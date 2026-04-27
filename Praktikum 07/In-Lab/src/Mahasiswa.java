public class Mahasiswa {
    String nim;
    String nama;
    String programStudi;

    // Konstruktor kosong
    public Mahasiswa() {
        nim = "-999";
        nama = "n/a";
        programStudi = "n/a";
    }

    // Konstruktor isi
    public Mahasiswa(String nim, String nama, String ps) {
        this.nim = nim;
        this.nama = nama;
        this.programStudi = ps;
    }

    // Copy constructor
    public Mahasiswa(Mahasiswa m) {
        this.nim = m.nim;
        this.nama = m.nama;
        this.programStudi = m.programStudi;
    }

    // Overloading method
    public void setProgramStudi() {
        this.programStudi = "Kosong";
    }

    public void setProgramStudi(String ps) {
        this.programStudi = ps;
    }

    public void setProgramStudi(Mahasiswa m) {
        this.programStudi = m.programStudi;
    }

    public void tampil() {
        System.out.println(nim + " | " + nama + " | " + programStudi);
    }
}