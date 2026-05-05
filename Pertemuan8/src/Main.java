/* Nama file  : Main.java
   Deskripsi  :berisi aplikasi dari class class lain
   pembuat : Haikal Rafli Sembiring/24060124130079
   tanggal : 4 Mei 2026
 */

public class Main {
    public static void main(String[] args) {

        /*Generik Pada Class */
        System.out.println("=========Generik Pada Class===========");
        Datum<Anabul> data = new Datum<>(new Kucing("Sherly", 3.5));
        System.out.println();
        
        
        data.tampilkanAnabul(data.getIsi());
        System.out.println();
        
        data.setIsi(new Anggora("Irene", 4.7));
        data.tampilkanAnabul(data.getIsi());
        System.out.println();
        
        /*Generik pada Operator */

        System.out.println("======= Generik pada Operator ==========");
        System.out.println();
        

        Datum<Integer> a = new Datum<>(3);
        Datum<Integer> b = new Datum<>(6);
        System.out.println("Tukar ");
        System.out.println("a : " + a.getIsi() + ", b : " + b.getIsi());
        OperatorGenerik.Tukar(a, b);
        System.out.println("a : " + a.getIsi() + ", b : " + b.getIsi());
        
        System.out.println();



        Datum<Anabul> hewan1 = new Datum<>(new Kucing("Moriarty", 3.5));
        Datum<Anabul> hewan2 = new Datum<>(new Anjing("Roger"));

        System.out.println("Hewan 1 : ");
        hewan1.tampilkanAnabul(hewan1.getIsi());
        System.out.println();
        System.out.println("Hewan 2 : ");
        hewan2.tampilkanAnabul(hewan2.getIsi());
        System.out.println();
        
        System.out.println("TUKAR ISI");
        OperatorGenerik.Tukar(hewan1, hewan2);
        System.out.println("Hewan 1 : ");
        hewan1.tampilkanAnabul(hewan1.getIsi());
        System.out.println();
        System.out.println("Hewan 2 : ");
        hewan2.tampilkanAnabul(hewan2.getIsi());

        System.out.println();

        // Tukar Integer
        Datum<Integer> p = new Datum<>(4);
        Datum<Integer> q = new Datum<>(7);
        System.out.println("Tukar Integer");
        System.out.println("p : " + p.getIsi() + ", q : " + q.getIsi());
        OperatorGenerik.Tukar(p, q);
        System.out.println("p : " + p.getIsi() + ", q : " + q.getIsi());


         System.out.println();
        // Tukar String
        Datum<String> x = new Datum<>("James");
        Datum<String> y = new Datum<>("Moriarty");
        System.out.println("Tukar String");
        System.out.println("x : " + x.getIsi() + ", y : " + y.getIsi());
        OperatorGenerik.Tukar(x, y);
        System.out.println("x : " + x.getIsi() + ", y : " + y.getIsi());

        System.out.println();

        // Tukar Keluarga Anabul
        Datum<Anabul> anabul1 = new Datum<>(new Burung("Kimi"));
        Datum<Anabul> anabul2 = new Datum<>(new Anjing("Bernaldo"));
        System.out.println("Tukar Anabul");

        System.out.println("anabul1(" + anabul1.getIsi().getClass() + ") : ");
        anabul1.tampilkanAnabul(anabul1.getIsi());
        System.out.println();
        System.out.println("anabul2(" + anabul2.getIsi().getClass() + ") : ");
        anabul2.tampilkanAnabul(anabul2.getIsi());
        System.out.println();

        OperatorGenerik.Tukar(anabul1, anabul2);

        System.out.println("anabul1(" + anabul1.getIsi().getClass() + ") : ");
        anabul1.tampilkanAnabul(anabul1.getIsi());
        System.out.println();
        System.out.println("anabul2(" + anabul2.getIsi().getClass() + ") : ");
        anabul2.tampilkanAnabul(anabul2.getIsi());
        System.out.println();


         /* C */
         Datum<Kucing> kucing1 = new Datum<>(new Anggora("Rara", 2.5));
         Datum<Kucing> kucing2 = new Datum<>(new Kembangtelon("Lala", 3.5));
         System.out.println("Bobot Kucing 1 : " + kucing1.getIsi().getBobot() + " kg");
         System.out.println("Bobot Kucing 2 : " + kucing2.getIsi().getBobot() + " kg");
         System.out.println("Jumlah bobot keduanya :  " + OperatorGenerik.Bobot2(kucing1, kucing2) + " kg");


         System.out.println();

         /* LARIK GENERIK */
         System.out.println("==========LARIK GENERIK==========");
         System.out.println();

         Data<String> dataNama = new Data<>(new String[0]);
         dataNama.setIsi(1, "Sherina");
         dataNama.setIsi(2, "Fatiha");
         dataNama.setIsi(3, "Izzati");
         for(int i = 1; i<= dataNama.getSize(); i++) {
            System.out.println("Isi posisi " + i + " : " + dataNama.getIsi(i));
         }
         System.out.println("Banyak elemen : " + dataNama.getSize());



         System.out.println();
         Data<Anabul> dataAnabul = new Data<>(new Anabul[0]);

         dataAnabul.setIsi(1, new Kucing("Ambatron", 2.5));
         dataAnabul.setIsi(2, new Anjing("Ambasingh"));
         dataAnabul.setIsi(3, new Burung("Ambakun"));

        for(int i = 1; i<= dataAnabul.getSize(); i++) {
          System.out.println("Isi posisi " + i + " : " + dataAnabul.getIsi(i).getNama()+ " " +  dataAnabul.getIsi(i).getClass());
         }
        System.out.println("Banyak elemen : " + dataNama.getSize());

         




        
     


    }   
}
