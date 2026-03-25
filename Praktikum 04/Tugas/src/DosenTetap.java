// Nama : Arga Yura Danendra
// NIM : 24060124140191
// LAB : B2
// Deskripsi : Tugas Inheritance - Sistem Pegawai

public class DosenTetap extends Dosen {
    private String nidn;
    private int masaKerja; 
    private String tanggalPensiun;

    public DosenTetap() {

    }

    public DosenTetap(String nip, String nidn, String nama, String tanggalLahir, String tmt,
                      double gajiPokok, String fakultas, int masaKerja, String tanggalPensiun) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidn = nidn;
        this.masaKerja = masaKerja;
        this.tanggalPensiun = tanggalPensiun;
    }

    public String getNidn() {
        return nidn;
    }

    public void setNidn(String nidn) {
        this.nidn = nidn;
    }

    public double getTunjangan() {
        return 0.02 * masaKerja * gajiPokok;
    }

    @Override
    public void printInfo() {
        System.out.println("NIP           : " + nip);
        System.out.println("NIDN          : " + nidn);
        System.out.println("Nama          : " + nama);
        System.out.println("Tanggal Lahir : " + tanggalLahir);
        System.out.println("TMT           : " + tmt);
        System.out.println("Jabatan       : Dosen Tetap");
        System.out.println("Fakultas      : " + fakultas);
        System.out.println("Masa Kerja    : " + masaKerja + " tahun");
        System.out.println("Tgl Pensiun   : " + tanggalPensiun);
        System.out.println("Gaji Pokok    : Rp " + gajiPokok);
        System.out.println("Tunjangan     : Rp " + getTunjangan());
    }
}