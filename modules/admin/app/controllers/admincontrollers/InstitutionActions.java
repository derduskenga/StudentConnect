package controllers.admincontrollers;

import com.sun.org.apache.xml.internal.serialize.LineSeparator;
import org.json.simple.JSONArray;
import play.Logger;
import play.Play;
import play.data.Form;

import static controllers.admincontrollers.InstitutionActions.clubSocietyForm;
import static play.data.Form.form;

import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import models.web.*;
import views.html.admin.institutionCategoryFormView;
import views.html.admin.all_institution_categories;
import views.html.admin.institutionFormView;
import views.html.admin.all_institutions;
import views.html.admin.campusFormView;
import views.html.admin.schoolFormView;
import views.html.admin.InstitutionCourseFormView;
import views.html.admin.addModeOfStudy;
import views.html.admin.addFees;
import views.html.admin.addInstitutionClub;
import views.html.admin.addPartner;
import views.html.admin.addLab;
import java.io.File;
import com.google.common.io.Files;
import org.apache.commons.io.FileUtils;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by derdus on 7/14/16.
 */
public class InstitutionActions extends Controller {
    public static Form<InstitutionCategory> institutionCategoryForm = form(InstitutionCategory.class);
    public static Form<Institution> institutionForm = form(Institution.class);
    public static Form<Campus> campusForm = form(Campus.class);
    public static Form<SchoolOrFaculty> schoolOrFacultyForm = form(SchoolOrFaculty.class);
    public static Form<ExaminationBody> examinationBodyForm = form(ExaminationBody.class);
    public static Form<InstitutionCourse> institutionCourseForm = form(InstitutionCourse.class);
    public static Form<CourseInstitutionModeOfStudy> courseInstitutionModeOfStudyForm = form(CourseInstitutionModeOfStudy.class);
    public static Form<ClubSociety> clubSocietyForm = form(ClubSociety.class);
    public static Form<Partner> partnerForm = form(Partner.class);
    public static Form<InstitutionPartnership> institutionPartnershipForm = form(InstitutionPartnership.class);
    public static Form<ResearchCenter> researchCenterForm = form(ResearchCenter.class);

