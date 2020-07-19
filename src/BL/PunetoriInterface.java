/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import DAL.Punetori;
import DAL.Telefoni;
import java.util.Date;
import java.util.List;

/**
 *
 * @author MR-ROBOT
 */

public interface PunetoriInterface  {
    void create(Punetori p) throws EmployeeException;
    void edit(Punetori p) throws EmployeeException;
    void delete(Punetori p) throws EmployeeException;
    List<Punetori> findAll() throws EmployeeException;
    Punetori findByID(Integer ID);
    List<Telefoni> getAllNumbersOfPunetori(Integer punetoriId);
    List<Punetori> getByDateRegjistrimit(Date d1 ,Date d2);
    List<Punetori> getByDepartmenti(int depID)throws EmployeeException;
}

