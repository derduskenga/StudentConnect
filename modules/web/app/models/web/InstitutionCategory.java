package models.web;

import play.db.ebean.Model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by derdus on 6/16/16.
 */
/*Values examples: Public University, Private University, Colleges,
Technical institutions/Institutes, Research Institutions, Special Schools, Business Incubators, Online Learning etc...*/
@Entity
public class InstitutionCategory extends Model {
    @Id
    public Long institution_category_id;
    public String institution_category_name;
    public String institution_category_description;


    //Entity Relations
    //............................................

    //..........................................
    @OneToMany(mappedBy = "institutionCategory")
    public List<Institution> institutionList;
}
