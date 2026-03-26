/* Nama file  : Asersi1.java
   Deskripsi  :Program untuk menunjukkan asersi
   pembuat : Haikal Rafli Sembiring/24060124130079
   tanggal : 26 Maret 2026
 */

public class Asersi1 {
  
    public static void main(String[] args) {
        int x = 0;
        if(x > 0) {
            System.out.println("x bilangan positif");
        }else {
            assert(x < 0) : "ada kesalahan kode";
            System.out.println("x bilangan negatif");

        }
    }
}
