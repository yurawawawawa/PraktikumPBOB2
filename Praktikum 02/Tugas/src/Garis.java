/* Nama File    : Garis.java
 * Deskripsi    : berisi atribut dan method dalam class Garis
 * Pembuat      : Arga Yura Danendra / 24060124140191
 * Tanggal      : 05/03/2026
 */

public class Garis {
    private Titik titikAwal;
    private Titik titikAkhir;
    private static int counterGaris = 0;

    // a. Konstruktor tanpa parameter
    public Garis() {
        titikAwal = new Titik();
        titikAwal.setAbsis(0);
        titikAwal.setOrdinat(0);
        titikAkhir = new Titik();
        titikAkhir.setAbsis(1);
        titikAkhir.setOrdinat(1);
        counterGaris++;
    }

    // b. Konstruktor dengan parameter
    public Garis(Titik awal, Titik akhir) {
        titikAwal = awal;
        titikAkhir = akhir;
        counterGaris++;
    }

    // c. Getter & Setter
    public Titik getTitikAwal() { return titikAwal; }
    public Titik getTitikAkhir() { return titikAkhir; }
    public void setTitikAwal(Titik awal) { titikAwal = awal; }
    public void setTitikAkhir(Titik akhir) { titikAkhir = akhir; }
    public static int getCounterGaris() { return counterGaris; }

    // d. Panjang garis
    public double getPanjang() {
        double dx = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double dy = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        return Math.sqrt(dx * dx + dy * dy);
    }

    // e. Gradien
    public double getGradien() {
        double dx = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double dy = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        if (dx == 0) {
            System.out.println("Garis vertikal, gradien tidak terdefinisi!");
            return Double.NaN;
        }
        return dy / dx;
    }

    // f. Titik tengah
    public Titik getTitikTengah() {
        double tx = (titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2;
        double ty = (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2;
        Titik tengah = new Titik();
        tengah.setAbsis(tx);
        tengah.setOrdinat(ty);
        return tengah;
    }

    // g. Sejajar
    public boolean isSejajar(Garis g) {
        return this.getGradien() == g.getGradien();
    }

    // h. Tegak lurus
    public boolean isTegakLurus(Garis g) {
        return this.getGradien() * g.getGradien() == -1;
    }

    // i. Tampilkan
    public void tampilkan() {
        System.out.println("Titik Awal  : (" + titikAwal.getAbsis() + ", " + titikAwal.getOrdinat() + ")");
        System.out.println("Titik Akhir : (" + titikAkhir.getAbsis() + ", " + titikAkhir.getOrdinat() + ")");
    }
}