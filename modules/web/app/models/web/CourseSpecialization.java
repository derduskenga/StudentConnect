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
}
