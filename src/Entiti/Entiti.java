/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entiti;

import java.io.Serializable;

/**
 *
 * @author aerdy
 */
public class Entiti implements Serializable{
    
    private static final long serialVersionUID=1L;
    
    private String nim;
    private String nama;
    private String alamat;
    private String jurusan;
    
    public String getNim(){
        return nim;
    }
    public void setNim(String nim){
        this.nim=nim;
    }
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama=nama;
    }
    public String getAlamat(){
        return alamat;
    }
    public void getAlamat(String alamat){
        this.alamat=alamat;
    }
    public String getJrursan(){
        return jurusan;
    }
    public void setJurusan(String jurusan){
        this.jurusan=jurusan;
    }
    
    @Override
    public int hashCode(){
        int hash = 0;
        hash +=(nim !=null ? nim.hashCode():0);
        return hash;
    }
    public boolean equals(Object object){
        if(!(object instanceof Entiti)){
            return false;
        }
        Entiti other = (Entiti)object;
         if ((this.nim == null && other.nim != null) || (this.nim != null && !this.nim.equals(other.nim))) {
            return false;
    }
        return true;
    }
    @Override
    public String toString(){
        return "MHS.Entiti.Entiti[nim="+nim+"]";
    }
}
