package models.web;

import play.Logger;
import play.Play;
import play.db.ebean.Model;
import models.web.utility.Utility;
import java.util.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Transient;
import com.avaje.ebean.*;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.*;
import java.io.*;

/**
 * Created by derdus on 7/2/16.
 */
@Entity
public class ExcelSampleFile extends Model{
    @Id
    public Long excel_sample_file_id;
    public Long excel_sample_file_size; //in MegaBytes
    @Column(nullable = false)
    public String excel_sample_file_name;
    @Column(nullable = false)
    public String excel_sample_file_storage_path;
    @Transient
    public byte[] excel_sample_file_bytes;
    public Utility.SampleFileType excel_sample_file_type; /*Course or Institution*/

    //methods
    public static Finder<Long, ExcelSampleFile> find() {
        return new Finder<Long, ExcelSampleFile>(Long.class, ExcelSampleFile.class);
    }

    public static ExcelSampleFile getSampleFileById(Long id){
        return ExcelSampleFile.find().byId(id);
    }

    public void deleteAllFilesByType(Utility.SampleFileType fileType){
        int type = fileType.ordinal();
        SqlUpdate del = Ebean.createSqlUpdate("delete from excel_sample_file where excel_sample_file_type=" + type);
        del.execute();
    }

    public boolean readFile (File course_file){

        List<Course> courseList = new ArrayList<Course>();
        try {
            FileInputStream file = new FileInputStream(course_file);
            //Get the workbook instance for XLS file
            HSSFWorkbook workbook = new HSSFWorkbook(file);
            //Get first sheet from the workbook
            HSSFSheet sheet = workbook.getSheetAt(0);
            //Iterate through each rows from first sheet
            int outer_counter = 1;
            Iterator<Row> rowIterator = sheet.iterator();
            while(rowIterator.hasNext()) {
                Course course = new Course();
                Row row = rowIterator.next();
                //For each row, iterate through each columns
                int inner_counter = 1;
                Iterator<Cell> cellIterator = row.cellIterator();
                while(cellIterator.hasNext()) {

                    Cell cell = cellIterator.next();

                    switch(cell.getCellType()) {
                        case Cell.CELL_TYPE_BOOLEAN:
                            Logger.info(cell.getBooleanCellValue() + "\t\t");
                            break;
                        case Cell.CELL_TYPE_NUMERIC:
                            Logger.info(cell.getNumericCellValue() + "\t\t");
                            break;
                        case Cell.CELL_TYPE_STRING:
                            if(outer_counter != 1){
                                if(inner_counter == 1){
                                    course.course_name = cell.getStringCellValue();
                                }else if(inner_counter == 2){
                                    course.course_description = cell.getStringCellValue();
                                }else if(inner_counter ==3 ){
                                    course.course_blog_url = cell.getStringCellValue();
                                }else if(inner_counter == 4){
                                    course.courseLevel = new CourseLevel().getCourseLevelById(Long.parseLong(cell.getStringCellValue()));
                                }else if(inner_counter == 5){
                                    course.courseField = new CourseField().getCourseById(Long.parseLong(cell.getStringCellValue()));
                                }
                            }
                            Logger.info("outer:" + outer_counter +  " Inner:"  + inner_counter + " " + cell.getStringCellValue() + "\t\t");
                            break;
                    }
                    inner_counter++;
            }
                courseList.add(course);
                Logger.info("");
                outer_counter++;
        }

        for(int k = 0; k<courseList.size(); k++){
            if(courseList.get(k).courseField !=null && courseList.get(k).courseField !=null) {
                courseList.get(k).saveCourse();
            }
        }
        file.close();
        FileOutputStream out = new FileOutputStream(course_file);
        workbook.write(out);
        out.close();
        return true;
        } catch (FileNotFoundException fnfe) {
            Logger.error("Error:" + fnfe.getMessage().toString());
            return false;
        } catch (IOException ioe) {
            Logger.error("Error:" + ioe.getMessage().toString());
            return false;
        }catch (Exception e){
            Logger.error("Error:" + e.getMessage().toString());
            return false;
        }
    }

    public String generateInstruction(){
        List<CourseField> courseFieldList = new CourseField().fetchAllCourseFields();
        List<CourseLevel>courseLevelList =  new CourseLevel().fetchAllCourseLevel();
        String field_instruction = "In the course_field_id use ";
        for(int i = 0; i<courseFieldList.size(); i++){
            field_instruction += courseFieldList.get(i).course_field_id + " for " + courseFieldList.get(i).course_field_name + " field courses. ";
        }

        String level_instruction = " In the course_level_id use ";
        for(int j = 0; j<courseLevelList.size(); j++){
            level_instruction += courseLevelList.get(j).course_level_id + " for " + courseLevelList.get(j).course_level_name + " level courses ";
        }
        return field_instruction + " " + level_instruction + ". If you use this sample excel, PLEASE DELETE THE Instructions/Key COLUMN. Record your courses only in the first sheet. Note that the courses in this sample should be deleted because they are already our the database. If you do not have the Course blog link, please use " + Utility.COURSE_BLOG_URL;
    }
    public String newCourseExcelFile(){
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet(Utility.COURSE_EXCEL_SHEET_NAME);
        //Fetch the Course object list
        List<Course> courseList = new Course().fetchAllCourses();
        if(courseList.size() == 0){
            return null;
        }
        Map<String, Object[]> data = new HashMap<String, Object[]>();
        data.put("1",new Object[]{"course_name","course_description","course_blog_url","course_level_id","course_field_id","Instructions/Key"});
        int j = 2;
        for(int i = 0; i< courseList.size(); i++){
            data.put("" + j, new Object[]{courseList.get(i).course_name,courseList.get(i).course_description,courseList.get(i).course_blog_url,courseList.get(i).courseLevel.course_level_id + "",courseList.get(i).courseField.course_field_id + "",generateInstruction()});
            j++;
        }
        /*data.put("2", new Object[] {1d, "John", 1500000d});*/
        Set<String> keyset = data.keySet();
        int rownum = 0;
        for (String key : keyset) {
            Row row = sheet.createRow(rownum++);
            Object [] objArr = data.get(key);
            int cellnum = 0;
            for (Object obj : objArr) {
                Cell cell = row.createCell(cellnum++);
                if(obj instanceof Date)
                    cell.setCellValue((Date)obj);
                else if(obj instanceof Boolean)
                    cell.setCellValue((Boolean)obj);
                else if(obj instanceof String)
                    cell.setCellValue((String)obj);
                else if(obj instanceof Double)
                    cell.setCellValue((Double)obj);
            }
        }

        try {
            FileOutputStream out =
                    new FileOutputStream(new File(Play.application().configuration().getString("samplefiles") + "/" + Utility.COURSE_EXCEL_SHEET_NAME + ".xlsx"));
            workbook.write(out);
            out.close();
            Logger.info("SUCCESS","Excel written successfully");
            return Play.application().configuration().getString("samplefiles") + "/" + Utility.COURSE_EXCEL_SHEET_NAME + ".xlsx";

        } catch (FileNotFoundException e) {
            Logger.error("Error",e.getMessage().toString());
            return null;
        } catch (IOException e) {
            Logger.error("Error",e.getMessage().toString());
            return null;
        }
    }
}
