package controllers.admincontrollers;

/**
 * Created by derdus on 6/17/16.
 */
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.web.*;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import play.Play;
import play.data.Form;
import static play.data.Form.form;

import play.libs.Json;
import views.html.admin.courseFieldFormView;
import views.html.admin.courseLevelFormView;
import views.html.admin.courseFormView;
import views.html.admin.all_course_fields;
import views.html.admin.all_course_level;
import views.html.admin.manageCourse;
import views.html.admin.courseSampleFileFormView;
import views.html.admin.addJobPlacementFormView;
import views.html.admin.addCourseSpecializationFormView;
import views.html.admin.addCourseCertificationFormView;
import views.html.admin.all_courses;
import play.mvc.*;
import play.Logger;

import java.io.File;
import java.nio.file.Files;
import java.util.*;
//model imports
import models.web.CourseField;
import models.web.utility.Utility;

import static play.mvc.Http.MultipartFormData;
import org.json.simple.*;
public class CourseActions extends Controller{
    static Form<CourseField> courseFieldForm = form(CourseField.class);
    static Form<CourseLevel> courseLevelForm = form(CourseLevel.class);
    static Form<Course> courseForm = form(Course.class);
    static Form<ExcelSampleFile> sampleFileForm = form(ExcelSampleFile.class);
    static Form<JobPlacement> jobPlacementForm = form(JobPlacement.class);
    static Form<Specialization> courseSpecializationForm = form(Specialization.class);
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
        boolean res = new CourseField().deleteCourseField(id);
        if(res){
            flash("coursefielddeleted","Course Field has been deleted");
        }else {
            flash("coursefielddeleteerror","You cannot delete a course field that is already attached to a course. Please consult system admin.");
        }
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
        boolean res = new CourseLevel().deleteCourseLevel(id);
        if(res){
            flash("deletecourselevelsuccess","Course level was deleted successifully");
        }else {
            flash("deletecourselevelerror","You cannot delete a course level that is already in use by a course. Please consult system admin.");
        }

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
    public static Result editCourse(Long id){
        Course course = new Course().getCourseById(id);
        if(course == null){
            return redirect(routes.CourseActions.fetchAllCourses());
        }
        //Create a form filled with course object
        Form<Course> prefilledCourseForm = courseForm.fill(course);
        return ok(courseFormView.render(prefilledCourseForm,new CourseField().fetchCourseFieldMap(course.courseField.course_field_id),new CourseLevel().fetchCourseLevelMap(course.courseLevel.course_level_id)));
    }
    public static Result deleteCourse(Long id){
        boolean res = new Course().deleteCourse(id);
        if (res){
            flash("coursedeletesuccess","Course has been deleted successfully");
        }else {
            flash("coursedeleteerror","You cannot delete a course which is already attached to an institution. Please consult system admin.");
        }
        return redirect(routes.CourseActions.fetchAllCourses());
    }
    public static Result fetchAllCourses(){
        return ok(all_courses.render(new Course().fetchAllCourses()));
    }
    public static Result viewCourseDetails(Long id){
       Course course = new Course().getCourseById(id);
        if(course == null){
            flash("viewerror","Sorry! We could not serve your request");
            return redirect(routes.CourseActions.fetchAllCourses());
        }
        return ok(manageCourse.render(course));
    }
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

