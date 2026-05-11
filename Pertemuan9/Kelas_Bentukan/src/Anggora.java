/* Nama file  : Anggora.java
   Deskripsi  : realisasi atribut dan method pada class Anggora
   pembuat : Haikal Rafli Sembiring/24060124130079
   tanggal : 11 Mei 2026
 */

public class Anggora extends Kucing {

    /*Method */
    /*Konstruktor */
    public Anggora(String nama, double bobot) {
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
