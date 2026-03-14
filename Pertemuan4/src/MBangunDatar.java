/* Nama file  : MBangunDatar.java
   Deskripsi  :berisi realisasi dari class BangunDatar
   pembuat : Haikal Rafli Sembiring/24060124130079
   tanggal : 12 Maret 2026
 */

public class MBangunDatar {
    public static void main(String[] args) {
        Persegi P1 = new Persegi(2,"Hijau", "Solid");
        Lingkaran L1 = new Lingkaran(7,"Merah", "Solid");


        System.out.println("Bangun Datar : " + "Persegi");
        // System.out.println("Panjang sisi P1 : " + P1.getSisi());
        P1.printInfo();
        // System.out.println("Jumlah sisi P1 : " + P1.getJmlSisi());
        // System.out.println("Warna P1 : " + P1.getWarna());
        // System.out.println("Border P1 : " + P1.getBorder());

        System.out.println("Luas P1 : " + P1.getLuas());
        System.out.println("Keliling P1 : " + P1.getKeliling());
        System.out.println("Diagonal P1 : " + P1.getDiagonal());

        System.out.println();
        // System.out.println("Panjang jari-jari L1 : " + L1.getJari());

         System.out.println("Bangun Datar : " + "Lingkaran");
        L1.printInfo();
        System.out.println("Luas L1 : " + L1.getLuas());
        System.out.println("Keliling L1 : " + L1.getKeliling());

        System.out.println();
        BangunDatar.printCounterBangunDatar();


    }
}
