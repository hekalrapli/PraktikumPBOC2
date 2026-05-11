/* Nama file  : Kembangtelon.java
   Deskripsi  : realisasi atribut dan method pada class Kembangtelon
   pembuat : Haikal Rafli Sembiring/24060124130079
   tanggal : 11 Mei 2026
 */

public class Kembangtelon extends Kucing {

    
    /*Method */
    /*Konstruktor */
    public Kembangtelon(String nama, double bobot) {
        super(nama, bobot);
    }

    @Override
     public void Gerak() {
        System.out.println(super.getPanggilan() + " lincah melompat");
    }
    
    public void Bersuara() {
        System.out.println(super.getPanggilan() + " bersuara : Meong lembut");

    }
}
