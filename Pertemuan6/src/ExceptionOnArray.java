/* Nama file  : ExceptionOnArray.java
   Deskripsi  :Program penggunaan exception menggunakan class library java
   pembuat : Haikal Rafli Sembiring/24060124130079
   tanggal : 26 Maret 2026
 */

public class ExceptionOnArray {

    public static void main(String[] args) {
        //instansiasi object array integer
        Integer[] arrayInteger = new Integer[4];
        try {
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        }catch(ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        }finally {
            System.out.println("Clean up code...");
        }
    }
}