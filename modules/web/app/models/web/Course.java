package models.web;

import models.web.utility.Utility;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import play.Logger;
import play.db.ebean.Model;

import javax.persistence.*;
import java.util.*;

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
    @OneToMany(mappedBy = "course")
    public List<CampusCourse> campusCourseList;


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

    public boolean deleteCourse(Long id){
        if(getCourseById(id) != null){
            try {
                getCourseById(id).delete();
                return true;
            }catch (PersistenceException pe){
                Logger.error("Error: " + pe.getMessage().toString());
                return false;
            }catch (Exception ex){
                Logger.error("Error:" + ex.getMessage().toString());
                return false;
            }
        }
        return false;
    }

    public List<Course> filterCoursesByInstitutionByCampus(Institution institution, Campus campus){
        List<Course> courseList = new ArrayList<Course>();
        for (int i = 0;i<institution.institutionCourseList.size(); i++){
            if(institution.institutionCourseList.get(i).campus.equals(campus)){
                courseList.add(institution.institutionCourseList.get(i).course);
            }
        }
        return courseList;
    }

    public Map<Map<Long,String>,Boolean> coursesMap(){
        List<Course> courseList = find().orderBy("course_name").findList();
        Map<Map<Long,String>,Boolean> courseMap = new LinkedHashMap<Map<Long,String>,Boolean>();
        for(int i = 0; i < courseList.size(); i++){
            Map<Long,String> innerCourseMap  = new HashMap<Long,String>();
            innerCourseMap.put(courseList.get(i).course_id,courseList.get(i).course_name + "-" + courseList.get(i).courseLevel.course_level_name);
            courseMap.put(innerCourseMap,false);
        }
        return courseMap;
    }

    public JSONArray getCampusCourses(List<Course> courseList){
        JSONArray jsonArray = new JSONArray();
        for (Course course: courseList){
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("id",course.course_id);
            jsonObject.put("name",course.course_name);
            jsonArray.add(jsonObject);
        }
        return jsonArray;
    }
}
