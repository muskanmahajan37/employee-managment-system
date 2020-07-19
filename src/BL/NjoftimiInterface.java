/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import DAL.Njoftimi;
import java.util.List;

/**
 *
 * @author MR-ROBOT
 */
public interface NjoftimiInterface {
    void create(Njoftimi n) throws EmployeeException;
    void edit(Njoftimi n) throws EmployeeException;
    void delete(Njoftimi n) throws EmployeeException;
    List<Njoftimi> findAll() throws EmployeeException;
    Njoftimi findByID(Integer ID) throws EmployeeException; 
    List<Njoftimi> findNjoftimiPerdoruesi(Integer ID) throws EmployeeException;
     Njoftimi merge(Njoftimi v) throws EmployeeException ;
}
