/* Nama file  : Mahasiswa.java
   Deskripsi  :berisi atribut dan method dari class mahasiswa
   pembuat : Haikal Rafli Sembiring/24060124130079
   tanggal : 28 April 2026
 */

public class Mahasiswa {
    /*Atribut */
    private String nim;
    private String nama;
    private String programStudi;
    
    /*Method */
    /*Konstruktor */
    public Mahasiswa(){
        this.nim = "-999";
        this.nama = "n/a";
        this.programStudi = "n/a";
    }

    public Mahasiswa(String nim, String nama, String programStudi){
        this.nim = nim;
        this.nama = nama;
        this.programStudi = programStudi;
    }

    public Mahasiswa(Mahasiswa Mhs){
        this.nim = Mhs.getNim();
        this.nama = Mhs.getNama();
        this.programStudi = Mhs.getProgramStudi();
    }

    /*Getter */
    public String getProgramStudi() {
        return this.programStudi;
    }
    public String getNim() {
        return this.nim;
    }
    public String getNama() {
        return this.nama;
    }
 
    /*Setter */
    public void setProgramStudi() {
        programStudi = "Kosong";
    }
    public void setProgramStudi(String prodi) {
        programStudi = prodi;
    }
    public void setProgramStudi(Mahasiswa Mhs) {
        programStudi = Mhs.getProgramStudi();
    }

}
