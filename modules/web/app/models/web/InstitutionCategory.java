package models.web;

import play.Logger;
import play.data.validation.Constraints;
import play.db.ebean.Model;

import javax.persistence.*;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by derdus on 6/16/16.
 */
/*Values examples: Public University, Private University, Colleges,
Technical institutions/Institutes, Research Institutions, Special Schools, Business Incubators, Online Learning etc...*/
@Entity
public class InstitutionCategory extends Model {
    @Id
    public Long institution_category_id;
    @Constraints.Required(message = "This field is required")
    public String institution_category_name;
    @Constraints.Required(message = "This field is required")
    public String institution_category_description;


    //Entity Relations
    //............................................

    //..........................................
    @OneToMany(mappedBy = "institutionCategory")
    public List<Institution> institutionList;

    //methods
    public static Finder<Long, InstitutionCategory> find(){
        return new Finder<Long, InstitutionCategory>(Long.class,InstitutionCategory.class);
    }
    public Long saveInstitutionCategory(){
        if(this.institution_category_id == null){
            save();
            return institution_category_id;
        }
        update();
        return institution_category_id;
    }
    public InstitutionCategory fetchInstitutionCategoryById(Long id){
        return find().byId(id);
    }
    public List<InstitutionCategory> fetchAllInstitutionCategories(){
        return find().orderBy("institution_category_name").findList();
    }
    public boolean deleteInstitutionCategoryById(Long id){
        if(fetchInstitutionCategoryById(id) != null){
            try {
                fetchInstitutionCategoryById(id).delete();
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

    public Map<Map<Long,String>,Boolean> fetchInstitutonCategoryMap(){
        List<InstitutionCategory> institutionCategoryList = find().orderBy("institution_category_name").findList();
        Map<Map<Long,String>,Boolean> institutionCategoryMap = new LinkedHashMap<Map<Long,String>,Boolean>();
        for(int i = 0; i < institutionCategoryList.size(); i++){
            Map<Long,String> innerMap  = new HashMap<Long,String>();
            innerMap.put(institutionCategoryList.get(i).institution_category_id,institutionCategoryList.get(i).institution_category_name);
            institutionCategoryMap.put(innerMap,false);
        }
        return institutionCategoryMap;
    }

    public Map<Map<Long,String>,Boolean> fetchInstitutonCategoryMap(Long id){
        List<InstitutionCategory> courseFieldList = find().orderBy("institution_category_name").findList();
        Map<Map<Long,String>,Boolean> institutionCategoryMap = new LinkedHashMap<Map<Long,String>,Boolean>();
        for(int i = 0; i < courseFieldList.size(); i++){
            Map<Long,String> innerMap  = new HashMap<Long,String>();
            innerMap.put(courseFieldList.get(i).institution_category_id,courseFieldList.get(i).institution_category_name);
            if(courseFieldList.get(i).institution_category_id == id){
                institutionCategoryMap.put(innerMap,true);
            }else {
                institutionCategoryMap.put(innerMap,false);
            }
        }
        return institutionCategoryMap;
    }

}
