/* Nama file  : Kucing.java
   Deskripsi  :berisi atribut dan method dari class Kucing
   pembuat : Haikal Rafli Sembiring/24060124130079
   tanggal : 30 April 2026
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
        System.out.println(super.getNama() + " Melata");
    }
    
    public void Bersuara() {
        System.out.println(super.getNama() + " meong");

    }

    public void printBobot() {
        System.out.println("Memiliki bobot " + this.getBobot() + " kg");
    }
}
