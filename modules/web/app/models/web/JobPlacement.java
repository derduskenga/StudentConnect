package models.web;

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
     System intergrator
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
    public String job_placement_blog_url;


    //Entity Relationship
    @ManyToOne
    public Course course;
}

