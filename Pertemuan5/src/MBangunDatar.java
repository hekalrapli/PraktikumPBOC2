/* Nama file  : MBangunDatar.java
   Deskripsi  :berisi realisasi dari class BangunDatar
   pembuat : Haikal Rafli Sembiring/24060124130079
   tanggal : 26 Maret 2026
 */

public class MBangunDatar {
    public static void main(String[] args) {
        // BangunDatar B1 = new BangunDatar();
        BangunDatar P1 = new Persegi(10, "Hijau", "Solid");
        Persegi P2 =  new Persegi(5, "Kuning", "Solid");
        BangunDatar L1 = new Lingkaran(14,"Biru oke gas", "Solid");
        Lingkaran L2 = new Lingkaran(7, "Merah", "Solid");

        System.out.println("Luas P1 == L1 ? " + P1.isEqualLuas(L1));
        System.out.println("Keliling P1 == L1 ? " + P1.isEqualKeliling(L1));

        System.out.println("Panjang sisi P1 sebelum zoom in : " + ((Persegi) P1).getSisi() );
        ((Persegi) P1).zoomIn();
        System.out.println("Panjang sisi P1 setelah zoom in : " + ((Persegi) P1).getSisi() );
        
        System.out.println();

        System.out.println("Panjang sisi L1 sebelum zoom in : " + ((Lingkaran) L1).getJari() );
        ((Lingkaran) L1).zoomIn();
        System.out.println("Panjang sisi L1 setelah zoom in : " + ((Lingkaran) L1).getJari() );
   
 
     
    }
}
