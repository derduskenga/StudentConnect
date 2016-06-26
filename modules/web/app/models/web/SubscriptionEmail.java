package models.web;

import play.db.ebean.Model;
import javax.persistence.*;
import play.data.validation.Constraints;
import java.util.*;
import play.Logger;

/**
 * Created by derdus on 6/18/16.
 */
@Entity
public class SubscriptionEmail extends Model{
    @Id
    public Long subscription_email_id;
    @Constraints.Email(message="Invalid Email")
    @Constraints.Required(message = "You did not enter the email")
    @Column(unique = true)
    public String subscription_email;
    @Temporal(TemporalType.TIMESTAMP)
    public Date subscription_date;

    @PrePersist
    protected void onCreate(){
        subscription_date = new Date();
    }
}