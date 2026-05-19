// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package jdbc.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlUtility {
   private static Connection koneksi;

   public MysqlUtility() {
   }

   public static Connection getConnection() {
      if (koneksi == null) {
         try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/pbo";
            String user = "mahasiswa";
            String password = "mantapkali";
            koneksi = DriverManager.getConnection(url, user, password);
            if (koneksi != null) {
               System.out.println("Koneksi Berhasil");
            }
         } catch (ClassNotFoundException cne) {
            System.out.println("Gagal load driver: " + cne.getMessage());
         } catch (SQLException sqle) {
            System.out.println("Gagal Koneksi:" + sqle.getMessage());
         }
      }

      return koneksi;
   }
}
