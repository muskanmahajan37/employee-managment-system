/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import DAL.Vijueshmeria;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author MR-ROBOT
 */
public class VijueshmeriaRepository extends EntMngClass implements VijueshmeriaInterface {

    @Override
    public void create(Vijueshmeria v) throws EmployeeException {
        try {
            em.getTransaction().begin();
            em.persist(v);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new EmployeeException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void edit(Vijueshmeria v) throws EmployeeException {
        try {
            em.getTransaction().begin();
            em.merge(v);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new EmployeeException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void delete(Vijueshmeria v) throws EmployeeException {
        try {
            em.getTransaction().begin();
            em.remove(v);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new EmployeeException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public List<Vijueshmeria> findAll() throws EmployeeException {
        try {
            return em.createNamedQuery("Vijueshmeria.findAll").getResultList();
        } catch (Exception e) {
            throw new EmployeeException("Msg! \n" + e.getMessage());
        }
    }

    @Override
    public Vijueshmeria findByID(Integer ID) throws EmployeeException {
        try {
            Query query = em.createQuery("SELECT p FROM Vijueshmeria p WHERE p.ID = :abc");
            query.setParameter("abc", ID);
            return (Vijueshmeria) query.getSingleResult();
        } catch (Exception e) {
            throw new EmployeeException("Msg! \n" + e.getMessage());
        }
    }

    @Override
    public List<Vijueshmeria> findEmpId(Integer ID) throws EmployeeException {
        try {
            Query q = em.createQuery("SELECT v FROM Vijueshmeria v WHERE v.punetoriId.punetoriID=:id");
            q.setParameter("id", ID);
            return (List<Vijueshmeria>) q.getResultList();
        } catch (Exception e) {
            throw new EmployeeException(e.getMessage());
        }
    }


    @Override
    public List<Vijueshmeria> findByEmpAndDate(Integer id, Date startDate, Date endDate) throws EmployeeException {
        try {
            Query q = em.createQuery("SELECT v from Vijueshmeria v  WHERE v.punetoriId.punetoriID =:id AND v.data between :start and :end");
            q.setParameter("id", id);
            q.setParameter("start", startDate);
            q.setParameter("end", endDate);
            return (List<Vijueshmeria>) q.getResultList();
        } catch (Exception e) {
            throw new EmployeeException(e.getMessage());
        }
    }
    
    public List<Vijueshmeria> findByDate(Date d1 , Date d2)throws EmployeeException{
           try {
            Query q = em.createQuery("SELECT v from Vijueshmeria v  WHERE  v.data between :start and :end");
            q.setParameter("start", d1);
            q.setParameter("end", d2);
            return (List<Vijueshmeria>) q.getResultList();
        } catch (Exception e) {
            throw new EmployeeException(e.getMessage());
        }
    }
    
       public double findTotal(Integer ID, String d2)throws EmployeeException{
           try {
            Query q = em.createQuery("SELECT SUM(v.jashtOrarit)AS jashtOrarit from Vijueshmeria v where v.punetoriId.punetoriID=:id AND v.data between '2019-:data-01' AND '2019-:data-31'");
            q.setParameter("id", ID);
            q.setParameter("data", d2);
            return (Double) q.getSingleResult();
        } catch (Exception e) {
            throw new EmployeeException(e.getMessage());
        }
    }
       
       public double findJashtOrarit(Integer id,Date d1,Date d2)throws EmployeeException{
           try{
               Query q = em.createQuery("SELECT SUM(v.jashtOrarit)AS JASHT from Vijueshmeria v where v.punetoriId.punetoriID=:id AND v.data BETWEEN :d1 and :d2");
               q.setParameter("id", id);
               q.setParameter("d1", d1);
               q.setParameter("d2", d2);
            return (Double)q.getSingleResult();
           }catch(Exception e){
               throw new EmployeeException("");
           }
       }

           public double findTotal(Integer id,Date d1,Date d2)throws EmployeeException{
           try{
               Query q = em.createQuery("SELECT SUM(v.total)AS JASHT from Vijueshmeria v where v.punetoriId.punetoriID=:id AND v.data BETWEEN :d1 and :d2");
               q.setParameter("id", id);
               q.setParameter("d1", d1);
               q.setParameter("d2", d2);
            return (Double)q.getSingleResult();
           }catch(Exception e){
               throw new EmployeeException("");
           }
       }
               public double findFesta(Integer id,Date d1,Date d2)throws EmployeeException{
           try{
               Query q = em.createQuery("SELECT SUM(v.festa)AS festa from Vijueshmeria v where v.punetoriId.punetoriID=:id AND v.data BETWEEN :d1 and :d2");
               q.setParameter("id", id);
               q.setParameter("d1", d1);
               q.setParameter("d2", d2);
            return (Double)q.getSingleResult();
           }catch(Exception e){
               throw new EmployeeException("SKA ASNE VLER");
           }
       }

    public double findFesta(int i, String string, String string0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
           
}