    public static Result newInstitutionCategory(){
        return ok(institutionCategoryFormView.render(institutionCategoryForm));
    }
    public static Result saveInstitutionCategory(){
        Form<InstitutionCategory> institutionCategoryBoundForm = institutionCategoryForm.bindFromRequest();
        if(institutionCategoryBoundForm.hasErrors()){
            return badRequest(institutionCategoryFormView.render(institutionCategoryBoundForm));
        }
        flash("institutioncategoryformsuccess","Institution category has been saved successfully");
        InstitutionCategory institutionCategory = institutionCategoryBoundForm.get();
        institutionCategory.saveInstitutionCategory();
        return  redirect(routes.InstitutionActions.newInstitutionCategory());
    }
    public static Result allInstitutionCategory(){
        return ok(all_institution_categories.render(new InstitutionCategory().fetchAllInstitutionCategories()));
    }
    public static Result deleteInstitutionCategory(Long institution_category_id){
        if(new InstitutionCategory().deleteInstitutionCategoryById(institution_category_id)){
            flash("institutioncategorydeleted","Institution category has been deleted");
            return redirect(routes.InstitutionActions.allInstitutionCategory());
        }
        flash("institutioncategoryerror","Error! You cannot delete an institution category that is already attached to an Institution. Please consult system admin.");
        return redirect(routes.InstitutionActions.allInstitutionCategory());
    }
    public static Result editInstitutionCategory(Long institution_category_id){
        InstitutionCategory institutionCategory = new InstitutionCategory().fetchInstitutionCategoryById(institution_category_id);
        if(institutionCategory == null){
            return redirect(routes.InstitutionActions.allInstitutionCategory());
        }
        Form<InstitutionCategory> preFilledInstitutionCategoryForm = institutionCategoryForm.fill(institutionCategory);
        return ok(institutionCategoryFormView.render(preFilledInstitutionCategoryForm));
    }
    public static Result newInstitution(){
        return ok(institutionFormView.render(institutionForm,new InstitutionCategory().fetchInstitutonCategoryMap(),new County().fetchCountyMap(),new Institution().getRegionsMap()));
    }
    public static Result saveInstitution(){
        Form<Institution> institutionBoundForm = institutionForm.bindFromRequest();
        Map<String,String> institutionFormDataMap = institutionBoundForm.data();

        //get values from select fields
        String institution_category = institutionFormDataMap.get("institution_category_name");
        String institution_county = institutionFormDataMap.get("county_name");
        String institution_region = institutionFormDataMap.get("region");

        //build maps in case of error or editing
        Map<Map<Long,String>,Boolean> institutionCategoryMap = new LinkedHashMap<Map<Long, String>, Boolean>();
        Map<Map<Long,String>,Boolean> institutionCountyMap = new LinkedHashMap<Map<Long, String>, Boolean>();
        Map<Map<String,String>, Boolean> institutionRegionMap = new LinkedHashMap<Map<String, String>, Boolean>();
        try {
            institutionCategoryMap = new InstitutionCategory().fetchInstitutonCategoryMap(Long.parseLong(institution_category));
            institutionCountyMap = new County().fetchCountyMap(Long.parseLong(institution_county));
            institutionRegionMap = new Institution().getRegionsMap(institution_region);
        }catch (Exception ex){
            flash("institutionsaveerror","Correct form errors and re-submit");
            Logger.error("ERROR:" + ex.getMessage().toString());
            return badRequest(institutionFormView.render(institutionBoundForm,institutionCategoryMap,institutionCountyMap,institutionRegionMap));
        }

        if(institution_category.equals("") || institution_county.equals("") || institution_region.equals("")){
            flash("institutionsaveerror","Correct form errors and re-submit");
            return badRequest(institutionFormView.render(institutionBoundForm,institutionCategoryMap,institutionCountyMap,institutionRegionMap));
        }
        /*institutionBoundForm.discardErrors();*/
        if(institutionBoundForm.hasErrors()){
            flash("institutionsaveerror","Correct form errors and re-submit");
            //Logger.error("ERROR:" + institutionBoundForm.errorsAsJson().toString());
            return badRequest(institutionFormView.render(institutionBoundForm,institutionCategoryMap,institutionCountyMap,institutionRegionMap));
        }

        //process logo file
        Http.MultipartFormData body = request().body().asMultipartFormData();
        Http.MultipartFormData.FilePart part = body.getFile("institution_logo_path");

        if(part == null){
            flash("institutionsaveerror","No logo selected!");
            return badRequest(institutionFormView.render(institutionBoundForm,institutionCategoryMap,institutionCountyMap,institutionRegionMap));
        }

        File institution_logo_file = part.getFile();
        Logger.info("IMAGE TYPE:" + part.getContentType().toString());
        if(!part.getContentType().toString().startsWith("image")){
            flash("institutionsaveerror","Only image files accepted");
            return badRequest(institutionFormView.render(institutionBoundForm,institutionCategoryMap,institutionCountyMap,institutionRegionMap));
        }
        try {
            String logo_upload_folder = Play.application().configuration().getString("universitylogos","/tmp/");
            /*6 come from counting letters from i to / in image/png*/
            File destination = new File(logo_upload_folder,institution_logo_file.getName().concat("." + part.getContentType().toString().substring(6)));
            Files.move(institution_logo_file,destination);

            Institution institution = institutionBoundForm.get();
            institution.county = new County().fetchCountyById(Long.parseLong(institution_county));
            institution.institutionCategory = new InstitutionCategory().fetchInstitutionCategoryById(Long.parseLong(institution_category));
            institution.region = Region.valueOf(institution_region);
            institution.institution_logo_path = destination.getPath().toString();
            //Logger.info("Selected region:" + Region.valueOf(institution_region).toString());
            //save institution object
            institution.saveInstitution();
            flash("institutionsavesuccess","Institution has been saved successfully");
            return redirect(routes.InstitutionActions.newInstitution());
        }catch (Exception ex){
            flash("institutionsaveerror","We could not save your file");
            Logger.error("Error:" + ex.getMessage().toString());
            return badRequest(institutionFormView.render(institutionBoundForm,institutionCategoryMap,institutionCountyMap,institutionRegionMap));
        }
    }

