/* Nama file  : Burung.java
   Deskripsi  : realisasi atribut dan method pada class Burung
   pembuat : Haikal Rafli Sembiring/24060124130079
   tanggal : 11 Mei 2026
 */

public class Burung extends Anabul{
    

      /*Method */
    /*Konstruktor */
    public Burung(String nama) {
        super(nama);
    }

     public void Gerak() {
        System.out.println(super.getPanggilan() + " Terbang");
    }
    
    public void Bersuara() {
        System.out.println(super.getPanggilan() + " Cuit");

    }
}
