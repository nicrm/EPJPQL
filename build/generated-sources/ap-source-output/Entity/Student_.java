package Entity;

import Entity.Studypoint;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-02-24T12:54:19")
@StaticMetamodel(Student.class)
public class Student_ { 

    public static volatile CollectionAttribute<Student, Studypoint> studypointCollection;
    public static volatile SingularAttribute<Student, String> firstname;
    public static volatile SingularAttribute<Student, Integer> id;
    public static volatile SingularAttribute<Student, String> lastname;

}