/* Nama file  : MainPiaraan.java
   Deskripsi  : berisi aplikasi dari class-class lain 
   pembuat : Haikal Rafli Sembiring/24060124130079
   tanggal : 11 Mei 2026
 */

public class MainPiaraan {
    public static void main(String[] args) {
        Piaraan P1 = new Piaraan();
        Anabul A1 = new Anjing("Blacky");

        P1.enqueueAnabul(A1);
        P1.enqueueAnabul(new Anggora("Moezza",4.7));
        P1.enqueueAnabul(new Kucing("James", 5.0));
        P1.showAnabul();
        System.out.println("Jumlah anabul : " + P1.getNbelm());
        System.out.println("Is Member Blacky? " + P1.isMember(A1));
        System.out.println("Jumlah Kucing di Piaraan: " + P1.countKucing());
        System.out.println("Jumlah bobot keluarga kucing di Piaraan : " + P1.bobotKucing());

        System.out.println();
        System.out.println("Nama panggilan Anabul Pertama : " + P1.getAnabul().getPanggilan());
        System.out.println();
        P1.showJenisAnabul();
        System.out.println("Jumlah anabul : " + P1.getNbelm());
        
        System.out.println();
        System.out.println("Anabul pertama dihapus");

        Anabul hapus = P1.dequeueAnabul();

        System.out.println();
        System.out.println("Nama Anabul yg dihapus : " + hapus.getPanggilan());
        P1.showJenisAnabul();
        System.out.println("Jumlah anabul : " + P1.getNbelm());
        System.out.println("Is Member Blacky ? " + P1.isMember(A1));
    }
}
