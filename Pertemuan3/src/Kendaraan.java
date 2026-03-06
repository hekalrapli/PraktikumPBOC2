/* Nama file  : Kendaraan.java
   Deskripsi  :berisi atribut dan method dalam class Kendaraan
   pembuat : Haikal Rafli Sembiring/24060124130079
   tanggal : 5 Maret 2026
 */
public class Kendaraan {
    
    /*ATRIBUT */
    private String noPlat;
    private String jenis;


    /* METHOD */

    /*KONSTRUKTOR */
    public Kendaraan() {
        this("","");
    }
    public Kendaraan(String noPlat, String jenis) {
        this.noPlat = noPlat;
        this.jenis = jenis;

    }

    /*SELEKTOR */
     public String getNoPlat() {
     return noPlat;
   }
   public String getJenis() {
     return jenis;
   }


    /*MUTATOR */
   public void setNoPlat(String x) {
        this.noPlat = x;
   }
 
   public void setJenis(String x) {
        this.jenis = x;
   }


    
}