    public static Result courseNewJobPlacement(){
        return ok(addJobPlacementFormView.render(jobPlacementForm,new Course().coursesMap()));
    }
    public static Result saveCourseJobPlacement(Long course_id){
        ObjectNode result = Json.newObject();
        Course course = new Course().getCourseById(course_id);
        if(course == null){
            result.put("message", "There was an error. We could not serve your request");
            //result.put("divclass","alert alert-danger");
            result.put("success",0);
            return ok(result);
        }
        final Map<String, String[]> values = request().body().asFormUrlEncoded();
        String job_titles = values.get("course_jobs")[0];
        //Logger.info(job_titles);
        JsonNode node = Json.parse(job_titles);
        if(node.isArray()){
            Iterator<JsonNode> elements = node.elements();
            while (elements.hasNext()){
                JobPlacement jobPlacement = new JobPlacement();
                JsonNode obj = elements.next();
                //receive all data here like this.
                //Logger.info("Data:" + obj.get("title_url").asText());
                jobPlacement.job_placement_name = obj.get("job_title").asText();
                jobPlacement.job_placement_blog_url = obj.get("title_url").asText();
                jobPlacement.job_placement_description = obj.get("description").asText();
                jobPlacement.course = course;
                jobPlacement.saveJobPlacement();
            }

            result.put("message", "You job titles were saved successfully.");
            //result.put("divclass","alert alert-success");
            result.put("success",1);
            return ok(result);
        }
        result.put("message", "There was an error. We could not serve your request");
        //result.put("divclass","alert alert-danger");
        result.put("success",0);
        return ok(result);
    }
    public static Result saveCourseJobPlacemen(){
        return  TODO;
    }
    public static Result searchJobTitlesByInput(String key){
        return ok(Json.parse(JobPlacement.searchJobTitles(key)));
    }
    public static Result courseNewSpecialization(){
        return ok(addCourseSpecializationFormView.render(courseSpecializationForm,new Course().coursesMap()));
    }
    public static Result saveCourseSpecialization(Long course_id){
        Course course = new Course().getCourseById(course_id);
        ObjectNode result = Json.newObject();
        if (course == null){
            result.put("message", "There was an error. We could not serve your request");
            //result.put("divclass","alert alert-danger");
            result.put("success",0);
            return ok(result);
        }
        final Map<String, String[]> values = request().body().asFormUrlEncoded();
        String course_specialization = values.get("specializations")[0];
        JsonNode node = Json.parse(course_specialization);
        if(node.isArray()){
            Iterator<JsonNode> elements = node.elements();
            while (elements.hasNext()){
                JsonNode obj = elements.next();
                Specialization specialization = new Specialization();
                CourseSpecialization courseSpecialization = new CourseSpecialization();
                /**/
                specialization.specialization_name = obj.get("course_specialization").asText();
                specialization.course_specialization_blog_url = obj.get("specialization_url").asText();
                specialization.specialization_description = obj.get("specialization_description").asText();
                /**/
                Long specializationReturnId = specialization.saveSpecialization();
                /**/
                courseSpecialization.specialization = specialization.getSpecializationById(specializationReturnId);
                courseSpecialization.course = course;
                /**/
                courseSpecialization.saveCourseSpecialization();
            }
            result.put("message", "Your specializations were saved successfully.");
            result.put("success",1);
            return ok(result);
        }
        result.put("message", "There was an error. We could not serve your request");
        result.put("success",0);
        return ok(result);
    }
    public static Result SearchCourseSpecialization(String key){
        return ok(Json.parse(Specialization.searchCourseSpecializations(key)));
    }

    public static Result newCourseCertification(){
        return ok(addCourseCertificationFormView.render(new Course().fetchAllCourses(),new Course().coursesMap()));
    }
    public static Result saveCourseCertification(){
        final Map<String, String[]> values = request().body().asFormUrlEncoded();
        Long course_id = Long.parseLong(values.get("course_name")[0]);
        Course mainCourse = new Course();
        mainCourse = mainCourse.getCourseById(course_id);
        if(mainCourse == null){
            flash("certificationsubmiterror","Course name selected was not found!");
            return redirect(routes.CourseActions.saveCourseCertification());
        }
        String [] certificationCourses = values.get("certification_courses");
        if(certificationCourses.length == 0){
            flash("certificationsubmiterror","You did not select any certification course!");
            return redirect(routes.CourseActions.saveCourseCertification());
        }
        //Logger.info("String size is: " + certifocationCourses.length);
        for (int i = 0; i< certificationCourses.length; i++){
            CourseCertification courseCertification = new CourseCertification();
            Logger.info("item:" + certificationCourses[i]);
            Course minorCourse = new Course().getCourseById(Long.parseLong(certificationCourses[i]));

            courseCertification.mainCourse = mainCourse;
            courseCertification.certificationCourse = minorCourse;

            if(!new CourseCertification().certificationCourseAlreadyAdded(mainCourse,minorCourse)){
                courseCertification.saveCourseCertification();
            }
        }
        flash("certificationsubmitsuccess","Course certifications have been added");
        return redirect(routes.CourseActions.newCourseCertification());
    }

}
