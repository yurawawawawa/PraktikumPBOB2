class Civitasakademika {
    String nama;

    public Civitasakademika(String nama) {
        this.nama = nama;
    }

    public String getNomor() {
        return "";
    }
}

class Dosen extends Civitasakademika {
    String nip;

    public Dosen(String nama, String nip) {
        super(nama);
        this.nip = nip;
    }

    public String getNomor() {
        return nip;
    }
}

class Mahasiswa extends Civitasakademika {
    String nim;
    Dosen dosenwali;

    public Mahasiswa(String nama, String nim, Dosen wali) {
        super(nama);
        this.nim = nim;
        this.dosenwali = wali;
    }

    public String getNomor() {
        return nim;
    }

    public void setWali(Dosen d) {
        dosenwali = d;
    }

    public void tampilDataMahasiswa() {
        System.out.println(nim + " | " + nama + " | Wali: " + dosenwali.nama);
    }
}

class Seminar {
    Civitasakademika[] pesertas = new Civitasakademika[100];
    int banyakpeserta;

    public Seminar() {
        banyakpeserta = 0;
    }

    public void registrasi(Civitasakademika c) {
        pesertas[banyakpeserta] = c;
        banyakpeserta++;
    }

    public int countPeserta() {
        return banyakpeserta;
    }

    public void tampilPeserta() {
        for (int i = 0; i < banyakpeserta; i++) {
            System.out.println(
                pesertas[i].getNomor() + " | " + pesertas[i].nama
            );
        }
    }

    public int countMahasiswa() {
        int jumlah = 0;
        for (int i = 0; i < banyakpeserta; i++) {
            if (pesertas[i] instanceof Mahasiswa) {
                jumlah++;
            }
        }
        return jumlah;
    }
}

public class SeminarMain {
    public static void main(String[] args) {

        Dosen d1 = new Dosen("Pak Budi", "1987");
        Dosen d2 = new Dosen("Bu Rina", "1990");

        Mahasiswa m1 = new Mahasiswa("Arga", "240601", d1);
        Mahasiswa m2 = new Mahasiswa("Bima", "240602", d1);
        Mahasiswa m3 = new Mahasiswa("Caca", "240603", d2);
        Mahasiswa m4 = new Mahasiswa("Doni", "240604", d2);
        Mahasiswa m5 = new Mahasiswa("Eka", "240605", d1);

        Seminar s = new Seminar();

        s.registrasi(d1);
        s.registrasi(d2);
        s.registrasi(m1);
        s.registrasi(m2);
        s.registrasi(m3);
        s.registrasi(m4);
        s.registrasi(m5);

        System.out.println("Jumlah peserta = " + s.countPeserta());

        s.tampilPeserta();

        System.out.println("Jumlah mahasiswa = " + s.countMahasiswa());

        m1.setWali(d2);
        m1.tampilDataMahasiswa();
    }
}