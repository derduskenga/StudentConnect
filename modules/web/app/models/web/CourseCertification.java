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
    public Course certificationCourse; /*That which is a certification of the main course*/


}
