/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import DAL.Pagesa;
import java.util.List;

/**
 *
 * @author MR-ROBOT
 */
public interface PagesaInterface {

    void create(Pagesa p) throws EmployeeException;

    void edit(Pagesa p) throws EmployeeException;

    void delete(Pagesa p) throws EmployeeException;

    List<Pagesa> findAll() throws EmployeeException;

    Pagesa findByID(Integer ID) throws EmployeeException;
}
