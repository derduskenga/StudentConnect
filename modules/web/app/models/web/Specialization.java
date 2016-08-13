package models.web;

import com.google.gson.Gson;
import models.web.utility.Utility;
import play.db.ebean.Model;

import javax.persistence.*;
import java.util.*;

/**
 * Created by derdus on 6/17/16.
 */
/*
    A Course such as BCOM can have specialization such
    Accounting
    Finance
    Human Resources

 */

    @Entity
public class Specialization extends Model {
    @Id
    public Long specialization_id;
    public String specialization_name;
    public String course_specialization_blog_url = Utility.COURSE_SPECIALIZATION_BLOG_URL;
    @Column(columnDefinition = "TEXT")
    public String specialization_description;


    //Entity Relationship
    //..................................
    @OneToMany(mappedBy = "specialization")
    List<CourseSpecialization> courseSpecializationList;
    //..................................

    public static Finder<Long, Specialization> find(){
        return new Finder<Long, Specialization>(Long.class,Specialization.class);
    }

    public Long saveSpecialization (){
        if(this.specialization_id == null){
            save();
            return specialization_id;
        }
        update();
        return specialization_id;
    }

    public Specialization getSpecializationById(Long id){return find().byId(id);}
    public List<Specialization> getAllSpecializations(){
        return find().all();
    }
    public static String searchCourseSpecializations (String query){
        List<Specialization> specializationList = find().where().like("lower(specialization_name)","%" + query.toLowerCase() + "%").findList();
        String stringArray [] =  new String[specializationList.size()];
        for(int i = 0; i < specializationList.size(); i++){
            stringArray[i] = specializationList.get(i).specialization_name;
        }
        String jsonStr = new Gson().toJson(stringArray);
        return jsonStr;
    }

}
