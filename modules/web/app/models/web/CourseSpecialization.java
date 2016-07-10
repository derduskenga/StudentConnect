package models.web;

import play.db.ebean.Model;

import javax.persistence.*;

/**
 * Created by derdus on 6/17/16.
 */
@Entity
public class CourseSpecialization extends Model {
    @Id
    public Long course_specialization_id;

    //Entity Specialization
    @ManyToOne
    public Specialization specialization;
    @ManyToOne
    public Course course;


    public static Finder<Long, CourseSpecialization> find(){
        return new Finder<Long, CourseSpecialization>(Long.class,CourseSpecialization.class);
    }

    public Long saveCourseSpecialization(){
        if (this.course_specialization_id == null){
            save();;
            return course_specialization_id;
        }
        update();
        return course_specialization_id;
    }
}
