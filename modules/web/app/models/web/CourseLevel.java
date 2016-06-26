package models.web;

import play.db.ebean.Model;

import javax.persistence.*;
import java.util.*;

/**
 * Created by derdus on 6/16/16.
 */
/*
    Course level values include
    Certificate
    Bachalors
    Master
    PhD
    Associate degrees
    Certification/Professionals
    Short courses
    Postdoctoral degree
    Other (E.g a Political science student may take a postgraduate diploma in law OR
    BCOM student specialising in marketing may take a a postgraduate diploma in Marketing )
 */
@Entity
public class CourseLevel extends Model {
    @Id
    public Long Course_level_id;
    public String Course_level_name;
    public String Course_level_abbreviation;
    @Column(columnDefinition = "TEXT")
    public String Course_level_description;


    //Entity
    @OneToMany(mappedBy = "courseLevel")
    public List<Course> courseList;
}
