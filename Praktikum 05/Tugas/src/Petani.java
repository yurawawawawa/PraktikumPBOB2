// Nama : Arga Yura Danendra
// NIM : 24060124140191
// LAB : B2
// Deskripsi : Tugas Abstract Class & Interface


import java.util.Calendar;

public class Petani extends Manusia implements Pajak {

    private String asal_kota;
    private static int counterPetani = 0;
    private int C = 1;

    public Petani(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    public String getAsal_kota() {
        return asal_kota;
    }

    public void setAsal_kota(String asal_kota) {
        this.asal_kota = asal_kota;
    }

    public static int getCounterPetani() {
        return counterPetani;
    }

    @Override
    public int hitungMasaKerja() {
        int tahunSekarang = Calendar.getInstance().get(Calendar.YEAR);
        String[] bagian = tgl_mulai_kerja.split("-");
        int tahunMulai = Integer.parseInt(bagian[2]);
        int hasil = (tahunSekarang - tahunMulai) + C;
        return hasil;
    }

    @Override
    public double hitungPajak() {
        double pajak = 0;
        return pajak;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Asal Kota       : " + asal_kota);
    }
}