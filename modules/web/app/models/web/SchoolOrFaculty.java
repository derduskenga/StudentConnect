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
 * Created by derdus on 6/16/16.
 */
@Entity
public class SchoolOrFaculty extends Model {
    @Id
    public Long school_id;
    @Constraints.Required(message = "This field is required")
    public String school_name;
    @Constraints.Required(message = "This field is required")
    @Column(columnDefinition = "TEXT")
    public String school_description;

    //Entity relationships
    @ManyToOne
    public Institution institution;

    //Link faculty/schools and the courses it offers
    @OneToMany(mappedBy = "schoolOrFaculty")
    public List<InstitutionCourse> institutionCourseList;
    @OneToMany(mappedBy = "schoolOrFaculty")
    public List<SchoolOrFacultyCampus> schoolOrFacultyCampusList;


    //methods
    public static Finder<Long, SchoolOrFaculty> find(){
        return new Finder<Long, SchoolOrFaculty>(Long.class,SchoolOrFaculty.class);
    }

    public Long saveSchool(){
        if (this.school_id == null){
            save();
            return school_id;
        }
        update();
        return school_id;
    }

    public SchoolOrFaculty getSchoolById(Long id){
        return find().byId(id);
    }

    public boolean deleteSchool(Long id){
        if (getSchoolById(id) != null){
            try {
                getSchoolById(id).delete();
                return true;
            }catch (PersistenceException pe){
                Logger.error("Error:" + pe.getMessage().toString());
                return false;
            }catch (Exception ex){
                Logger.error("Error:" + ex.getMessage().toString());
                return false;
            }
        }
        return true;
    }
    public Map<Map<Long,String>,Boolean> getSchoolMap(){
        List<SchoolOrFaculty> schoolList = find().orderBy("school_name").findList();
        Map<Map<Long,String>,Boolean> schoolMap = new LinkedHashMap<Map<Long,String>,Boolean>();
        for(int i = 0; i < schoolList.size(); i++){
            Map<Long,String> innerMap  = new HashMap<Long,String>();
            innerMap.put(schoolList.get(i).school_id,schoolList.get(i).school_name);
            schoolMap.put(innerMap,false);
        }
        return schoolMap;
    }

    public Map<Map<Long,String>,Boolean> getSchoolMap(Long id){
        List<SchoolOrFaculty> schoolList = find().orderBy("school_name").findList();
        Map<Map<Long,String>,Boolean> schoolMap = new LinkedHashMap<Map<Long,String>,Boolean>();
        for(int i = 0; i < schoolList.size(); i++){
            Map<Long,String> innerMap  = new HashMap<Long,String>();
            innerMap.put(schoolList.get(i).school_id,schoolList.get(i).school_name);
            if(schoolList.get(i).school_id == id){
                schoolMap.put(innerMap,true);
            }else{
                schoolMap.put(innerMap,false);
            }
        }
        return schoolMap;
    }

    public JSONArray getSchoolByInstitution(Institution institution){
        JSONArray jsonArray = new JSONArray();
        for (int i = 0; i<institution.schoolOrFacultyList.size(); i++){
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("id",institution.schoolOrFacultyList.get(i).school_id);
            jsonObject.put("name",institution.schoolOrFacultyList.get(i).school_name);
            jsonArray.add(jsonObject);
        }
        return jsonArray;
    }

    public JSONArray getSchoolBycampus(Campus campus){
        JSONArray jsonArray = new JSONArray();
        for(int i=0; i<campus.schoolOrFacultyCampusList.size();i++){
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("id",campus.schoolOrFacultyCampusList.get(i).schoolOrFaculty.school_id);
            jsonObject.put("name",campus.schoolOrFacultyCampusList.get(i).schoolOrFaculty.school_name);
            jsonArray.add(jsonObject);
        }
        return jsonArray;
    }

}
