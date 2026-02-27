/* Nama file  : Garis.java
   Deskripsi  :berisi atribut dan method dalam class Garis
   pembuat : Haikal Rafli Sembiring/24060124130079
   tanggal : 26 Februari 2026
 */

public class Garis {
    private Titik awal;
    private Titik akhir;
    private static int counterGaris = 0;

    public Garis(Titik P, Titik Q) {
        this.awal = P;
        this.akhir = Q;
        counterGaris++;
    }
    
    public Garis() {
        this(new Titik(0,0), new Titik(1,1));
    }

    public Titik getTitikAwal() {
        return this.awal;
    }
    public Titik getTitikAkhir() {
        return this.akhir;
    }

    public static int getCounterGaris() {
        return counterGaris;
    }

    public void setTitikAwal(Titik x) {
        this.awal = x;
    }
    public void setTitikAkhir(Titik y) {
        this.akhir = y;
    }

  
    public double getPanjangGaris() {
        return this.awal.getJarak(akhir);
    }

    public double getGradien() {
        return (this.akhir.getOrdinat() - this.awal.getOrdinat()) / (this.akhir.getAbsis() - this.awal.getAbsis());
    }

    public Titik getTitikTengah() {
        Titik tengah = new Titik();
        tengah.setAbsis((this.akhir.getAbsis() + this.awal.getAbsis())/2);
        tengah.setOrdinat((this.akhir.getOrdinat() + this.awal.getOrdinat())/2);
        return tengah;
    }

    public boolean isSejajar(Garis G) {
        return this.getGradien() == G.getGradien();
    }
    public boolean isTegakLurus(Garis G) {
        return this.getGradien() * G.getGradien() == -1;
    }

    public void printTitikAwalAkhir() {
        System.out.println("Titik awal : (" + this.getTitikAwal().getAbsis() + "," + this.getTitikAwal().getOrdinat() 
     + ")");
          System.out.println("Titik akhir : (" + this.getTitikAkhir().getAbsis() + "," + this.getTitikAkhir().getOrdinat() 
     + ")");
    }

    public void persamaanGaris() {
        double m = this.getGradien();
        double c = this.awal.getOrdinat() - m*this.awal.getAbsis();
        System.out.println("y = " + m + "x + " + c);

    }





    

    
}
