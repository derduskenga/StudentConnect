package models.web;

import play.db.ebean.Model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by derdus on 6/16/16.
 */
@Entity
public class SchoolOrFaculty extends Model {
    @Id
    public Long school_id;
    public String school_name;
    @Column(columnDefinition = "TEXT")
    public String school_description;

    //Entity relationships
    @ManyToOne
    public Institution institution;

    //Link faculty/schools and the courses it offers
    @OneToMany(mappedBy = "schoolOrFaculty")
    public List<InstitutionCourse> institutionCourseList;
}
