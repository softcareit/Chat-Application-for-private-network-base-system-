package chatapplication_erp;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Sujoy
 */
public class DatabaseConnection2 {
    Connection conn2;
    public static Connection db_connect(){
        try{
            Connection conn2  =  DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Sujoy\\Documents\\NetBeansProjects\\ChatApplication_ERP\\chatdatabase.sqlite");
            //JOptionPane.showMessageDialog(null,"Connection Established" );

            return conn2;
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            
       return null;
        }
    }
    
}
