package models.web;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by derdus on 6/22/16.
 */
/*We link course in an institution to a mode of study then we assign its fees*/
@Entity
public class CourseInstitutionModeOfStudy extends Model {
    @Id
    public Long course_institution_mode_of_study_id;
    public ModeOfStudy modeOfStudy;
    /*Fees is given in shillings. We will have an option for converting it to US dollars
    * and does not include such items as student ID, statutory fees, library fees. It only includes
    * Tuition fees and administrative fees etc....*/
    public double institution_course_fees;
    /*if fees is available online, provide a link to check*/
    public String institution_course_fees_url;

    //Entity relationships
    @ManyToOne
    public InstitutionCourse institutionCourse;



    //methods
    public static Finder<Long, CourseInstitutionModeOfStudy> find(){
        return new Finder<Long, CourseInstitutionModeOfStudy>(Long.class,CourseInstitutionModeOfStudy.class);
    }

    public Long saveModeOfStudy(){
        if (this.course_institution_mode_of_study_id == null){
            save();
            return course_institution_mode_of_study_id;
        }
        update();
        return course_institution_mode_of_study_id;
    }

    public CourseInstitutionModeOfStudy getModeOfStudyById(Long id){
        return find().byId(id);
    }

    public List<CourseInstitutionModeOfStudy> getAllCoursesModeOfStudy(){return find().all();}

    public List<CourseInstitutionModeOfStudy> getInstitutionCoursesWithoutFees(){
        return find().where().eq("institution_course_fees",0).eq("institution_course_fees_url",null).findList();
    }


    public List<ModeOfStudy> getModesOfStudyByInstitutionCampusAndCourse(Institution institution, Campus campus, Course course){
        //We return a list of modes of study
        List<ModeOfStudy> modeOfStudyList = new ArrayList<ModeOfStudy>();
        for (CourseInstitutionModeOfStudy courseInstitutionModeOfStudy: getAllCoursesModeOfStudy()){
            if (courseInstitutionModeOfStudy.institutionCourse.course.equals(course) &&
                    courseInstitutionModeOfStudy.institutionCourse.campus.equals(campus) &&
                    courseInstitutionModeOfStudy.institutionCourse.institution.equals(institution)){
                modeOfStudyList.add(courseInstitutionModeOfStudy.modeOfStudy);
            }
        }
        return modeOfStudyList;
    }

    public boolean modeOfStudyAlreadyExist(InstitutionCourse institutionCourse, ModeOfStudy modeOfStudy){
        boolean found = false;
        for (CourseInstitutionModeOfStudy courseInstitutionModeOfStudy : getAllCoursesModeOfStudy()){
            if (courseInstitutionModeOfStudy.modeOfStudy.equals(modeOfStudy) && courseInstitutionModeOfStudy.institutionCourse.equals(institutionCourse)){
                found = true;
            }
        }
        return found;
    }

}
