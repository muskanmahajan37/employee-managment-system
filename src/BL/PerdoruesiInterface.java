/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import DAL.Perdoruesi;
import java.util.List;

/**
 *
 * @author MR-ROBOT
 */
public interface PerdoruesiInterface {
     void create(Perdoruesi p) throws EmployeeException;
    void edit(Perdoruesi p) throws EmployeeException;
    void delete(Perdoruesi p) throws EmployeeException;
    List<Perdoruesi> findAll() throws EmployeeException;
    Perdoruesi findByID(Integer ID) throws EmployeeException;
    Perdoruesi loginByUsernameAndPassword(String u, String p) throws EmployeeException;
    List<Perdoruesi> findExceptAdmin() throws EmployeeException;
    Perdoruesi findPerdoruesiInfo(Integer input) throws EmployeeException;
    List<Perdoruesi> findByDep(Integer id) throws EmployeeException;
}
