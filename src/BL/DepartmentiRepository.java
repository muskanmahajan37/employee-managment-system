/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;
import DAL.Departmenti;
import java.util.List;

/**
 *
 * @author MR-ROBOT
 */
public class DepartmentiRepository extends EntMngClass implements DepartmentiInterface{
     @Override
    public void create(Departmenti d) throws EmployeeException {
        try {
            em.getTransaction().begin();
            em.persist(d);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new EmployeeException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void edit(Departmenti d) throws EmployeeException {
        try {
            em.getTransaction().begin();
            em.merge(d);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new EmployeeException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void delete(Departmenti d) throws EmployeeException {
        try {
            em.getTransaction().begin();
            em.remove(d);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new EmployeeException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public List<Departmenti> findAll() throws EmployeeException {
        try {
            return em.createNamedQuery("Departmenti.findAll").getResultList();
        } catch (Exception e) {
            throw new EmployeeException("Msg! \n" + e.getMessage());
        }
    }

    @Override
    public Departmenti findByID(Integer ID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
