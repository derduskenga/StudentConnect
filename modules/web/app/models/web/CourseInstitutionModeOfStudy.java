package models.web;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by derdus on 6/22/16.
 */
/*We link course in an institution to a mode of study*/
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
}
