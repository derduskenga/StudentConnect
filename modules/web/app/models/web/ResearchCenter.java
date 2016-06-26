package models.web;

import play.db.ebean.Model;

import javax.persistence.*;

/**
 * Created by derdus on 6/16/16.
 */
//Can also be Research Labs
@Entity
public class ResearchCenter extends Model {
    @Id
    public Long research_center_id;
    public String research_center_name;
    @Column(columnDefinition="TEXT")
    public String research_center_description;
    public String research_center_email;
    public String research_center_contact_person;
    public String research_center_url;
    public String research_center_phone;
    public String research_center_known_for;


    //Entity reationship
    @ManyToOne
    public Institution institution;
}
