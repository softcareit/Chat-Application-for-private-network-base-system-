package chatapplication_erp;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Sujoy
 */
public class DatabaseConnection {
    Connection conn;
    public static Connection db_connect(){
        try{
            Connection conn  =  DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Sujoy\\Documents\\NetBeansProjects\\ChatApplication_ERP\\userdatabase.sqlite");
            //JOptionPane.showMessageDialog(null,"Connection Established" );

            return conn;
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            
       return null;
        }
    }
    
}
