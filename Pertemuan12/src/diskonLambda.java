/* Nama file  : diskonLambda.java
   Deskripsi  :berisi atribut dan method dari class diskonLambda
   pembuat : Haikal Rafli Sembiring/24060124130079
   tanggal : 6 Juni 2026
 */

interface IDiskon {
    public double hitungDiskon(int harga);
}

public class diskonLambda {
    public static void main(String[] args) {
        IDiskon diskonMerdeka = new IDiskon() {
            public double hitungDiskon(int harga) {
                return harga - (harga * 0.3);
            }
        };
        IDiskon diskonLebaran = (harga) -> harga  - (harga * 0.4);

        IDiskon diskonBiasa  = (harga) -> {
            return harga  - (harga * 0.1);
        };

     System.out.println("Diskon Merdeka : " + diskonMerdeka.hitungDiskon(45000));
     System.out.println("Diskon Lebaran : " + diskonLebaran.hitungDiskon(45000));
     System.out.println("Diskon Biasa : " + diskonBiasa.hitungDiskon(45000));
    }
}
