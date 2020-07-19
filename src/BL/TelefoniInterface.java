/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import DAL.Punetori;
import DAL.Telefoni;
import java.util.List;

/**
 *
 * @author MR-ROBOT
 */
public interface TelefoniInterface {
     void create(Telefoni t) throws EmployeeException;
    void edit(Telefoni t) throws EmployeeException;
    void delete(Telefoni t) throws EmployeeException;
    List<Telefoni> findAll() throws EmployeeException;
    
//    List<Telefoni> findByID(Punetori ID);

}
