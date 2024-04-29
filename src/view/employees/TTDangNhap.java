/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.employees;

import controller.emplyees.TimTTDangNhap;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import model.TTDangNhapModel;
import dao.TTDangNhapDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;




/**
 *
 * @author hyn09



/**
 *
 * @author hyn09
 */
public class TTDangNhap extends javax.swing.JPanel implements ActionListener {
    private DefaultTableModel tblModel;
    private static ArrayList<TTDangNhapModel> armt;
    /**
     * Creates new form TTDangNhap
     */
    public TTDangNhap() {
        initComponents();
        jTable_TTDangNhap.setDefaultEditor(Object.class, null);
        initTable();
        armt = TTDangNhapDAO.getInstance().selectAll();
        loadDataToTable(armt);
    }   
        public void loadDataToTable(ArrayList<TTDangNhapModel> ttdn) {
        try {
            tblModel.setRowCount(0);
            for (TTDangNhapModel i : ttdn) {
                tblModel.addRow(new Object[]{
                    i.getMaNV(), i.getUser(),i.getPassword(), i.getEmail(), i.getRole()
                });
            }
        } catch (Exception e) {
        } 
    }
        
    public TTDangNhapModel getTTDangNhapSelect() {
        int i_row = jTable_TTDangNhap.getSelectedRow();
        TTDangNhapModel ttdn = TTDangNhapDAO.getInstance().selectAll().get(i_row);
        return ttdn;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public final void initTable() {
        tblModel = new DefaultTableModel();
        String[] headerTbl = new String[]{"Mã nhân viên", "Tên đăng nhập","Mật khẩu", "Email", "Vai trò"};
        tblModel.setColumnIdentifiers(headerTbl);
        jTable_TTDangNhap.setModel(tblModel);
        jTable_TTDangNhap.getColumnModel().getColumn(0).setPreferredWidth(1);
        jTable_TTDangNhap.getColumnModel().getColumn(1).setPreferredWidth(100);
        jTable_TTDangNhap.getColumnModel().getColumn(2).setPreferredWidth(200);
        jTable_TTDangNhap.getColumnModel().getColumn(3).setPreferredWidth(50);
        jTable_TTDangNhap.getColumnModel().getColumn(4).setPreferredWidth(200);
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
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        cbxlLuaChon = new javax.swing.JComboBox<>();
        txtSearchForm = new javax.swing.JTextField();
        btnXemCTTT = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        txtRefresh = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_TTDangNhap = new javax.swing.JTable();

        jPanel2.setBackground(new java.awt.Color(230, 255, 243));

        btnSua.setBackground(new java.awt.Color(32, 178, 170));
        btnSua.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSua.setForeground(new java.awt.Color(255, 255, 255));
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconsua1.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setBackground(new java.awt.Color(32, 178, 170));
        btnXoa.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnXoa.setForeground(new java.awt.Color(255, 255, 255));
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconxoa1.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        cbxlLuaChon.setBackground(new java.awt.Color(32, 178, 170));
        cbxlLuaChon.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cbxlLuaChon.setForeground(new java.awt.Color(255, 255, 255));
        cbxlLuaChon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả", "Mã nhân viên", "Tên đăng nhập", "Vai trò" }));
        cbxlLuaChon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxlLuaChonActionPerformed(evt);
            }
        });

        txtSearchForm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchFormKeyReleased(evt);
            }
        });

        btnXemCTTT.setBackground(new java.awt.Color(32, 178, 170));
        btnXemCTTT.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnXemCTTT.setForeground(new java.awt.Color(255, 255, 255));
        btnXemCTTT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconxem.png"))); // NOI18N
        btnXemCTTT.setText("Xem chi tiết");
        btnXemCTTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemCTTTActionPerformed(evt);
            }
        });

        btnThem.setBackground(new java.awt.Color(32, 178, 170));
        btnThem.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnThem.setForeground(new java.awt.Color(255, 255, 255));
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icondaucong.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        txtRefresh.setBackground(new java.awt.Color(32, 178, 170));
        txtRefresh.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtRefresh.setForeground(new java.awt.Color(255, 255, 255));
        txtRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconlammoi2.png"))); // NOI18N
        txtRefresh.setText("Làm mới");
        txtRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(btnThem)
                .addGap(5, 5, 5)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSua)
                .addGap(4, 4, 4)
                .addComponent(btnXemCTTT)
                .addGap(77, 77, 77)
                .addComponent(cbxlLuaChon, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSearchForm, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRefresh)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxlLuaChon, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearchForm, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXemCTTT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jTable_TTDangNhap.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable_TTDangNhap);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        if (jTable_TTDangNhap.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn tài khoản muốn xoá");
        } else {
            int output = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xoá tài khoản", "Xác nhận xoá tài khoản", JOptionPane.YES_NO_OPTION);
            if (output == JOptionPane.YES_OPTION) {
                TTDangNhapDAO.getInstance().delete(getTTDangNhapSelect());
                JOptionPane.showMessageDialog(this, "Xóa thành công !");
                loadDataToTable(TTDangNhapDAO.getInstance().selectAll());
            }
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void cbxlLuaChonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxlLuaChonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxlLuaChonActionPerformed

    private void btnXemCTTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemCTTTActionPerformed
        // TODO add your handling code here:
        if (jTable_TTDangNhap.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn tài khoản !");
        } else {
            JFrame parentFrame = (JFrame) SwingUtilities.getWindowAncestor(TTDangNhap.this);
            XemCTTT dialog = new XemCTTT(this, parentFrame, true);
            dialog.setVisible(true);
        }
    }//GEN-LAST:event_btnXemCTTTActionPerformed

    private void txtRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRefreshActionPerformed
        // TODO add your handling code here:
        txtSearchForm.setText("");
        cbxlLuaChon.setSelectedIndex(0);
        loadDataToTable(TTDangNhapDAO.getInstance().selectAll());
    }//GEN-LAST:event_txtRefreshActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        JFrame parentFrame = (JFrame) SwingUtilities.getWindowAncestor(TTDangNhap.this);
        ThemTT dialog = new ThemTT(this, parentFrame, true);
        dialog.setVisible(true);
        
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        if (jTable_TTDangNhap.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn tài khoản cần sửa");
        } else {
            JFrame parentFrame = (JFrame) SwingUtilities.getWindowAncestor(TTDangNhap.this);
            SuaNCC dialog = new SuaNCC(this,parentFrame, true);
            dialog.setVisible(true);
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void txtSearchFormKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchFormKeyReleased
        // TODO add your handling code here:
        String luachon = (String) cbxlLuaChon.getSelectedItem();
        String searchContent = txtSearchForm.getText();
        ArrayList<TTDangNhapModel> result = new ArrayList<>();
        switch (luachon) {
            case "Tất cả":
                result = TimTTDangNhap.getInstance().searchTatCa(searchContent);
                break;
            case "Mã nhân viên":
                result = TimTTDangNhap.getInstance().searchMaNV(searchContent);
                break;
            case "Tên đăng nhập":
                result = TimTTDangNhap.getInstance().searchUserName(searchContent);
                break;
            case "Vai trò":
                result = TimTTDangNhap.getInstance().searchRole(searchContent);
                break;
            
        }
        loadDataToTable(result);
    }//GEN-LAST:event_txtSearchFormKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXemCTTT;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbxlLuaChon;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_TTDangNhap;
    private javax.swing.JButton txtRefresh;
    private javax.swing.JTextField txtSearchForm;
    // End of variables declaration//GEN-END:variables
}
