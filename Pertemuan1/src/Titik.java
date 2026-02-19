/* Nama file  : Titik.java
   Deskripsi  :berisi atribut dan method dalam class Titik
   pembuat : Haikal Rafli Sembiring/24060124130079
   tanggal : 19 Februari 2026
 */


public class Titik {
    double absis;
    double ordinat;

    Titik() {
        absis = 0;
        ordinat = 0;
    }

    double getAbsis() {
        return this.absis;
    }
    double getOrdinat() {
        return this.ordinat;
    }
    
    void setAbsis(double x) {
        this.absis = x;
    }
    void setOrdinat(double y) {
        this.ordinat = y;
    }
    void geser(double x, double y) {
        this.absis += x;
        this.ordinat +=y;
    }

    void printTitik() {
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }
}