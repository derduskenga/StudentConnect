package models.web;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by derdus on 6/17/16.
 */
@Entity
public class Partner extends Model {
    @Id
    public  Long partner_id;
    public String partner_name;
    public String partner_description;
    public String partner_website_url;

    //Entity Relationship
    @OneToMany(mappedBy = "partner")
    List<InstitutionPartnership> institutionPartnershipList;


}
