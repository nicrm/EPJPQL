package examprepmodul2ex3;

import Entity.Student;
import Facade.Facade;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author Nicolai
 */
public class ExamPrepModul2ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ExamPrepModul2ex3PU");
        Facade facade = new Facade(emf);
        List<Student> StudentList = facade.getAllStudents();
        for(Student e:StudentList) {
            System.out.println(e.getFirstname()+" "+e.getLastname());
        }
        List<Student> StudentFirstnameList = facade.getAllStudentsFirstNames();
        for(Student e:StudentFirstnameList) {
            System.out.println(e.getFirstname()+" "+e.getLastname());
        }
        List<Student> StudentLastnameList = facade.getAllStudentsLastNames();
        for(Student e:StudentLastnameList) {
            System.out.println(e.getFirstname()+" "+e.getLastname());
        }
    }
    
}