    public static Result editInstitution(Long id){
        Institution institution = new Institution().getInstitutionById(id);
        if(institution == null){
            return redirect(routes.InstitutionActions.allInstitutions());
        }
        Form<Institution> institutionPrefilledForm = institutionForm.fill(institution);
        return ok(institutionFormView.render(institutionPrefilledForm, institution.institutionCategory.fetchInstitutonCategoryMap(institution.institutionCategory.institution_category_id),institution.county.fetchCountyMap(institution.county.county_id),institution.getRegionsMap(Region.valueOf(institution.region.ordinal()).name())));
    }
    public static Result allInstitutions(){return ok(all_institutions.render(new Institution().fetchAllInstitutions()));}

    public static Result deleteInstitution(Long id){
        boolean response = new Institution().deleteInstitution(id);
        if(response){
            flash("institutiondeletesuccess","Institution has been deleted successfully");
        }else {
            flash("institutiondeleteerror","You cannot delete an institution which is already attached to courses or campuses. Please consult system admin.");
        }
        return  redirect(routes.InstitutionActions.allInstitutions());
    }

    public static Result viewInstitution(Long id){return TODO;}

    public static Result newCampus(){
        return ok(campusFormView.render(campusForm.fill(new Campus()),new Institution().getInstitutionMap()));
    }
    public static Result saveCampus(){
        Form<Campus> campusBoundForm = campusForm.bindFromRequest();
        Map<String,String> campusFormDataMap = campusBoundForm.data();
        String institution_id = campusFormDataMap.get("institution_id");
        Map<Map<Long,String>,Boolean> institution_map = new Institution().getInstitutionMap(Long.parseLong(institution_id));
        if (campusBoundForm.hasErrors()){
            flash("campusformerror","Correct form errors then resubmit");
            return badRequest(campusFormView.render(campusBoundForm,institution_map));
        }
        Campus campus = campusBoundForm.get();
        campus.institution = new Institution().getInstitutionById( Long.parseLong(institution_id));
        campus.saveCampus();
        flash("campusformsuccess","Campus has been added successfully");
        return redirect(routes.InstitutionActions.newCampus());
    }
    public static Result deleteCampus(Long id){return TODO;}
    public static  Result editCampus(Long id){return TODO;}
    public static Result viewCampus(Long id){return TODO;}

    public static Result newSchool(){
        return ok(schoolFormView.render(schoolOrFacultyForm,new Institution().getInstitutionMap(),new Campus().getCampusMap()));
    }
    public static Result saveSchool(){
        Form<SchoolOrFaculty> schoolOrFacultyBoundForm = schoolOrFacultyForm.bindFromRequest();
        Map<String,String> schoolFormDataMap = schoolOrFacultyBoundForm.data();
        String selected_campus = schoolFormDataMap.get("campus_id");
        String selected_institution = schoolFormDataMap.get("institution_id");
        Map<Map<Long,String>,Boolean> institution_map = new Institution().getInstitutionMap(Long.parseLong(selected_institution));
        Map<Map<Long,String>,Boolean> campus_map = new Campus().getCampusMap(Long.parseLong(selected_campus));

        if (schoolOrFacultyBoundForm.hasErrors()){
            return badRequest(schoolFormView.render(schoolOrFacultyBoundForm,institution_map,campus_map));
        }

        SchoolOrFaculty schoolOrFaculty = schoolOrFacultyBoundForm.get();
        schoolOrFaculty.institution = new Institution().getInstitutionById(Long.parseLong(selected_institution));
        Long school_id = schoolOrFaculty.saveSchool();
        SchoolOrFacultyCampus schoolOrFacultyCampus = new SchoolOrFacultyCampus();
        schoolOrFacultyCampus.campus = new Campus().getCampusById(Long.parseLong(selected_campus));
        schoolOrFacultyCampus.schoolOrFaculty = schoolOrFaculty;
        schoolOrFacultyCampus.saveSchoolCampus();
        //report succees
        flash("schoolformsuccess","School/Faculty has been successfully added");
        return redirect(routes.InstitutionActions.newSchool());
    }

