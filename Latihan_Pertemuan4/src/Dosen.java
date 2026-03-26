/* Nama file  : Dosen.java
   Deskripsi  :berisi atribut dan method dalam class Dosen
   pembuat : Haikal Rafli Sembiring/24060124130079
   tanggal : 14 Maret 2026
 */

public class Dosen extends Pegawai {
    private String fakultas;
    
    public Dosen() {
        
    }

    public String getFakultas() {
        return this.fakultas;
    }

    /*MUTATOR */
    public void setFakultas(String fakultas) {
         this.fakultas = fakultas;
    }



}