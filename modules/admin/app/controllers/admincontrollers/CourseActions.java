package controllers.admincontrollers;

/**
 * Created by derdus on 6/17/16.
 */
import models.web.*;
import play.Play;
import play.data.Form;
import static play.data.Form.form;
import views.html.admin.courseFieldFormView;
import views.html.admin.courseLevelFormView;
import views.html.admin.courseFormView;
import views.html.admin.all_course_fields;
import views.html.admin.all_course_level;
import views.html.admin.courseSampleFileFormView;
import play.mvc.*;
import play.Logger;

import java.io.File;
import java.nio.file.Files;
import java.util.*;
//model imports
import models.web.CourseField;
import models.web.utility.Utility;

import static play.mvc.Http.MultipartFormData;

public class CourseActions extends Controller{
    static Form<CourseField> courseFieldForm = form(CourseField.class);
    static Form<CourseLevel> courseLevelForm = form(CourseLevel.class);
    static Form<Course> courseForm = form(Course.class);
    static Form<ExcelSampleFile> sampleFileForm = form(ExcelSampleFile.class);

    public static Result newCourseField(){
        //return ok(courseFieldFormView.render(courseFieldForm));
        return ok(courseFieldFormView.render(courseFieldForm));
    }

    public static Result saveCourseField(){
        Form<CourseField> courseFieldBoundForm = courseFieldForm.bindFromRequest();
        if(courseFieldBoundForm.hasErrors()){
            flash("coursefieldformerrors","Correct the errors and submit again");
            return badRequest(courseFieldFormView.render(courseFieldBoundForm));
        }
        flash("coursefieldformsuccess","Field has been saved");
        CourseField courseField = courseFieldBoundForm.get();
        //Logger.info("Id is " + courseField.course_field_id);
        courseField.saveCourseField();
        return redirect(routes.CourseActions.newCourseField());
    }

    public static Result fetchAllCourseFields(){
        return ok(all_course_fields.render(new CourseField().fetchAllCourseFields()));
    }

    public static Result editCourseField(Long id){
        //fetch the course field to be edited
        CourseField c_field = new CourseField().getCourseById(id);
        if(c_field == null){
            return redirect(routes.CourseActions.newCourseField());
        }
        Form<CourseField> preFilledCourseFieldForm = courseFieldForm.fill(c_field);
        return ok(courseFieldFormView.render(preFilledCourseFieldForm));
    }

    public static Result deleteCourseField(Long id){
        new CourseField().deleteCourseField(id);
        flash("coursefielddeleted","Course Field has been deleted");
        return redirect(routes.CourseActions.fetchAllCourseFields());
    }

    public static Result newCourseLevel(){

        return ok(courseLevelFormView.render(courseLevelForm));
    }

    public static Result fetchAllCourseLevels(){
        return ok(all_course_level.render(new CourseLevel().fetchAllCourseLevel()));
    }

    public static Result saveCourseLevel(){
        Form<CourseLevel> courseLevelBoundForm = courseLevelForm.bindFromRequest();
        if(courseLevelBoundForm.hasErrors()){
            flash("courselevelformerrors","Correct the errors and submit again");
            return badRequest(courseLevelFormView.render(courseLevelBoundForm));
        }
        flash("courselevelformsuccess","Level has been saved");
        CourseLevel courseLevel = courseLevelBoundForm.get();
        courseLevel.saveCourseLevel();
        return redirect(routes.CourseActions.newCourseLevel());
    }

    public static Result editCourseLevel(Long id){
        //fetch the course level object to be edited
        CourseLevel c_level =  new CourseLevel().getCourseLevelById(id);
        if(c_level == null){
            return redirect(routes.CourseActions.newCourseLevel());
        }
        Form<CourseLevel> preFilledCourseLevelForm = courseLevelForm.fill(c_level);
        return ok(courseLevelFormView.render(preFilledCourseLevelForm));
    }

    public static Result deleteCourseLevel(Long id){
        new CourseLevel().deleteCourseLevel(id);
        flash("deletecourselevelsuccess","Course level was deleted successifully");
        return redirect(routes.CourseActions.fetchAllCourseLevels());
    }

