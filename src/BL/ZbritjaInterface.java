/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import DAL.Njoftimi;
import DAL.Zbritja;
import java.util.List;

/**
 *
 * @author MR-ROBOT
 */
public interface ZbritjaInterface {
       void create(Zbritja z) throws EmployeeException;
    void edit(Zbritja z) throws EmployeeException;
    void delete(Zbritja z) throws EmployeeException;
    List<Zbritja> findAll() throws EmployeeException;
    Zbritja findByID(Integer ID) throws EmployeeException; 
}