    public static Result fetchInstitutionCampuses(Long institution_id){
        Institution institution = new Institution().getInstitutionById(institution_id);
        if ( institution== null){
            return badRequest();
        }
         if (institution.campusList.isEmpty()){
             return badRequest();
         }
        JSONArray jsonArray = new Campus().getCampusByInstitution(institution);
        return ok(Json.parse(jsonArray.toJSONString()));
    }

    public static Result addCourse(){
        return ok(InstitutionCourseFormView.render(examinationBodyForm,institutionCourseForm,new Institution().getInstitutionMap(),new Campus().getCampusMap(),new Course().fetchAllCourses(),new SchoolOrFaculty().getSchoolMap()));
    }

    public static Result saveCourseInstitution(){
        Form<InstitutionCourse> institutionCourseBoundForm = institutionCourseForm.bindFromRequest();
        Form<ExaminationBody> examinationBodyBoundForm = examinationBodyForm.bindFromRequest();
        Map<String,String> institutionCourseMap = institutionCourseBoundForm.data();
        String institution_id = institutionCourseMap.get("institution_id");
        String campus_id  = institutionCourseMap.get("campus_id");
        String school_id = institutionCourseMap.get("school_id");
        String course_id = institutionCourseMap.get("institution_course");

        Logger.info("course_id:" + course_id);
        Logger.info("course_id:" + campus_id);
        Logger.info("INFO:" + new InstitutionCourse().courseHasBeenAdded(
                new Campus().getCampusById(Long.parseLong(campus_id)),
                new Course().getCourseById(Long.parseLong(course_id))));

        if(institutionCourseBoundForm.hasErrors() || examinationBodyBoundForm.hasErrors()){
            return badRequest(InstitutionCourseFormView.render(examinationBodyBoundForm,institutionCourseBoundForm,
                    new Institution().getInstitutionMap(Long.parseLong(institution_id)),
                    new Campus().getCampusMap(Long.parseLong(campus_id)),
                    new Course().fetchAllCourses(),
                    new SchoolOrFaculty().getSchoolMap(Long.parseLong(school_id))));
        }



        if (new InstitutionCourse().courseHasBeenAdded(
                new Campus().getCampusById(Long.parseLong(campus_id)),
                new Course().getCourseById(Long.parseLong(course_id)))){
            flash("institutioncourseerror","This course has been added!");
            return redirect(routes.InstitutionActions.addCourse());
        }

        InstitutionCourse institutionCourse = institutionCourseBoundForm.get();
        ExaminationBody examinationBody = examinationBodyBoundForm.get();
        //institution Course
        institutionCourse.institution = new Institution().getInstitutionById(Long.parseLong(institution_id));
        institutionCourse.course = new Course().getCourseById(Long.parseLong(course_id));
        institutionCourse.schoolOrFaculty = new SchoolOrFaculty().getSchoolById(Long.parseLong(school_id));
        institutionCourse.campus = new Campus().getCampusById(Long.parseLong(campus_id));
        institutionCourse.saveInstitutionCourse();
        //Examination Body
        examinationBody.institutionCourse = institutionCourse;
        examinationBody.saveExaminationBody();
        flash("institutioncoursesuccess","Course has been added successfully");
        return redirect(routes.InstitutionActions.addCourse());
    }

