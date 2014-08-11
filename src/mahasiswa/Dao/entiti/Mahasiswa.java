/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mahasiswa.Dao.entiti;

/**
 *
 * @author aerdy
 */
public class Mahasiswa {
    private String nama;
    private String nim;
    private String alamat;
    
    
    public Mahasiswa(){
        
    }
    public Mahasiswa(String nama , String nim , String alamat){
        this.nama = nama;
        this.nim = nim;
        this.alamat = alamat;
    }
    
    
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getNim(){
        return nim;
    }
    public void setNim(String nim){
        this.nim = nim;
    }
    
    public String getAlamat(){
        return alamat;
    }
    public void SetALamat(String alamat){
        this.alamat = alamat;
    }
    
}
