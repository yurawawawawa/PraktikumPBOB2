// File : Main.java
// Nama / NIM : Arga Yura Danendra / 24060124140191
// Lab : B2

public class Main {
    public static void main(String[] args) {

        Anggora a1 = new Anggora("Milo", 3.5);
        Kembangtelon k1 = new Kembangtelon("Luna", 4.2);

        // Datum
        Datum<Anabul> d1 = new Datum<>();
        d1.setIsi(a1);

        System.out.println("Isi Datum:");
        d1.getIsi().bersuara();

        // Tukar Integer
        Box<Integer> x = new Box<>(3);
        Box<Integer> y = new Box<>(6);

        OperatorGenerik.Tukar(x, y);

        System.out.println("x = " + x.nilai);
        System.out.println("y = " + y.nilai);

        // Tukar String
        Box<String> s1 = new Box<>("Halo");
        Box<String> s2 = new Box<>("Dunia");

        OperatorGenerik.Tukar(s1, s2);

        System.out.println(s1.nilai);
        System.out.println(s2.nilai);

        // Tukar Anabul
        Box<Anabul> h1 = new Box<>(new Anjing("Doggy"));
        Box<Anabul> h2 = new Box<>(new Anggora("Kitty", 2));

        OperatorGenerik.Tukar(h1, h2);

        h1.nilai.bersuara();
        h2.nilai.bersuara();

        // Bobot2
        System.out.println("Jumlah bobot = " +
            OperatorGenerik.Bobot2(a1, k1));

        // Data Generic
        Data<Anabul> arr = new Data<>();

        arr.setIsi(1, a1);
        arr.setIsi(2, k1);

        System.out.println("Isi elemen 1:");
        arr.getIsi(1).bersuara();

        System.out.println("Jumlah data = " + arr.getSize());
    }
}