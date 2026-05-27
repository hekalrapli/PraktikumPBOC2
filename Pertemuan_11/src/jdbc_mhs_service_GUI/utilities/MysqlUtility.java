package jdbc_mhs_service_GUI.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author sirie
 */
public class MysqlUtility {
    
    
    public static Connection getConnection() {
         Connection conn = null;
     
            try {
                // Class.forName("com.mysql.jdbc.Driver");
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/pbo";
                String user = "mahasiswa";
                String password = "mantapkali";
                conn = DriverManager.getConnection(url, user, password);
             
                  System.out.println("Koneksi Berhasil");
                
            } catch (ClassNotFoundException cne) {
                System.out.println("Gagal load driver: " + cne.getMessage());
            } catch (SQLException sqle) {
                System.out.println("Gagal Koneksi:" + sqle.getMessage());
            }
        
        return conn;
    }
}