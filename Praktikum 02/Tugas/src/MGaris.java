/* Nama File    : MGaris.java
 * Deskripsi    : main class untuk menggunakan class Garis
 * Pembuat      : Arga Yura Danendra / 24060124140191
 * Tanggal      : 05/03/2026
 */

public class MGaris {
    public static void main(String[] args) {

        // Garis 1
        Garis g1 = new Garis();

        // Garis 2
        Titik t1 = new Titik(); t1.setAbsis(0); t1.setOrdinat(1);
        Titik t2 = new Titik(); t2.setAbsis(1); t2.setOrdinat(2);
        Garis g2 = new Garis(t1, t2);

        // Info g1
        g1.tampilkan();
        System.out.println("Panjang : " + g1.getPanjang());
        System.out.println("Gradien : " + g1.getGradien());
        System.out.println("Tengah  : (" + g1.getTitikTengah().getAbsis() + ", " + g1.getTitikTengah().getOrdinat() + ")");

        System.out.println();

        // Cek relasi g1 dan g2
        System.out.println("g1 sejajar g2?     " + g1.isSejajar(g2));
        System.out.println("g1 tegak lurus g2? " + g1.isTegakLurus(g2));
        System.out.println("Total garis: " + Garis.getCounterGaris());
    }
}