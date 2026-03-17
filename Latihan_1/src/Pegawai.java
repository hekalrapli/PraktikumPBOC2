/* Nama file  : Pegawai.java
   Deskripsi  :berisi atribut dan method dalam class Pegawai
   pembuat : Haikal Rafli Sembiring/24060124130079
   tanggal : 14 Maret 2026
 */

import java.time.LocalDate;
import java.time.Period;

public class Pegawai {  

    /*Atribut */

    private String nip;
    private String nama;
    private LocalDate tgl_lahir;
    private LocalDate tmt;
    private double gajiPokok;


    /*Method */
    /*Konstruktor */
    public Pegawai() {

    }

    /*SELEKTOR */
    public String getNip() {
        return this.nip;
    }
    public String getNama() {
        return this.nama;
    }
    public LocalDate getTglLahir() {
        return this.tgl_lahir;
    }
    public LocalDate getTMT() {
        return this.tmt;
    }
    public double getGajiPokok() {
        return this.gajiPokok;
    }

    public Period getMasaKerja() {
        return Period.between(tmt, LocalDate.now());
    }

    public double getTunjangan() {
        return  gajiPokok;
    }



    /*Mutator */

    public void setNip(String nip) {
         this.nip =  nip;
    }
    public void setNama(String nama) {
         this.nama = nama;
    }
    public void setTglLahir(LocalDate tgl_lahir) {
         this.tgl_lahir = tgl_lahir;
    }
    public void setTMT(LocalDate tmt) {
         this.tmt = tmt;
    }
    public void setGajiPokok(double gajiPokok ) {
         this.gajiPokok = gajiPokok;
    }


    
   

  






}
