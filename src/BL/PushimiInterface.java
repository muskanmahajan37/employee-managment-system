/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import DAL.Pushimi;
import java.util.List;

/**
 *
 * @author rilin
 */
public interface PushimiInterface {
    void create(Pushimi p) throws EmployeeException;
    void edit(Pushimi p) throws EmployeeException;
    void delete(Pushimi p) throws EmployeeException;
    List<Pushimi> findAll() throws EmployeeException;
    Pushimi findByID(Integer ID) throws EmployeeException;   
    Pushimi getByNumriPushimit(Integer i) ;
}
