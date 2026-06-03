// File : Main.java
// Nama / NIM : Arga Yura Danendra / 24060124140191
// Lab : B2

public class Main {
    public static void main(String[] args) {
        Piaraan klinik = new Piaraan();

        // Praktikum 9
        Anggora p1      = new Anggora("Gondrong", 2.8);
        Kembangtelon p2 = new Kembangtelon("Minyak", 3.1);
        Anjing p3       = new Anjing("Adhy");
        Anjing p4       = new Anjing("Rehan");

        klinik.enqueueAnabul(p1);
        klinik.enqueueAnabul(p3);
        klinik.enqueueAnabul(p4);

        System.out.println("Jumlah Kucing: " + klinik.CountKucing());

    }
}