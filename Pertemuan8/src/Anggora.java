/* Nama file  : Anggora.java
   Deskripsi  :berisi atribut dan method dari class Anggora
   pembuat : Haikal Rafli Sembiring/24060124130079
   tanggal : 30 April 2026
 */

public class Anggora extends Kucing {
    public Anggora(String nama, double bobot) {
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
