package models.web;

import models.web.utility.Utility;
import play.db.ebean.Model;

import javax.persistence.*;
import java.util.List;
import play.data.validation.Constraints;

/**
 * Created by derdus on 6/16/16.
 */
@Entity
public class Course extends Model {
    @Id
    public Long course_id;
    @Constraints.Required(message = "Course name required")
    public String course_name;
    @Constraints.Required(message = "Course description required")
    @Column(columnDefinition = "TEXT")
    public String course_description;
    public String course_blog_url = Utility.COURSE_BLOG_URL;

    //Other details

    //Entity relationships
    @ManyToOne
    public CourseLevel courseLevel;
    @ManyToOne
    public CourseField courseField;
    //.................................................
    @OneToMany(mappedBy = "course")
    public List<InstitutionCourse> institutionCourseList;
    @OneToMany(mappedBy = "course")
    public List<CourseSpecialization> courseSpecializationList;
    @OneToMany(mappedBy = "course")
    public List<JobPlacement> jobPlacementList;
    @OneToMany(mappedBy = "certificationCourse")
    public List<CourseCertification> courseCertificationList; /*For any course picked, we fetch all associated cetification courses*/


    //Methods
    public static Finder<Long, Course> find(){
        return new Finder<Long, Course>(Long.class,Course.class);
    }

    public Long saveCourse(){
        if(this.course_id == null){
            save();
            return course_id;
        }
        update();
        return course_id;
    }

    public Course getCourseById (Long id){
        return  find().byId(id);
    }

    public List<Course> fetchAllCourses(){
        return find().all();
    }

    public void deleteCourse(Long id){
        if(getCourseById(id) != null){
            getCourseById(id).delete();
        }
    }


}
