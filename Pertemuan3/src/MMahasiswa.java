/* Nama file  : MMahasiswa.java
   Deskripsi  :berisi pemanggilan objek untuk masing-masing class
   pembuat : Haikal Rafli Sembiring/24060124130079
   tanggal : 5 Maret 2026
 */

public class MMahasiswa {
    public static void main(String[] args) {
        Dosen D1 = new Dosen();
        Kendaraan K1 = new Kendaraan();
        Mahasiswa M1 = new Mahasiswa();
        Matakuliah MRP = new Matakuliah();
        Matakuliah PTI = new Matakuliah();
        

        D1.setNip("13595096");
        D1.setNama("Grandprix Kadja");
        D1.setProdi("Teknik Industri");

        MRP.setidMatkul("MH8756");
        MRP.setNama("Manajemen Rantai Pasok");
        MRP.setSks(3);

        PTI.setidMatkul("PT4718");
        PTI.setNama("Pengantar Teknik Industri");
        PTI.setSks(4);

        

        K1.setNoPlat("B 120 MO");
        K1.setJenis("Mobil");

        M1.setNim("13424047");
        M1.setNama("Nurin Izzati");
        M1.setProdi("Teknik Industri");
        M1.setDosenWali(D1);
        M1.setKendaraan(K1);
        M1.addMatkul(MRP);
        M1.addMatkul(PTI);

        M1.printDetailMhs();
        System.out.println();
        System.out.println("Jumlah Mata Kuliah yang diambil: " + M1.getJumlahMatkul());
        System.out.println("Jumlah SKS Mata Kuliah : " + M1.getJumlahSKS());

        

        System.out.println();
        System.out.println("Nama Dosen : " + D1.getNama());
        System.out.println("Nip Dosen : " + D1.getNip());
        System.out.println("Prodi Dosen : " + D1.getProdi());

        System.out.println();
        System.out.println("Nama Mata Kuliah : " + MRP.getNama());
        System.out.println("Id Mata Kuliah : " + MRP.getidMatkul());
        System.out.println("Jumlah SKS   : " + MRP.getSks());

        System.out.println();
        System.out.println("Nomor Plat : " + K1.getNoPlat());
        System.out.println("Jenis Kendaraan : " + K1.getJenis());





    }
}
