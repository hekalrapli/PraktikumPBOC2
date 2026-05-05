/* Nama file  : Data.java
   Deskripsi  :berisi atribut dan  method dari class Data
   pembuat : Haikal Rafli Sembiring/24060124130079
   tanggal : 4 Mei 2026
 */

import java.util.Arrays;

public class Data<T> {
    
    /*Atribut */
    private static final int kapasitas = 100;
    private final T ruang[];
    private int banyak;

      /*Method */
    /*Konstruktor */
    public Data(T[] ruang) {
        this.ruang = Arrays.copyOf(ruang, kapasitas);
        this.banyak = 0;
    }

    /*Getter */
    public T getIsi(int posisi) {
        if (posisi < 1 || posisi > kapasitas) {
            return null;
        }
        return ruang[posisi-1];
    }

     public int getSize() {
        return this.banyak;
    }


    /*Setter */
    public void setIsi(int posisi, T objek) {
        if (ruang[posisi-1] == null) {
            banyak++;
        }
        ruang[posisi-1] = objek;
    }
   
}