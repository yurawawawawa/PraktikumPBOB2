public class MMahasiswa {
    public static void main(String[] args) {

        Mahasiswa M1 = new Mahasiswa(
            "234", "Citra", "Informatika",      
            "123", "Andi", "Informatika",        
            "H1234AB", "motor"                  
        );

        M1.addMatKul(new MataKuliah("PBO", "Pemrograman Berorientasi Objek", 3));
        M1.addMatKul(new MataKuliah("MBD", "Manajemen Basis Data", 3));

        M1.printDetailMhs();
        System.out.println("Jumlah Mata Kuliah = " + M1.getJumlahMatKul());
        System.out.println("Jumlah SKS         = " + M1.getJumlahSKS());
    }
}