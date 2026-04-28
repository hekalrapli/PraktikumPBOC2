/* Nama file  : Anabul.java
   Deskripsi  :berisi atribut dan method dari class Anabul
   pembuat : Haikal Rafli Sembiring/24060124130079
   tanggal : 28 April 2026
 */

public class Anabul {
    /*Atribut */
    private String nama;
    
    /*Method */
    /*Konstruktor */
    public Anabul(){
        this.nama = "";
    }
    public Anabul(String nama){
        this.nama = nama;
    }

    /*Setter */
    public void setNama(String nama) {
         this.nama = nama;
    }

    /*Getter */
    public String getNama() {
        return this.nama;
    }

    public void Gerak() {
           System.out.println("Anabul " + nama + "bergerak" );
        }
        
        public void Bersuara() {
        System.out.println("Anabul " + nama + "bersuara" );

    }
}
