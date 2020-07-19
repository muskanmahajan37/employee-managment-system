/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import DAL.Njoftimi;
import java.util.List;
import javax.persistence.Query;
import static jdk.nashorn.tools.ShellFunctions.input;

/**
 *
 * @author MR-ROBOT
 */
public class NjoftimiRepository extends EntMngClass implements NjoftimiInterface{
    
    
    
        @Override
    public void create(Njoftimi n) throws EmployeeException {
        try {
            em.getTransaction().begin();
            em.persist(n);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new EmployeeException("Msg \n" + e.getMessage());
        }
    }
    
              @Override
    public Njoftimi merge(Njoftimi n) throws EmployeeException {
        try {
            em.getTransaction().begin();
            em.merge(n);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new EmployeeException("Msg \n" + e.getMessage());
        }
            return em.merge(n);
    }

    @Override
    public void edit(Njoftimi n) throws EmployeeException {
        try {
            em.getTransaction().begin();
            em.merge(n);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new EmployeeException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void delete(Njoftimi n) throws EmployeeException {
        try {
            em.getTransaction().begin();
            em.remove(n);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new EmployeeException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public List<Njoftimi> findAll() throws EmployeeException {
        try {
            return em.createNamedQuery("Njoftimi.findAll").getResultList();
        } catch (Exception e) {
            throw new EmployeeException("Msg! \n" + e.getMessage());
        }
    }

    @Override
    public Njoftimi findByID(Integer ID) throws EmployeeException {
        try {
            Query query = em.createQuery("SELECT n FROM Njoftimi n WHERE n.njoftimiID = :abc");
            query.setParameter("abc", ID);
            return (Njoftimi) query.getSingleResult();
        } catch (Exception e) {
            throw new EmployeeException("Msg! \n" + e.getMessage());
        }
    }

    @Override
    public List<Njoftimi> findNjoftimiPerdoruesi(Integer ID) throws EmployeeException {
           try {
      Query query = em.createQuery("SELECT n FROM Njoftimi n WHERE n.perdoruesiId.perdoruesiID = :id OR n.perdoruesiId.perdoruesiID = NULL");
            query.setParameter("id", ID);
            return (List<Njoftimi>) query.getResultList();
        } catch (Exception e) {
            throw new EmployeeException("");
        }
    }
    
}
