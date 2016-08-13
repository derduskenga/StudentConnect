package models.web;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.List;

/**
 * Created by derdus on 6/21/16.
 */
/*We link courses with certification */
@Entity
public class CourseCertification extends Model{
    @Id
    public Long course_certification_id;

    //Entity relationships
    @ManyToOne
    public Course mainCourse;/*Main course*/
    @ManyToOne
    public Course certificationCourse; /*That which is a certification of the main course*/

    //Methods
    public static Finder<Long, CourseCertification> find(){
        return new Finder<Long, CourseCertification>(Long.class,CourseCertification.class);
    }

    public Long saveCourseCertification(){
        if(this.course_certification_id== null){
            save();
            return course_certification_id;
        }
        update();
        return course_certification_id;
    }

    public CourseCertification getCourseCertificationById(Long id){return find().byId(id);}

    public List<CourseCertification> getAllCertifications(){
        return find().all();
    }


    public boolean certificationCourseAlreadyAdded(Course mainCourse, Course minoCourse){
        boolean found = false;
        for (CourseCertification certifications : getAllCertifications()){
            if (certifications.mainCourse.equals(mainCourse) && certifications.certificationCourse.equals(minoCourse)){
                found = true;
            }
        }
        return found;
    }

}
