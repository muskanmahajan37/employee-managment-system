/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import DAL.Departmenti;
import DAL.Perdoruesi;
import DAL.Punetori;
import DAL.Telefoni;
import java.util.Date;
import java.util.List;
import javax.persistence.Query;
import javax.persistence.TypedQuery;


/**
 *
 * @author MR-ROBOT
 */
public class PunetoriRepository extends EntMngClass implements PunetoriInterface {

    @Override
    public void create(Punetori p) throws EmployeeException {
        try {
            em.getTransaction().begin();
            em.persist(p);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new EmployeeException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void edit(Punetori p) throws EmployeeException {
        try {
            em.getTransaction().begin();
            em.merge(p);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new EmployeeException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void delete(Punetori p) throws EmployeeException {
        try {
            em.getTransaction().begin();
            em.remove(p);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new EmployeeException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public List<Punetori> findAll() throws EmployeeException {
        try {
            return em.createNamedQuery("Punetori.findAll").getResultList();
        } catch (Exception e) {
            throw new EmployeeException("Msg! \n" + e.getMessage());
        }
    }

    @Override
    public Punetori findByID(Integer ID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Telefoni> getAllNumbersOfPunetori(Integer punetoriId) {
        Query q = em.createQuery("SELECT t FROM Punetori p JOIN p.telefoniCollection t WHERE p.punetoriID = :punetoriId",
                Telefoni.class);
        q.setParameter("punetoriId", punetoriId);
        return (List<Telefoni>) q.getResultList();
    }

    public List<Punetori> getByDateRegjistrimit(Date startDate, Date endDate) {
        TypedQuery<Punetori> q = em.createQuery("SELECT p from Punetori p where p.dataPunesimit between :start and :end AND p.perdoruesi.roliID.roliID=2",Punetori.class);
        q.setParameter("start", startDate);
        q.setParameter("end", endDate);
        return  q.getResultList();
    }

    @Override
    public List<Punetori> getByDepartmenti(int depID) throws EmployeeException {
        Query q = em.createQuery("SELECT p from Punetori p JOIN Perdoruesi pr on p.punetoriID = \n" +
"pr.punetoriID.punetoriID where  p.departmentiId.departmentiID=:id and pr.roliID.roliID=2");
        q.setParameter("id",depID);
        return (List<Punetori>)q.getResultList();
    }
    
        
    public List<Punetori> findOnlyEmployees() throws EmployeeException{
        try{
            Query q = em.createNamedQuery("Punetori.findOnlyEmployees");
            return q.getResultList();
        }catch(Exception e){
            throw new EmployeeException("MSG "+e.getMessage());
        }
    }
}

   
