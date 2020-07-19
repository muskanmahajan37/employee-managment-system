/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import DAL.Verejtja;
import java.util.Date;
import java.util.List;

/**
 *
 * @author MR-ROBOT
 */
public interface VerejtjaInterface {
       void create(Verejtja v) throws EmployeeException;

    void edit(Verejtja v) throws EmployeeException;

    void delete(Verejtja v) throws EmployeeException;

    List<Verejtja> findAll() throws EmployeeException;

    Verejtja findByID(Integer ID) throws EmployeeException;
 Verejtja merge(Verejtja v) throws EmployeeException;
 List<Verejtja> findVerejtjaPerdoruesi(Integer ID) throws EmployeeException;

}
