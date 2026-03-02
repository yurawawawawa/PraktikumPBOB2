public class Garis {
    private Titik titikAwal;
    private Titik titikAkhir;
    private static int counterGaris = 0; 

    
    public Garis() {
        titikAwal = new Titik(0, 0);
        titikAkhir = new Titik(1, 1);
        counterGaris++;
    }


    public Garis(Titik awal, Titik akhir) {
        titikAwal = awal;
        titikAkhir = akhir;
        counterGaris++;
    }


    public Titik getTitikAwal() {
        return titikAwal;
    }

    public Titik getTitikAkhir() {
        return titikAkhir;
    }

    public void setTitikAwal(Titik awal) {
        titikAwal = awal;
    }

    public void setTitikAkhir(Titik akhir) {
        titikAkhir = akhir;
    }

    public static int getCounterGaris() {
        return counterGaris;
    } 

    public double getPanjang() {
        double dx = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double dy = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        return Math.sqrt(dx * dx + dy * dy);
    }


    public double getGradien() {
        double dx = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double dy = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        if (dx == 0) {
            System.out.println("Garis vertikal, gradien tidak terdefinisi!");
            return Double.NaN;
        }
        return dy / dx;
    }

    public Titik getTitikTengah() {
        double tx = (titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2;
        double ty = (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2;
        return new Titik(tx, ty);
    }


    public boolean isSejajar(Garis g) {
        return this.getGradien() == g.getGradien();
    }

   
    public boolean isTegakLurus(Garis g) {
        return this.getGradien() * g.getGradien() == -1;
    }

    
    public void tampilkan() {
        System.out.println("Titik Awal  : " + titikAwal);
        System.out.println("Titik Akhir : " + titikAkhir);
    }
}