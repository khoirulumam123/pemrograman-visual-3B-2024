/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package modul.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class halaman1 extends javax.swing.JFrame {

    /**
     * Creates new form halaman1
     */
    public halaman1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JenisKelamin = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Fakultas = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jeniskelamin = new javax.swing.JLabel();
        telepon = new javax.swing.JLabel();
        jfrem = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        j = new javax.swing.JLabel();
        yayad = new javax.swing.JLabel();
        Nama = new javax.swing.JTextField();
        tempatlahir = new javax.swing.JTextField();
        tanggallahir = new javax.swing.JTextField();
        notelepon = new javax.swing.JTextField();
        lakilaki = new javax.swing.JRadioButton();
        perempuan = new javax.swing.JRadioButton();
        gmail = new javax.swing.JTextField();
        prodi = new javax.swing.JTextField();
        fakultas1 = new javax.swing.JComboBox<>();
        cbData = new javax.swing.JCheckBox();
        batal = new javax.swing.JButton();
        riset = new javax.swing.JButton();
        simpan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 255, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel1.setText("FORMULIR PENDAFTARAN MAHASISWA BARU");

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel2.setText("UNIVERSITAS TRUNOJOYO MADURA");

        jLabel3.setText("Jl.Raya Telang,PO.BOX. 2 Kamal,bangkalan - bangkalan");

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Downloads\\LOGO UTM1.jpg")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(70, 70, 70))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addComponent(jLabel13))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        Fakultas.setBackground(new java.awt.Color(0, 0, 204));

        jLabel4.setBackground(new java.awt.Color(51, 51, 0));
        jLabel4.setForeground(new java.awt.Color(51, 51, 0));
        jLabel4.setText("nama :");

        jLabel5.setText("tempat lahir :");

        jLabel6.setText("tanggal lahir :");

        jeniskelamin.setText("jenis kelamin :");

        telepon.setText("no telepeon :");

        jfrem.setText("gmail :");

        j.setText("prodi :");

        yayad.setText("fakultas :");

        Nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NamaActionPerformed(evt);
            }
        });

        tempatlahir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tempatlahirActionPerformed(evt);
            }
        });

        tanggallahir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanggallahirActionPerformed(evt);
            }
        });

        JenisKelamin.add(lakilaki);
        lakilaki.setText("laki-laki");

        JenisKelamin.add(perempuan);
        perempuan.setText("perempuan");
        perempuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perempuanActionPerformed(evt);
            }
        });

        prodi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prodiActionPerformed(evt);
            }
        });

        fakultas1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TEKNIK", "FEB", "FISIB", "HUKUM", "PERTANIAN", "KEISLAMAN", "PENDIDIKAN", "KEDOKTERAN" }));
        fakultas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fakultas1ActionPerformed(evt);
            }
        });

        cbData.setText("Data Saya Sudah Benar");

        batal.setText("BATAL");
        batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batalActionPerformed(evt);
            }
        });

        riset.setText("RISET");
        riset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                risetActionPerformed(evt);
            }
        });

        simpan.setText("SIMPAN");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FakultasLayout = new javax.swing.GroupLayout(Fakultas);
        Fakultas.setLayout(FakultasLayout);
        FakultasLayout.setHorizontalGroup(
            FakultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FakultasLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(FakultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(telepon)
                    .addComponent(jLabel10)
                    .addGroup(FakultasLayout.createSequentialGroup()
                        .addGroup(FakultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jeniskelamin)
                            .addComponent(jfrem)
                            .addComponent(j)
                            .addComponent(yayad))
                        .addGap(50, 50, 50)
                        .addGroup(FakultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(notelepon)
                            .addComponent(Nama)
                            .addComponent(tempatlahir)
                            .addGroup(FakultasLayout.createSequentialGroup()
                                .addComponent(lakilaki)
                                .addGap(18, 18, 18)
                                .addComponent(perempuan))
                            .addComponent(gmail)
                            .addComponent(prodi)
                            .addGroup(FakultasLayout.createSequentialGroup()
                                .addComponent(fakultas1, 0, 222, Short.MAX_VALUE)
                                .addGap(81, 81, 81))
                            .addComponent(tanggallahir)))
                    .addComponent(cbData, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(FakultasLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(batal)
                        .addGap(35, 35, 35)
                        .addComponent(riset)
                        .addGap(47, 47, 47)
                        .addComponent(simpan)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FakultasLayout.setVerticalGroup(
            FakultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FakultasLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(FakultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(FakultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tempatlahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FakultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tanggallahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FakultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FakultasLayout.createSequentialGroup()
                        .addComponent(jeniskelamin)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FakultasLayout.createSequentialGroup()
                        .addGroup(FakultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lakilaki)
                            .addComponent(perempuan))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(FakultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(telepon)
                    .addComponent(notelepon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FakultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jfrem)
                    .addComponent(gmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FakultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j)
                    .addComponent(prodi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FakultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(yayad)
                    .addComponent(fakultas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(cbData)
                .addGap(37, 37, 37)
                .addGroup(FakultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(riset)
                    .addComponent(batal)
                    .addComponent(simpan))
                .addContainerGap(104, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fakultas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Fakultas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NamaActionPerformed

    private void tempatlahirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tempatlahirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tempatlahirActionPerformed

    private void tanggallahirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanggallahirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tanggallahirActionPerformed

    private void prodiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prodiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prodiActionPerformed

    private void fakultas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fakultas1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fakultas1ActionPerformed

    private void batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalActionPerformed
int response = JOptionPane.showConfirmDialog(this, "Keluar Program", "Keluar", JOptionPane.YES_NO_OPTION);
        if(response == 0) {
            System.exit(0);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_batalActionPerformed

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        String jenisKelamin = null;
        
        if (!cbData.isSelected()) {
            JOptionPane.showMessageDialog(null, "Silahkan di Checklis jika Data yang diinputkan sudah benar", "Peringatan", JOptionPane.WARNING_MESSAGE);
         } else {
            String nama = Nama.getText();
            String tempatLahir = tempatlahir.getText();
            String tanggalLahir = tanggallahir.getText();

            if(lakilaki.isSelected()) {
                jenisKelamin = "Laki-laki";
            }else if (perempuan.isSelected()) {
                jenisKelamin = "Perempuan";
            }

            String Gmail = gmail.getText();
            String telepon = notelepon.getText();
            
            String fakultas = (String) fakultas1.getSelectedItem();
            String Prodi = prodi.getText();
            

            halaman2 halaman2 = new halaman2(nama, tempatLahir, tanggalLahir, jenisKelamin, Gmail, telepon, fakultas, Prodi);
            halaman2.setVisible(true);
            this.dispose();
    }          
        
    }//GEN-LAST:event_simpanActionPerformed

    private void risetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_risetActionPerformed
        Nama.setText("");
        tempatlahir.setText("");
        tanggallahir.setText("");
        gmail.setText("");
        notelepon.setText("");
        prodi.setText("");
        
        JenisKelamin.clearSelection();
        fakultas1.setSelectedIndex(0);        // TODO add your handling code here:
    }//GEN-LAST:event_risetActionPerformed

    private void perempuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perempuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_perempuanActionPerformed

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
            java.util.logging.Logger.getLogger(halaman1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(halaman1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(halaman1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(halaman1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new halaman1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Fakultas;
    private javax.swing.ButtonGroup JenisKelamin;
    private javax.swing.JTextField Nama;
    private javax.swing.JButton batal;
    private javax.swing.JCheckBox cbData;
    private javax.swing.JComboBox<String> fakultas1;
    private javax.swing.JTextField gmail;
    private javax.swing.JLabel j;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jeniskelamin;
    private javax.swing.JLabel jfrem;
    private javax.swing.JRadioButton lakilaki;
    private javax.swing.JTextField notelepon;
    private javax.swing.JRadioButton perempuan;
    private javax.swing.JTextField prodi;
    private javax.swing.JButton riset;
    private javax.swing.JButton simpan;
    private javax.swing.JTextField tanggallahir;
    private javax.swing.JLabel telepon;
    private javax.swing.JTextField tempatlahir;
    private javax.swing.JLabel yayad;
    // End of variables declaration//GEN-END:variables
}
