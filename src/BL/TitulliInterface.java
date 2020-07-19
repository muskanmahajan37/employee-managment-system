/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import DAL.TitulliPunetorit;
import java.util.List;

/**
 *
 * @author MR-ROBOT
 */
public interface TitulliInterface {
    void create(TitulliPunetorit t) throws EmployeeException;
    void edit(TitulliPunetorit t) throws EmployeeException;
    void delete(TitulliPunetorit t) throws EmployeeException;
    List<TitulliPunetorit> findAll() throws EmployeeException;
    TitulliPunetorit findByID(Integer ID) throws EmployeeException;  
    List<TitulliPunetorit> findByDep(Integer id)throws EmployeeException;
}
