package models.web;

import play.data.validation.Constraints;
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
    @Constraints.Required(message = "This field is required")
    public String examination_body_name;
    @Column(columnDefinition = "TEXT")
    public String examination_body_description;
    public String examination_body_website_url;

    //Entity relationship
    @OneToOne
    public InstitutionCourse institutionCourse;

    //methods
    public static Finder<Long, ExaminationBody> find(){
        return new Finder<Long, ExaminationBody>(Long.class,ExaminationBody.class);
    }

    public Long saveExaminationBody(){
        if (this.examination_body_id == null){
            save();
            return examination_body_id;
        }
        update();
        return examination_body_id;
    }
}
