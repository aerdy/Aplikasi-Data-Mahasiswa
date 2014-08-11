/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mahasiswa.Dao.entiti.Dao.Model;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import mahasiswa.Dao.entiti.Mahasiswa;

/**
 *
 * @author aerdy
 */
public class MahasiswaImpelement implements MahasiswaInterface{
    
    private String dbHost="jdbc:mysql://localhost:3306/mahasiswa1";
    private String dbUser="root";
    private String dbPass="";
    private Connection conn;
    
    public MahasiswaImpelement(){
        try {
            try {
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                
            } catch (Exception e) {
            }
        } catch (Exception e) {
        }
    }
    
    public MahasiswaImpelement(Connection conn){
        this.conn = conn;
    }
    

    @Override
    public void connec() throws SQLException {
        this.conn = (Connection) DriverManager.getConnection(dbHost,dbUser,dbPass);
    }

    @Override
    public void disconnec() throws SQLException {
        this.conn.close();
    }

    @Override
    public List read() throws SQLException {
        java.sql.Statement st = conn.createStatement();
        String sql = "select *from mahasiswa";
        ResultSet rs = st.executeQuery(sql);
        List list = new ArrayList();
        while (rs.next()) {
            Mahasiswa mhs = new Mahasiswa();
            mhs.setNim(rs.getString("nim"));
            mhs.setNama(rs.getString("nama"));
            mhs.SetALamat(rs.getString("alamat"));
            list.add(mhs);
        }
        return list;

    }

    @Override
    public void insert(Mahasiswa mahasiswa) throws SQLException {
         String sql = "insert into mahasiswa (nim, nama, alamat) values(?,?,?);";
        java.sql.PreparedStatement ps = this.conn.prepareStatement(sql);
        ps.setString(1, mahasiswa.getNim());
        ps.setString(2, mahasiswa.getNama());
        ps.setString(3, mahasiswa.getAlamat());
        ps.executeUpdate();
    }

    @Override
    public void update(String nim, Mahasiswa mahasiswa) throws SQLException {
        String sql = "update mahasiswa set nama=?,alamat=? where nim=?";
        java.sql.PreparedStatement ps = this.conn.prepareStatement(sql);
       
        ps.setString(1, mahasiswa.getNama());
        ps.setString(2, mahasiswa.getAlamat());
        ps.setString(3, nim);
        ps.executeUpdate();
    }

    @Override
    public void delete(String nim) throws SQLException {
        String sql = "delete from mahasiswa where nim=?";
        java.sql.PreparedStatement ps = this.conn.prepareStatement(sql);
        ps.setString(1, nim);
        ps.executeUpdate();
    }

    @Override
    public Mahasiswa read(String nim) throws SQLException {
             String sql = "select *from mahasiswa where nim = ?";
        java.sql.PreparedStatement ps = this.conn.prepareStatement(sql);
        ps.setString(1, nim);
        ResultSet rs = ps.executeQuery();
        Mahasiswa mahasiswa = new Mahasiswa();
        while (rs.next()) {
            mahasiswa.setNim(rs.getString("nim"));
            mahasiswa.setNama(rs.getString("nama"));
            mahasiswa.SetALamat(rs.getString("alamat"));
        }
        return mahasiswa;
    }
    
}
