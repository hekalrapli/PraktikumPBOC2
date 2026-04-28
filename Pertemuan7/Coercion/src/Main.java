/* Nama file  : Main.java
   Deskripsi  :berisi implementasi dari polimorfisme coercion
   pembuat : Haikal Rafli Sembiring/24060124130079
   tanggal : 28 April 2026
 */

public class Main {
    public static void main(String[] args) throws Exception {
        // int ke char
        int y_int = 65;
        System.out.println("Integer ke Integer : " + y_int);

        char y_char = (char)y_int;
        System.out.println("Integer ke Character : " + y_char);
        
        // int ke real
        double y_real = y_int;
        System.out.println("Integer ke Real : " + y_real);
        
        // real to int
        int realToInt = (int)y_real;
        System.out.println("Real ke Integer : " + realToInt);

        System.out.println();
        
        // konkatenasi int
        String X = "1234";
        String Y = "5678";
        String S = X+Y;
        System.out.println("Konkatenasi X dan Y : " + S);
        int Z = Integer.parseInt(X) + Integer.parseInt(Y);
        System.out.println("Penjumlahan X dan Y : " + Z);

         System.out.println();
        // konkatenasi real
        String P = "12.34";
        String Q = "56.8";
        String R = P+Q;
         System.out.println("Konkatenasi P dan Q : " + R);
         double D = Double.parseDouble(X) + Double.parseDouble(Y);
         System.out.println("Penjumlahan P dan Q : " + D);
        
         System.out.println();
        // hasil konversi S
        Integer A = Integer.parseInt(S);
        System.out.println("String ke Integer : " + A);
        // hasil konversi A
        String T = Integer.toString(A);
        System.out.println("Integer ke String : " + T);




      
        
       

    }
}
