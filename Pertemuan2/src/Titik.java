/* Nama file  : Titik.java
   Deskripsi  :berisi atribut dan method dalam class Titik
   pembuat : Haikal Rafli Sembiring/24060124130079
   tanggal : 26 Februari 2026
 */


public class Titik {
   private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    public Titik() {
        this(0,0);
      
    }
    
    public Titik(double x, double y) {
        this.absis = x;
        this.ordinat = y;
        counterTitik++;
    }

    public  static int getCounterTitik() {
        return counterTitik;
    }

     public double getAbsis() {
        return this.absis;
    }
    public  double getOrdinat() {
        return this.ordinat;
    }
    
    public  void setAbsis(double x) {
        this.absis = x;
    }
     public void setOrdinat(double y) {
        this.ordinat = y;
    }
    public  void geser(double x, double y) {
        this.absis += x;
        this.ordinat +=y;
    }

    public  int getKuadran() {
        if(this.absis > 0) {
            if(this.ordinat> 0) return 1;
            else return 4;
        }else {
            if(this.ordinat > 0) return 2;
            else return 3;
        }
    }
    
     public double getJarakPusat() {
        return Math.sqrt((this.absis * this.absis) + (this.ordinat * this.ordinat));
    }
    
    public  double getJarak(Titik T) {
        double x = this.absis - T.getAbsis();
        double y = this.ordinat - T.getOrdinat();
        return Math.sqrt(x*x + y*y);
    }
    
     public void refleksiX() {
        this.ordinat *= -1;
    }
    public  void refleksiY() {
        this.absis *= -1;
    }
    
    public  Titik getRefleksiX() {
        Titik result = new Titik();
        result.setAbsis(this.absis);
        result.setOrdinat(this.ordinat *-1);
        return result;
    }
    public  Titik getRefleksiY() {
        Titik result = new Titik();
        result.setAbsis(this.absis *-1);
        result.setOrdinat(this.ordinat);
        return result;
    }

    public  void printTitik() {
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }


  
}