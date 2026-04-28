/* Nama file  : Mahasiswa.java
   Deskripsi  :berisi atribut dan method dalam class Mahasiswa
   pembuat : Haikal Rafli Sembiring/24060124130079
   tanggal : 28 April 2026
 */


public class Mahasiswa extends Civitasakademika {
    /* Atribut */
    private String nim;
    private Dosen dosenWali;
    
    /* Method */
    /* Konstruktor */
    public Mahasiswa() {
       
    }
    public Mahasiswa(String nama, String nim, Dosen dosenWali) {
        super(nama);
        this.nim = nim;
        this.dosenWali = dosenWali;

    }

    /*Setter */

    public void setWali(Dosen dosenWali) {
         this.dosenWali = dosenWali;
    }

     public void setNim(String nim) {
        this.nim = nim;
    }

    /* Getter */
     @Override
    public String getNomor() {
        return this.nim;
    }
    public Dosen getDosenWali() {
        return this.dosenWali;
    }

   
    public void tampilDataMahasiswa() {
        System.out.println("NIM : " + this.nim);
        System.out.println("Nama : " + this.getNama());
        System.out.println("Nama Dosen Wali : " + this.getDosenWali().getNama());
    }

   
}
