package controllers.admincontrollers;

/**
 * Created by derdus on 6/17/16.
 */
import models.web.CourseField;
import models.web.CourseLevel;
import play.data.Form;
import static play.data.Form.form;
import views.html.admin.courseFieldFormView;
import views.html.admin.courseLevelFormView;
import views.html.admin.all_course_fields;
import views.html.admin.all_course_level;
import play.mvc.*;
import play.Logger;
//model imports
import models.web.CourseField;

public class CourseActions extends Controller{
    static Form<CourseField> courseFieldForm = form(CourseField.class);
    static Form<CourseLevel> courseLevelForm = form(CourseLevel.class);

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
        flash("courselevelformsuccess","Field has been saved");
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
        return redirect(routes.CourseActions.fetchAllCourseFields());
    }
}
