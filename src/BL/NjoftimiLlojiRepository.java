/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import DAL.NjoftimiLloji;
import java.util.List;

/**
 *
 * @author MR-ROBOT
 */
public class NjoftimiLlojiRepository extends EntMngClass implements NjoftimiLlojiInterface{
    @Override
    public void create(NjoftimiLloji n) throws EmployeeException {
        try {
            em.getTransaction().begin();
            em.persist(n);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new EmployeeException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void edit(NjoftimiLloji n) throws EmployeeException {
        try {
            em.getTransaction().begin();
            em.merge(n);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new EmployeeException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void delete(NjoftimiLloji n) throws EmployeeException {
        try {
            em.getTransaction().begin();
            em.remove(n);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new EmployeeException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public List<NjoftimiLloji> findAll() throws EmployeeException {
        try {
            return em.createNamedQuery("NjoftimiLloji.findAll").getResultList();
        } catch (Exception e) {
            throw new EmployeeException("Msg! \n" + e.getMessage());
        }
    }

    @Override
    public NjoftimiLloji findByID(Integer ID) throws EmployeeException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
