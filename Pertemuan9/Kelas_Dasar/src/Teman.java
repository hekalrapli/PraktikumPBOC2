/* Nama file  : Teman.java
   Deskripsi  : realisasi atribut dan method pada class Teman
   pembuat : Haikal Rafli Sembiring/24060124130079
   tanggal : 11 Mei 2026
 */

import java.util.ArrayList;

public class Teman {
    
    /*Atribut */
    private int nbelm;
    private ArrayList<String> Lnama;

    /*Method */ 
    /*Konstruktor */
    public Teman() {
        this.nbelm = 0;
        Lnama = new ArrayList<>();
    } 

    /*Getter */
    /*a */
    public int getNbelm() {
        return this.nbelm;
    }
    
    /*b */
    public String getNama(int indeks) {
        return Lnama.get(indeks-1);
    }

    public int countNama(String nama) {
        int total = 0;
        for(int i = 0; i < nbelm; i++) {
            if(Lnama.get(i) == nama) {
                total++;
            }
        }
        return total;
    }

    /*Setter */
    public void setNama(int indeks, String nama) {
         Lnama.set(indeks-1, nama);
    }
    public  void addNama(String nama) {
         Lnama.add(nama);
         nbelm++;
    }

    public  void delNama(String nama) {
        if(Lnama.remove(nama)) {
            nbelm--;

        }
     
    }


    public void gantiNama(String nama, String namabaru) {
        if(isMember(nama)) {
            /*indexof mengembalikan index dari suatu elemen di list */
            Lnama.set(Lnama.indexOf(nama), namabaru);
        }
    }
    public boolean isMember(String nama) {
        /*contains mengecek apakah suatu elemen ada di dalam list */
        return Lnama.contains(nama);
    }


    public void showTeman() {
        for(int i = 0; i < nbelm; i++) {
            System.out.println("Teman ke-" + (i+1) +  ": " + Lnama.get(i));
        }
    }




}