    public static Result fetchCampusSchools(Long campus_id){
        Campus campus = new Campus().getCampusById(campus_id);
        if ( campus== null){
            return badRequest();
        }
        if (campus.schoolOrFacultyCampusList.isEmpty()){
            return badRequest();
        }
        JSONArray jsonArray = new SchoolOrFaculty().getSchoolBycampus(campus);
        return ok(Json.parse(jsonArray.toJSONString()));
    }

    public static Result addModeOfStudy(){
        return ok(addModeOfStudy.render(courseInstitutionModeOfStudyForm,ModeOfStudy.modeOfStudyMap(),new InstitutionCourse().getAllInstitutionCourses()));
    }

    public static Result saveModeOfStudy(){
       //bind the form
        Form<CourseInstitutionModeOfStudy> courseInstitutionModeOfStudyBoundForm = courseInstitutionModeOfStudyForm.bindFromRequest();
        if(courseInstitutionModeOfStudyBoundForm.hasErrors()){
            flash("modeofstudyerror","Correct form errors anf resubmit");
            return redirect(routes.InstitutionActions.addModeOfStudy());
        }
        Map<String, String[]> formDatamap = request().body().asFormUrlEncoded();
        String institution_course = formDatamap.get("institution_course")[0];
        String [] mode_of_study = formDatamap.get("mode_of_study");

        if (mode_of_study.length == 0){
            flash("modeofstudyerror","No  mode of study was selected");
            return redirect(routes.InstitutionActions.addModeOfStudy());
        }
        //Logger.info("institutionCourse selected:" + institution_course);
        //Logger.info("Number" + mode_of_study.length);

        for (int i = 0; i < mode_of_study.length; i++){
            //create object
            CourseInstitutionModeOfStudy courseInstitutionModeOfStudy = new CourseInstitutionModeOfStudy();
            InstitutionCourse institutionCourse = new InstitutionCourse().getInstitutionCourseById(Long.parseLong(institution_course));

            courseInstitutionModeOfStudy.institutionCourse = institutionCourse;
            courseInstitutionModeOfStudy.modeOfStudy = ModeOfStudy.valueOf(mode_of_study[i]);

            if (new CourseInstitutionModeOfStudy().modeOfStudyAlreadyExist(institutionCourse,ModeOfStudy.valueOf(mode_of_study[i]))){
                flash("modeofstudyerror","This mode of study has been added to the selected course");
                return redirect(routes.InstitutionActions.addModeOfStudy());
            }

            courseInstitutionModeOfStudy.save();
            //Logger.info("DONE");
        }

        flash("modeofstudysuccess","Mode of study has been added");
        return redirect(routes.InstitutionActions.addModeOfStudy());
    }

    public static Result getInstitutionCampusCourses(Long institution_id, Long campus_id){
        if (new  Campus().getCampusById(campus_id) == null || new Institution().getInstitutionById(institution_id) == null){
            return badRequest();
        }
        Course course = new Course();
        List<Course> courseList = course.filterCoursesByInstitutionByCampus(new Institution().getInstitutionById(institution_id),new Campus().getCampusById(campus_id));
        return ok(Json.parse(course.getCampusCourses(courseList).toJSONString()));
    }

    public static Result addCourseFees(){
        return ok(addFees.render(courseInstitutionModeOfStudyForm,
                new CourseInstitutionModeOfStudy().getInstitutionCoursesWithoutFees()));
    }

