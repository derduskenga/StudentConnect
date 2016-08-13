package models.web;

import play.db.ebean.Model;

import javax.persistence.*;
import java.util.List;

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
    public Institution institution;

    //Methods come here
    public static Finder<Long, ClubSociety> find(){
        return new Finder<Long, ClubSociety>(Long.class,ClubSociety.class);
    }

    public Long saveClub(){
        if (this.club_society_id == null){
            save();
            return club_society_id;
        }
        update();
        return club_society_id;
    }

    public ClubSociety getClubById(Long id){
        return find().byId(id);
    }

    public List<ClubSociety> getAllClubs(){return find().all();}

    public List<ClubSociety> getClubsByInstitution(Long institution_id){
        return find().where().eq("institution.institution_id",institution_id).findList();
    }
}

