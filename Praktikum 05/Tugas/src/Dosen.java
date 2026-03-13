// Nama : Arga Yura Danendra
// NIM : 24060124140191
// LAB : B2
// Deskripsi : Tugas Inheritance - Sistem Pegawai

public class Dosen extends Pegawai {
    protected String fakultas;

    public Dosen() {}

    public Dosen(String nip, String nama, String tanggalLahir, String tmt, double gajiPokok, String fakultas) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.fakultas = fakultas;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Fakultas      : " + fakultas);
    }
}