/* Nama file  : Datum.java
   Deskripsi  :berisi atribut dan method dari class Datum
   pembuat : Haikal Rafli Sembiring/24060124130079
   tanggal : 30 April 2026
 */


public class Datum<T> {
    /*Atribut */
    private T isi;

    /*Method */
    /*Konstruktor */
    public Datum(T isi) {
        this.isi = isi;
    }


    /*Setter */
    public void setIsi(T isibaru) {
        this.isi = isibaru;
    }
    
    /*Getter */
    public T getIsi() {
        return isi;
    }

    public  void tampilkanAnabul(Anabul anabul) {
        anabul.Gerak();
        anabul.Bersuara();
        if(anabul instanceof Kucing) {
            ((Kucing) anabul).printBobot();
        }
    }
    
    
}
