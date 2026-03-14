/* Nama file  : Lingkaran.java
   Deskripsi  :berisi atribut dan method dalam class Lingkaran
   pembuat : Haikal Rafli Sembiring/24060124130079
   tanggal : 12 Maret 2026
 */

// contoh penggunakan keyword final dengan asumsi class lingkaran tidak akan diwariskan lagi
public final class Lingkaran extends BangunDatar {
      /*Atribut */
    private double jari;


     /*Method */
    /*Konstruktor */
    public Lingkaran() {
        setJmlSisi(1);
    }

    public Lingkaran(double jari, String warna, String border) {
        this.jari = jari;
       super(1,warna,border);
    }

     /*Selektor */
    public double getJari() {
        return this.jari;
    }

    public double getLuas() {
        return Math.PI*jari*jari;
    }

    public double getKeliling() {
        return 2*jari * Math.PI;
    }


      /*Mutator */
    public void setJari(double jari) {
        this.jari = jari;
    }

      public void printInfo() {
        super.printInfo();
        System.out.println("Panjang jari : " + jari);
    }

  


}
