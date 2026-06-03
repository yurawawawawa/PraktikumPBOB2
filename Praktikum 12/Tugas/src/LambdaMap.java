import java.util.HashMap;
import java.util.Map;

public class LambdaMap {

    public static void main(String[] args) {

        Map<String, String> mahasiswa =
                new HashMap<>();

        mahasiswa.put("24060123130001", "Arga");
        mahasiswa.put("24060123130002", "Budi");
        mahasiswa.put("24060123130003", "Cici");

        mahasiswa.forEach(
                (nim, nama) ->
                        System.out.println(
                                "NIM : " + nim +
                                " | Nama : " + nama
                        )
        );
    }
}