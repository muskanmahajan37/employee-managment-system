/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import DAL.Perdoruesi;
import DAL.Pushimi;
import DAL.PushimiPunetori;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author rilin
 */
public class PushimiPunetoriRepository extends EntMngClass implements PushimiPunetoriInterface {

    @Override
    public void create(PushimiPunetori p) throws EmployeeException {
        try {
            em.getTransaction().begin();
            em.persist(p);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new EmployeeException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void edit(PushimiPunetori p) throws EmployeeException {
        try {
            em.getTransaction().begin();
            em.merge(p);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new EmployeeException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void delete(PushimiPunetori p) throws EmployeeException {
        try {
            em.getTransaction().begin();
            em.remove(p);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new EmployeeException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public List<PushimiPunetori> findAll() throws EmployeeException {
        try {
            return em.createNamedQuery("PushimiPunetori.findAll").getResultList();
        } catch (Exception e) {
            throw new EmployeeException("Msg! \n" + e.getMessage());
        }
    }

    @Override
    public List<PushimiPunetori> findByID(Integer ID) throws EmployeeException {
       try{
            Query query = em.createQuery("SELECT p from PushimiPunetori p where p.perdoruesiID.perdoruesiID=:ID");
            query.setParameter("ID", ID);
            return query.getResultList();
       }catch(Exception e ){ 
           throw new EmployeeException("MSG! \n"+e.getMessage());
       }
    }

    public int findTotali(int i, int j) throws EmployeeException {
        try {
            Query query = em.createQuery("SELECT MIN(p.mbetura) FROM PushimiPunetori p WHERE p.perdoruesiID.perdoruesiID=:i AND p.pushimiID.pushimiID=:j");
            query.setParameter("i", i);
            query.setParameter("j", j);
         return (int)query.getSingleResult();
        } catch (Exception e) {
            throw new EmployeeException("Msg! \n" + e.getMessage());
        }
    }
    public List<Pushimi> gjejPushimet(Perdoruesi i)throws EmployeeException {
        try{
            Query query = em.createQuery("SELECT p.pushimiID from PushimiPunetori p WHERE p.perdoruesiID=:i");
             query.setParameter("i", i);
            return query.getResultList();
        }catch(Exception e){
            throw new EmployeeException("MSG "+e.getMessage());
        }
    }
    
    
    public List<Pushimi> findPushimiEmp(Integer id)throws EmployeeException{
        try{
            Query query = em.createQuery("SELECT p from PushimiPunetori p where p.perdoruesiID.perdoruesiID =:id");
            query.setParameter("id", id);
            return query.getResultList();
        }catch(Exception e){
            throw new EmployeeException("");
        }
    }
   

}
