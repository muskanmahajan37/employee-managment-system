/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import DAL.Zbritja;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author MR-ROBOT
 */
public class ZbritjaRepository extends EntMngClass implements ZbritjaInterface{
    
        
        @Override
    public void create(Zbritja z) throws EmployeeException {
        try {
            em.getTransaction().begin();
            em.persist(z);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new EmployeeException("Msg \n" + e.getMessage());
        }
    }


    @Override
    public void edit(Zbritja z) throws EmployeeException {
        try {
            em.getTransaction().begin();
            em.merge(z);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new EmployeeException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void delete(Zbritja z) throws EmployeeException {
        try {
            em.getTransaction().begin();
            em.remove(z);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new EmployeeException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public List<Zbritja> findAll() throws EmployeeException {
        try {
            return em.createNamedQuery("Zbritja.findAll").getResultList();
        } catch (Exception e) {
            throw new EmployeeException("Msg! \n" + e.getMessage());
        }
    }

    @Override
    public Zbritja findByID(Integer ID) throws EmployeeException {
        try {
            Query query = em.createQuery("SELECT n FROM Zbritja n WHERE n.zbritjaID = :abc");
            query.setParameter("abc", ID);
            return (Zbritja) query.getSingleResult();
        } catch (Exception e) {
            throw new EmployeeException("Msg! \n" + e.getMessage());
        }
    }

}
