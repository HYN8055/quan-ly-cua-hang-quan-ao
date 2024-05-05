/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view.employers;

import controller.WritePDF;
import dao.TTDangNhapDAO;
import dao.ChiTietHoaDonBanHangDAO;
import dao.ChiTietHoaDonNhapHangDAO;
import dao.SanPhamDAO;
import dao.NhaCungCapDAO;
import dao.HoaDonBanHangDAO;
import dao.HoaDonNhapHangDAO;
import dao.NhanVienDAO;
import java.sql.Date;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import model.ChiTietHoaDonModel;
import model.HoaDonModel;
import model.HoaDonBanHangModel;
import model.HoaDonNhapHangModel;

/**
 *
 * @author Tran Nhat Sinh con lon
 */
public class CTThongKe extends javax.swing.JDialog {

    /**
     * Creates new form CTPhieuDialog
     */
    private ThongKe parent;

    public CTThongKe(javax.swing.JPanel parent, javax.swing.JFrame owner, boolean modal) {
        super(owner, modal);
        this.parent = (ThongKe) parent;
        initComponents();
        setLocationRelativeTo(null);
        HoaDonModel pn = this.parent.findPhieu();
        txtMaHD.setText(pn.getMaHD());
        txtGhiChu.setText(pn.getGhiChu());
        txtNgtao.setText(NhanVienDAO.getInstance().selectById(pn.getNguoiTao()).getTenNV());
        txtTongTien.setText(this.parent.getFormatter().format(pn.getTongTien()) + "đ");
        txtTG.setText(this.parent.getFormatDate().format(pn.getThoiGianTao()));
        loadDataToTableProduct();
        setWidthTable();
    }

    public void setWidthTable() {
        tblChiTietPhieu.getColumnModel().getColumn(0).setPreferredWidth(5);
        tblChiTietPhieu.getColumnModel().getColumn(1).setPreferredWidth(10);
        tblChiTietPhieu.getColumnModel().getColumn(2).setPreferredWidth(250);
    }

    public void loadDataToTableProduct() {
        try {
            DefaultTableModel tblCTPhieumd = (DefaultTableModel) tblChiTietPhieu.getModel();
            tblCTPhieumd.setRowCount(0);
            HoaDonModel pn = this.parent.findPhieu();
            String check = pn.getMaHD();
            if (check.contains("HDBH")) {
                ArrayList<ChiTietHoaDonModel> CTPhieu = ChiTietHoaDonBanHangDAO.getInstance().selectAll(check);
                for (int i = 0; i < CTPhieu.size(); i++) {
                    tblCTPhieumd.addRow(new Object[]{
                        i + 1,
                        CTPhieu.get(i).getMaHD(),
                        SanPhamDAO.getInstance().selectById(CTPhieu.get(i).getMaMay()).getTenSP(),
                        CTPhieu.get(i).getSoLuong(),
                        parent.getFormatter().format(CTPhieu.get(i).getDonGia()) + "đ",
                        parent.getFormatter().format(CTPhieu.get(i).getDonGia() * CTPhieu.get(i).getSoLuong()) + "đ"
                    });
                }
            } else {
                ArrayList<ChiTietHoaDonModel> CTPhieu = ChiTietHoaDonNhapHangDAO.getInstance().selectAll(check);
                for (int i = 0; i < CTPhieu.size(); i++) {
                    tblCTPhieumd.addRow(new Object[]{
                        i + 1,
                        CTPhieu.get(i).getMaMay(),
                        SanPhamDAO.getInstance().selectById(CTPhieu.get(i).getMaMay()).getTenSP(),
                        CTPhieu.get(i).getSoLuong(),
                        parent.getFormatter().format(CTPhieu.get(i).getDonGia()) + "đ",
                        parent.getFormatter().format(CTPhieu.get(i).getDonGia() * CTPhieu.get(i).getSoLuong()) + "đ"
                    });
                }
            }

        } catch (Exception e) {
        }
    }

