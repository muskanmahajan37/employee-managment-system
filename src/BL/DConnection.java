/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author MR-ROBOT
 */
public class DConnection {
    public Connection getConnection() throws SQLException{
        Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=EmployeeManagment","sa","sa");
        return conn;
    }
}
