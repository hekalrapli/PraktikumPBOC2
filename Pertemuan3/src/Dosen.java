/* Nama file  : Dosen.java
   Deskripsi  :berisi atribut dan method dalam class Dosen
   pembuat : Haikal Rafli Sembiring/24060124130079
   tanggal : 5 Maret 2026
 */

public class Dosen {
    /* ATRIBUT */
   private String nip;
   private String nama;
   private String prodi;

   /*METHOD */
    /*KONSTRUKTOR */

   public Dosen() {
    this("","","");
   }

   public Dosen(String nip, String nama, String prodi) {
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
   }

  /*SELEKTOR */
   public String getNip() {
     return nip;
   }
   public String getNama() {
     return nama;
   }

   public String getProdi() {
     return prodi;
   }

   /*MUTATOR */
   public void setNip(String x) {
        this.nip = x;
   }
 
   public void setNama(String x) {
        this.nama = x;
   }
   public void setProdi(String x) {
        this.prodi = x;
   }
 



}
