/* Nama file  : Persegi.java
   Deskripsi  :berisi atribut dan method dalam class Persegi
   pembuat : Haikal Rafli Sembiring/24060124130079
   tanggal : 12 Maret 2026
 */

// contoh penggunakan keyword final dengan asumsi class Persegi tidak akan diwariskan lagi
public final class Persegi extends BangunDatar {

    /*Atribut */
    private double sisi;


    /*Method */
    /*Konstruktor */
    public Persegi() {
        setJmlSisi(4);
    }

    public Persegi(double sisi, String warna, String border) {
        this.sisi = sisi;
        super(4,warna,border);
    }

    /*Selektor */
    public double getSisi() {
        return sisi;
    }

     public double getLuas() {
        return sisi*sisi;
    }

    public double getKeliling() {
        return 4 * sisi;
    }

    public double getDiagonal() {
        return sisi * Math.sqrt(2);
    }

    /*Mutator */
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    /*Override */
    /*Method tambahan */


    //   public void printInfo() {
    
    //     System.out.println("Jumlah sisi : " + getJmlSisi());
    //     System.out.println("Warna : " + getWarna());
    //     System.out.println("Border : " + getBorder());
    //     System.out.println("Panjang sisi : " + sisi);
    // }


    // Menggunakan keyword Super
    public void printInfo() {
    
        super.printInfo();
        System.out.println("Panjang sisi : " + sisi);
    }





    
}
