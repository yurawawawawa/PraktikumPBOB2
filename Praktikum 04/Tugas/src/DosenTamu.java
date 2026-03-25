// Nama : Arga Yura Danendra
// NIM : 24060124140191
// LAB : B2
// Deskripsi : Tugas Inheritance - Sistem Pegawai

public class DosenTamu extends Dosen {
    private String nidk;
    private int sisaKontrak; 

    public DosenTamu() {

    }

    public DosenTamu(String nip, String nidk, String nama, String tanggalLahir, String tmt,
                     double gajiPokok, String fakultas, int sisaKontrak) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidk = nidk;
        this.sisaKontrak = sisaKontrak;
    }

    public String getNidk() {
        return nidk;
    }

    public void setNidk(String nidk) {
        this.nidk = nidk;
    }

    public double getTunjangan() {
        return 0.025 * gajiPokok;
    }

    @Override
    public void printInfo() {
        System.out.println("NIP           : " + nip);
        System.out.println("NIDK          : " + nidk);
        System.out.println("Nama          : " + nama);
        System.out.println("Tanggal Lahir : " + tanggalLahir);
        System.out.println("TMT           : " + tmt);
        System.out.println("Jabatan       : Dosen Tamu");
        System.out.println("Fakultas      : " + fakultas);
        System.out.println("Sisa Kontrak  : " + sisaKontrak + " bulan");
        System.out.println("Gaji Pokok    : Rp " + gajiPokok);
        System.out.println("Tunjangan     : Rp " + getTunjangan());
    }
}