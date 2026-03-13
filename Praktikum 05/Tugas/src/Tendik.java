// Nama : Arga Yura Danendra
// NIM : 24060124140191
// LAB : B2
// Deskripsi : Tugas Inheritance - Sistem Pegawai

public class Tendik extends Pegawai {
    private String bidang;
    private int masaKerja;
    private String tanggalPensiun;

    public Tendik() {

    }

    public Tendik(String nip, String nama, String tanggalLahir, String tmt,
                  double gajiPokok, String bidang, int masaKerja, String tanggalPensiun) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.bidang = bidang;
        this.masaKerja = masaKerja;
        this.tanggalPensiun = tanggalPensiun;
    }

    public String getBidang() { return bidang; }
    public void setBidang(String bidang) { this.bidang = bidang; }

    public double getTunjangan() {
        return 0.01 * masaKerja * gajiPokok;
    }

    @Override
    public void printInfo() {
        System.out.println("NIP           : " + nip);
        System.out.println("Nama          : " + nama);
        System.out.println("Tanggal Lahir : " + tanggalLahir);
        System.out.println("TMT           : " + tmt);
        System.out.println("Jabatan       : Tendik");
        System.out.println("Bidang        : " + bidang);
        System.out.println("Masa Kerja    : " + masaKerja + " tahun");
        System.out.println("Tgl Pensiun   : " + tanggalPensiun);
        System.out.println("Gaji Pokok    : Rp " + gajiPokok);
        System.out.println("Tunjangan     : Rp " + getTunjangan());
    }
}