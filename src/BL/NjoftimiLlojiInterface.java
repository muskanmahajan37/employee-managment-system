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
public interface NjoftimiLlojiInterface {
    void create(NjoftimiLloji nl) throws EmployeeException;
    void edit(NjoftimiLloji d) throws EmployeeException;
    void delete(NjoftimiLloji d) throws EmployeeException;
    List<NjoftimiLloji> findAll() throws EmployeeException;
    NjoftimiLloji findByID(Integer ID) throws EmployeeException; 
}
