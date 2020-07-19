/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import DAL.Perdoruesi;
import DAL.Punetori;
import DAL.Telefoni;
import java.util.List;
import javax.persistence.NamedQuery;
import javax.persistence.Query;

/**
 *
 * @author MR-ROBOT
 */
public class TelefoniRepository extends EntMngClass implements TelefoniInterface {

    public void create(Telefoni t) throws EmployeeException {
        try {
            em.getTransaction().begin();
            em.persist(t);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new EmployeeException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void edit(Telefoni t) throws EmployeeException {
        try {
            em.getTransaction().begin();
            em.merge(t);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new EmployeeException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void delete(Telefoni t) throws EmployeeException {
        try {
            em.getTransaction().begin();
            em.remove(t);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new EmployeeException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public List<Telefoni> findAll() throws EmployeeException {
        try {
            return em.createNamedQuery("Telefoni.findAll").getResultList();
        } catch (Exception e) {
            throw new EmployeeException("Msg! \n" + e.getMessage());
        }
    }

//    @Override
//    public List<Telefoni> findByID(Integer ID) {
//      Query query = em.createQuery("SELECT t FROM Telefoni t WHERE t.punetoriId=:us");
//        query.setParameter("id", ID);
//        return (List<Telefoni>) query.getResultList();
//    }

    
    
}
