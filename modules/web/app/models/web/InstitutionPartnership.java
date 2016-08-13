package models.web;

import play.db.ebean.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.List;

/**
 * Created by derdus on 6/17/16.
 */
/*Institution has ManyToMany relationship with Partner. So we break it into two - OneToMany relationships
so we have create 'InstitutionPartnership'
 */

@Entity
public class InstitutionPartnership extends Model {
    @Id
    public Long institution_partnership_id;
    @Column(columnDefinition = "TEXT")
    public String institution_partnership_description;/*We describe the reason fo the partnership*/

    //Entity Relationship
    @ManyToOne
    public Institution institution;
    @ManyToOne
    public Partner partner;


    //Methods
    public static Finder<Long, InstitutionPartnership> find(){
        return new Finder<Long, InstitutionPartnership>(Long.class,InstitutionPartnership.class);
    }

    public Long saveInstitutionPartnership(){
        if(this.institution_partnership_id == null){
            save();
            return institution_partnership_id;
        }
        update();
        return institution_partnership_id;
    }

    public List<InstitutionPartnership> getAllInstitutionPartnership(){return find().all();}
}
