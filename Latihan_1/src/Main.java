/* Nama file  : Main.java
   Deskripsi  :berisi realisasi dari semua class
   pembuat : Haikal Rafli Sembiring/24060124130079
   tanggal : 16 Maret 2026
 */

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
       DosenTetap D1 = new DosenTetap();
       DosenTamu D2 = new DosenTamu();
       Tendik T1 = new Tendik();

       System.out.println();

       D1.setNip("9545647548");
       D1.setNidn("78647324");
       D1.setNama("Andi");
       D1.setTglLahir(LocalDate.parse("1990-05-05"));
       D1.setTMT(LocalDate.parse("2015-01-01"));
       D1.setFakultas("Fakultas Sains dan Matematika");
       D1.setGajiPokok(5000000);
       D1.printInfo();

       System.out.println();
       
       D2.setNip("12345678");
       D2.setNidk("13424047");
       D2.setNama("Grandprix");
       D2.setTglLahir(LocalDate.parse("1985-07-04"));
       D2.setTMT(LocalDate.parse("2025-11-01"));
       D2.setTglBerakhir(LocalDate.parse("2026-07-17"));
       D2.setFakultas("Fakultas Teknik");
       D2.setGajiPokok(3000000);
       D2.printInfo();

       System.out.println();
       T1.setNip("87654321");
       T1.setNama("Benny Siregar");
       T1.setTglLahir(LocalDate.parse("1992-08-09"));
       T1.setTMT(LocalDate.parse("2024-02-04"));
       T1.setBidang("Kemahasiswaaan");
       T1.setGajiPokok(2500000);
       T1.printInfo();
    }
}
