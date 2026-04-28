/* Nama file  : Kucing.java
   Deskripsi  :berisi atribut dan method dari class Kucing
   pembuat : Haikal Rafli Sembiring/24060124130079
   tanggal : 28 April 2026
 */

public class Kucing extends Anabul{
    

      /*Method */
    /*Konstruktor */
    public Kucing(String nama) {
        super(nama);
    }

     public void Gerak() {
        System.out.println(super.getNama() + " Melata");
    }
    
    public void Bersuara() {
        System.out.println(super.getNama() + " meong");

    }
}
