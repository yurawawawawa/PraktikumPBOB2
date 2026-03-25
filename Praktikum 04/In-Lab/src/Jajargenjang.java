// Nama : Arga Yura Danendra
// NIM : 24060124140191
// LAB : B2
// Deskripsi : Hubungan Inheritance Bangun Datar

public class Jajargenjang extends BangunDatar {
    private double alas;
    private double tinggi;
    private double sisiMiring;

    public Jajargenjang() {
        super();
        this.jmlSisi = 4;
    }

    public Jajargenjang(double alas, double tinggi, double sisiMiring, String warna, String border) {
        super(4, warna, border);
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiMiring = sisiMiring;
    }

    public double getAlas() { return alas; }
    public double getTinggi() { return tinggi; }
    public double getSisiMiring() { return sisiMiring; }

    public void setAlas(double alas) { this.alas = alas; }
    public void setTinggi(double tinggi) { this.tinggi = tinggi; }
    public void setSisiMiring(double sisiMiring) { this.sisiMiring = sisiMiring; }

    public double getLuas() {
        return alas * tinggi;
    }

    public double getKeliling() {
        return 2 * (alas + sisiMiring);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Alas        : " + alas);
        System.out.println("Tinggi      : " + tinggi);
        System.out.println("Sisi Miring : " + sisiMiring);
        System.out.println("Luas        : " + getLuas());
        System.out.println("Keliling    : " + getKeliling());
    }
}