package models.web;

import play.db.ebean.Model;

import javax.persistence.*;
import java.util.*;
import play.data.validation.Constraints;

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
    public Long course_level_id;
    @Constraints.Required(message = "Field level required e.g. Bachalors, Master, PhD etc..")
    public String course_level_name;
    @Constraints.Required(message = "Field description required including examples and abbreviations")
    @Column(columnDefinition = "TEXT")
    public String course_level_description;


    //Entity
    @OneToMany(mappedBy = "courseLevel")
    public List<Course> courseList;


    //methods
    public static Finder<Long, CourseLevel> find(){
        return new Finder<Long, CourseLevel>(Long.class,CourseLevel.class);
    }

    public Long saveCourseLevel(){
        if(this.course_level_id == null){
            save();
            return course_level_id;
        }
        update();
        return course_level_id;
    }

    public CourseLevel getCourseLevelById(Long id){
        return CourseLevel.find().byId(id);
    }

    public List<CourseLevel> fetchAllCourseLevel(){
        return find().all();
    }
    public void deleteCourseLevel(Long id){
        if(getCourseLevelById(id) != null){
            getCourseLevelById(id).delete();
        }
    }

}
