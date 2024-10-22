package Aplikasi;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author NOFRA IRVAN
 */
//
import app.db.Mahasiswa;
import app.db.MahasiswaManager;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Utama extends javax.swing.JFrame {

    List<Mahasiswa> mahasiswa = new ArrayList<>();
    int currentRow = 0;
   
    public Utama() {
        String lookAndFeel =javax.swing.UIManager.getSystemLookAndFeelClassName();
        try {
            javax.swing.UIManager.setLookAndFeel(lookAndFeel);
        } catch (Exception e) {
        }
        
        initComponents();
            loadData();
            binData();
            this.setTitle("Data Mahasiswa");

            txtNoBP.setEditable(false);
            txtNama.setEditable(false);
            txtTmpLahir.setEditable(false);
            txtTglLahir.setEditable(false);
            txtAlamat.setEditable(false);
            txtPhone.setEditable(false);
            txtAsalSekolah.setEditable(false);
            this.setLocationRelativeTo(this);
    }
    private void loadData(){
        MahasiswaManager mhsmgr = new MahasiswaManager();
        mahasiswa = mhsmgr.getMahasiswa();
        mhsmgr.closeConnection();
    }   
    private void binData(){
        if (mahasiswa.size()>0){
            Mahasiswa m = mahasiswa.get(currentRow);
            txtNoBP.setText(m.getnobp());
            txtNama.setText(m.getnama());
            txtTmpLahir.setText(m.gettmplahir());
            txtTglLahir.setText(m.gettgllahir());
            txtAlamat.setText(m.getalamat());
            txtPhone.setText(m.getphone());
            txtAsalSekolah.setText(m.getasalsekolah());
        } else {
            currentRow = 0;
            txtNoBP.setText("");
            txtNama.setText("");
            txtTmpLahir.setText("");
            txtTglLahir.setText("");
            txtAlamat.setText("");
            txtPhone.setText("");
            txtAsalSekolah.setText("");
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNoBP = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTmpLahir = new javax.swing.JTextField();
        txtTglLahir = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtAlamat = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtAsalSekolah = new javax.swing.JTextField();
        btnPrev = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Data Mahasiswa");

        jLabel1.setText("Data Mahasiswa");

        jLabel2.setText("No BP");

        txtNoBP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoBPActionPerformed(evt);
            }
        });

        jLabel4.setText("Nama");

        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });

        jLabel5.setText("Tempat/Tgl lahir");

        jLabel12.setText("Alamat");

        txtAlamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlamatActionPerformed(evt);
            }
        });

        jLabel13.setText("No Telphone");

        jLabel14.setText("Asal Sekolah");

        txtAsalSekolah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAsalSekolahActionPerformed(evt);
            }
        });

        btnPrev.setText("<<");
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });

        btnNext.setText(">>");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnNew.setText("Baru");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setText("Hapus");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel13)
                                        .addComponent(jLabel14))
                                    .addComponent(jLabel12))))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtTmpLahir, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(104, 104, 104)
                                .addComponent(txtTglLahir))
                            .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNoBP, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAsalSekolah)
                            .addComponent(txtPhone))))
                .addContainerGap(135, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPrev, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNoBP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTmpLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTglLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtAsalSekolah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrev)
                    .addComponent(btnNext)
                    .addComponent(btnEdit)
                    .addComponent(btnNew)
                    .addComponent(btnDelete))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
       if (currentRow < mahasiswa.size()-1) {
                --currentRow;
                btnPrev.setEnabled(true);
                }else{
                btnNext.setEnabled(false);
                }
                binData();        // TODO add your handling code here:
    }//GEN-LAST:event_btnNextActionPerformed

    private void txtAlamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlamatActionPerformed

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        if (btnNew.getText().equals("Baru")) {
    // Kosongkan input form
    txtNoBP.setText("");
    txtNama.setText("");
    txtTmpLahir.setText("");
    txtTglLahir.setText("");
    txtAlamat.setText("");
    txtPhone.setText("");
    txtAsalSekolah.setText("");

    // Set semua input field menjadi editable
    txtNoBP.setEditable(true);
    txtNama.setEditable(true);
    txtTmpLahir.setEditable(true);
    txtTglLahir.setEditable(true);
    txtAlamat.setEditable(true);
    txtPhone.setEditable(true);
    txtAsalSekolah.setEditable(true);

    // Set fokus ke input NoBP
    txtNoBP.requestFocus();
    
    // Ubah teks tombol
    btnNew.setText("Simpan");
    btnDelete.setText("Batal");

    // Nonaktifkan tombol lain
    btnEdit.setEnabled(false);
    btnPrev.setEnabled(false);
    btnNext.setEnabled(false);
} else {
    // Pastikan NoBP dan Nama tidak kosong
    if (!txtNoBP.getText().equals("") && !txtNama.getText().equals("")) {

        // Membuat objek Mahasiswa dan mengisi data dari form
        MahasiswaManager mhsmgr = new MahasiswaManager();
        Mahasiswa m = new Mahasiswa();
        m.setnobp(txtNoBP.getText());   
        m.setnama(txtNama.getText());  // Menggunakan getText() bukan getName()
        m.settmplahir(txtTmpLahir.getText());
        m.settgllahir(txtTglLahir.getText());
        m.setalamat(txtAlamat.getText());
        m.setphone(txtPhone.getText());
        m.setasalsekolah(txtAsalSekolah.getText());

        // Insert data mahasiswa ke database
        if (mhsmgr.Insert(m) > 0) {
            loadData();  // Muat ulang data dari database
            currentRow = mahasiswa.size() - 1;  // Set current row ke data terakhir
            binData();  // Tampilkan data di UI
            JOptionPane.showMessageDialog(this, "Data Berhasil Disimpan", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Data Gagal Disimpan", "Informasi", JOptionPane.ERROR_MESSAGE);
        }

        // Set semua input field menjadi tidak editable
        txtNoBP.setEditable(false);
        txtNama.setEditable(false);
        txtTmpLahir.setEditable(false);
        txtTglLahir.setEditable(false);
        txtAlamat.setEditable(false);
        txtPhone.setEditable(false);
        txtAsalSekolah.setEditable(false);

        // Ubah teks tombol kembali ke kondisi awal
        btnNew.setText("Baru");
        btnDelete.setText("Hapus");

        // Aktifkan tombol lain
        btnEdit.setEnabled(true);
        btnPrev.setEnabled(true);
        btnNext.setEnabled(true);

        // Tutup koneksi
        mhsmgr.closeConnection();
    } else {
        // Jika NoBP atau Nama kosong
        JOptionPane.showMessageDialog(this, "No BP dan Nama tidak boleh kosong!", "Informasi", JOptionPane.WARNING_MESSAGE);
    }
}

     
    }//GEN-LAST:event_btnNewActionPerformed

    private void txtNoBPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoBPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNoBPActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
      if (btnEdit.getText().equals("Ubah")) {
    // Jangan kosongkan field, cukup set editable
    txtNoBP.setEditable(true);
    txtNama.setEditable(true);
    txtTmpLahir.setEditable(true);
    txtTglLahir.setEditable(true);
    txtAlamat.setEditable(true);
    txtPhone.setEditable(true);
    txtAsalSekolah.setEditable(true);

    // Set fokus ke input NoBP
    txtNoBP.requestFocus();
    
    // Ubah teks tombol
    btnNew.setText("Simpan");
    btnDelete.setText("Batal");
    btnEdit.setEnabled(false);
    btnPrev.setEnabled(false);
    btnNext.setEnabled(false);
} else {
    // Membuat objek Mahasiswa dan mengisi data dari form
    MahasiswaManager mhsmgr = new MahasiswaManager();
    Mahasiswa m = new Mahasiswa();
    m.setnobp(txtNoBP.getText());
    m.setnama(txtNama.getText());  // Perbaikan: gunakan getText() bukan getName()
    m.settmplahir(txtTmpLahir.getText());
    m.settgllahir(txtTglLahir.getText());
    m.setalamat(txtAlamat.getText());
    m.setphone(txtPhone.getText());
    m.setasalsekolah(txtAsalSekolah.getText());

    // Update data mahasiswa ke database
     if (mhsmgr.Update(m) > 0) {
                    JOptionPane.showMessageDialog(this, "Data Berhasil Disimpan", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                    loadData(); // Muat ulang data
                    btnEdit.setText("Ubah"); // Kembali ke tombol Ubah
                } else {
                    JOptionPane.showMessageDialog(this, "Data Gagal Disimpan", "Informasi", JOptionPane.ERROR_MESSAGE);
                }

    // Set semua input field menjadi tidak editable
    txtNoBP.setEditable(false);
    txtNama.setEditable(false);
    txtTmpLahir.setEditable(false);
    txtTglLahir.setEditable(false);
    txtAlamat.setEditable(false);
    txtPhone.setEditable(false);
    txtAsalSekolah.setEditable(false);

    // Reset tombol kembali ke kondisi awal
    btnNew.setText("Baru");
    btnDelete.setText("Hapus");
    btnPrev.setEnabled(true);
    btnNext.setEnabled(true);
}

    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (btnDelete.getText().equals("Hapus")){
            int dialog = JOptionPane.showConfirmDialog(this,"Apakah Anda Yakin Akan Menghapus Data Ini ?","Konfirmasi",JOptionPane.YES_NO_OPTION);
            MahasiswaManager mhsmgr = new MahasiswaManager();
            
            Mahasiswa m = mahasiswa.get(currentRow);
                if (dialog == JOptionPane.YES_NO_OPTION) {
                    if (mhsmgr.Delete(m) > 0) {
                        loadData();
                        currentRow = currentRow - 1; 
                        binData();
                        JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(this, "Data Gagal Dihapus", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }else if (btnDelete.getText().equals("Batal")){
                loadData();
                binData();
                btnNew.setText("Baru");
                btnEdit.setText("Ubah");
                btnDelete.setText("Hapus");
                btnEdit.setEnabled(true);
                btnNew.setEnabled(true);
                btnNext.setEnabled(true);
                btnPrev.setEnabled(true);
                txtNoBP.setEditable(false);
                txtNama.setEditable(false);
                txtTmpLahir.setEditable(false);
                txtTglLahir.setEditable(false);
                txtAlamat.setEditable(false);
                txtPhone.setEditable(false);
                txtAsalSekolah.setEditable(false);
            }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        if (currentRow < mahasiswa.size()-1){
                ++currentRow;
                btnNext.setEnabled(true);
                }else {
                btnNext.setEnabled(false);
                }
                binData();
    }//GEN-LAST:event_btnPrevActionPerformed

    private void txtAsalSekolahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAsalSekolahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAsalSekolahActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
                new Utama().setVisible(true);
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrev;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtAsalSekolah;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNoBP;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtTglLahir;
    private javax.swing.JTextField txtTmpLahir;
    // End of variables declaration//GEN-END:variables
}
