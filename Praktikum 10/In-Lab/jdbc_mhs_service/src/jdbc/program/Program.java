package jdbc.program;

import java.util.List;

import jdbc.model.Mahasiswa;
import jdbc.service.MysqlMahasiswaService;

public class Program {

    static MysqlMahasiswaService service =
            new MysqlMahasiswaService();

    public static void displayAll(){

        List<Mahasiswa> list =
                service.getAll();

        for(Mahasiswa m : list){

            System.out.println(m);
        }
    }

    public static void main(String[] args){

        System.out.println("=== INSERT ===");

        Mahasiswa mhs =
                new Mahasiswa(1, "Arga");

        service.add(mhs);

        displayAll();

        System.out.println("=== UPDATE ===");

        Mahasiswa updateMhs =
                service.getById(1);

        updateMhs.setNama("Yura");

        service.update(updateMhs);

        displayAll();

        System.out.println("=== DELETE ===");

//        service.delete(1);

        displayAll();
    }
}