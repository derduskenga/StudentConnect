package models.web;

import play.db.ebean.Model;

import javax.persistence.*;

/**
 * Created by derdus on 6/16/16.
 */
@Entity
public class ClubSociety extends Model {
    @Id
    public Long club_society_id;
    public String club_society_name;
    @Column(columnDefinition = "TEXT")
    public String club_society_description;


    //other details
    //Chairperson and other members
    //activities of the club
    //requirements for joining or entry including registration fees and seasonal contributions


    //Relationship fields/Entity mapping
    @ManyToOne
    Institution institution;
}
