package models.web;

import play.db.ebean.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * Created by derdus on 6/19/16.
 */
@Entity
public class ExaminationBody extends Model {
    @Id
    public Long examination_body_id;
    public String examination_body_name;
    @Column(columnDefinition = "TEXT")
    public String examination_body_description;
    public String examination_body_website_url;

    //Entity relationship
    @OneToOne
    public InstitutionCourse institutionCourse;

}
