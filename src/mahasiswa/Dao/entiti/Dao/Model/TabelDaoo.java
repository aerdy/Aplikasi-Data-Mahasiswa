/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mahasiswa.Dao.entiti.Dao.Model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import mahasiswa.Dao.entiti.Mahasiswa;

/**
 *
 * @author aerdy
 */
public class TabelDaoo extends AbstractTableModel{
    List<Mahasiswa> list = new ArrayList<Mahasiswa>();
    
    public TabelDaoo(List list){
        this.list = list;
    }
    

    @Override
    public int getRowCount() {
        return this.list.size();
    }

    @Override
    public int getColumnCount() {
    return 3;   
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
    switch(columnIndex){
        case 0 : return list.get(rowIndex).getNim();
        case 1 : return list.get(rowIndex).getNama();
        case 2 : return list.get(rowIndex).getAlamat();
            default:
                return null;
    }    
    }
        
        public String getColumnname( int column){
        switch(column){
            case 0 : return "nim";
            case 1 : return "nama";
            case 2 : return "alamat";
                default:
                    return null;
            
        }
        }
        public Mahasiswa select(int index){
            return list.get(index);
        }
        
    }
    

