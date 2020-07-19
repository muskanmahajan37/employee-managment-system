/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import DAL.TitulliPunetorit;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author MR-ROBOT
 */
public class TitulliRepository extends EntMngClass implements TitulliInterface {
    
    
      public void create(TitulliPunetorit t) throws EmployeeException {
        try {
            em.getTransaction().begin();
            em.persist(t);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new EmployeeException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void edit(TitulliPunetorit t) throws EmployeeException {
        try {
            em.getTransaction().begin();
            em.merge(t);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new EmployeeException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void delete(TitulliPunetorit t) throws EmployeeException {
        try {
            em.getTransaction().begin();
            em.remove(t);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new EmployeeException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public List<TitulliPunetorit> findAll() throws EmployeeException {
        try {
            return em.createNamedQuery("TitulliPunetorit.findAll").getResultList();
        } catch (Exception e) {
            throw new EmployeeException("Msg! \n" + e.getMessage());
        }
    }

    @Override
    public TitulliPunetorit findByID(Integer ID) throws EmployeeException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<TitulliPunetorit> findByDep(Integer id) throws EmployeeException {
             try{
           Query query = em.createQuery("Select t from TitulliPunetorit t WHERE t.departmentiId.departmentiID=:id");
           query.setParameter("id", id);
           return (List<TitulliPunetorit>)  query.getResultList();
        }catch(Exception e){
            throw new EmployeeException("");
        }
    }

 
    
    
    
    
    
}
