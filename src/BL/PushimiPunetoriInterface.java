/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import DAL.PushimiPunetori;
import java.util.List;

/**
 *
 * @author rilin
 */
public interface PushimiPunetoriInterface {
    void create(PushimiPunetori p) throws EmployeeException;
    void edit(PushimiPunetori p) throws EmployeeException;
    void delete(PushimiPunetori p) throws EmployeeException;
    List<PushimiPunetori> findAll() throws EmployeeException;
    List<PushimiPunetori> findByID(Integer ID) throws EmployeeException;
    int findTotali(int i  , int j )throws EmployeeException ;
    
}
