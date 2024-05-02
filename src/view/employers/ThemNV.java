/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view.employers;

import dao.NhanVienDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.NhanVienModel;
import javax.swing.JFrame;

/**
 *
 * @author hyn09
 */
public class ThemNV extends javax.swing.JDialog {

    /**
     * Creates new form ThemNV
     */
    private NhanVien parent;
    
    public ThemNV(javax.swing.JPanel parent, java.awt.Frame owner, boolean modal) {
        super(owner, modal);
        this.parent = (NhanVien) parent;
        initComponents();
        setLocationRelativeTo(null);
        txtMaNV.setText(createId());
    }
    
     ThemNV() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private ThemNV(JFrame jFrame, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTenNV = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtSdt = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnQuit = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(152, 225, 225));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("THÊM THÔNG TIN NHÂN VIÊN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(198, 198, 198))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel2)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Mã nhân viên");

        txtMaNV.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        txtMaNV.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 255, 255), new java.awt.Color(102, 204, 255)));
        txtMaNV.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Họ tên");

        txtTenNV.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        txtTenNV.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 255, 255), new java.awt.Color(102, 204, 255)));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Địa chỉ");

        txtDiaChi.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        txtDiaChi.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 255, 255), new java.awt.Color(102, 204, 255)));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("Số điện thoại");

        txtSdt.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        txtSdt.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 255, 255), new java.awt.Color(102, 204, 255)));

        btnAdd.setBackground(new java.awt.Color(230, 255, 243));
        btnAdd.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(0, 179, 179));
        btnAdd.setText("Thêm");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnQuit.setBackground(new java.awt.Color(230, 255, 243));
        btnQuit.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnQuit.setForeground(new java.awt.Color(0, 179, 179));
        btnQuit.setText("Hủy");
        btnQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("Email");

        txtEmail.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        txtEmail.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 255, 255), new java.awt.Color(102, 204, 255)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnAdd)
                        .addGap(133, 133, 133)
                        .addComponent(btnQuit, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtSdt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                        .addComponent(txtMaNV, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                        .addComponent(txtTenNV, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                        .addComponent(txtDiaChi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)))
                .addContainerGap(154, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSdt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnQuit))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public String createId() {
    ArrayList<NhanVienModel> spAll = NhanVienDAO.getInstance().selectAll();
    int maxId = 0;
    for (NhanVienModel nv : spAll) {
        String maNV = nv.getMaNV();
        if (maNV.startsWith("NV")) {
            try {
                int id = Integer.parseInt(maNV.replaceAll("[^\\d]", ""));
                if (id > maxId) {
                    maxId = id;
                }
            } catch (NumberFormatException e) {
            }
        }
    }
    return "NV" + (maxId + 1);
    }
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        try {
            String maNV = txtMaNV.getText().trim();
            String tenNV = txtTenNV.getText().trim();
            String diachi = txtDiaChi.getText().trim();
            String sdt = txtSdt.getText().trim();
            String email = txtEmail.getText().trim();
            if (maNV.equals("") || tenNV.equals("") || sdt.equals("") || diachi.equals("")|| email.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin !", "Cảnh báo", JOptionPane.WARNING_MESSAGE);
            } else {
                if (maNV != null && !maNV.equals(NhanVienDAO.getInstance().selectById(maNV))) {
                    NhanVienModel nv = new NhanVienModel();
                    nv.setMaNV(maNV);
                    nv.setTenNV(tenNV);
                    nv.setDiaChi(diachi);
                    nv.setSdt(sdt);
                    nv.setEmail(email);
                    
                    int kq = NhanVienDAO.getInstance().insert(nv);
                    if(kq > 0) {
                    JOptionPane.showMessageDialog(this, "Thêm nhân viên thành công !");
                    parent.loadDataToTable(NhanVienDAO.getInstance().selectAll());
                    this.dispose(); 
                    } else {
                    JOptionPane.showMessageDialog(this, "Thêm không thành công ! Mã nhân viên đã tồn tại !", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            } }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnQuitActionPerformed

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
            java.util.logging.Logger.getLogger(ThemNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThemNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThemNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThemNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ThemNV dialog = new ThemNV(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnQuit;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtSdt;
    private javax.swing.JTextField txtTenNV;
    // End of variables declaration//GEN-END:variables
}
