/* Nama file  : Burung.java
   Deskripsi  :berisi atribut dan method dari class Burung
   pembuat : Haikal Rafli Sembiring/24060124130079
   tanggal : 28 April 2026
 */

public class Burung extends Anabul{
    

      /*Method */
    /*Konstruktor */
    public Burung(String nama) {
        super(nama);
    }

     public void Gerak() {
        System.out.println(super.getNama() + " Terbang");
    }
    
    public void Bersuara() {
        System.out.println(super.getNama() + " Cuit");

    }
}
