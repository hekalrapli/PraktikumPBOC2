/* Nama file  : Seminar.java
   Deskripsi  :berisi atribut dan method dalam class Seminar
   pembuat : Haikal Rafli Sembiring/24060124130079
   tanggal : 28 April 2026
 */


public class Seminar {

    /* Atribut */

    Civitasakademika[] pesertas;
    private  int banyakpeserta = 0;

    /* Method */
    /* Konstruktor */
    public Seminar(int kapasitas) {
        this.pesertas = new Civitasakademika[kapasitas];
        this.banyakpeserta = 0;
    }

    public int countPeserta() {
        return this.banyakpeserta;
    }

    public int countMahasiswa() {
        int total  = 0;
        for(int i  = 0; i < pesertas.length; i++) {
            if(pesertas[i] != null && pesertas[i] instanceof Mahasiswa) {
                total++;
            }
        }
        return total;
    }
    

    public void registrasi(Civitasakademika c) {
        if(banyakpeserta < pesertas.length) {
            pesertas[banyakpeserta] =c;
            banyakpeserta++;
        }
      
    }
    public void tampilPeserta() {
        for(Civitasakademika c : pesertas) {
            if(c != null) {
                System.out.println("Nomor : " + c.getNomor() + ", Nama : " + c.getNama()) ;
            }
        
            
        }
    }

}
