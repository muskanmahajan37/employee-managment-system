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
public interface DepartmentiInterface {
 void create(Departmenti d) throws EmployeeException;
    void edit(Departmenti d) throws EmployeeException;
    void delete(Departmenti d) throws EmployeeException;
    List<Departmenti> findAll() throws EmployeeException;
    Departmenti findByID(Integer ID) throws EmployeeException;    
}
