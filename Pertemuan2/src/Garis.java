/* Nama file  : Garis.java
   Deskripsi  :berisi atribut dan method dalam class Garis
   pembuat : Haikal Rafli Sembiring/24060124130079
   tanggal : 26 Februari 2026
 */

public class Garis {
    Titik awal;
    Titik akhir;
    static int counterGaris = 0;

    public Garis(Titik P, Titik Q) {
        this.awal = P;
        this.awal = Q;
    }

    public Garis() {
        this(new Titik(0,0), new Titik(1,1));
    }

    
}
