/* Nama file  : Kembangtelon.java
   Deskripsi  :berisi atribut dan method dari class Kembangtelon
   pembuat : Haikal Rafli Sembiring/24060124130079
   tanggal : 30 April 2026
 */

public class Kembangtelon extends Kucing {

    
    /*Method */
    /*Konstruktor */
    public Kembangtelon(String nama, double bobot) {
        super(nama, bobot);
    }

    @Override
     public void Gerak() {
        System.out.println(super.getNama() + " lincah melompat");
    }
    
    public void Bersuara() {
        System.out.println(super.getNama() + " bersuara : Meong lembut");

    }
}
