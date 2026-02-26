/* Nama file  : Titik.java
   Deskripsi  :berisi atribut dan method dalam class Titik
   pembuat : Haikal Rafli Sembiring/24060124130079
   tanggal : 26 Februari 2026
 */


public class Mtitik {
    public static void main(String[] args) {
        Titik T1 = new Titik();
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();
        T1.geser(3,4);
        T1.printTitik();

        Titik T2 = T1;
        T2.printTitik();
        T1.setAbsis(10);
        T1.setOrdinat(10);
        T2.printTitik();

        // Overloading Constructor
        Titik T3 = new Titik(3,4);
        System.out.println("Absis T3 menggunakan Overloading : " + T3.getAbsis());
        System.out.println("Ordinat T3 menggunakan Overloading : " + T3.getOrdinat());

        Titik T4 = new Titik();
        T4.setAbsis(3);
        T4.setOrdinat(4);

        Titik T5 = new Titik();
        T5.setAbsis(12);
        T5.setOrdinat(5);

        System.out.println("Jumlah titik : " + Titik.getCounterTitik());
        System.out.println("Jarak : " + T4.getJarakPusat());
        System.out.println("Jarak : " + T4.getJarak(T5));
        System.out.println("Kuadran T4 : " + T4.getKuadran());
        T5.refleksiX();
        System.out.println("Absis T5 : " + T5.getAbsis() + ",Ordinat T5 : " + T5.getOrdinat());
        T5.refleksiY();
        System.out.println("Absis T5 : " + T5.getAbsis() + ",Ordinat T5: " + T5.getOrdinat());
        
        Titik T6 = T5.getRefleksiX();
        System.out.println("Absis T6 : " + T6.getAbsis() + ",Ordinat T6: " + T6.getOrdinat());
        
        Titik T7 = T5.getRefleksiY();
        System.out.println("Absis T7 : " + T7.getAbsis() + ",Ordinat T7: " + T7.getOrdinat());


    }

}