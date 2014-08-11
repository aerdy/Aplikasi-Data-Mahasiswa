/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FormMahasiswa.java
 *
 * Created on Dec 6, 2010, 11:24:06 PM
 */
package mahasiswa.GUI;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableModel;
import mahasiswa.Dao.entiti.Dao.Model.MahasiswaImpelement;
import mahasiswa.Dao.entiti.Dao.Model.TabelDaoo;
import mahasiswa.Dao.entiti.Mahasiswa;

/**
 *
 * @author bahrie
 */
public class FormMahasiswa extends javax.swing.JFrame {

    MahasiswaImpelement daoMysql = new MahasiswaImpelement();
    TabelDaoo tabelModel;
    List<Mahasiswa> records = new ArrayList<Mahasiswa>();

    /** Creates new form FormMahasiswa */
    public FormMahasiswa() {
        initComponents();
        loadData();
    }

    void loadData() {
        try {
            daoMysql.connec();
            List list = new ArrayList();
            list = daoMysql.read();
            TabelDaoo tableModel = new TabelDaoo(list);
            jTable1.setModel(tableModel);
            daoMysql.disconnec();
        } catch (SQLException ex) {
            Logger.getLogger(FormMahasiswa.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    void kosongkanTeks() {
        txtNim.setText("");
        txtNama.setText("");
        txtAlamat.setText("");
    }

    public TabelDaoo getTabelModel() {
        return tabelModel;
    }

    public void setTabelModel(TabelDaoo tabelModel) {
        this.tabelModel = tabelModel;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelIsiData = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNim = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtAlamat = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        buttonUptade = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        tabelIsiData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabelIsiData);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("NIM");

        jLabel2.setText("Nama");

        jLabel3.setText("Alamat");

        txtNim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNimActionPerformed(evt);
            }
        });

        jButton1.setText("Tambah");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        buttonUptade.setText("Ubah");
        buttonUptade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUptadeActionPerformed(evt);
            }
        });

        jButton3.setText("Hapus");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNim, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
                            .addComponent(txtNama, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonUptade, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))
                            .addComponent(txtAlamat, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(buttonUptade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNimActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        if (!txtNim.getText().isEmpty()
                && !txtNama.getText().isEmpty()
                && !txtAlamat.getText().isEmpty()) {
            try {
                // TODO add your handling code here:
                daoMysql.connec();
                Mahasiswa mhs = new Mahasiswa();
                mhs.setNim(txtNim.getText());
                mhs.setNama(txtNama.getText());
                mhs.SetALamat(txtAlamat.getText());
                daoMysql.insert(mhs);
                loadData();
            } catch (SQLException ex) {
                Logger.getLogger(FormMahasiswa.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Harus diisi semua", "Salah", JOptionPane.ERROR_MESSAGE);
        }
        this.kosongkanTeks();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void buttonUptadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUptadeActionPerformed
        try {
            // TODO add your handling code here:
            daoMysql.connec();
            int index = jTable1.getSelectedRow();
            if (buttonUptade.getText().equals("Ubah")) {
                records = daoMysql.read();
                Mahasiswa mahasiswa = records.get(index);
                String nim = mahasiswa.getNim();
                Mahasiswa mhs = daoMysql.read(nim);
                txtNim.setText(mhs.getNim());
                txtNama.setText(mhs.getNama());
                txtAlamat.setText(mhs.getAlamat());
                buttonUptade.setText("Simpan");
            } else {
                Mahasiswa mhs1 = new Mahasiswa();
                mhs1.setNim(txtNim.getText());
                mhs1.setNama(txtNama.getText());
                mhs1.SetALamat(txtAlamat.getText());
                if (JOptionPane.showConfirmDialog(this, "apakah anda yakin untuk melakukan update", "konfirmasi update", JOptionPane.OK_CANCEL_OPTION) == 0) {
                    daoMysql.update(records.get(index).getNim(), mhs1);
                    loadData();
                    this.kosongkanTeks();
                    buttonUptade.setText("Update");
                    JOptionPane.showMessageDialog(this, "Data berhasil di update");
                }
            }
            daoMysql.disconnec();
        } catch (SQLException ex) {
            Logger.getLogger(FormMahasiswa.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_buttonUptadeActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int index = jTable1.getSelectedRow();
        if (JOptionPane.showConfirmDialog(this, "apakah anda yakin untuk menghapus data", "konfirmasi penghapusan", JOptionPane.OK_CANCEL_OPTION) == 0) {
            try {
                daoMysql.connec();
                records = daoMysql.read();
                daoMysql.delete(records.get(index).getNim());
                JOptionPane.showMessageDialog(this, "data berhasil di hapus");
            } catch (SQLException ex) {
                Logger.getLogger(FormMahasiswa.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "data belum dipilh", "error", JOptionPane.ERROR_MESSAGE);

            }
        }
        loadData();

    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new FormMahasiswa().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonUptade;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tabelIsiData;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNim;
    // End of variables declaration//GEN-END:variables
}
