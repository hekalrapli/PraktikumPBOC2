/* Nama file  : OperatorGenerik.java
   Deskripsi  :berisi  method dari class OperatorGenerik
   pembuat : Haikal Rafli Sembiring/24060124130079
   tanggal : 4 Mei 2026
 */

public class OperatorGenerik {

    /*Method */
        public static <T> void Tukar(Datum<T> a, Datum<T> b) {
            T temp = a.getIsi();
            a.setIsi(b.getIsi());
            b.setIsi(temp);
        }

        public static <T extends Kucing> double Bobot2(T a, T b) {
            return a.getBobot() + b.getBobot();
        }
}
