/* Nama file  : Anjing.java
   Deskripsi  : realisasi atribut dan method pada class Anjing
   pembuat : Haikal Rafli Sembiring/24060124130079
   tanggal : 11 Mei 2026
 */

public class Anjing extends Anabul{
    
    /*Method */
    /*Konstruktor */
    public Anjing(String nama) {
        super(nama);
    }

     public void Gerak() {
        System.out.println(super.getPanggilan() + " Melata");
    }
    
    public void Bersuara() {
        System.out.println(super.getPanggilan() + " guk-guk");

    }
}
