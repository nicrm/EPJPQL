package Entity;

import Entity.Student;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-02-24T12:54:19")
@StaticMetamodel(Studypoint.class)
public class Studypoint_ { 

    public static volatile SingularAttribute<Studypoint, Student> studentId;
    public static volatile SingularAttribute<Studypoint, Integer> score;
    public static volatile SingularAttribute<Studypoint, Integer> maxval;
    public static volatile SingularAttribute<Studypoint, String> description;
    public static volatile SingularAttribute<Studypoint, Integer> id;

}