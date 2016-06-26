package models.web;

import java.util.*;
import javax.persistence.*;
import play.mvc.*;
import  play.data.validation.Constraints;
import play.db.ebean.Model;


/**
 * Created by derdus on 6/15/16.
 */
@Entity
public class Institution extends Model{
    @Id
    public Long institution_id;
    @Constraints.Required(message = "This field is required")
    public String institution_name;
    @Constraints.Required(message = "This field is required")
    public String institution_abbreviation;
    @Constraints.Required(message = "This field is required")
    public String institution_website_url;
    @Constraints.Required(message = "This field is required")
    public String institution_logo_path;
    @Constraints.Required(message = "This field is required")
    @Column(columnDefinition = "TEXT")
    public String institution_description;
    public String institution_known_for;
    public String nearest_town;
    public String institution_chancellor;
    public String institution_vc;
    public String institution_email;
    public String institution_tel;
    public String institution_phone;
    public String institution_address;
    /*This is overall ranking. Note that some institutions be ranked differently at fuculty level*/
    public int institution_ranking_local;/*Ranking in kenya*/
    public int institution_ranking_africa;/*ranking in africa*/
    public int institution_ranking_global;/*Ranking in the world*/
    public String institution_motto;
    @Column(columnDefinition = "TEXT")
    public String institution_map_embed_url;
    public Region region;
    //plus many other attributes

    //Entity relationships
    //.......................................................
    @ManyToOne
    public InstitutionCategory institutionCategory;
    @ManyToOne
    public County county;
    //......................................................
    @OneToMany(mappedBy = "institution")
    public List <Campus> campusList;
    @OneToMany(mappedBy = "institution")
    public List<ClubSociety> clubSocietyList;
    @OneToMany(mappedBy = "institution")
    public List<SchoolOrFaculty> schoolOrFacultyList;
    @OneToMany(mappedBy = "institution")
    public List<ResearchCenter> researchCenterList;
    @OneToMany(mappedBy = "institution")
    public List<InstitutionPartnership> institutionPartnershipList;
    @OneToMany(mappedBy = "institution")
    public List<InstitutionCourse> institutionCourseList;
    //Methods come here
    public static Finder<Long, Institution> find(){
        return new Finder<Long, Institution>(Long.class,Institution.class);
    }

    /**
     *Saving {@link Institution} object
     * @return institution_id
     * @author Derdus
     */
    public Long saveInstitution(){
        if(this.institution_id == null){//Saving at first instanace; Id has not been generated
            save();/*save() is method from Models base class*/
            return institution_id;
        }
        //Means we are just updating, because the Institution object has a an ID already.
        update();/*update() is method from Models base class*/
        return institution_id;
    }

    /**
     * Returns an {@link Institution}
     * @param id
     * @return Institution
     */
    public Institution getInstitutionById(Long id){
        return Institution.find().byId(id);
    }

    /**
     * Search an institution by using institution_abbreviation e.g. JKUAT
     * @param abbreviation
     * @return Institution
     */
    public Institution getInstitutionByAbbreviation(String abbreviation){
        return Institution.find().where().eq("institution_abbreviation",abbreviation).findUnique();
    }

}
