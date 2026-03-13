// Nama : Arga Yura Danendra
// NIM : 24060124140191
// LAB : B2
// Deskripsi : Tugas Inheritance - Sistem Pegawai

public class MPegawai {
    public static void main(String[] args) {

        DosenTetap dt = new DosenTetap(
            "9545647548", "78647324", "Andi",
            "5 Mei 1990", "1 Januari 2015",
            5000000, "Fakultas Sains dan Matematika",
            10, "1 Juni 2055"
        );

        DosenTamu dta = new DosenTamu(
            "1234567890", "98765432", "Budi",
            "10 Maret 1988", "1 Juni 2020",
            4000000, "Fakultas Teknik", 21
        );

        Tendik t = new Tendik(
            "1122334455", "Citra",
            "20 Juli 1985", "1 Maret 2010",
            3500000, "Akademik", 15, "1 Agustus 2040"
        );

        System.out.println("DOSEN TETAP : ");
        dt.printInfo();

        System.out.println();

        System.out.println("DOSEN TAMU : ");
        dta.printInfo();

        System.out.println();

        System.out.println("TENDIK : ");
        t.printInfo();
    }
}