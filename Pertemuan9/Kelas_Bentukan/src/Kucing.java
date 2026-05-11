/* Nama file  : Kucing.java
   Deskripsi  : realisasi atribut dan method pada class Kucing
   pembuat : Haikal Rafli Sembiring/24060124130079
   tanggal : 11 Mei 2026
 */

public class Kucing extends Anabul{

    /*Atribut */
    protected double bobot;

      /*Method */
    /*Konstruktor */
    public Kucing(String nama, double bobot) {
        super(nama);
        this.bobot = bobot;
    }

    /*Setter */
    public void setBobot(double bobot) {
        this.bobot = bobot;

    }

    /*Getter */ 
    public double getBobot() {
        return this.bobot;
    }

     public void Gerak() {
        System.out.println(super.getPanggilan() + " Melata");
    }
    
    public void Bersuara() {
        System.out.println(super.getPanggilan() + " meong");

    }

    public void printBobot() {
        System.out.println("Memiliki bobot " + this.getBobot() + " kg");
    }
}
