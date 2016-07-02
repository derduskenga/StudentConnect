package models.web;

import play.db.ebean.Model;

import javax.persistence.*;
import java.util.*;

/**
 * Created by derdus on 6/18/16.
 */
/*We ask a user on our site to leave us a question */
    @Entity
public class Question extends Model {
    @Id
    public Long question_id;
    public String question_subject;
    @Column(columnDefinition = "TEXT")
    public String question_body;
    @Temporal(TemporalType.TIMESTAMP)
    public Date question_date;
    @Column(columnDefinition = "boolean default false ")
    public boolean seen;
    @Column(columnDefinition = "boolean default false ")
    public boolean resolved;
    @Column(columnDefinition = "TEXT")
    public String admin_notes;


    @PrePersist
    protected void onCreate(){
        question_date = new Date();
    }

    public Long saveQuestion() {
        if (this.question_id == null) {
            save();
            return question_id;
        }
        update();
        return question_id;
    }
}
