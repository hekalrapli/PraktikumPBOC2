/* Nama file  : Anjing.java
   Deskripsi  :berisi atribut dan method dari class Anjing
   pembuat : Haikal Rafli Sembiring/24060124130079
   tanggal : 28 April 2026
 */

public class Anjing extends Anabul{
    
    /*Method */
    /*Konstruktor */
    public Anjing(String nama) {
        super(nama);
    }

     public void Gerak() {
        System.out.println(super.getNama() + " Melata");
    }
    
    public void Bersuara() {
        System.out.println(super.getNama() + " guk-guk");

    }
}
