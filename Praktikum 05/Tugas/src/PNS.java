// Nama : Arga Yura Danendra
// NIM : 24060124140191
// LAB : B2
// Deskripsi : Tugas Abstract Class & Interface



import java.util.Calendar;

public class PNS extends Manusia implements Pajak {

    private String nip;
    private static int counterPNS = 0;
    private int A = 1;

    public PNS(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public static int getCounterPNS() {
        return counterPNS;
    }

    @Override
    public int hitungMasaKerja() {
        int tahunSekarang = Calendar.getInstance().get(Calendar.YEAR);
        String[] bagian = tgl_mulai_kerja.split("-");
        int tahunMulai = Integer.parseInt(bagian[2]);
        int hasil = (tahunSekarang - tahunMulai) + A;
        return hasil;
    }

    @Override
    public double hitungPajak() {
        double pajak = 0.10 * pendapatan;
        return pajak;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NIP : " + nip);
    }
}