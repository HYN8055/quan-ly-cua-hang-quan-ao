/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.employees;


//import bean.employees.DanhMucBean;
//import controller.emplyees.ChuyenManHinhController;


import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import view.employers.BanHang;
import view.employers.HoaDonBH;

import javax.swing.JOptionPane;
import model.TTDangNhapModel;
import view.employers.BanHang;
import view.employers.DangNhap;
import view.employers.HoaDonBH;
import view.employers.SuaTTCaNhan;

import view.employers.TrangChu;

/**
 *
 * @author hyn09
 */
public class MainJFrameBH extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrameBH
     */
    
    private TTDangNhapModel currentAcc;
    
    public TTDangNhapModel getCurrentAcc() {
        return currentAcc;
    }
    
    public void setCurrentAcc(TTDangNhapModel currentAcc) {
        this.currentAcc = currentAcc;
    }
    
    private MainJFrameBH() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public MainJFrameBH(TTDangNhapModel t) {
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

        jpnBanHang.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            // Gọi phương thức hiển thị màn hình trang chủ khi jpaneltrangchu được nhấn
            super.mouseClicked(evt);
                // Xóa tất cả các thành phần hiển thị trên jpnView
            jpnView.removeAll();
            jpnView.setLayout(new BorderLayout());
            BanHang banhang = new BanHang();

            banhang.setNguoiTao(currentAcc.getMaNV());

            jpnView.add(banhang);
            jpnView.repaint();
            jpnView.revalidate();
             
        }
        @Override
        public void mousePressed(java.awt.event.MouseEvent evt) {
            jpnBanHang.setBackground(new Color(125,125,125));
            jlbBanHang.setBackground(new Color(125,125,125));
               
        }

        @Override
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            jpnBanHang.setBackground(new Color(255, 255, 255));
            jlbBanHang.setBackground(new Color(255, 255, 255));
        }

        @Override
        public void mouseExited(java.awt.event.MouseEvent evt) {
                jpnBanHang.setBackground(new Color(152,205,205));
                jlbBanHang.setBackground(new Color(152,205,205));
            
        }
    });

        jpnHoaDonBH.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            // Gọi phương thức hiển thị màn hình trang chủ khi jpaneltrangchu được nhấn
            super.mouseClicked(evt);
                // Xóa tất cả các thành phần hiển thị trên jpnView
            jpnView.removeAll();
            jpnView.setLayout(new BorderLayout());
            HoaDonBH hoadonbh = new HoaDonBH();
            jpnView.add(hoadonbh);
            jpnView.repaint();
            jpnView.revalidate();
             
        }
        @Override
        public void mousePressed(java.awt.event.MouseEvent evt) {
            jpnHoaDonBH.setBackground(new Color(125,125,125));
            jlbHoaDonBH.setBackground(new Color(125,125,125));
               
        }

        @Override
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            jpnHoaDonBH.setBackground(new Color(255, 255, 255));
            jlbHoaDonBH.setBackground(new Color(255, 255, 255));
        }

        @Override
        public void mouseExited(java.awt.event.MouseEvent evt) {
                jpnHoaDonBH.setBackground(new Color(152,205,205));
                jlbHoaDonBH.setBackground(new Color(152,205,205));
            
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

        jpnRoot = new javax.swing.JPanel();
        jpnMenu = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jpnTrangChu = new javax.swing.JPanel();
        jlbTrangChu = new javax.swing.JLabel();
        LogOut = new javax.swing.JButton();
        jpnHoaDonBH = new javax.swing.JPanel();
        jlbHoaDonBH = new javax.swing.JLabel();
        jpnBanHang = new javax.swing.JPanel();
        jlbBanHang = new javax.swing.JLabel();
        Change = new javax.swing.JButton();
        jpnView = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpnMenu.setBackground(new java.awt.Color(230, 255, 249));

        jPanel11.setBackground(new java.awt.Color(152, 205, 205));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setText("ForGStudio");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lo_go.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel7)))
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

        jpnHoaDonBH.setBackground(new java.awt.Color(255, 255, 255));

        jlbHoaDonBH.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jlbHoaDonBH.setText("HÓA ĐƠN BÁN HÀNG");

        javax.swing.GroupLayout jpnHoaDonBHLayout = new javax.swing.GroupLayout(jpnHoaDonBH);
        jpnHoaDonBH.setLayout(jpnHoaDonBHLayout);
        jpnHoaDonBHLayout.setHorizontalGroup(
            jpnHoaDonBHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnHoaDonBHLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbHoaDonBH)
                .addGap(73, 73, 73))
        );
        jpnHoaDonBHLayout.setVerticalGroup(
            jpnHoaDonBHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnHoaDonBHLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jlbHoaDonBH)
                .addContainerGap())
        );

        jpnBanHang.setBackground(new java.awt.Color(255, 255, 255));

        jlbBanHang.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jlbBanHang.setText("BÁN HÀNG");

        javax.swing.GroupLayout jpnBanHangLayout = new javax.swing.GroupLayout(jpnBanHang);
        jpnBanHang.setLayout(jpnBanHangLayout);
        jpnBanHangLayout.setHorizontalGroup(
            jpnBanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnBanHangLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jlbBanHang)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnBanHangLayout.setVerticalGroup(
            jpnBanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnBanHangLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jlbBanHang)
                .addContainerGap())
        );

        Change.setBackground(new java.awt.Color(152, 205, 205));
        Change.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Change.setForeground(new java.awt.Color(255, 255, 255));
        Change.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/doithongtin.png"))); // NOI18N
        Change.setText("ĐỔI THÔNG TIN");
        Change.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChangeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpnMenuLayout = new javax.swing.GroupLayout(jpnMenu);
        jpnMenu.setLayout(jpnMenuLayout);
        jpnMenuLayout.setHorizontalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addGroup(jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnMenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jpnBanHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jpnTrangChu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jpnHoaDonBH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jpnMenuLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Change, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LogOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 67, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpnMenuLayout.setVerticalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnBanHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnHoaDonBH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        javax.swing.GroupLayout jpnRootLayout = new javax.swing.GroupLayout(jpnRoot);
        jpnRoot.setLayout(jpnRootLayout);
        jpnRootLayout.setHorizontalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRootLayout.createSequentialGroup()
                .addComponent(jpnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnRootLayout.setVerticalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LogOutActionPerformed

    private void ChangeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChangeMouseClicked
        // TODO add your handling code here:
        SuaTTCaNhan cp = new SuaTTCaNhan(this, rootPaneCheckingEnabled, getCurrentAcc());
        cp.setVisible(true);
    }//GEN-LAST:event_ChangeMouseClicked

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
            java.util.logging.Logger.getLogger(MainJFrameBH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrameBH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrameBH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrameBH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrameBH().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Change;
    private javax.swing.JButton LogOut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JLabel jlbBanHang;
    private javax.swing.JLabel jlbHoaDonBH;
    private javax.swing.JLabel jlbTrangChu;
    private javax.swing.JPanel jpnBanHang;
    private javax.swing.JPanel jpnHoaDonBH;
    private javax.swing.JPanel jpnMenu;
    private javax.swing.JPanel jpnRoot;
    private javax.swing.JPanel jpnTrangChu;
    private javax.swing.JPanel jpnView;
    // End of variables declaration//GEN-END:variables
}
