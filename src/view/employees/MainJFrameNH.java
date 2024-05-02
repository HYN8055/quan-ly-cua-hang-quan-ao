/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.employees;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.TTDangNhapModel;
import view.employers.DangNhap;
import view.employers.HoaDonNH;
import view.employers.NhapHang;
import view.employers.SuaTTCaNhan;
import view.employers.TrangChu;

/**
 *
 * @author hyn09
 */
public class MainJFrameNH extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrameNH
     */
    private TTDangNhapModel currentAcc;
    
    public TTDangNhapModel getCurrentAcc() {
        return currentAcc;
    }
    
    public void setCurrentAcc(TTDangNhapModel currentAcc) {
        this.currentAcc = currentAcc;
    }
    
    private MainJFrameNH() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public MainJFrameNH(TTDangNhapModel t) {
        initComponents();
        setLocationRelativeTo(null);
        this.currentAcc = t;
        
         
        setTitle("QUẢN LÝ CỬA HÀNG BÁN QUẦN ÁO");
        jpnView.removeAll();
        jpnView.setLayout(new BorderLayout());
        TrangChu trangChu = new TrangChu();
        jpnView.add(trangChu);
        jpnView.repaint();
        jpnView.revalidate();
        
        jpnTrangChu.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            // Gọi phương thức hiển thị màn hình trang chủ khi jpaneltrangchu được nhấn
            super.mouseClicked(evt);
                // Xóa tất cả các thành phần hiển thị trên jpnView
            jpnView.removeAll();
            jpnView.setLayout(new BorderLayout());
            TrangChu trangChu = new TrangChu();
            jpnView.add(trangChu);
            jpnView.repaint();
            jpnView.revalidate();
             
        }
        @Override
        public void mousePressed(java.awt.event.MouseEvent evt) {
            jpnTrangChu.setBackground(new Color(125,125,125));
            jlbTrangChu.setBackground(new Color(125,125,125));
               
        }

        @Override
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            jpnTrangChu.setBackground(new Color(255, 255, 255));
            jlbTrangChu.setBackground(new Color(255, 255, 255));
        }

        @Override
        public void mouseExited(java.awt.event.MouseEvent evt) {
                jpnTrangChu.setBackground(new Color(152,205,205));
                jlbTrangChu.setBackground(new Color(152,205,205));
            
        }
    });
        
        jpnNhapHang.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            // Gọi phương thức hiển thị màn hình trang chủ khi jpaneltrangchu được nhấn
            super.mouseClicked(evt);
                // Xóa tất cả các thành phần hiển thị trên jpnView
            jpnView.removeAll();
            jpnView.setLayout(new BorderLayout());
            NhapHang nhaphang = new NhapHang();
            nhaphang.setNguoiNhapHang(currentAcc.getMaNV());
            jpnView.add(nhaphang);
            jpnView.repaint();
            jpnView.revalidate();
             
        }
        @Override
        public void mousePressed(java.awt.event.MouseEvent evt) {
            jpnNhapHang.setBackground(new Color(125,125,125));
            jlbNhapHang.setBackground(new Color(125,125,125));
               
        }

        @Override
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            jpnNhapHang.setBackground(new Color(255, 255, 255));
            jlbNhapHang.setBackground(new Color(255, 255, 255));
        }

        @Override
        public void mouseExited(java.awt.event.MouseEvent evt) {
                jpnNhapHang.setBackground(new Color(152,205,205));
                jlbNhapHang.setBackground(new Color(152,205,205));
            
        }
    });
        
        jpnHoaDonNH.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            // Gọi phương thức hiển thị màn hình trang chủ khi jpaneltrangchu được nhấn
            super.mouseClicked(evt);
                // Xóa tất cả các thành phần hiển thị trên jpnView
            jpnView.removeAll();
            jpnView.setLayout(new BorderLayout());
            HoaDonNH hoadonnh = new HoaDonNH();
            jpnView.add(hoadonnh);
            jpnView.repaint();
            jpnView.revalidate();
             
        }
        @Override
        public void mousePressed(java.awt.event.MouseEvent evt) {
            jpnHoaDonNH.setBackground(new Color(125,125,125));
            jlbHoaDonNH.setBackground(new Color(125,125,125));
               
        }

        @Override
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            jpnHoaDonNH.setBackground(new Color(255, 255, 255));
            jlbHoaDonNH.setBackground(new Color(255, 255, 255));
        }

        @Override
        public void mouseExited(java.awt.event.MouseEvent evt) {
                jpnHoaDonNH.setBackground(new Color(152,205,205));
                jlbHoaDonNH.setBackground(new Color(152,205,205));
            
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

        jpnRoot1 = new javax.swing.JPanel();
        jpnMenu1 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jpnTrangChu = new javax.swing.JPanel();
        jlbTrangChu = new javax.swing.JLabel();
        jpnHoaDonNH = new javax.swing.JPanel();
        jlbHoaDonNH = new javax.swing.JLabel();
        LogOut = new javax.swing.JButton();
        jpnNhapHang = new javax.swing.JPanel();
        jlbNhapHang = new javax.swing.JLabel();
        Change = new javax.swing.JButton();
        jpnView = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpnMenu1.setBackground(new java.awt.Color(230, 255, 249));

        jPanel12.setBackground(new java.awt.Color(152, 205, 205));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setText("ForGStudio");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lo_go.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addContainerGap(89, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel8)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jpnTrangChu.setBackground(new java.awt.Color(255, 255, 255));

        jlbTrangChu.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jlbTrangChu.setText("TRANG CHỦ");

        javax.swing.GroupLayout jpnTrangChuLayout = new javax.swing.GroupLayout(jpnTrangChu);
        jpnTrangChu.setLayout(jpnTrangChuLayout);
        jpnTrangChuLayout.setHorizontalGroup(
            jpnTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTrangChuLayout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jlbTrangChu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnTrangChuLayout.setVerticalGroup(
            jpnTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTrangChuLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jlbTrangChu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpnHoaDonNH.setBackground(new java.awt.Color(255, 255, 255));

        jlbHoaDonNH.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jlbHoaDonNH.setText(" HÓA ĐƠN NHẬP HÀNG");

        javax.swing.GroupLayout jpnHoaDonNHLayout = new javax.swing.GroupLayout(jpnHoaDonNH);
        jpnHoaDonNH.setLayout(jpnHoaDonNHLayout);
        jpnHoaDonNHLayout.setHorizontalGroup(
            jpnHoaDonNHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnHoaDonNHLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbHoaDonNH)
                .addGap(74, 74, 74))
        );
        jpnHoaDonNHLayout.setVerticalGroup(
            jpnHoaDonNHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnHoaDonNHLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jlbHoaDonNH)
                .addContainerGap())
        );

        LogOut.setBackground(new java.awt.Color(152, 205, 205));
        LogOut.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LogOut.setForeground(new java.awt.Color(255, 255, 255));
        LogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dangxuat.png"))); // NOI18N
        LogOut.setText("ĐĂNG XUẤT");
        LogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogOutMouseClicked(evt);
            }
        });
        LogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutActionPerformed(evt);
            }
        });

        jpnNhapHang.setBackground(new java.awt.Color(255, 255, 255));

        jlbNhapHang.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jlbNhapHang.setText("NHẬP HÀNG");

        javax.swing.GroupLayout jpnNhapHangLayout = new javax.swing.GroupLayout(jpnNhapHang);
        jpnNhapHang.setLayout(jpnNhapHangLayout);
        jpnNhapHangLayout.setHorizontalGroup(
            jpnNhapHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnNhapHangLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jlbNhapHang)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnNhapHangLayout.setVerticalGroup(
            jpnNhapHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnNhapHangLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jlbNhapHang)
                .addContainerGap())
        );

        Change.setBackground(new java.awt.Color(152, 205, 205));
        Change.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Change.setForeground(new java.awt.Color(255, 255, 255));
        Change.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/doithongtin.png"))); // NOI18N
        Change.setText("ĐỔI THÔNG TIN");
        Change.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnMenu1Layout = new javax.swing.GroupLayout(jpnMenu1);
        jpnMenu1.setLayout(jpnMenu1Layout);
        jpnMenu1Layout.setHorizontalGroup(
            jpnMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpnMenu1Layout.createSequentialGroup()
                .addGroup(jpnMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnMenu1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jpnMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jpnTrangChu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jpnHoaDonNH, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jpnNhapHang, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jpnMenu1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jpnMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Change, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LogOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 73, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpnMenu1Layout.setVerticalGroup(
            jpnMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMenu1Layout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnNhapHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnHoaDonNH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(345, 345, 345)
                .addComponent(Change, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpnViewLayout = new javax.swing.GroupLayout(jpnView);
        jpnView.setLayout(jpnViewLayout);
        jpnViewLayout.setHorizontalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );
        jpnViewLayout.setVerticalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpnRoot1Layout = new javax.swing.GroupLayout(jpnRoot1);
        jpnRoot1.setLayout(jpnRoot1Layout);
        jpnRoot1Layout.setHorizontalGroup(
            jpnRoot1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRoot1Layout.createSequentialGroup()
                .addComponent(jpnMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnRoot1Layout.setVerticalGroup(
            jpnRoot1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnMenu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LogOutActionPerformed

    private void ChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangeActionPerformed
        // TODO add your handling code here:
        SuaTTCaNhan cp = new SuaTTCaNhan(this, rootPaneCheckingEnabled, getCurrentAcc());
        cp.setVisible(true);
    }//GEN-LAST:event_ChangeActionPerformed

    private void LogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOutMouseClicked
        // TODO add your handling code here:
        int relly = JOptionPane.showConfirmDialog(
                null,
                "Bạn muốn thoát khỏi chương trình ?",
                "Xác nhận",
                JOptionPane.YES_NO_OPTION);
        if (relly == JOptionPane.YES_OPTION) {
            this.dispose();
            DangNhap dialog = new DangNhap(new javax.swing.JFrame(), true);
            //dialog.setVisible(true);
        }
    }//GEN-LAST:event_LogOutMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrameNH().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Change;
    private javax.swing.JButton LogOut;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JLabel jlbHoaDonNH;
    private javax.swing.JLabel jlbNhapHang;
    private javax.swing.JLabel jlbTrangChu;
    private javax.swing.JPanel jpnHoaDonNH;
    private javax.swing.JPanel jpnMenu1;
    private javax.swing.JPanel jpnNhapHang;
    private javax.swing.JPanel jpnRoot1;
    private javax.swing.JPanel jpnTrangChu;
    private javax.swing.JPanel jpnView;
    // End of variables declaration//GEN-END:variables
}
