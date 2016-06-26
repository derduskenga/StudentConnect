package models.admin.user;

import be.objectify.deadbolt.core.models.Permission;
import be.objectify.deadbolt.core.models.Role;
import be.objectify.deadbolt.core.models.Subject;
import play.db.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.*;

/**
 * Created by derdus on 6/22/16.
 */
@Entity
public class AdminUser extends Model implements Subject{
    @Id
    public Long admin_user_id;

    @Constraints.Required(message = "First name required")
    public String admin_user_first_name;

    @Constraints.Required(message = "First name required")
    public String admin_user_last_name;

    @Column(unique = true)
    @Constraints.Email(message = "Email is not valid")
    @Constraints.Required(message = "Email required")
    public String admin_user_email;

    public String admin_user_password;

    public  String admin_user_salt;

    @Column(columnDefinition = "boolean default 'true'")
    public Boolean is_admin_user_active;

    @Override
    public List<? extends Role> getRoles() {
        return null;
    }

    @Override
    public List<? extends Permission> getPermissions() {
        return null;
    }

    @Override
    public String getIdentifier() {
        return null;
    }
}
