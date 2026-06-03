package jdbc.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.List;

import jdbc.model.Mahasiswa;
import jdbc.utilities.MysqlUtility;

public class MysqlMahasiswaService {

    Connection koneksi = null;

    public MysqlMahasiswaService(){

        koneksi =
                MysqlUtility.getConnection();
    }

    public void add(Mahasiswa mhs){

        String query =
                "INSERT INTO mahasiswa VALUES (?, ?)";

        try{

            PreparedStatement ps =
                    koneksi.prepareStatement(query);

            ps.setInt(1, mhs.getId());
            ps.setString(2, mhs.getNama());

            ps.executeUpdate();

            System.out.println(
                    "Berhasil insert"
            );

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public void update(Mahasiswa mhs){

        String query =
                "UPDATE mahasiswa SET nama=? WHERE id=?";

        try{

            PreparedStatement ps =
                    koneksi.prepareStatement(query);

            ps.setString(1, mhs.getNama());
            ps.setInt(2, mhs.getId());

            ps.executeUpdate();

            System.out.println(
                    "Berhasil update"
            );

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public void delete(int id){

        String query =
                "DELETE FROM mahasiswa WHERE id=?";

        try{

            PreparedStatement ps =
                    koneksi.prepareStatement(query);

            ps.setInt(1, id);

            ps.executeUpdate();

            System.out.println(
                    "Berhasil delete"
            );

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public Mahasiswa getById(int id){

        Mahasiswa mhs = null;

        String query =
                "SELECT * FROM mahasiswa WHERE id=?";

        try{

            PreparedStatement ps =
                    koneksi.prepareStatement(query);

            ps.setInt(1, id);

            ResultSet rs =
                    ps.executeQuery();

            while(rs.next()){

                mhs = new Mahasiswa(
                        rs.getInt("id"),
                        rs.getString("nama")
                );
            }

        }
        catch(Exception e){
            e.printStackTrace();
        }

        return mhs;
    }

    public List<Mahasiswa> getAll(){

        List<Mahasiswa> list =
                new ArrayList<>();

        String query =
                "SELECT * FROM mahasiswa";

        try{

            Statement st =
                    koneksi.createStatement();

            ResultSet rs =
                    st.executeQuery(query);

            while(rs.next()){

                Mahasiswa mhs =
                        new Mahasiswa(
                                rs.getInt("id"),
                                rs.getString("nama")
                        );

                list.add(mhs);
            }

        }
        catch(Exception e){
            e.printStackTrace();
        }

        return list;
    }
}