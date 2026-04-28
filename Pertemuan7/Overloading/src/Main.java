/* Nama file  : Mahasiswa.java
   Deskripsi  :berisi implementasi dari polimorfisme overloading
   pembuat : Haikal Rafli Sembiring/24060124130079
   tanggal : 28 April 2026
 */

public class Main {
    public static void main(String[] args) {
        Mahasiswa Mhs1 = new Mahasiswa();
        Mahasiswa Mhs2 = new Mahasiswa();
        Mahasiswa Mhs3 = new Mahasiswa();
        Mahasiswa Mhs4 = new Mahasiswa("13424047","AAI","Teknik Geofisika");
        Mahasiswa Mhs5 = new Mahasiswa(Mhs4);
        Mhs1.setProgramStudi();
        System.out.println("Varian 1 : " + Mhs1.getProgramStudi());

        Mhs1.setProgramStudi("Teknik Industri");
        System.out.println("Varian 2 : " + Mhs1.getProgramStudi());
        
        Mhs2.setProgramStudi("Teknik Biomedis");
        Mhs1.setProgramStudi(Mhs2);
        System.out.println("Varian 3 : " + Mhs1.getProgramStudi());
        

        System.out.println();
        System.out.println("Mhs 3");
        System.out.println("Nim : " + Mhs3.getNim());
        System.out.println("Nama  : " + Mhs3.getNama());
        System.out.println("Program Studi  : " + Mhs3.getProgramStudi());

        
        System.out.println();
        System.out.println("Mhs 4");
        System.out.println("Nim : " + Mhs4.getNim());
        System.out.println("Nama  : " + Mhs4.getNama());
        System.out.println("Program Studi  : " + Mhs4.getProgramStudi());

        System.out.println();
        System.out.println("Mhs 5");
        System.out.println("Nim : " + Mhs5.getNim());
        System.out.println("Nama  : " + Mhs5.getNama());
        System.out.println("Program Studi  : " + Mhs5.getProgramStudi());

    }
}
