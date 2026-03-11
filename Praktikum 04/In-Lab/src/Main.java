public class Main {
    public static void main(String[] args) {

        Persegi p1 = new Persegi(5, "Merah", "Solid");
        Lingkaran l1 = new Lingkaran(8, "Hijau", "Dotted");

        System.out.println("PERSEGI");
        p1.printInfo();

        System.out.println();

        System.out.println("LINGKARAN");
        l1.printInfo();
    }
}