/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.employers;

import controller.TimHDNH;
import dao.ChiTietHoaDonNhapHangDAO;
import dao.HoaDonNhapHangDAO;
import dao.NhaCungCapDAO;
import dao.NhanVienDAO;
import dao.TTDangNhapDAO;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import model.ChiTietHoaDonModel;
import model.HoaDonNhapHangModel;
import model.TTDangNhapModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author hyn09
 */
public class HoaDonNH extends javax.swing.JPanel implements ActionListener{
    private DefaultTableModel tblModel;
    DecimalFormat formatter = new DecimalFormat("###,###,###");
    SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/YYYY HH:mm");
    
    public DecimalFormat getFormatter() {
        return formatter;
    }

    public SimpleDateFormat getFormatDate() {
        return formatDate;
    }

    public HoaDonNH() {
        initComponents();
        tblPhieuNhap.setDefaultEditor(Object.class, null);
        initTable();
        loadDataToTable();
        changeTextFind();
        jDateChooserFrom.setDateFormatString("dd/MM/yyyy");
        jDateChooserTo.setDateFormatString("dd/MM/yyyy");
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public final void initTable() {
        tblModel = new DefaultTableModel();
        String[] headerTbl = new String[]{"STT", "Mã hoá đơn", "Nhà cung cấp", "Người tạo", "Thời gian tạo", "Tổng tiền", "Ghi chú"};
        tblModel.setColumnIdentifiers(headerTbl);
        tblPhieuNhap.setModel(tblModel);
        tblPhieuNhap.getColumnModel().getColumn(0).setPreferredWidth(1);
        tblPhieuNhap.getColumnModel().getColumn(1).setPreferredWidth(2);
        tblPhieuNhap.getColumnModel().getColumn(2).setPreferredWidth(00);
        tblPhieuNhap.getColumnModel().getColumn(3).setPreferredWidth(100);
    }
    
    public void loadDataToTable() {
        try {
            ArrayList<HoaDonNhapHangModel> allPhieuNhap = HoaDonNhapHangDAO.getInstance().selectAll();
            tblModel.setRowCount(0);
            for (int i = 0; i < allPhieuNhap.size(); i++) {
                tblModel.addRow(new Object[]{
                    i + 1, allPhieuNhap.get(i).getMaHD(), NhaCungCapDAO.getInstance().selectById(allPhieuNhap.get(i).getNhaCungCap()).getMaNCC(), NhanVienDAO.getInstance().selectById(allPhieuNhap.get(i).getNguoiTao()).getMaNV(), formatDate.format(allPhieuNhap.get(i).getThoiGianTao()), formatter.format(allPhieuNhap.get(i).getTongTien()) + "đ", allPhieuNhap.get(i).getGhiChu()
                });
            }
        } catch (Exception e) {
        }
    }

    private void loadDataToTableSearch(ArrayList<HoaDonNhapHangModel> result) {
        try {

            tblModel.setRowCount(0);
            for (int i = 0; i < result.size(); i++) {
                tblModel.addRow(new Object[]{
                    i + 1, result.get(i).getMaHD(), NhaCungCapDAO.getInstance().selectById(result.get(i).getNhaCungCap()).getMaNCC(), NhanVienDAO.getInstance().selectById(result.get(i).getNguoiTao()).getMaNV(), formatDate.format(result.get(i).getThoiGianTao()), formatter.format(result.get(i).getTongTien()) + "đ", result.get(i).getGhiChu()
                });
            }
        } catch (Exception e) {
        }
    }
    
    public void changeTextFind() {
        jTextFieldSearch.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {

            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                /* do nothing */
                if (jTextFieldSearch.getText().length() == 0) {
                    loadDataToTable();
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });
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
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jComboBoxLuaChon = new javax.swing.JComboBox<>();
        jTextFieldSearch = new javax.swing.JTextField();
        btnDetail = new javax.swing.JButton();
        btnExportExcel = new javax.swing.JButton();
        btnSua1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        giaTu = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        giaDen = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jDateChooserFrom = new com.toedter.calendar.JDateChooser();
        jDateChooserTo = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPhieuNhap = new javax.swing.JTable();

        jPanel2.setBackground(new java.awt.Color(230, 255, 243));

        btnEdit.setBackground(new java.awt.Color(32, 178, 170));
        btnEdit.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconsua1.png"))); // NOI18N
        btnEdit.setText("Sửa");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(32, 178, 170));
        btnDelete.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconxoa1.png"))); // NOI18N
        btnDelete.setText("Xóa");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jComboBoxLuaChon.setBackground(new java.awt.Color(32, 178, 170));
        jComboBoxLuaChon.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jComboBoxLuaChon.setForeground(new java.awt.Color(255, 255, 255));
        jComboBoxLuaChon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả", "Mã hoá đơn", "Người tạo", "Nhà cung cấp" }));
        jComboBoxLuaChon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxLuaChonActionPerformed(evt);
            }
        });

        jTextFieldSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldSearchKeyReleased(evt);
            }
        });

        btnDetail.setBackground(new java.awt.Color(32, 178, 170));
        btnDetail.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnDetail.setForeground(new java.awt.Color(255, 255, 255));
        btnDetail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconxem.png"))); // NOI18N
        btnDetail.setText("Xem chi tiết");
        btnDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetailActionPerformed(evt);
            }
        });

        btnExportExcel.setBackground(new java.awt.Color(32, 178, 170));
        btnExportExcel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnExportExcel.setForeground(new java.awt.Color(255, 255, 255));
        btnExportExcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconexcel1.png"))); // NOI18N
        btnExportExcel.setText("Xuất file Excel");
        btnExportExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportExcelActionPerformed(evt);
            }
        });

        btnSua1.setBackground(new java.awt.Color(32, 178, 170));
        btnSua1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSua1.setForeground(new java.awt.Color(255, 255, 255));
        btnSua1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconlammoi2.png"))); // NOI18N
        btnSua1.setText("Làm mới");
        btnSua1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSua1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(32, 178, 170));
        jLabel3.setText("Lọc theo ngày:");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(32, 178, 170));
        jLabel2.setText("Từ:");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(32, 178, 170));
        jLabel1.setText("Đến:");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(32, 178, 170));
        jLabel5.setText("Từ:");

        giaTu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                giaTuKeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(32, 178, 170));
        jLabel6.setText("Đến:");

        giaDen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                giaDenKeyReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(32, 178, 170));
        jLabel7.setText("Lọc theo giá:");

        jDateChooserFrom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jDateChooserFromKeyReleased(evt);
            }
        });

        jDateChooserTo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jDateChooserToKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jDateChooserFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jDateChooserTo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExportExcel)))
                .addGap(91, 91, 91)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(giaTu, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(giaDen, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jComboBoxLuaChon, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSua1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxLuaChon, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSua1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExportExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addGap(13, 13, 13)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(giaTu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(giaDen, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooserTo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooserFrom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel2)))))
                .addGap(19, 19, 19))
        );

        tblPhieuNhap.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblPhieuNhap);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        if (tblPhieuNhap.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn hoá đơn nhập cần xoá");
        } else {
            deletePhieuNhap(getHDNhapSelect());
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    public void deletePhieuNhap(HoaDonNhapHangModel pn) {
        int result = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xoá " + pn.getMaHD(), "Xác nhận xoá hoá đơn nhập", JOptionPane.YES_NO_OPTION);
        if (result == JOptionPane.YES_OPTION) {
            ArrayList<ChiTietHoaDonModel> ctHDNhap = ChiTietHoaDonNhapHangDAO.getInstance().selectAll(pn.getMaHD());
            for (ChiTietHoaDonModel i : ctHDNhap) {
                ChiTietHoaDonNhapHangDAO.getInstance().delete(i);
            }
            HoaDonNhapHangDAO.getInstance().delete(pn);
            JOptionPane.showMessageDialog(this, "Đã xoá thành công hoá đơn " + pn.getMaHD());
            loadDataToTable();
        }
    }
    
    public HoaDonNhapHangModel getHDNhapSelect() {
        int i_row = tblPhieuNhap.getSelectedRow();
        HoaDonNhapHangModel pn = HoaDonNhapHangDAO.getInstance().selectById(tblModel.getValueAt(i_row, 1).toString());
        return pn;
    }
    
    private void jComboBoxLuaChonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxLuaChonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxLuaChonActionPerformed

    private void btnDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetailActionPerformed
        // TODO add your handling code here:
        if (tblPhieuNhap.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn phiếu !");
        } else {
            XemCTPN a = new XemCTPN(this, (JFrame) javax.swing.SwingUtilities.getWindowAncestor(this), true);
            a.setVisible(true);
        }
    }//GEN-LAST:event_btnDetailActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
