/* Nama file  : DosenTetap.java
   Deskripsi  :berisi atribut dan method dalam class DosenTetap
   pembuat : Haikal Rafli Sembiring/24060124130079
   tanggal : 14 Maret 2026
 */

import java.time.Month;

public class DosenTetap extends Dosen {

    /*Atribut */
    private String nidn;
    static int bup = 65;
    static String jabatan = "Dosen Tetap";
    static double tunjangan = 0.02;

    /*Method */
    /*Konstruktor */

    public DosenTetap() {
        
    }


    /*Selektor */
    public String getNidn() {
        return this.nidn;
    }

    public double getTunjangan() {
        return super.getTunjangan() * getMasaKerja().getYears() * tunjangan;
    }
    
    /*Mutator */
    public void setNidn(String nidn) {
        this.nidn = nidn;
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
        System.out.println("NIDN : " + getNidn());
        System.out.println("Nama : " + getNama());
        System.out.println("Tanggal Lahir : " + getTglLahir().getDayOfMonth() + " " + getTglLahir().getMonth() + " " + getTglLahir().getYear());
        System.out.println("TMT : " + getTMT().getDayOfMonth() + " " + getTMT().getMonth() + " " + getTMT().getYear());
        System.out.println("Jabatan : " + jabatan);
        System.out.println("Fakultas : " + getFakultas());
        System.out.println("Masa kerja : " + getMasaKerja().getYears() + " tahun " +  getMasaKerja().getMonths() + " bulan");
        printTanggalPensiun();
        System.out.println("Gaji Pokok : " + getGajiPokok());
        System.out.println("Tunjangan : " + getTunjangan());


    
        

    }



}
