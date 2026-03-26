/**
 * File      : AngkaSial.java
 * Deskripsi : Program penggunaan exception buatan sendiri
 * Pengenalan klausa 'throw' dan 'throws'
 */
public class AngkaSial {

    public void cobaAngka(int angka) throws AngkaSialException {
        if (angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial"); // Baris 12 (pada modul)
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12); // Baris 21 (pada modul)
        } catch (AngkaSialException ase) {
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}