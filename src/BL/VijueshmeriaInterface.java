/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import DAL.Vijueshmeria;
import gui.view.VijueshmeriaForm;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author MR-ROBOT
 */
public interface VijueshmeriaInterface {

    void create(Vijueshmeria v) throws EmployeeException;

    void edit(Vijueshmeria v) throws EmployeeException;

    void delete(Vijueshmeria v) throws EmployeeException;

    List<Vijueshmeria> findAll() throws EmployeeException;

    Vijueshmeria findByID(Integer ID) throws EmployeeException;

    List<Vijueshmeria> findEmpId(Integer id) throws EmployeeException;

    List<Vijueshmeria> findByEmpAndDate(Integer id, Date startDate, Date endDate) throws EmployeeException;

    List<Vijueshmeria> findByDate(Date d1, Date d2) throws EmployeeException;
    double findTotal(Integer id, String d2)throws EmployeeException;

}
