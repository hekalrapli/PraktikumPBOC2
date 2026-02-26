/* Nama file  : Titik.java
   Deskripsi  :berisi atribut dan method dalam class Titik
   pembuat : Haikal Rafli Sembiring/24060124130079
   tanggal : 26 Februari 2026
 */


public class Titik {
    double absis;
    double ordinat;
    static int counterTitik = 0;

    Titik() {
        this(0,0);
      
    }
    
    public Titik(double x, double y) {
        this.absis = x;
        this.ordinat = y;
        counterTitik++;
    }

    static int getCounterTitik() {
        return counterTitik;
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

    int getKuadran() {
        if(this.absis > 0) {
            if(this.ordinat> 0) return 1;
            else return 4;
        }else {
            if(this.ordinat > 0) return 2;
            else return 3;
        }
    }

    double getJarakPusat() {
        return Math.sqrt((this.absis * this.absis) + (this.ordinat * this.ordinat));
    }

    double getJarak(Titik T) {
        double x = this.absis - T.getAbsis();
        double y = this.ordinat - T.getOrdinat();
         return Math.sqrt(x*x + y*y);
    }

    void refleksiX() {
        this.ordinat *= -1;
    }
    void refleksiY() {
        this.absis *= -1;
    }

    Titik getRefleksiX() {
        Titik result = new Titik();
        result.setAbsis(this.absis);
        result.setOrdinat(this.ordinat *-1);
        return result;
    }
    Titik getRefleksiY() {
         Titik result = new Titik();
        result.setAbsis(this.absis *-1);
        result.setOrdinat(this.ordinat);
        return result;
    }

    void printTitik() {
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

  
}