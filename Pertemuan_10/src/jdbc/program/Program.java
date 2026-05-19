// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package jdbc.program;

import java.util.ArrayList;
import jdbc.model.Mahasiswa;
import jdbc.service.MysqlMahasiswaService;

public class Program {
   static MysqlMahasiswaService service = new MysqlMahasiswaService();

   public Program() {
   }

   public static void main(String[] args) {
      new ArrayList();
      System.out.println("");
      System.out.println("===insert");
      Mahasiswa mhsAdd = new Mahasiswa(5, "Haryo");
      service.add(mhsAdd);
      System.out.println("berhasil insert: " + String.valueOf(mhsAdd));
      displayAll();
      System.out.println("===update");
      Mahasiswa mhsUpdate = service.getById(5);
      System.out.println("Akan diupdate data lama: " + String.valueOf(mhsUpdate));
      if (mhsUpdate != null) {
         mhsUpdate.setNama("Dinaya");
         System.out.println("dengan data baru: " + String.valueOf(mhsUpdate));
         service.update(mhsUpdate);
      }

      displayAll();
      System.out.println("===delete");
      System.out.println("akan di delete: " + String.valueOf(service.getById(5)));
      service.delete(5);
      displayAll();
   }

   public static void displayAll() {
      System.out.println("--- Daftar Mahasiswa Saat Ini ---");

      for(Mahasiswa mhs : service.getAll()) {
         System.out.println(mhs);
      }

      System.out.println("---------------------------------");
   }
}
