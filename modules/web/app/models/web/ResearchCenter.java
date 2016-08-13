package models.web;

import play.data.validation.Constraints;
import play.db.ebean.Model;

import javax.persistence.*;
import java.util.List;

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
    @Constraints.Email(message = "Invalid email")
    public String research_center_email;
    public String research_center_contact_person;
    public String research_center_url;
    public String research_center_phone;
    public String research_center_known_for;


    //Entity relationship
    @ManyToOne
    public Institution institution;


    //Methods come here
    public static Finder<Long, ResearchCenter> find(){
        return new Finder<Long, ResearchCenter>(Long.class,ResearchCenter.class);
    }


    public Long saveResearchCenter(){
        if (this.research_center_id == null){
            save();
            return research_center_id;
        }
        update();
        return research_center_id;
    }

    public ResearchCenter getResearchCenterById(Long id){return find().byId(id);}

    public List<ResearchCenter> getAllResearchCenter(){return find().all();}
}