    public ArrayList<HoaDonModel> getPhieuAll() {
        ArrayList<HoaDonModel> result = new ArrayList<>();
        ArrayList<HoaDonNhapHangModel> conten1 = HoaDonNhapHangDAO.getInstance().selectAll();
        ArrayList<HoaDonBanHangModel> conten2 = HoaDonBanHangDAO.getInstance().selectAll();
        for (HoaDonNhapHangModel phieuNhap : conten1) { 
            String maPhieu = phieuNhap.getMaHD();
            Date thoiGianTao = phieuNhap.getThoiGianTao();
            String nguoiTao = phieuNhap.getNguoiTao();
            double tongTien = phieuNhap.getTongTien();
            HoaDonModel ac = new HoaDonModel(maPhieu, nguoiTao, thoiGianTao, tongTien);
            result.add(ac);
        }
        for (HoaDonBanHangModel phieuXuat : conten2) {
            String maPhieu = phieuXuat.getMaHD();
            Date thoiGianTao = phieuXuat.getThoiGianTao();
            String nguoiTao = phieuXuat.getNguoiTao();
            double tongTien = phieuXuat.getTongTien();
            HoaDonModel ac = new HoaDonModel(maPhieu, nguoiTao,  thoiGianTao, tongTien);
            result.add(ac);
        }
        return result;
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
        txtTG = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNgtao = new javax.swing.JTextField();
        jScrollPane22 = new javax.swing.JScrollPane();
        tblChiTietPhieu = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtMaHD = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTongTien = new javax.swing.JTextField();
        btnPdf = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtGhiChu = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(152, 225, 225));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("THÔNG TIN CHI TIẾT HOÁ ĐƠN");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Mã hoá đơn");

        txtTG.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        txtTG.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 255, 255), new java.awt.Color(102, 204, 255)));
        txtTG.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Thời gian tạo");

        txtNgtao.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        txtNgtao.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 255, 255), new java.awt.Color(102, 204, 255)));
        txtNgtao.setEnabled(false);

        tblChiTietPhieu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã sản phẩm", "Tên sản phẩm", "Số lượng", "Đơn giá", "Thành tiền"
            }
        ));
        jScrollPane22.setViewportView(tblChiTietPhieu);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Người tạo");

        txtMaHD.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        txtMaHD.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 255, 255), new java.awt.Color(102, 204, 255)));
        txtMaHD.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("Tổng tiền:");

        txtTongTien.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        txtTongTien.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 255, 255), new java.awt.Color(102, 204, 255)));
        txtTongTien.setEnabled(false);

        btnPdf.setBackground(new java.awt.Color(230, 255, 243));
        btnPdf.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnPdf.setForeground(new java.awt.Color(0, 179, 179));
        btnPdf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconexcel1.png"))); // NOI18N
        btnPdf.setText("Xuất PDF");
        btnPdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPdfActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setText("Ghi chú");

        txtGhiChu.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        txtGhiChu.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 255, 255), new java.awt.Color(102, 204, 255)));
        txtGhiChu.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane22, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNgtao, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(38, 38, 38)
                        .addComponent(txtMaHD, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(189, 189, 189)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtGhiChu, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTG, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPdf)
                .addGap(86, 86, 86))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaHD, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtGhiChu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNgtao, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtTG, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPdf, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(180, 180, 180))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 337, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPdfActionPerformed
        // TODO add your handling code here:
        WritePDF writepdf = new WritePDF();
        writepdf.writePhieuNhap(this.parent.findPhieu().getMaHD());
    }//GEN-LAST:event_btnPdfActionPerformed

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
            java.util.logging.Logger.getLogger(CTThongKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CTThongKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CTThongKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CTThongKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPdf;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JTable tblChiTietPhieu;
    private javax.swing.JTextField txtGhiChu;
    private javax.swing.JTextField txtMaHD;
    private javax.swing.JTextField txtNgtao;
    private javax.swing.JTextField txtTG;
    private javax.swing.JTextField txtTongTien;
    // End of variables declaration//GEN-END:variables
}
