package models.web;

import models.web.utility.Utility;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import play.Logger;
import play.db.ebean.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.*;
import com.google.gson.Gson;

/**
 * Created by derdus on 6/17/16.
 */
/*
    For example for Computer Science you can be:
    Researcher
    Lecturer in University
    Computer Programmer
     System integrator
      Network Engineer
      System Designer etc.
 */
@Entity
public class JobPlacement extends Model {
    @Id
    public Long job_placement_id;
    public String job_placement_name;
    @Column(columnDefinition = "TEXT")
    public String job_placement_description;
    public String job_placement_blog_url = Utility.JOB_PLACEMENT_BLOG_URL;


    //Entity Relationship
    @ManyToOne
    public Course course;
    //Methods
    public static Finder<Long, JobPlacement> find(){
        return new Finder<Long, JobPlacement>(Long.class,JobPlacement.class);
    }
    public Long saveJobPlacement(){
        if(this.job_placement_id == null){
            save();
            return job_placement_id;
        }
        update();
        return job_placement_id;
    }
    public JobPlacement getJobPlacementById(Long id){
        return find().byId(id);
    }

    public static String searchJobTitles(String query){
        //List<JobPlacement> jobPlacementLis =
       List<JobPlacement> jobPlacementList = find().where().like("lower(job_placement_name)","%" + query.toLowerCase() + "%").findList();
       // List<JobPlacement> jobPlacementList = find().where().
        String stringArray [] =  new String[jobPlacementList.size()];
        //Logger.info("Size:" + jobPlacementList.size());
        for(int i = 0; i<jobPlacementList.size(); i++) {
            stringArray[i] = jobPlacementList.get(i).job_placement_name;
        }
        String jsonStr = new Gson().toJson(stringArray);
        return jsonStr;
    }
}

