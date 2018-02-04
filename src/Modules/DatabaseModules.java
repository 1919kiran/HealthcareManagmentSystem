/*
 * Healthcare Managment System.
 * 
 */
package Modules;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import oracle.jdbc.OraclePreparedStatement;
import oracle.jdbc.OracleResultSet;

/**
 *
 * @author Kiran
 */
public class DatabaseModules {
    
    //refreshes the database tables. 
    public static void update_database(){
        Connection conn ;
        OraclePreparedStatement psmt;
        OracleResultSet rs;
        conn = JavaConnectToDB.connectToDatabse();
        try{
            String query = "select *from DOCTOR_DETAILS";
            psmt = (OraclePreparedStatement)conn.prepareStatement(query);
            rs = (OracleResultSet) psmt.executeQuery();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
