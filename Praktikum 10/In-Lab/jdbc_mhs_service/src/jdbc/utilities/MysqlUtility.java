package jdbc.utilities;

import java.sql.Connection;
import java.sql.DriverManager;

public class MysqlUtility {

    private static Connection koneksi;

    public static Connection getConnection(){

        if(koneksi == null){

            try{

                Class.forName("com.mysql.cj.jdbc.Driver");

                String url =
                    "jdbc:mysql://localhost:3306/jdbc_mhs";

                String user = "root";

                String password = "";

                koneksi =
                    DriverManager.getConnection(
                        url,
                        user,
                        password
                    );

                System.out.println(
                        "Koneksi berhasil"
                );

            }
            catch(Exception e){
                e.printStackTrace();
            }
        }

        return koneksi;
    }
}