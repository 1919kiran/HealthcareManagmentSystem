/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagmentsystem;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import oracle.jdbc.*;

/**
 *
 * @author Kiran
 */
public class HospitalManagmentSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Connecting to databse by getting username & password
        Connection conn = JavaConnectToDB.connectToDatabse();
           //DoctorLogin d = new DoctorLogin();
           //d.setVisible(true);
        }
    }
}
