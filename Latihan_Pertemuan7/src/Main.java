/* Nama file  : Main.java
   Deskripsi  :berisi aplikasi dari class civitasakademika, class turunannya dan class seminar
   pembuat : Haikal Rafli Sembiring/24060124130079
   tanggal : 28 April 2026
 */


public class Main {
    
    public static void main(String[] args) {
        Civitasakademika D1 = new Dosen("Rinaldi Munir", "19685088");
        Civitasakademika D2 = new Dosen("Tuwankotta", "1609087");

        Seminar S1 = new Seminar();

        Civitasakademika M1 = new Mahasiswa("Fitria Izzati", "13424046",(Dosen)D2);
        Civitasakademika M2 = new Mahasiswa("Kloce Saragih", "13524047",(Dosen)D1);
        Civitasakademika M3 = new Mahasiswa("James Moriarty", "13024048",(Dosen)D1);
        Civitasakademika M4 = new Mahasiswa("Louis Moriarty", "13424049",(Dosen)D1);
        Civitasakademika M5 = new Mahasiswa("Albert Moriarty", "13124050",(Dosen)D2);
      

        
        S1.registrasi(D1);
        S1.registrasi(D2);
        S1.registrasi(M1);
        S1.registrasi(M2);
        S1.registrasi(M3);
        S1.registrasi(M4);
        S1.registrasi(M5);

        
        S1.tampilPeserta();
        System.out.println("Jumlah mahasiswa : " + S1.countMahasiswa());
        System.out.println("Jumlah Peserta : " + S1.countPeserta());
        
        System.out.println();

        ((Mahasiswa)M1).tampilDataMahasiswa();
        ((Mahasiswa)M1).setWali((Dosen)D1);
        System.out.println();
       ((Mahasiswa)M1).tampilDataMahasiswa();

  


    }
}
