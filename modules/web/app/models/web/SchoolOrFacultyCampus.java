package models.web;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by derdus on 7/24/16.
 */
@Entity
public class SchoolOrFacultyCampus extends Model {
    @Id
    public Long school_or_faculty_campus_id;


    //relationship variables
    @ManyToOne
    public Campus campus;
    @ManyToOne
    public SchoolOrFaculty schoolOrFaculty;

    public Long saveSchoolCampus(){
        if (this.school_or_faculty_campus_id == null){
            save();
            return school_or_faculty_campus_id;
        }
        update();
        return school_or_faculty_campus_id;
    }
}
