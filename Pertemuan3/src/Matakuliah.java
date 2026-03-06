/* Nama file  : Matakuliah.java
   Deskripsi  :berisi atribut dan method dalam class Matakuliah
   pembuat : Haikal Rafli Sembiring/24060124130079
   tanggal : 5 Maret 2026
 */

public class Matakuliah {
    /*ATRIBUT */
    private String idMatkul;
    private String nama;
    private int sks;


    /* METHOD */

    /*KONSTRUKTOR */
    public Matakuliah() {
        this("","",0);
    }
    public Matakuliah(String idMatkul, String nama, int sks) {
        this.idMatkul = idMatkul;
        this.nama = nama;
        this.sks = sks;
    }

    /*SELEKTOR */
     public String getidMatkul() {
     return idMatkul;
   }
   public String getNama() {
     return nama;
   }

   public int getSks() {
     return sks;
   }

    /*MUTATOR */
   public void setidMatkul(String x) {
        this.idMatkul = x;
   }
 
   public void setNama(String x) {
        this.nama = x;
   }
   public void setSks(int x) {
        this.sks = x;
   }

    
}
