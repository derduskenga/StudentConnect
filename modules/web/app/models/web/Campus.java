package models.web;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by derdus on 6/15/16.
 */
//For a university institution category, university colleges are included
@Entity
public class Campus extends Model {
    @Id
    public Long campus_id;
    public String campus_name;
    public String campus_description;

    //Relationship fields/Entity mapping
    @ManyToOne
    public Institution institution;
    //We need to map courses and campuses
}
