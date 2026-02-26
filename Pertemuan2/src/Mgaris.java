/* Nama file  : Mgaris.java
   Deskripsi  :berisi atribut dan method dalam class garis
   pembuat : Haikal Rafli Sembiring/24060124130079
   tanggal : 26 Februari 2026
 */

public class Mgaris {
     public static void main(String[] args) {

          Titik a = new Titik(-2,0);
          Titik b = new Titik(0,4);
          Garis G1 = new Garis(a,b);
          Garis G2 = new Garis();
 

          G2.setTitikAwal(new Titik(0,4));
          G2.setTitikAkhir(new Titik(4,2));


          System.out.println("Titik Awal : (" + G1.getTitikAwal().getAbsis() + "," + G1.getTitikAwal().getOrdinat() + ")");
          System.out.println("Titik Akhir : (" + G1.getTitikAkhir().getAbsis() + "," + G1.getTitikAkhir().getOrdinat() + ")");
          System.out.println("Jumlah garis : " + Garis.getCounterGaris());
          System.out.println("Panjang garis G1 : " + G1.getPanjangGaris());    
          System.out.println("Gradien garis G1 : " + G1.getGradien()); 
          Titik tengah = G1.getTitikTengah();
          System.out.print("Titik Tengah G1 : ");


          tengah.printTitik();
          System.out.println("Gradien garis G2 : " + G2.getGradien()); 
          
          System.out.println("G1 Sejajar G2 ? : " + G1.isSejajar(G2));
          System.out.println("G1 Tegak Lurus G2 ? : " + G1.isTegakLurus(G2));
          G1.printTitikAwalAkhir();
          G1.persamaanGaris();   
          G2.persamaanGaris();   
     }
}
