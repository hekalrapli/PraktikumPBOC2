/* Nama file  : Mahasiswa.java
   Deskripsi  :berisi atribut dan method dalam class Mahasiswa
   pembuat : Haikal Rafli Sembiring/24060124130079
   tanggal : 5 Maret 2026
 */

import java.util.ArrayList;

public class Mahasiswa {
     /* ATRIBUT */
   private String nim;
   private String nama;
   private String prodi;
   private ArrayList<Matakuliah> listMatakuliah;
   private Dosen dosenWali;
   private Kendaraan kendaraan;

   /*METHOD */
    /*KONSTRUKTOR */

   public Mahasiswa() {

    this("","","");
    this.listMatakuliah = new ArrayList<>();
    this.dosenWali = new Dosen();
    this.kendaraan = new Kendaraan();
   }

   public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
   }

  /*SELEKTOR */
   public String getNip() {
     return nim;
   }
   public String getNama() {
     return nama;
   }

   public String getProdi() {
     return prodi;
   }

   public Dosen getDosenWali() {
    return dosenWali;
   }

   public Kendaraan getKendaraan() {
    return kendaraan;
   }

   /*MUTATOR */
   public void setNim(String x) {
        this.nim = x;
   }
 
   public void setNama(String x) {
        this.nama = x;
   }
   public void setProdi(String x) {
        this.prodi = x;
   }

   public void setDosenWali(Dosen D) {
        dosenWali = D;
   }
   public void setKendaraan(Kendaraan K) {
        kendaraan = K;
   }

  /*Method Tambahan */
   public void addMatkul(Matakuliah newMatkul) {
    listMatakuliah.add(newMatkul);
   }

   public int getJumlahSKS() {
    int totalSks = 0;
    for(int i = 0; i < listMatakuliah.size(); i++) {
        totalSks += listMatakuliah.get(i).getSks();
    }
    return totalSks;

   }

   public int getJumlahMatkul() {
    return listMatakuliah.size();

   }

   public void printMhs() {
         System.out.println("Nama Mahasiswa : " + this.getNama());
        System.out.println("NIM  : " + this.getNip());
        System.out.println("Prodi  : " + this.getProdi());
   }

   public void printDetailMhs() {
       System.out.println("Nama Mahsiswa : " + this.getNama());
        System.out.println("NIM  : " + this.getNip());
        System.out.println("Prodi  : " + this.getProdi());

        System.out.println();
        System.out.println("Mata Kuliah yang diambil : ");
          for(int i = 0; i < listMatakuliah.size(); i++) {
         System.out.println(i+1 + ". " + listMatakuliah.get(i).getNama());
    }

         System.out.println();
        System.out.println("Nama Dosen Wali : " + dosenWali.getNama());
        System.out.println("Nip  : " + dosenWali.getNip());
        System.out.println("Prodi  : " + dosenWali.getProdi());

        System.out.println();
        System.out.println("Nomor Plat Kendaraan : " + kendaraan.getNoPlat());
        System.out.println("Jenis Kendaraan : " + kendaraan.getJenis());



   }


    
}
