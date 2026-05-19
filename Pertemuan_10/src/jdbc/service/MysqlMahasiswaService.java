// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package jdbc.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import jdbc.model.Mahasiswa;
import jdbc.utilities.MysqlUtility;

public class MysqlMahasiswaService {
   Connection koneksi = null;

   public MysqlMahasiswaService() {
      this.koneksi = MysqlUtility.getConnection();
   }

   public Mahasiswa makeMhsObject() {
      return new Mahasiswa();
   }

   public void add(Mahasiswa mhs) {
      String sql = "INSERT INTO mahasiswa (id, nama) VALUES (?, ?)";

      try {
         PreparedStatement ps = this.koneksi.prepareStatement(sql);

         try {
            ps.setInt(1, mhs.getId());
            ps.setString(2, mhs.getNama());
            ps.executeUpdate();
            System.out.println("Data berhasil ditambahkan");
         } catch (Throwable var7) {
            if (ps != null) {
               try {
                  ps.close();
               } catch (Throwable var6) {
                  var7.addSuppressed(var6);
               }
            }

            throw var7;
         }

         if (ps != null) {
            ps.close();
         }
      } catch (SQLException e) {
         System.out.println("Gagal add: " + e.getMessage());
      }

   }

   public void update(Mahasiswa mhs) {
      String sql = "UPDATE mahasiswa SET nama = ? WHERE id = ?";

      try {
         PreparedStatement ps = this.koneksi.prepareStatement(sql);

         try {
            ps.setString(1, mhs.getNama());
            ps.setInt(2, mhs.getId());
            ps.executeUpdate();
            System.out.println("Data berhasil diupdate");
         } catch (Throwable var7) {
            if (ps != null) {
               try {
                  ps.close();
               } catch (Throwable var6) {
                  var7.addSuppressed(var6);
               }
            }

            throw var7;
         }

         if (ps != null) {
            ps.close();
         }
      } catch (SQLException e) {
         System.out.println("Gagal update: " + e.getMessage());
      }

   }

   public void delete(int id) {
      String sql = "DELETE FROM mahasiswa WHERE id = ?";

      try {
         PreparedStatement ps = this.koneksi.prepareStatement(sql);

         try {
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Data berhasil dihapus");
         } catch (Throwable var7) {
            if (ps != null) {
               try {
                  ps.close();
               } catch (Throwable var6) {
                  var7.addSuppressed(var6);
               }
            }

            throw var7;
         }

         if (ps != null) {
            ps.close();
         }
      } catch (SQLException e) {
         System.out.println("Gagal delete: " + e.getMessage());
      }

   }

   public Mahasiswa getById(int id) {
      Mahasiswa mhs = null;
      String sql = "SELECT * FROM mahasiswa WHERE id = ?";

      try {
         PreparedStatement ps = this.koneksi.prepareStatement(sql);

         try {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
               mhs = new Mahasiswa();
               mhs.setId(rs.getInt("id"));
               mhs.setNama(rs.getString("nama"));
            }
         } catch (Throwable var8) {
            if (ps != null) {
               try {
                  ps.close();
               } catch (Throwable var7) {
                  var8.addSuppressed(var7);
               }
            }

            throw var8;
         }

         if (ps != null) {
            ps.close();
         }
      } catch (SQLException e) {
         System.out.println("Gagal getById: " + e.getMessage());
      }

      return mhs;
   }

   public List<Mahasiswa> getAll() {
      List<Mahasiswa> list = new ArrayList();
      String sql = "SELECT * FROM mahasiswa";

      try {
         Statement s = this.koneksi.createStatement();

         try {
            ResultSet rs = s.executeQuery(sql);

            try {
               while(rs.next()) {
                  Mahasiswa mhs = new Mahasiswa();
                  mhs.setId(rs.getInt("id"));
                  mhs.setNama(rs.getString("nama"));
                  list.add(mhs);
               }
            } catch (Throwable var9) {
               if (rs != null) {
                  try {
                     rs.close();
                  } catch (Throwable var8) {
                     var9.addSuppressed(var8);
                  }
               }

               throw var9;
            }

            if (rs != null) {
               rs.close();
            }
         } catch (Throwable var10) {
            if (s != null) {
               try {
                  s.close();
               } catch (Throwable var7) {
                  var10.addSuppressed(var7);
               }
            }

            throw var10;
         }

         if (s != null) {
            s.close();
         }
      } catch (SQLException e) {
         System.out.println("Gagal getAll: " + e.getMessage());
      }

      return list;
   }
}
