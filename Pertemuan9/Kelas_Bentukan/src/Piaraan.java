/* Nama file  : Piaraan.java
   Deskripsi  : realisasi atribut dan method pada class Piaraan
   pembuat : Haikal Rafli Sembiring/24060124130079
   tanggal : 11 Mei 2026
 */

import java.util.LinkedList;

public class Piaraan {
    /*Atribut */
    private int nbelm;
    private LinkedList<Anabul> Lanabul;

    /*Method */
    /*Konstruktor */
    public Piaraan() {
        this.nbelm = 0;
        this.Lanabul = new LinkedList<>();
    }


    /*Getter */

    /*B */
    /*i */
    public int getNbelm() {
        return this.nbelm;
    }

    /*ii */
    public void enqueueAnabul(Anabul anabul) {
        Lanabul.addLast(anabul);
        nbelm++;
    }
    
    /*iii */
    public boolean isMember(Anabul anabul) {
        return Lanabul.contains(anabul);
    }
    
    /*iv */
    public Anabul getAnabul() {
        return Lanabul.peekFirst();
    }
    
    /*v */
    public Anabul dequeueAnabul() {
        Anabul removed =  Lanabul.poll();
        nbelm--;
        return removed;
    }

    /*C */
    public void showAnabul() {
        for(int i = 0; i < nbelm; i++) {
            System.out.println(Lanabul.get(i).getPanggilan());
        }
    }

    /*D */
    public int countKucing() {
        int total = 0;
        for(int i =0 ;i < nbelm; i++) {
            if(Lanabul.get(i) instanceof Kucing) {
                total++;
            }
        }
        return total;
    } 

    /*E */
    public double bobotKucing() {
        double total_bobot = 0;
        for(int i =0 ;i < nbelm; i++) {
            if(Lanabul.get(i) instanceof Kucing) {
                total_bobot += ((Kucing)Lanabul.get(i)).getBobot();
            }
        }
        return total_bobot;
    } 

    /*F */
    public void showJenisAnabul() {
        for(int i = 0; i < nbelm; i++) {
            System.out.println("Panggilan " + Lanabul.get(i).getPanggilan() + ", Jenis : " + Lanabul.get(i).getClass().getName());
        }
    }




}
