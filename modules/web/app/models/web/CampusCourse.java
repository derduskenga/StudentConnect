package models.web;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by derdus on 7/23/16.
 */
@Entity
public class CampusCourse extends Model {
    @Id
    public Long campus_course_id;

    //Relationship
    @ManyToOne
    public Campus campus;
    @ManyToOne
    public Course course;
}
