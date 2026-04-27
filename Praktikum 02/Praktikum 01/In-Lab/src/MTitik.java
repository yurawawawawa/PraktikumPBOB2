// Nama File : MTitik.java
// Nama & NIM : Arga Yura Danendra & 24060124140191
// Deskripsi : Main class untuk mencoba class Titik

public class MTitik {
    public static void main(String[] args) {
        // Membuat titik dengan konstruktor tanpa parameter
        Titik t1 = new Titik();
        System.out.println("Titik t1 (default):");
        t1.printTitik();

        // Membuat titik dengan konstruktor berparameter
        Titik t2 = new Titik(3.5, 7.0);
        System.out.println("\nTitik t2 (3.5, 7.0):");
        t2.printTitik();

        // Menggunakan getter
        System.out.println("\nAbsis t2  : " + t2.getAbsis());
        System.out.println("Ordinat t2: " + t2.getOrdinat());

        // Menggunakan setter
        t1.setAbsis(10.0);
        t1.setOrdinat(5.0);
        System.out.println("\nTitik t1 setelah di-set (10.0, 5.0):");
        t1.printTitik();

        // Menggunakan geser
        t2.geser(2.0, -3.0);
        System.out.println("\nTitik t2 setelah digeser (2.0, -3.0):");
        t2.printTitik();

        System.out.println(t1.getKuadran());
    }
}