package models.web;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import play.Logger;
import play.data.validation.Constraints;
import play.db.ebean.Model;

import javax.persistence.*;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by derdus on 6/15/16.
 */
//For a university institution category, university colleges are included
@Entity
public class Campus extends Model {
    @Id
    public Long campus_id;
    @Constraints.Required(message = "This field is required")
    public String campus_name;
    @Constraints.Required(message = "This field is required")
    public String campus_nearest_town;
    @Constraints.Required(message = "This field is required")
    public String campus_description;
    public Boolean is_main_campus = false;

    //Relationship fields/Entity mapping
    @ManyToOne
    public Institution institution;

    @OneToMany(mappedBy = "campus")
    public List<CampusCourse> campusCourseList;
    @OneToMany(mappedBy = "campus")
    public List<SchoolOrFacultyCampus> schoolOrFacultyCampusList;


    //methods
    public static Finder<Long, Campus> find(){
        return new Finder<Long, Campus>(Long.class,Campus.class);
    }

    public Long saveCampus(){
        if(this.campus_id == null){
            save();
            return campus_id;
        }
        update();
        return campus_id;
    }

    public Campus getCampusById(Long id){
        return find().byId(id);
    }

    public boolean deleteCampus(Long id){
        if (getCampusById(id) != null){
            try {
                getCampusById(id).delete();;
                return true;
            }catch (PersistenceException pe){
                Logger.error("Error:" + pe.getMessage().toString());
                return false;
            }catch (Exception ex){
                Logger.error("Error:" + ex.getMessage().toString());
            }
        }
        return false;
    }

    public JSONArray getCampusByInstitution(Institution institution){
        JSONArray jsonArray = new JSONArray();
        for (int i = 0; i<institution.campusList.size(); i++){
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("id",institution.campusList.get(i).campus_id);
            jsonObject.put("name",institution.campusList.get(i).campus_name);
            jsonArray.add(jsonObject);
        }
        return jsonArray;
    }


    public Map<Map<Long,String>,Boolean> getCampusMap(){
        List<Campus> campusList = find().orderBy("campus_name").findList();
        Map<Map<Long,String>,Boolean> campusMap = new LinkedHashMap<Map<Long,String>,Boolean>();
        for(int i = 0; i < campusList.size(); i++){
            Map<Long,String> innerMap  = new HashMap<Long,String>();
            innerMap.put(campusList.get(i).campus_id,campusList.get(i).campus_name);
            campusMap.put(innerMap,false);
        }
        return campusMap;
    }

    public Map<Map<Long,String>,Boolean> getCampusMap(Long id){
        List<Campus> campusList = find().orderBy("campus_name").findList();
        Map<Map<Long,String>,Boolean> campusMap = new LinkedHashMap<Map<Long,String>,Boolean>();
        for(int i = 0; i < campusList.size(); i++){
            Map<Long,String> innerMap  = new HashMap<Long,String>();
            innerMap.put(campusList.get(i).campus_id,campusList.get(i).campus_name);
            if(campusList.get(i).campus_id == id){
                campusMap.put(innerMap,true);
            }else{
                campusMap.put(innerMap,false);
            }
        }
        return campusMap;
    }

}
