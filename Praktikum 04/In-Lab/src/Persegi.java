// Persegi.java — class ANAK
public class Persegi extends BangunDatar {
    private double sisi;

    public Persegi() {
        setJmlSisi(4); // pakai setter karena jmlSisi private di induk
    }

    public Persegi(double sisi, String warna, String border) {
        setJmlSisi(4);
        setWarna(warna);
        setBorder(border);
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getLuas() {
        return sisi * sisi;
    }
    
    public double getKeliling() {
        return 4 * sisi;
    }
    
    public double getDiagonal() {
        return sisi * Math.sqrt(2);
    }
}