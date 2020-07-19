/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import DAL.Kontrata;
import java.util.List;

/**
 *
 * @author MR-ROBOT
 */
public interface KontrataInterface {
     void create(Kontrata k) throws EmployeeException;
    void edit(Kontrata k) throws EmployeeException;
    void delete(Kontrata k) throws EmployeeException;
    List<Kontrata> findAll() throws EmployeeException;
    Kontrata findByID(Integer ID) throws EmployeeException;   
}
