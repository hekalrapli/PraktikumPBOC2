/* Nama file  : Dosen.java
   Deskripsi  :berisi atribut dan method dalam class Dosen
   pembuat : Haikal Rafli Sembiring/24060124130079
   tanggal : 28 April 2026
 */


public class Dosen extends Civitasakademika {

     /* Atribut */
    private String nip;


     /* Method */
     /* Konstruktor */
    public Dosen() {
        this(" "," ");
    }
    public Dosen(String nama, String nip) {
        super(nama);
        this.nip = nip;
    }

     /* Setter */
    public void setNip(String nip) {
        this.nip = nip;
    }
   
    /*Getter */
    @Override
    public String getNomor() {
        return this.nip;
    }
}
