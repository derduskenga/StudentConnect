package models.web;

import models.web.utility.Utility;
import play.db.ebean.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

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
}

