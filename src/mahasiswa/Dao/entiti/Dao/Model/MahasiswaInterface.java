/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mahasiswa.Dao.entiti.Dao.Model;

import java.sql.SQLException;
import java.util.List;
import mahasiswa.Dao.entiti.Mahasiswa;

/**
 *
 * @author aerdy
 */
public interface  MahasiswaInterface {
    
    public void connec()throws SQLException;
    public void disconnec()throws SQLException;
    
    public List read()throws SQLException;
    public void insert(Mahasiswa mahasiswa) throws SQLException;
    public void update(String nim , Mahasiswa mahasiswa) throws SQLException;
    public void delete(String nim)throws SQLException;
    public Mahasiswa read(String nim)throws  SQLException;
    
}
