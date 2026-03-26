/* Nama file  : DosenTamu.java
   Deskripsi  :berisi atribut dan method dalam class DosenTamu
   pembuat : Haikal Rafli Sembiring/24060124130079
   tanggal : 14 Maret 2026
 */


import java.time.LocalDate;
import java.time.Period;

public class DosenTamu extends Dosen{

    /*Atribut */
    private String nidk;
    private LocalDate tgl_berakhir;
    private double tunjangan = 0.025;
    static String jabatan =  "Dosen Tamu";


        /*Method */
        /*Konstruktor */
    public DosenTamu() {

    }

    /*Selektor */
    public String getNidk() {
        return this.nidk;
    }

    public LocalDate getTglBerakhir() {
        return this.tgl_berakhir;
    }

    public Period getMasaKontrak() {
        Period bulan =  Period.between(LocalDate.now(),getTglBerakhir());
        return bulan;
    }


    public double getTunjangan() {
        return super.getTunjangan() * tunjangan;
    }


    /*Mutator */
    public void setNidk(String nidk) {
        this.nidk = nidk;
    }

    public void setTglBerakhir(LocalDate tgl_berakhir) {
         this.tgl_berakhir = tgl_berakhir;
    }

    /*Method Tambahan */
   

    public void printInfo() {
        System.out.println("NIP : " + getNip());
        System.out.println("NIDK : " + getNidk());
        System.out.println("Nama : " + getNama());
        System.out.println("Tanggal Lahir : " + getTglLahir().getDayOfMonth() + " " + getTglLahir().getMonth() + " " + getTglLahir().getYear());
        System.out.println("TMT : " + getTMT().getDayOfMonth() + " " + getTMT().getMonth() + " " + getTMT().getYear());
        System.out.println("Jabatan : " + jabatan);
        System.out.println("Fakultas : " + getFakultas());
        System.out.println("Masa Kontrak Berakhir : " + getMasaKontrak().getMonths() + " Bulan");
        System.out.println("Tanggal berakhir Kontrak : " + getTglBerakhir().getDayOfMonth() + " " + getTglBerakhir().getMonth() + " " + getTglBerakhir().getYear() );
        System.out.println("Gaji Pokok : " + getGajiPokok());
        System.out.println("Tunjangan : " + getTunjangan());

    }
}