    public static Result newCourse(){
        /*render form, course field map and course level map*/
        return ok(courseFormView.render(courseForm, new CourseField().fetchCourseFieldMap(), new CourseLevel().fetchCourseLevelMap()));
    }
    public static Result saveCourse(){
        Form<Course> courseBoundForm = courseForm.bindFromRequest();
        Map<String,String> courseFormDataMap = courseBoundForm.data();

        /*Get values for the dropdown selections course field and course level*/
        String courseLevelSelected = courseFormDataMap.get("course_level_name");
        String courseFieldSelected = courseFormDataMap.get("course_field_name");

        //build maps in case of error or editing
        Map<Map<Long,String>,Boolean> courseLevelMap = new CourseLevel().fetchCourseLevelMap(Long.valueOf(courseLevelSelected));
        Map<Map<Long,String>,Boolean> courseFieldMap = new CourseField().fetchCourseFieldMap(Long.valueOf(courseFieldSelected));

        if(courseBoundForm.hasErrors()){
            return badRequest(courseFormView.render(courseBoundForm,courseFieldMap,courseLevelMap));
        }

        Course course = courseBoundForm.get();
        course.courseLevel = new CourseLevel().getCourseLevelById(Long.valueOf(courseLevelSelected));
        course.courseField = new CourseField().getCourseById(Long.valueOf(courseFieldSelected));
        //save the course object
        course.saveCourse();
        flash("coursesavesuccess","Course has been saved successfully");
        return redirect(routes.CourseActions.newCourse());
    }
    public static Result saveCourseExcelFile(){
        MultipartFormData body = request().body().asMultipartFormData();
        MultipartFormData.FilePart  part = body.getFile("courseexcelfilecontrol");
        if(part == null){
           flash("fileerror","No file selected!");
            return redirect(routes.CourseActions.newCourse());
        }

        File course_file = part.getFile();
        if(!(part.getContentType().equalsIgnoreCase("application/vnd.ms-excel") || part.getContentType().equalsIgnoreCase("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"))){
            flash("fileerror","Only Excel file allowed");
            return redirect(routes.CourseActions.newCourse());
        }
        if(course_file.length() > Utility.FILE_UPLOAD_SIZE_LIMIT){
            flash("fileerror","Please attach a file not exceeding 25MB");
            return redirect(routes.CourseActions.newCourse());
        }
        boolean file_response = new ExcelSampleFile().readFile(course_file);
        if(file_response){flash("filesuccess","Courses were extracted successfully");}else{flash("fileerror","We could not serve your request");}
        return redirect(routes.CourseActions.newCourse());
    }
    public static Result editCourse(Long id){return  TODO;}
    public static Result deleteCourse(Long id){return  TODO;}
    public static Result fetchAllCourses(){return  TODO;}
    public static Result downloadSampleCourseFile(){
        String file_path = new ExcelSampleFile().newCourseExcelFile();
        if(file_path == null){
            flash("fileerror","Server error. We could not serve your request");
            return redirect(routes.CourseActions.newCourse());
        }
        Logger.info("File Path: " + file_path);
        response().setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        response().setHeader("Content-disposition","attachment; filename=Sample file");
        response().setHeader("Content-Length", String.valueOf(new File(file_path).length()));
        try {
            return ok(new File(file_path));
        }catch (Exception e){
            flash("fileerror","Server error. We could not serve your request");
            return ok();
        }
    }


    /*public static Result newCourseSampleFile(){
        return ok(courseSampleFileFormView.render(sampleFileForm));
    }*/

   /* public static Result SaveCourseSampleFile(String file_type){
        Form<ExcelSampleFile> excelSampleFileBoundForm = sampleFileForm.bindFromRequest();
        if(excelSampleFileBoundForm.hasErrors()){
            return badRequest(courseSampleFileFormView.render(sampleFileForm));
        }
        ExcelSampleFile excelSampleFile = excelSampleFileBoundForm.get();
        MultipartFormData body = request().body().asMultipartFormData();
        MultipartFormData.FilePart part = body.getFile("excel_sample_file_bytes");
        Logger.info("File format " + part.getContentType().toString());
        if(part != null){
            File sample_file = part.getFile();
            if(sample_file.length() > Utility.FILE_UPLOAD_SIZE_LIMIT){
                flash("fileerror","Please attach a file not exceeding " + Utility.FILE_UPLOAD_SIZE_LIMIT + " MB");
                return badRequest(courseSampleFileFormView.render(sampleFileForm));
            }

            if(!part.getContentType().equals("application/vnd.ms-excel")){
                flash("fileerror","Only Excel files allowed");
                return badRequest(courseSampleFileFormView.render(sampleFileForm));
            }

            try {
               String uploadpath = Play.application().configuration().getString("samplefiles","/tmp/");
                File destination = new File(uploadpath,sample_file.getName());
                excelSampleFile.excel_sample_file_name = part.getFilename();
                excelSampleFile.excel_sample_file_size = sample_file.length();
                excelSampleFile.excel_sample_file_storage_path = destination.toPath().toString();
                Files.move(sample_file.toPath(), destination.toPath());
                //assign doc type
                if(file_type.equalsIgnoreCase("course")){
                    excelSampleFile.excel_sample_file_type = Utility.SampleFileType.COURSE;
                }else {
                    excelSampleFile.excel_sample_file_type = Utility.SampleFileType.INSTITUTION;
                }
                //Logger.info("Show: " + excelSampleFile.excel_sample_file_type.ordinal());
                //delete anyoccurence of current file
                excelSampleFile.deleteAllFilesByType(excelSampleFile.excel_sample_file_type);
                //insert new one
                excelSampleFile.save();
                flash("fileuploadsuccess","File uploaded succssfully");
                return redirect(routes.CourseActions.newCourseSampleFile());
            }catch (Exception ex){
                Logger.error("Error: " + ex.getMessage().toString());
                flash("fileerror","Server Error. Please try again");
                return badRequest(courseSampleFileFormView.render(sampleFileForm));
            }

        }
        flash("fileerror","No file was selected");
        return badRequest(courseSampleFileFormView.render(sampleFileForm));
    }*/
}
