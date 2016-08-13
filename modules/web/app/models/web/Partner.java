package models.web;

import com.google.gson.Gson;
import play.data.validation.Constraints;
import play.db.ebean.Model;

import javax.persistence.Column;
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
    @Column(columnDefinition = "TEXT")
    public String partner_description;
    public String partner_website_url;

    //Entity Relationship
    @OneToMany(mappedBy = "partner")
    public List<InstitutionPartnership> institutionPartnershipList;

    //Methods
    public static Finder<Long, Partner> find(){
        return new Finder<Long, Partner>(Long.class,Partner.class);
    }

    public Long savePartner(){
        if (this.partner_id == null){
            save();
            return partner_id;
        }
        update();
        return partner_id;
    }

    public Partner getPartnerById(Long id){return find().byId(id);}

    public Partner getPartnerByName(String name){
        return find().where().eq("lower(partner_name)",name.toLowerCase().trim()).findUnique();
    }

    public List<Partner> getAllPartners(){return find().all();}

    public boolean partnerExists(String name){
        boolean found = false;
        for (Partner partner: getAllPartners()){
            if (partner.partner_name.equals(name)){
                found = true;
            }
        }
        return found;
    }

    public static String searchPartners(String query){
        List<Partner> partnerList = find().where().like("lower(partner_name)","%" + query.toLowerCase() + "%").findList();
        String stringArray [] =  new String[partnerList.size()];
        for(int i = 0; i<partnerList.size(); i++) {
            stringArray[i] = partnerList.get(i).partner_name;
        }
        String jsonStr = new Gson().toJson(stringArray);
        return jsonStr;
    }



}
