/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import DAL.Pushimi;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author rilin
 */
public class PushimiRepository extends EntMngClass implements PushimiInterface {
       @Override
    public void create(Pushimi p) throws EmployeeException {
        try {
            em.getTransaction().begin();
            em.persist(p);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new EmployeeException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void edit(Pushimi p) throws EmployeeException {
        try {
            em.getTransaction().begin();
            em.merge(p);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new EmployeeException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void delete(Pushimi p) throws EmployeeException {
        try {
            em.getTransaction().begin();
            em.remove(p);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new EmployeeException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public List<Pushimi> findAll() throws EmployeeException {
        try {
            return em.createNamedQuery("Pushimi.findAll").getResultList();
        } catch (Exception e) {
            throw new EmployeeException("Msg! \n" + e.getMessage());
        }
    }

    @Override
    public Pushimi  findByID(Integer ID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
      @Override
    public Pushimi getByNumriPushimit(Integer i ){
        Query q = em.createQuery("SELECT p FROM Pushimi p WHERE p.pushimiID =:i",
                Pushimi.class);
        q.setParameter("i", i);
        return  (Pushimi)q.getSingleResult();
    }
    
    
}


