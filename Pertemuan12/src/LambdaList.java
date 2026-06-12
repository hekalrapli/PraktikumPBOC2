/* Nama file  : LambdaList.java
   Deskripsi  :berisi atribut dan method dari class LambdaList
   pembuat : Haikal Rafli Sembiring/24060124130079
   tanggal : 6 Juni 2026
 */
import java.util.ArrayList;

public class LambdaList {
    public static void main(String[] args) {
        ArrayList<String> mahasiswaList  = new ArrayList<>();
        mahasiswaList.add("Ambatron");
        mahasiswaList.add("Byokovi");
        mahasiswaList.add("Chong Koh Wi");
        mahasiswaList.add("Dol Ki wi");

        mahasiswaList.forEach((nama) -> System.out.println(nama));
    }
}
