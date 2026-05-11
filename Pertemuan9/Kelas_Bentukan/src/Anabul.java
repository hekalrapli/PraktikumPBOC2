/* Nama file  : Anabul.java
   Deskripsi  : realisasi atribut dan method pada class Anabul
   pembuat : Haikal Rafli Sembiring/24060124130079
   tanggal : 11 Mei 2026
 */

public class Anabul {
    /*Atribut */

    private String panggilan;
    
    /*Method */
    /*Konstruktor */
    public Anabul(){
        this("");
    }
    public Anabul(String nama){
        this.panggilan = nama;
     
    }

    /*Setter */
    public void setNama(String nama) {
         this.panggilan = nama;
    }

    /*Getter */
    public String getPanggilan() {
        return this.panggilan;
    }

    public void Gerak() {
           System.out.println("Anabul " + panggilan + "bergerak" );
        }
        
        public void Bersuara() {
        System.out.println("Anabul " + panggilan + "bersuara" );

    }
}
