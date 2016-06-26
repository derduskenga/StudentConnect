package models.web;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import play.data.validation.Constraints;

import java.util.List;

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
}
