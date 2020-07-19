/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import DAL.Verejtja;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author MR-ROBOT
 */
public class VerejtjaRepository extends EntMngClass implements VerejtjaInterface{
        
    
        @Override
    public void create(Verejtja v) throws EmployeeException {
        try {
            em.getTransaction().begin();
            em.persist(v);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new EmployeeException("Msg \n" + e.getMessage());
        }
    }
    
            @Override
    public Verejtja merge(Verejtja v) throws EmployeeException {
        try {
            em.getTransaction().begin();
            em.merge(v);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new EmployeeException("Msg \n" + e.getMessage());
        }
            return em.merge(v);
    }

    @Override
    public void edit(Verejtja v) throws EmployeeException {
        try {
            em.getTransaction().begin();
            em.merge(v);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new EmployeeException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void delete(Verejtja v) throws EmployeeException {
        try {
            em.getTransaction().begin();
            em.remove(v);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new EmployeeException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public List<Verejtja> findAll() throws EmployeeException {
        try {
            return em.createNamedQuery("Verejtja.findAll").getResultList();
        } catch (Exception e) {
            throw new EmployeeException("Msg! \n" + e.getMessage());
        }
    }

    @Override
    public Verejtja findByID(Integer ID) throws EmployeeException {
        try {
            Query query = em.createQuery("SELECT v FROM Verejtja v WHERE v.verejtjaID = :abc");
            query.setParameter("abc", ID);
            return (Verejtja) query.getSingleResult();
        } catch (Exception e) {
            throw new EmployeeException("Msg! \n" + e.getMessage());
        }
    }
    
        @Override
    public List<Verejtja> findVerejtjaPerdoruesi(Integer ID) throws EmployeeException {
           try {
      Query query = em.createQuery("SELECT v FROM Verejtja v WHERE v.perdoruesiId.perdoruesiID = :id");
            query.setParameter("id", ID);
            return (List<Verejtja>) query.getResultList();
        } catch (Exception e) {
            throw new EmployeeException("");
        }
    }
}
