/* Nama file  : Main.java
   Deskripsi  :berisi implementasi dari polimorfisme inclusion
   pembuat : Haikal Rafli Sembiring/24060124130079
   tanggal : 28 April 2026
 */

public class Main {
    public static void main(String[] args) throws Exception {
        Anabul anabul1 = new Anjing("Gilberto");
        Anabul anabul2 = new Kucing("Roberto");
        Anabul anabul3 = new Burung("Alberto");

        
        anabul1.Gerak();
        anabul1.Bersuara();
        System.out.println();
        
        anabul2.Gerak();
        anabul2.Bersuara();
        System.out.println();

        anabul3.Gerak();
        anabul3.Bersuara();
        System.out.println();
        

    }
}
