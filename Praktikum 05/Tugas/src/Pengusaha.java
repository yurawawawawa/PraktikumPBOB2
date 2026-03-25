// Nama : Arga Yura Danendra
// NIM : 24060124140191
// LAB : B2
// Deskripsi : Tugas Abstract Class & Interface


import java.util.Calendar;

public class Pengusaha extends Manusia implements Pajak {

    private String npwp;
    private static int counterPengusaha = 0;
    private int B = 9;

    public Pengusaha(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String npwp) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    public String getNpwp() {
        return npwp;
    }

    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }

    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    @Override
    public int hitungMasaKerja() {
        int tahunSekarang = Calendar.getInstance().get(Calendar.YEAR);
        String[] bagian = tgl_mulai_kerja.split("-");
        int tahunMulai = Integer.parseInt(bagian[2]);
        int hasil = (tahunSekarang - tahunMulai) + B;
        return hasil;
    }

    @Override
    public double hitungPajak() {
        double pajak = 0.15 * pendapatan;
        return pajak;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NPWP : " + npwp);
    }
}