    public static Result saveCourseFees(){
        //bind the form
        Form<CourseInstitutionModeOfStudy> courseInstitutionModeOfStudyBoundForm = courseInstitutionModeOfStudyForm.bindFromRequest();
        if(courseInstitutionModeOfStudyBoundForm.hasErrors()){
            flash("modeofstudyerror","Correct form errors anf resubmit");
            return redirect(routes.InstitutionActions.addCourseFees());
        }
        Map<String, String[]> formDatamap = request().body().asFormUrlEncoded();
        String institution_course_mode_of_study = formDatamap.get("institution_course_mode_of_study")[0];

        if(institution_course_mode_of_study.equals("")){
            flash("modeofstudyerror","Correct form errors anf resubmit");
            return redirect(routes.InstitutionActions.addCourseFees());
        }

        CourseInstitutionModeOfStudy courseInstitutionModeOfStudy = courseInstitutionModeOfStudyBoundForm.get();
        //Override id
        courseInstitutionModeOfStudy.course_institution_mode_of_study_id = Long.parseLong(institution_course_mode_of_study);
        courseInstitutionModeOfStudy.saveModeOfStudy();
        flash("modeofstudysuccess","Fees has been added");
        return redirect(routes.InstitutionActions.addCourseFees());

    }

    public static Result newClub(){
        return ok(addInstitutionClub.render(clubSocietyForm,new Institution().getInstitutionMap()));
    }
    public static Result saveClub(){
        Form<ClubSociety> clubSocietyBoundForm = clubSocietyForm.bindFromRequest();
        Map<String,String> clubFormData = clubSocietyBoundForm.data();
        String institution_id = clubFormData.get("institution_id");

        if (clubSocietyBoundForm.hasErrors()){
            flash("cluberror","Correct form errors and resubmit");
            return badRequest(addInstitutionClub.render(clubSocietyBoundForm,new Institution().getInstitutionMap(Long.parseLong(institution_id))));
        }

        ClubSociety clubSociety = clubSocietyBoundForm.get();
        clubSociety.institution = new Institution().getInstitutionById(Long.parseLong(institution_id));
        //save society/club
        clubSociety.saveClub();
        flash("clubsuccess","Club/society has been added");
        return redirect(routes.InstitutionActions.newClub());
    }

    public static Result newPartner(){
        return ok(addPartner.render(partnerForm,institutionPartnershipForm,new Institution().getInstitutionMap()));
    }

    public static Result savePartner(){
        Form<Partner> partnerBoundForm = partnerForm.bindFromRequest();
        Form<InstitutionPartnership> institutionPartnershipBoundForm = institutionPartnershipForm.bindFromRequest();
        Map<String,String> partnerFormData = partnerBoundForm.data();
        String institution_id = partnerFormData.get("institution_id");

        if (partnerBoundForm.hasErrors() || institutionPartnershipBoundForm.hasErrors()){
            flash("partnererror","Correct form errors then resubmit");
            return badRequest(addPartner.render(partnerBoundForm,institutionPartnershipBoundForm,new Institution().getInstitutionMap(Long.parseLong(institution_id))));
        }

        Partner new_partner = partnerBoundForm.get();

        if(new_partner.partnerExists(new_partner.partner_name)){
            InstitutionPartnership institutionPartnership = institutionPartnershipBoundForm.get();
            institutionPartnership.partner = new_partner.getPartnerByName(new_partner.partner_name);
            institutionPartnership.institution = new Institution().getInstitutionById(Long.parseLong(institution_id));
            //save partnership only
            //Logger.info("Exists:" + new_partner.partner_name);
            institutionPartnership.saveInstitutionPartnership();
            flash("partnersuccess","Partner has been added successfully");
            return redirect(routes.InstitutionActions.newPartner());
        }
        //Logger.info("does not exist:" + new_partner.partner_name);
        InstitutionPartnership institutionPartnership = institutionPartnershipBoundForm.get();
        institutionPartnership.partner = new_partner;
        institutionPartnership.institution = new Institution().getInstitutionById(Long.parseLong(institution_id));
        //save partner and partnership
        new_partner.savePartner();
        institutionPartnership.saveInstitutionPartnership();
        flash("partnersuccess","Partner has been added successfully");
        return redirect(routes.InstitutionActions.newPartner());
    }

    public static Result searchPartners(String key){return ok(Json.parse(Partner.searchPartners(key)));}

    public static Result newLab(){
        return ok(addLab.render(researchCenterForm,new Institution().getInstitutionMap()));
    }

    public static Result saveLab(){return TODO;}
}
