/* Nama file  : BangunDatar.java
   Deskripsi  :berisi atribut dan method dalam class BangunDatar
   pembuat : Haikal Rafli Sembiring/24060124130079
   tanggal : 12 Maret 2026
 */

public  class BangunDatar {
    /* ATRIBUT */
    private int jmlSisi;
    private String warna;
    private String border;
    private static int counterBangunDatar = 0;

    /*Method */
    /*Konstruktor */
    public BangunDatar(){
        counterBangunDatar++;
    }
    public BangunDatar(int jmlSisi, String warna,String border){
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

      /*Selektor */
    public int getJmlSisi() {
        return jmlSisi;
    }


    public String getWarna() {
        return warna;
    }

    public String getBorder() {
        return border;
    }

      /*Mutator */
    public void setJmlSisi(int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
    public void setBorder(String border) {
        this.border = border;
    }

    /*Method tambahan */

    public  void printInfo() {
        System.out.println("Jumlah sisi : " + jmlSisi);
        System.out.println("Warna : " + warna);
        System.out.println("Border : " + border);
    }

    public static void printCounterBangunDatar() {
        System.out.println("Jumlah Objek Bangun Datar : " + counterBangunDatar);
    }

    
}
