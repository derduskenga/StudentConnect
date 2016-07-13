package models.web;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

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

}
