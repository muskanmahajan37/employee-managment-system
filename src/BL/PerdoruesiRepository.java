/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import java.util.List;
import javax.persistence.Query;
import DAL.Perdoruesi;

/**
 *
 * @author MR-ROBOT
 */
public class PerdoruesiRepository extends EntMngClass implements PerdoruesiInterface {

    @Override
    public void create(Perdoruesi p) throws EmployeeException {
        try {
            em.getTransaction().begin();
            em.persist(p);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new EmployeeException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void edit(Perdoruesi p) throws EmployeeException {
        try {
            em.getTransaction().begin();
            em.merge(p);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new EmployeeException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void delete(Perdoruesi p) throws EmployeeException {
        try {
            em.getTransaction().begin();
            em.remove(p);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new EmployeeException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public List<Perdoruesi> findAll() throws EmployeeException {
        try {
            return em.createNamedQuery("Perdoruesi.findAll").getResultList();
        } catch (Exception e) {
            throw new EmployeeException("Msg! \n" + e.getMessage());
        }
    }

    @Override
    public Perdoruesi findByID(Integer ID) throws EmployeeException {
        try {
            Query query = em.createQuery("SELECT p FROM Perdoruesi p WHERE p.perdoruesiID =:abc");
            query.setParameter("abc", ID);
            return (Perdoruesi) query.getSingleResult();
        } catch (Exception e) {
            throw new EmployeeException("Msg! \n" + e.getMessage());
        }
    }

    @Override
    public Perdoruesi loginByUsernameAndPassword(String u, String p) throws EmployeeException {
        try {
            Query query = em.createQuery("SELECT p FROM Perdoruesi p WHERE p.username =:us AND p.password=:psw");
            query.setParameter("us", u);
            query.setParameter("psw", p);
            return (Perdoruesi) query.getSingleResult();
        } catch (Exception e) {
            throw new EmployeeException("Msg! \n" + e.getMessage());
        }

    }

    @Override
    public List<Perdoruesi> findExceptAdmin() throws EmployeeException {
        try {
            return em.createNamedQuery("Perdoruesi.findExceptAdmin").getResultList();
        } catch (Exception e) {
            throw new EmployeeException("Msg! \n" + e.getMessage());
        }
    }
    
    public List<Perdoruesi> findExceptAdminn() throws EmployeeException{
        try{
            Query q = em.createQuery("SELECT r from Roli r,Perdoruesi p where r.roliID =2");
            return q.getResultList();
        }catch(Exception e){
            throw new EmployeeException("MSG "+e.getMessage());
        }
    }

    @Override
    public Perdoruesi findPerdoruesiInfo(Integer input) throws EmployeeException {
        try {
            Query query = em.createQuery("Select p from Perdoruesi p Where p.perdoruesiID =:input");
            query.setParameter("input", input);
            return (Perdoruesi) query.getSingleResult();
        } catch (Exception e) {
            throw new EmployeeException("");
        }
    }
    
    public List<Perdoruesi> findByDep(Integer id) throws EmployeeException{
        try{
           Query query = em.createQuery("Select p from Perdoruesi p Where p.punetoriID.departmentiId.departmentiID=:dep AND p.roliID.roliID=2");
           query.setParameter("dep", id);
           return (List<Perdoruesi>)  query.getResultList();
        }catch(Exception e){
            throw new EmployeeException("");
        }
    }

}
