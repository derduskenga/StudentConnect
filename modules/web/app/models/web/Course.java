package models.web;

import play.db.ebean.Model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by derdus on 6/16/16.
 */
@Entity
public class Course extends Model {
    @Id
    public Long course_id;
    public String course_name;
    @Column(columnDefinition = "TEXT")
    public String course_description;
    public String course_department_name;
    public String course_blog_url;

    //Other details

    //Entity relationships
    @OneToMany(mappedBy = "course")
    public List<InstitutionCourse> institutionCourseList;
    @ManyToOne
    public CourseLevel courseLevel;
    @ManyToOne
    public CourseField courseField;
    //.................................................
    @OneToMany(mappedBy = "course")
    public List<CourseSpecialization> courseSpecializationList;
    @OneToMany(mappedBy = "course")
    public List<JobPlacement> jobPlacementList;
    @OneToMany(mappedBy = "certificationCourse")
    public List<CourseCertification> courseCertificationList; /*For any course picked, we fetch all associated cetification courses*/

}
