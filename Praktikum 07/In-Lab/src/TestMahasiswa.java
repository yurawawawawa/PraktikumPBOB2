public class TestMahasiswa {
    public static void main(String[] args) {

        Mahasiswa m1 = new Mahasiswa();
        Mahasiswa m2 = new Mahasiswa("24060124140191", "Arga", "Informatika");
        Mahasiswa m3 = new Mahasiswa(m2);

        m1.setProgramStudi();
        m2.setProgramStudi("Teknik Komputer");
        m3.setProgramStudi(m2);

        m1.tampil();
        m2.tampil();
        m3.tampil();
    }
}