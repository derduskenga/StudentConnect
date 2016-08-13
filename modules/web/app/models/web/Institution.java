package models.web;

import java.util.*;
import javax.persistence.*;

import play.Logger;
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
    //@Constraints.Required(message = "This field is required")
    public String institution_logo_path;
    @Constraints.Required(message = "This field is required")
    @Column(columnDefinition = "TEXT")
    public String institution_description;
    //@Constraints.Required(message = "This field is required")
    public String institution_known_for;
    @Constraints.Required(message = "This field is required")
    public String institution_nearest_town;
    public String institution_chancellor;
    public String institution_vc;
    @Constraints.Required(message = "This field is required")
    @Constraints.Email(message = "Invalid email")
    public String institution_email;
    public String institution_tel;
    @Constraints.Required(message = "This field is required")
    public String institution_phone;
    @Constraints.Required(message = "This field is required")
    public String institution_address;
    /*This is overall ranking. Note that some institutions be ranked differently at fuculty level*/
    public int institution_ranking_local = 0;/*Ranking in kenya*/
    public int institution_ranking_africa = 0;/*ranking in africa*/
    public int institution_ranking_global = 0;/*Ranking in the world*/
    @Constraints.Required(message = "This field is required")
    public String institution_motto;
    @Column(columnDefinition = "TEXT")
    public String institution_map_embed_url;
    @Constraints.Required(message = "This field is required")
    public Region region;
    @Constraints.Required(message = "This field is required")
    public int year_established;
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
    public Institution getInstitutionById(Long id){return Institution.find().byId(id);}

    /**
     * Search an institution by using institution_abbreviation e.g. JKUAT
     * @param abbreviation
     * @return Institution
     */
    public Institution getInstitutionByAbbreviation(String abbreviation){
        return Institution.find().where().eq("institution_abbreviation",abbreviation).findUnique();
    }
    public List<Institution> fetchAllInstitutions(){return find().all();}

    public boolean deleteInstitution(Long id){
        if(getInstitutionById(id) != null){
            try {
                getInstitutionById(id).delete();
                return true;
            }catch (PersistenceException pe){
                Logger.error("Error:" + pe.getMessage().toString());
                return false;
            }catch (Exception ex){
                Logger.error("Error:" + ex.getMessage().toString());
                return false;
            }
        }
        return false;
    }
    public Map<Map<Long,String>,Boolean> getInstitutionMap(){
        List<Institution> institutionList = find().orderBy("institution_name").findList();
        Map<Map<Long,String>,Boolean> institutionMap = new LinkedHashMap<Map<Long,String>,Boolean>();
        for(int i = 0; i < institutionList.size(); i++){
            Map<Long,String> innerCourseMap  = new HashMap<Long,String>();
            innerCourseMap.put(institutionList.get(i).institution_id,institutionList.get(i).institution_name);
            institutionMap.put(innerCourseMap,false);
        }
        return institutionMap;
    }

    public Map<Map<Long,String>,Boolean> getInstitutionMap(Long id){
        List<Institution> institutionList = find().orderBy("institution_name").findList();
        Map<Map<Long,String>,Boolean> institutionMap = new LinkedHashMap<Map<Long,String>,Boolean>();
        for(int i = 0; i < institutionList.size(); i++){
            Map<Long,String> innerCourseMap  = new HashMap<Long,String>();
            innerCourseMap.put(institutionList.get(i).institution_id,institutionList.get(i).institution_name);
            if (institutionList.get(i).institution_id == id){
                institutionMap.put(innerCourseMap,true);
            }else {
                institutionMap.put(innerCourseMap,false);
            }
        }
        return institutionMap;
    }
    public Map<Map<String,String>,Boolean> getRegionsMap(){
        Map<Map<String,String>,Boolean> regionsMap = new LinkedHashMap<Map<String,String>,Boolean>();
        for(Region r: Region.values()){
            Map<String,String> innerMap  = new HashMap<String,String>();
            innerMap.put(r.toString(),r.toString());
            regionsMap.put(innerMap,false);
        }
        return regionsMap;
    }

    public Map<Map<String,String>,Boolean> getRegionsMap(String region_ordinal){
        Map<Map<String,String>,Boolean> regionsMap = new LinkedHashMap<Map<String,String>,Boolean>();
        for(Region r: Region.values()){
            Map<String,String> innerMap  = new HashMap<String,String>();
            innerMap.put(r.toString(),r.toString());
            if(r.toString() == region_ordinal){
                regionsMap.put(innerMap,true);
            }else{
                regionsMap.put(innerMap,false);
            }
        }
        return regionsMap;
    }
}
