/* Nama file  : Civitasakademika.java
   Deskripsi  :berisi atribut dan method dalam class Civitasakademika
   pembuat : Haikal Rafli Sembiring/24060124130079
   tanggal : 28 April 2026
 */

public class Civitasakademika {

    /* Atribut */
    private String nama;

    /*Method */

    /*Konstruktor */
    public Civitasakademika() {
        this(" ");
    }
    public Civitasakademika(String nama) {
        this.nama = nama;
    }

    /* Setter */
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    /* Getter */
    public String getNama() {
        return this.nama;
    }
    
    public String getNomor(){return " ";}
    
}
