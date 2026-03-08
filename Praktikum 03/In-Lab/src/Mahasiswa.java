import java.util.ArrayList;

public class Mahasiswa {
    private String nim, nama, prodi;
    private ArrayList<MataKuliah> listMatKul = new ArrayList<>();
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    public Mahasiswa() {}

    // Komposisi → Dosen dan Kendaraan dibuat di DALAM constructor
    public Mahasiswa(String nim, String nama, String prodi,
                     String nipDosen, String namaDosen, String prodiDosen,
                     String noPlat, String jenis) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.dosenWali = new Dosen(nipDosen, namaDosen, prodiDosen);
        this.kendaraan = new Kendaraan(noPlat, jenis);
    }

    public String getNim() { return nim; }
    public String getNama() { return nama; }
    public String getProdi() { return prodi; }
    public Dosen getDosenWali() { return dosenWali; }
    public Kendaraan getKendaraan() { return kendaraan; }

    public void setNim(String nim) { this.nim = nim; }
    public void setNama(String nama) { this.nama = nama; }
    public void setProdi(String prodi) { this.prodi = prodi; }

    public void addMatKul(MataKuliah newMatKul) {
        listMatKul.add(newMatKul);
    }

    public int getJumlahSKS() {
        int total = 0;
        for (int i = 0; i < listMatKul.size(); i++) {
            total += listMatKul.get(i).getSks();
        }
        return total;
    }

    public int getJumlahMatKul() {
        return listMatKul.size();
    }

    public void printMhs() {
        System.out.println("NIM   : " + nim);
        System.out.println("Nama  : " + nama);
        System.out.println("Prodi : " + prodi);
    }

    public void printDetailMhs() {
        System.out.println("NIM   : " + nim);
        System.out.println("Nama  : " + nama);
        System.out.println("Prodi : " + prodi);
        System.out.println("Mata Kuliah:");
        for (int i = 0; i < listMatKul.size(); i++) {
            System.out.println("  - " + listMatKul.get(i).getNama() + " (" + listMatKul.get(i).getSks() + " SKS)");
        }
        if (dosenWali != null) {
            System.out.println("Dosen Wali : " + dosenWali.getNama() + " (" + dosenWali.getNip() + ")");
        } else {
            System.out.println("Dosen Wali : -");
        }
        if (kendaraan != null) {
            System.out.println("Kendaraan  : " + kendaraan.getJenis() + " (" + kendaraan.getNoPlat() + ")");
        } else {
            System.out.println("Kendaraan  : -");
        }
    }
}