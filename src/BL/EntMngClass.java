/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import org.eclipse.persistence.internal.jpa.EntityManagerImpl;

/**
 *
 * @author MR-ROBOT
 */
public abstract class EntMngClass {
     public EntityManager em=Persistence.createEntityManagerFactory("EmployeeManagmentSystemPU").createEntityManager();
}
