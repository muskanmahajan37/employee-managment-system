/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import DAL.Kontrata;
import java.util.List;

/**
 *
 * @author MR-ROBOT
 */
public class KontrataRepository  extends EntMngClass implements KontrataInterface{
     @Override
    public void create(Kontrata n) throws EmployeeException {
        try {
            em.getTransaction().begin();
            em.persist(n);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new EmployeeException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void edit(Kontrata n) throws EmployeeException {
        try {
            em.getTransaction().begin();
            em.merge(n);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new EmployeeException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void delete(Kontrata n) throws EmployeeException {
        try {
            em.getTransaction().begin();
            em.remove(n);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new EmployeeException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public List<Kontrata> findAll() throws EmployeeException {
        try {
            return em.createNamedQuery("Kontrata.findAll").getResultList();
        } catch (Exception e) {
            throw new EmployeeException("Msg! \n" + e.getMessage());
        }
    }

    @Override
    public Kontrata findByID(Integer ID) throws EmployeeException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
