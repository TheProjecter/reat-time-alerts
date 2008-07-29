/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package rtnsutil;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author priyankgandhi
 */
public class Util {
    
    protected static final String url = "jdbc:mysql://localhost/295";
    protected static final String uname = "root";
    protected static final String pwd = "administrator";
    
    static Connection conn = null;
    
   public static Connection getConnection()
    {
        try {

            if(conn == null)
            {
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection(url,uname, pwd);
            }
            return conn;
        }catch (SQLException ex) {
            Logger.getLogger(Util.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        catch (ClassNotFoundException ex) {
            Logger.getLogger(Util.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    } 

}
