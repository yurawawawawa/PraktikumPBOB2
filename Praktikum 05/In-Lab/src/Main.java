// Nama : Arga Yura Danendra
// NIM : 24060124140191
// LAB : B2
// Deskripsi : Hubungan Inheritance Bangun Datar

public class Main {
    public static void main(String[] args) {

        Persegi p1 = new Persegi(5, "Merah", "Solid");
        Lingkaran l1 = new Lingkaran(8, "Hijau", "Dotted");
        Jajargenjang j1 = new Jajargenjang(6, 4, 5, "Ungu", "Solid");

        System.out.println("BAGIAN PERSEGI");
        p1.printInfo();

        System.out.println();

        System.out.println("BAGIAN LINGKARAN");
        l1.printInfo();

        System.out.println();

        System.out.println("JAJARGENJANG");
        j1.printInfo();

        BangunDatar.printCounterBangunDatar();
    }
}