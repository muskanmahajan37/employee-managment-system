/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import DAL.Pagesa;
import DAL.Vijueshmeria;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author MR-ROBOT
 */
public class PagesaRepository extends EntMngClass implements PagesaInterface{
        @Override
    public void create(Pagesa p) throws EmployeeException {
        try {
            em.getTransaction().begin();
            em.persist(p);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new EmployeeException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void edit(Pagesa p) throws EmployeeException {
        try {
            em.getTransaction().begin();
            em.merge(p);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new EmployeeException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void delete(Pagesa p) throws EmployeeException {
        try {
            em.getTransaction().begin();
            em.remove(p);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new EmployeeException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public List<Pagesa> findAll() throws EmployeeException {
        try {
            return em.createNamedQuery("Pagesa.findAll").getResultList();
        } catch (Exception e) {
            throw new EmployeeException("Msg! \n" + e.getMessage());
        }
    }

    @Override
    public Pagesa findByID(Integer ID) throws EmployeeException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public List<Pagesa> findEmpId(Integer ID) throws EmployeeException {
        try {
            Query q = em.createQuery("SELECT p from Pagesa p where p.perdoruesiId.perdoruesiID =:id");
            q.setParameter("id", ID);
            return (List<Pagesa>) q.getResultList();
        } catch (Exception e) {
            throw new EmployeeException(e.getMessage());
        }
    }
    
    
      public List<Pagesa> findEmpDate(Integer ID) throws EmployeeException {
        try {
            Query q = em.createQuery("Select p from Pagesa p where p.perdoruesiId.perdoruesiID=32 and p.muajiPageses ='2019-06-01'");
            q.setParameter("id", ID);
            return (List<Pagesa>) q.getResultList();
        } catch (Exception e) {
            throw new EmployeeException(e.getMessage());
        }
    }
    
    
    
    
}
