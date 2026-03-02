/* Nama File    : MTitik.java
 * Deskripsi    : Main class untuk menggunakan class Titik
 * Pembuat      : [isi nama kamu]
 * Tanggal      : [isi tanggal]
 */

public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik();         // Membuat objek titik T1 (0, 0)
        T1.setAbsis(3);                  // Mengubah absis T1 dengan nilai 3
        T1.setOrdinat(4);                 // Mengubah ordinat T1 dengan nilai 4
        T1.printTitik();                  // Mencetak koordinat T1 ke layar
        T1.printTitik();  
       System.out.println("Kuadran " + T1.getKuadran());
    }
}