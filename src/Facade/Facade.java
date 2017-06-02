/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Entity.Student;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Nicolai
 */
public class Facade {
        EntityManagerFactory emf;

    public Facade(EntityManagerFactory emf) {
        this.emf = emf;
    }

    EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    
  public List<Student> getAllStudents() {
        EntityManager em = getEntityManager();
        List<Student> StudentList;
        try {
            em.getTransaction().begin();
            StudentList = em.createQuery("SELECT e FROM Student e").getResultList();
        } finally {
            em.close();
        }
        return StudentList;
}
  public List<Student> getAllStudentsFirstNames() {
        EntityManager em = getEntityManager();
        List<Student> StudentList;
        try {
            em.getTransaction().begin();
            StudentList = em.createQuery("SELECT e FROM Student e WHERE e.firstname = :firstname").setParameter("firstname", "jan").getResultList();
            
        } finally {
            em.close();
        }
        return StudentList;
}
  public List<Student> getAllStudentsLastNames() {
        EntityManager em = getEntityManager();
        List<Student> StudentList;
        try {
            em.getTransaction().begin();
            StudentList = em.createQuery("SELECT e FROM Student e WHERE e.lastname = :lastname").setParameter("lastname", "olsen").getResultList();
        } finally {
            em.close();
        }
        return StudentList;
}
}
