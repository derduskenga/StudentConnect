package models.web;

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
    @Column(columnDefinition = "TEXT")
    public String specialization_description;


    //Entity Relationship
    //..................................
    @OneToMany(mappedBy = "specialization")
    List<CourseSpecialization> courseSpecializationList;
    //..................................
}