//        // TODO add your handling code here:
        if (tblPhieuNhap.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn phiếu cần sửa");
        } else {
            try {
                SuaPN a = new SuaPN(this, (JFrame) javax.swing.SwingUtilities.getWindowAncestor(this), true);
                a.setVisible(true);
            } catch (UnsupportedLookAndFeelException ex) {
                Logger.getLogger(HoaDonNH.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnExportExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportExcelActionPerformed
        // TODO add your handling code here:
        try {
            JFileChooser jFileChooser = new JFileChooser();
            jFileChooser.showSaveDialog(this);
            File saveFile = jFileChooser.getSelectedFile();
            if (saveFile != null) {
                saveFile = new File(saveFile.toString() + ".xlsx");
                Workbook wb = new XSSFWorkbook();
                Sheet sheet = wb.createSheet("Account");

                Row rowCol = sheet.createRow(0);
                for (int i = 0; i < tblPhieuNhap.getColumnCount(); i++) {
                    Cell cell = rowCol.createCell(i);
                    cell.setCellValue(tblPhieuNhap.getColumnName(i));
                }
                for (int j = 0; j < tblPhieuNhap.getRowCount(); j++) {
                    Row row = sheet.createRow(j + 1);
                    for (int k = 0; k < tblPhieuNhap.getColumnCount(); k++) {
                        Cell cell = row.createCell(k);
                        if (tblPhieuNhap.getValueAt(j, k) != null) {
                            cell.setCellValue(tblPhieuNhap.getValueAt(j, k).toString());
                        }
                    }
                }
                FileOutputStream out = new FileOutputStream(new File(saveFile.toString()));
                wb.write(out);
                wb.close();
                out.close();
                openFile(saveFile.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnExportExcelActionPerformed

    private void btnSua1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSua1ActionPerformed
        // TODO add your handling code here:
        loadDataToTable();
        jComboBoxLuaChon.setSelectedIndex(0);
        jTextFieldSearch.setText("");
        jDateChooserFrom.setCalendar(null);
        jDateChooserTo.setCalendar(null);
        giaDen.setText("");
        giaTu.setText("");
    }//GEN-LAST:event_btnSua1ActionPerformed

    private void jTextFieldSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSearchKeyReleased
        // TODO add your handling code here:
        searchAllRepect();
    }//GEN-LAST:event_jTextFieldSearchKeyReleased

    private void jDateChooserToKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDateChooserToKeyReleased
        // TODO add your handling code here:
        searchAllRepect();
    }//GEN-LAST:event_jDateChooserToKeyReleased

    private void jDateChooserFromKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDateChooserFromKeyReleased
        // TODO add your handling code here:
        searchAllRepect();
    }//GEN-LAST:event_jDateChooserFromKeyReleased

    private void giaTuKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_giaTuKeyReleased
        // TODO add your handling code here:
        searchAllRepect();
    }//GEN-LAST:event_giaTuKeyReleased

    private void giaDenKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_giaDenKeyReleased
        // TODO add your handling code here:
        searchAllRepect();
    }//GEN-LAST:event_giaDenKeyReleased

    private void openFile(String file) {
        try {
            File path = new File(file);
            Desktop.getDesktop().open(path);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public HoaDonNhapHangModel getPhieuNhapSelect() {
        int i_row = tblPhieuNhap.getSelectedRow();
        HoaDonNhapHangModel pn = HoaDonNhapHangDAO.getInstance().selectById(tblModel.getValueAt(i_row, 1).toString());
        return pn;
    }

    public boolean checkDate(Date dateTest, Date star, Date end) {
        return dateTest.getTime() >= star.getTime() && dateTest.getTime() <= end.getTime();
    }

    public ArrayList<HoaDonNhapHangModel> searchDate() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        ArrayList<HoaDonNhapHangModel> result = new ArrayList<HoaDonNhapHangModel>();
        Date from = jDateChooserFrom.getDate();
        Date to = jDateChooserTo.getDate();
        ArrayList<HoaDonNhapHangModel> armt = HoaDonNhapHangDAO.getInstance().selectAll();
        for (var phieu : armt) {
            System.out.println("From:" + from + " " + from.getTime());
            System.out.println("To: " + to + " " + to.getTime());
            System.out.println("Current: " + phieu.getThoiGianTao() + " " + phieu.getThoiGianTao().getTime());
            System.out.println("Check: " + checkDate(phieu.getThoiGianTao(), from, to));
            if (checkDate(phieu.getThoiGianTao(), from, to)) {
                result.add(phieu);
            }

        }
        return result;
    }

    public void searchAllRepect() {
        String luaChon = jComboBoxLuaChon.getSelectedItem().toString();
        String content = jTextFieldSearch.getText();
        ArrayList<HoaDonNhapHangModel> result = null;
        if (content.length() > 0) {
            result = new ArrayList<>();
            switch (luaChon) {
                case "Tất cả":
                    result = TimHDNH.getInstance().searchTatCa(content);
                    break;
                case "Mã hoá đơn":
                    result = TimHDNH.getInstance().searchMaPhieuNhap(content);
                    break;
                case "Nhà cung cấp":
                    result = TimHDNH.getInstance().searchNhaCungCap(content);
                    break;
                case "Người tạo":
                    result = TimHDNH.getInstance().searchNguoiTao(content);
                    break;
            }
        } else if (content.length() == 0) {
            result = HoaDonNhapHangDAO.getInstance().selectAll();
        }
        Iterator<HoaDonNhapHangModel> itr = result.iterator();
        if (jDateChooserFrom.getDate() != null || jDateChooserTo.getDate() != null) {
            Date from;
            Date to;
            if (jDateChooserFrom.getDate() != null && jDateChooserTo.getDate() == null) {
                try {
                    from = ChangeFrom(jDateChooserFrom.getDate());
                    to = ChangeTo(new Date());
                    while (itr.hasNext()) {
                        HoaDonNhapHangModel phieu = itr.next();
                        if (!checkDate(phieu.getThoiGianTao(), from, to)) {
                            itr.remove();
                        }
                    }
                } catch (ParseException ex) {
                    Logger.getLogger(HoaDonNH.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (jDateChooserTo.getDate() != null && jDateChooserFrom.getDate() == null) {
                try {
                    String sDate1 = "01/01/2002";
                    from = ChangeFrom(new SimpleDateFormat("dd/MM/yyyy").parse(sDate1));
                    to = ChangeTo(jDateChooserTo.getDate());
                    while (itr.hasNext()) {
                        HoaDonNhapHangModel phieu = itr.next();
                        if (!checkDate(phieu.getThoiGianTao(), from, to)) {
                            itr.remove();
                        }
                    }
                } catch (ParseException ex) {
                    Logger.getLogger(HoaDonNH.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                try {
                    from = ChangeFrom(jDateChooserFrom.getDate());
                    to = ChangeTo(jDateChooserTo.getDate());
                    if (from.getTime() > to.getTime()) {
                        JOptionPane.showMessageDialog(this, "Thời gian không hợp lệ !", "Cảnh báo", JOptionPane.WARNING_MESSAGE);
                        jDateChooserFrom.setCalendar(null);
                        jDateChooserTo.setCalendar(null);
                    } else {
                        while (itr.hasNext()) {
                            HoaDonNhapHangModel phieu = itr.next();
                            if (!checkDate(phieu.getThoiGianTao(), from, to)) {
                                itr.remove();
                            }
                        }
                    }
                } catch (ParseException ex) {
                    Logger.getLogger(HoaDonNH.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        ArrayList<HoaDonNhapHangModel> result1 = new ArrayList<>();
        if (giaTu.getText().length() > 0 || giaDen.getText().length() > 0) {
            double a;
            double b;
            if (giaTu.getText().length() > 0 && giaDen.getText().length() == 0) {
                a = Double.parseDouble(giaTu.getText());
                for (int i = 0; i < result.size(); i++) {
                    if (result.get(i).getTongTien() >= a) {
                        result1.add(result.get(i));
                    }
                }
            } else if (giaTu.getText().length() == 0 && giaDen.getText().length() > 0) {;
                b = Double.parseDouble(giaDen.getText());
                for (int i = 0; i < result.size(); i++) {
                    if (result.get(i).getTongTien() <= b) {
                        result1.add(result.get(i));
                    }
                }
            } else if (giaTu.getText().length() > 0 && giaDen.getText().length() > 0) {
                a = Double.parseDouble(giaTu.getText());
                b = Double.parseDouble(giaDen.getText());
                for (int i = 0; i < result.size(); i++) {
                    if (result.get(i).getTongTien() >= a && result.get(i).getTongTien() <= b) {
                        result1.add(result.get(i));
                    }
                }
            }
        }
        if (giaTu.getText().length() > 0 || giaDen.getText().length() > 0) {
            loadDataToTableSearch(result1);
        } else {
            loadDataToTableSearch(result);
        }
    }

    public Date ChangeFrom(Date date) throws ParseException {
        SimpleDateFormat fm = new SimpleDateFormat("dd-MM-yyyy 00:00:00");
        String dateText = fm.format(date);
        SimpleDateFormat par = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
        Date result = par.parse(dateText);
        return result;
    }

    public Date ChangeTo(Date date) throws ParseException {
        SimpleDateFormat fm = new SimpleDateFormat("dd-MM-yyyy 23:59:59");
        String dateText = fm.format(date);
        SimpleDateFormat par = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
        Date result = par.parse(dateText);
        return result;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDetail;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnExportExcel;
    private javax.swing.JButton btnSua1;
    private javax.swing.JTextField giaDen;
    private javax.swing.JTextField giaTu;
    private javax.swing.JComboBox<String> jComboBoxLuaChon;
    private com.toedter.calendar.JDateChooser jDateChooserFrom;
    private com.toedter.calendar.JDateChooser jDateChooserTo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldSearch;
    private javax.swing.JTable tblPhieuNhap;
    // End of variables declaration//GEN-END:variables
}

