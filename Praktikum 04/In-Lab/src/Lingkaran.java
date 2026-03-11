// Nama : Arga Yura Danendra
// NIM : 24060124140191
// LAB : B2
// Deskripsi : Hubungan Inheritance Bangun Datar

public class Lingkaran extends BangunDatar {
    private double jari;

    public Lingkaran() {
        super();            
        this.jmlSisi = 0;  
    }

    // keyword - super
    public Lingkaran(double diameter, String warna, String border) {
        super(0, warna, border);
        this.jari = diameter / 2;
    }

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    public double getLuas() {
        return Math.PI * jari * jari;
    }

    public double getKeliling() {
        return 2 * Math.PI * jari;
    }

    // override
    @Override
    public void printInfo() {
        super.printInfo(); 
        System.out.println("Jari-jari   : " + jari);
        System.out.println("Luas        : " + getLuas());
        System.out.println("Keliling    : " + getKeliling());
    }
}