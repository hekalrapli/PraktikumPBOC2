/* Nama file  : Tendik.java
   Deskripsi  :berisi atribut dan method dalam class Tendik
   pembuat : Haikal Rafli Sembiring/24060124130079
   tanggal : 14 Maret 2026
 */

import java.time.Month;

public class Tendik extends Pegawai {
     /*Atribut */
    private String bidang;
    static int bup = 55;
    private double tunjangan = 0.01;

    /*Method */
    /*Konstruktor */

    public Tendik() {
        
    }

    /*Selektor */
    public String getBidang() {
        return this.bidang;
    }

    public double getTunjangan() {
         return super.getTunjangan() * getMasaKerja().getYears() * tunjangan;
    }

    

    /*Mutator */
    public void setBidang(String bidang) {
        this.bidang = bidang;
    }

    /*Method tambahan */
  
 

     public void printTanggalPensiun() {
        Month bulan = Month.of(getTglLahir().getMonthValue()+1);
        String bulan_ret = bulan.toString();
        int tahun = getTglLahir().getYear() + bup;
        String tahun_ret = String.valueOf(tahun);
        System.out.print("Tanggal Pensiun : ");
        System.out.println("1 " + bulan_ret + " " + tahun_ret);
    }

    public void printInfo() {
        System.out.println("NIP : " + getNip());
        System.out.println("Nama : " + getNama());
        System.out.println("Tanggal Lahir : " + getTglLahir().getDayOfMonth() + " " + getTglLahir().getMonth() + " " + getTglLahir().getYear());
        System.out.println("TMT : " + getTMT().getDayOfMonth() + " " + getTMT().getMonth() + " " + getTMT().getYear());
        System.out.println("Bidang : " + bidang);
        System.out.println("Masa kerja : " + getMasaKerja().getYears() + " tahun " +  getMasaKerja().getMonths() + " bulan");
        printTanggalPensiun();
        System.out.println("Gaji Pokok : " + getGajiPokok());
        System.out.println("Tunjangan :"  + getTunjangan());


    }
}
