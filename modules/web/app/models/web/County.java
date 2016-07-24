package models.web;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import play.data.validation.Constraints;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by derdus on 6/22/16.
 */
/*For the 47 counties in kenya*/
@Entity
public class County extends Model{
    @Id
    public Long county_id;
    @Constraints.Required(message = "County name required")
    public String county_name;


    //Entity relationship
    @OneToMany(mappedBy = "county")
    public List<Institution> institutionList;


    //methods
    public static Finder<Long, County> find(){
        return new Finder<Long, County>(Long.class,County.class);
    }
    public County fetchCountyById(Long id){return find().byId(id);}

    public Map<Map<Long,String>,Boolean> fetchCountyMap(){
        List<County> countyList = find().orderBy("county_name").findList();
        Map<Map<Long,String>,Boolean> countyMap = new LinkedHashMap<Map<Long,String>,Boolean>();
        for(int i = 0; i < countyList.size(); i++){
            Map<Long,String> innerMap  = new HashMap<Long,String>();
            innerMap.put(countyList.get(i).county_id,countyList.get(i).county_name);
            countyMap.put(innerMap,false);
        }
        return countyMap;
    }

    public Map<Map<Long,String>,Boolean> fetchCountyMap(Long id){
        List<County> countyList = find().orderBy("county_name").findList();
        Map<Map<Long,String>,Boolean> countyMap = new LinkedHashMap<Map<Long,String>,Boolean>();
        for(int i = 0; i < countyList.size(); i++){
            Map<Long,String> innerMap  = new HashMap<Long,String>();
            innerMap.put(countyList.get(i).county_id,countyList.get(i).county_name);
            if(countyList.get(i).county_id == id){
                countyMap.put(innerMap,true);
            }else{
                countyMap.put(innerMap,false);
            }
        }
        return countyMap;
    }


}
