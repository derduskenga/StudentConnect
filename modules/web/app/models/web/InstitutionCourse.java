package models.web;

import play.db.ebean.Model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by derdus on 6/19/16.
 */
//Assigning courses to institutions
@Entity
public class InstitutionCourse extends Model {
    @Id
    public Long institution_course_id;

    //Entity Relationship

    @ManyToOne
    public Institution institution;
    @ManyToOne
    public Course course;
    @OneToOne(mappedBy = "institutionCourse")
    public ExaminationBody examinationBody;

    @ManyToOne
    public SchoolOrFaculty schoolOrFaculty;

    @OneToMany(mappedBy = "institutionCourse")
    public List<CourseInstitutionModeOfStudy> courseInstitutionModeOfStudyList;
}