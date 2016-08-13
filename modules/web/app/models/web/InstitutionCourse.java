package models.web;

import play.db.ebean.Model;

import javax.persistence.*;
import java.util.List;
import play.data.validation.Constraints;

/**
 * Created by derdus on 6/19/16.
 */
//Assigning courses to institutions
@Entity
public class InstitutionCourse extends Model {
    @Id
    public Long institution_course_id;
    @Constraints.Required(message = "Department name required")
    public String course_department_name;

    //Entity Relationship

    @ManyToOne
    public Institution institution;
    @ManyToOne
    public Course course;
    @ManyToOne
    public SchoolOrFaculty schoolOrFaculty;
    @ManyToOne
    public Campus campus;

    @OneToOne(mappedBy = "institutionCourse")
    public ExaminationBody examinationBody;

    @OneToMany(mappedBy = "institutionCourse")
    public List<CourseInstitutionModeOfStudy> courseInstitutionModeOfStudyList;

    //methods
    public static Finder<Long, InstitutionCourse> find(){
        return new Finder<Long, InstitutionCourse>(Long.class,InstitutionCourse.class);
    }
    public Long saveInstitutionCourse(){
        if (this.institution_course_id == null){
            save();
            return institution_course_id;
        }
        update();
        return institution_course_id;
    }

    public List<InstitutionCourse> getAllInstitutionCourses(){return find().all();}

    public InstitutionCourse getInstitutionCourseById(Long id){return find().byId(id);}

    public boolean courseHasBeenAdded(Campus campus, Course course){
        List<InstitutionCourse> institutionCourseList = getAllInstitutionCourses();
        boolean found = false;
        for (int i =0; i<institutionCourseList.size(); i++){
            if (institutionCourseList.get(i).campus.equals(campus) && institutionCourseList.get(i).course.equals(course)){
                found = true;
            }
        }
        return found;
    }
}