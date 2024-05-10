package view.employers;
import java.util.*;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.TTDangNhapModel;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author hyn09
 */
public class MainJFrame extends javax.swing.JFrame {

    private TTDangNhapModel currentAcc;
    public JPanel selectedPanel; 
    
    public TTDangNhapModel getCurrentAcc() {
        return currentAcc;
    }
    
    public void setCurrentAcc(TTDangNhapModel currentAcc) {
        this.currentAcc = currentAcc;
    }
    
    private MainJFrame() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public MainJFrame(TTDangNhapModel t) {
        initComponents();
        setLocationRelativeTo(null);
        this.currentAcc = t;
        
        setTitle("QUẢN LÝ CỬA HÀNG BÁN QUẦN ÁO");
        jpnView.removeAll();
        jpnView.setLayout(new BorderLayout());
        TrangChu trangChu = new TrangChu();
        jpnView.add(trangChu);
        jpnTrangChu.setBackground(new Color(255,255,255));
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
            jpnTrangChu.setBackground(new Color(255,255,255));
            jpnSanPham.setBackground(new Color(152,205,205));
            jpnNhaCungCap.setBackground(new Color(152,205,205));
            jpnBanHang.setBackground(new Color(152,205,205));
            jpnNhapHang.setBackground(new Color(152,205,205));
            jpnHoaDonBH.setBackground(new Color(152,205,205));
            jpnHoaDonNH.setBackground(new Color(152,205,205));
            jpnNhanVien.setBackground(new Color(152,205,205));
            jpnTaiKhoan.setBackground(new Color(152,205,205));
            jpnThongKe.setBackground(new Color(152,205,205));
               
        }
    });
        jpnSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            // Gọi phương thức hiển thị màn hình trang chủ khi jpaneltrangchu được nhấn
            super.mouseClicked(evt);
                // Xóa tất cả các thành phần hiển thị trên jpnView
            jpnView.removeAll();
            jpnView.setLayout(new BorderLayout());
            SanPham sanpham = new SanPham();
            jpnView.add(sanpham);
            jpnView.repaint();
            jpnView.revalidate();
        }
        @Override
        public void mousePressed(java.awt.event.MouseEvent evt) {
            jpnTrangChu.setBackground(new Color(152,205,205));
            jpnSanPham.setBackground(new Color(255,255,255));
            jpnNhaCungCap.setBackground(new Color(152,205,205));
            jpnBanHang.setBackground(new Color(152,205,205));
            jpnNhapHang.setBackground(new Color(152,205,205));
            jpnHoaDonBH.setBackground(new Color(152,205,205));
            jpnHoaDonNH.setBackground(new Color(152,205,205));
            jpnNhanVien.setBackground(new Color(152,205,205));
            jpnTaiKhoan.setBackground(new Color(152,205,205));
            jpnThongKe.setBackground(new Color(152,205,205));
            
               
        }
    });
        jpnNhaCungCap.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            // Gọi phương thức hiển thị màn hình trang chủ khi jpaneltrangchu được nhấn
            super.mouseClicked(evt);
                // Xóa tất cả các thành phần hiển thị trên jpnView
            jpnView.removeAll();
            jpnView.setLayout(new BorderLayout());
            NhaCungCap nhacungcap = new NhaCungCap();
            jpnView.add(nhacungcap);
            jpnView.repaint();
            jpnView.revalidate();
             
        }
        @Override
        public void mousePressed(java.awt.event.MouseEvent evt) {
            jpnTrangChu.setBackground(new Color(152,205,205));
            jpnSanPham.setBackground(new Color(152,205,205));
            jpnNhaCungCap.setBackground(new Color(255,255,255));
            jpnBanHang.setBackground(new Color(152,205,205));
            jpnNhapHang.setBackground(new Color(152,205,205));
            jpnHoaDonBH.setBackground(new Color(152,205,205));
            jpnHoaDonNH.setBackground(new Color(152,205,205));
            jpnNhanVien.setBackground(new Color(152,205,205));
            jpnTaiKhoan.setBackground(new Color(152,205,205));
            jpnThongKe.setBackground(new Color(152,205,205));
               
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
            jpnView.add(banhang);
            banhang.setNguoiTao(currentAcc.getMaNV());
            jpnView.repaint();
            jpnView.revalidate();
             
        }
        @Override
        public void mousePressed(java.awt.event.MouseEvent evt) {
            jpnTrangChu.setBackground(new Color(152,205,205));
            jpnSanPham.setBackground(new Color(152,205,205));
            jpnNhaCungCap.setBackground(new Color(152,205,205));
            jpnBanHang.setBackground(new Color(255,255,255));
            jpnNhapHang.setBackground(new Color(152,205,205));
            jpnHoaDonBH.setBackground(new Color(152,205,205));
            jpnHoaDonNH.setBackground(new Color(152,205,205));
            jpnNhanVien.setBackground(new Color(152,205,205));
            jpnTaiKhoan.setBackground(new Color(152,205,205));
            jpnThongKe.setBackground(new Color(152,205,205));
               
        }

//       
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
            jpnView.add(nhaphang);
            nhaphang.setNguoiNhapHang(currentAcc.getMaNV());
            jpnView.repaint();
            jpnView.revalidate();
             
        }
        @Override
        public void mousePressed(java.awt.event.MouseEvent evt) {
            jpnTrangChu.setBackground(new Color(152,205,205));
            jpnSanPham.setBackground(new Color(152,205,205));
            jpnNhaCungCap.setBackground(new Color(152,205,205));
            jpnBanHang.setBackground(new Color(152,205,205));
            jpnNhapHang.setBackground(new Color(255,255,255));
            jpnHoaDonBH.setBackground(new Color(152,205,205));
            jpnHoaDonNH.setBackground(new Color(152,205,205));
            jpnNhanVien.setBackground(new Color(152,205,205));
            jpnTaiKhoan.setBackground(new Color(152,205,205));
            jpnThongKe.setBackground(new Color(152,205,205));
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
            jpnTrangChu.setBackground(new Color(152,205,205));
            jpnSanPham.setBackground(new Color(152,205,205));
            jpnNhaCungCap.setBackground(new Color(152,205,205));
            jpnBanHang.setBackground(new Color(152,205,205));
            jpnNhapHang.setBackground(new Color(152,205,205));
            jpnHoaDonBH.setBackground(new Color(255,255,255));
            jpnHoaDonNH.setBackground(new Color(152,205,205));
            jpnNhanVien.setBackground(new Color(152,205,205));
            jpnTaiKhoan.setBackground(new Color(152,205,205));
            jpnThongKe.setBackground(new Color(152,205,205));
               
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
            jpnTrangChu.setBackground(new Color(152,205,205));
            jpnSanPham.setBackground(new Color(152,205,205));
            jpnNhaCungCap.setBackground(new Color(152,205,205));
            jpnBanHang.setBackground(new Color(152,205,205));
            jpnNhapHang.setBackground(new Color(152,205,205));
            jpnHoaDonBH.setBackground(new Color(152,205,205));
            jpnHoaDonNH.setBackground(new Color(255,255,255));
            jpnNhanVien.setBackground(new Color(152,205,205));
            jpnTaiKhoan.setBackground(new Color(152,205,205));
            jpnThongKe.setBackground(new Color(152,205,205));
               
        }

    });
        jpnNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            // Gọi phương thức hiển thị màn hình trang chủ khi jpaneltrangchu được nhấn
            super.mouseClicked(evt);
                // Xóa tất cả các thành phần hiển thị trên jpnView
            jpnView.removeAll();
            jpnView.setLayout(new BorderLayout());
            NhanVien nhanvien = new NhanVien();
            jpnView.add(nhanvien);
            jpnView.repaint();
            jpnView.revalidate();
             
        }
        @Override
        public void mousePressed(java.awt.event.MouseEvent evt) {
            jpnTrangChu.setBackground(new Color(152,205,205));
            jpnSanPham.setBackground(new Color(152,205,205));
            jpnNhaCungCap.setBackground(new Color(152,205,205));
            jpnBanHang.setBackground(new Color(152,205,205));
            jpnNhapHang.setBackground(new Color(152,205,205));
            jpnHoaDonBH.setBackground(new Color(152,205,205));
            jpnHoaDonNH.setBackground(new Color(152,205,205));
            jpnNhanVien.setBackground(new Color(255,255,255));
            jpnTaiKhoan.setBackground(new Color(152,205,205));
            jpnThongKe.setBackground(new Color(152,205,205));
               
        }

    });
        jpnTaiKhoan.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            // Gọi phương thức hiển thị màn hình trang chủ khi jpaneltrangchu được nhấn
            super.mouseClicked(evt);
                // Xóa tất cả các thành phần hiển thị trên jpnView
            jpnView.removeAll();
            jpnView.setLayout(new BorderLayout());
            TTDangNhap ttdangnhap = new TTDangNhap();
            jpnView.add(ttdangnhap);
            jpnView.repaint();
            jpnView.revalidate();
             
        }
        @Override
        public void mousePressed(java.awt.event.MouseEvent evt) {
            jpnTrangChu.setBackground(new Color(152,205,205));
            jpnSanPham.setBackground(new Color(152,205,205));
            jpnNhaCungCap.setBackground(new Color(152,205,205));
            jpnBanHang.setBackground(new Color(152,205,205));
            jpnNhapHang.setBackground(new Color(152,205,205));
            jpnHoaDonBH.setBackground(new Color(152,205,205));
            jpnHoaDonNH.setBackground(new Color(152,205,205));
            jpnNhanVien.setBackground(new Color(152,205,205));
            jpnTaiKhoan.setBackground(new Color(255,255,255));
            jpnThongKe.setBackground(new Color(152,205,205));
               
        }

//       
    });
        jpnThongKe.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            // Gọi phương thức hiển thị màn hình trang chủ khi jpaneltrangchu được nhấn
            super.mouseClicked(evt);
                // Xóa tất cả các thành phần hiển thị trên jpnView
            jpnView.removeAll();
            jpnView.setLayout(new BorderLayout());
            ThongKe thongke = new ThongKe();
            jpnView.add(thongke);
            jpnThongKe.setBackground(new Color(152,205,205));
            jpnView.repaint();
            jpnView.revalidate();
             
        }
        @Override
        public void mousePressed(java.awt.event.MouseEvent evt) {
            jpnTrangChu.setBackground(new Color(152,205,205));
            jpnSanPham.setBackground(new Color(152,205,205));
            jpnNhaCungCap.setBackground(new Color(152,205,205));
            jpnBanHang.setBackground(new Color(152,205,205));
            jpnNhapHang.setBackground(new Color(152,205,205));
            jpnHoaDonBH.setBackground(new Color(152,205,205));
            jpnHoaDonNH.setBackground(new Color(152,205,205));
            jpnNhanVien.setBackground(new Color(152,205,205));
            jpnTaiKhoan.setBackground(new Color(152,205,205));
            jpnThongKe.setBackground(new Color(255,255,255));
               
        }
//
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

        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jpnRoot = new javax.swing.JPanel();
        jpnMenu = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jpnTrangChu = new javax.swing.JPanel();
        jlbTrangChu = new javax.swing.JLabel();
        jpnSanPham = new javax.swing.JPanel();
        jlbSanPham = new javax.swing.JLabel();
        jpnNhaCungCap = new javax.swing.JPanel();
        jlbNhaCungCap = new javax.swing.JLabel();
        jpnThongKe = new javax.swing.JPanel();
        jlbThongKe = new javax.swing.JLabel();
        jpnHoaDonNH = new javax.swing.JPanel();
        jlbHoaDonNH = new javax.swing.JLabel();
        jpnHoaDonBH = new javax.swing.JPanel();
        jlbHoaDonBH = new javax.swing.JLabel();
        jpnNhapHang = new javax.swing.JPanel();
        jlbNhapHang = new javax.swing.JLabel();
        jpnNhanVien = new javax.swing.JPanel();
        jlbNhanVien = new javax.swing.JLabel();
        jpnTaiKhoan = new javax.swing.JPanel();
        jlbTaiKhoan = new javax.swing.JLabel();
        jpnBanHang = new javax.swing.JPanel();
        jlbBanHang = new javax.swing.JLabel();
        Change = new javax.swing.JButton();
        LogOut = new javax.swing.JButton();
        jpnView = new javax.swing.JPanel();

        jPanel6.setBackground(new java.awt.Color(152, 205, 205));
        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("HÓA ĐƠN");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(26, 26, 26))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(152, 205, 205));

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
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel7)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jpnTrangChu.setBackground(new java.awt.Color(152, 205, 205));
        

        jlbTrangChu.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jlbTrangChu.setText("TRANG CHỦ");

        javax.swing.GroupLayout jpnTrangChuLayout = new javax.swing.GroupLayout(jpnTrangChu);
        jpnTrangChu.setLayout(jpnTrangChuLayout);
        jpnTrangChuLayout.setHorizontalGroup(
            jpnTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTrangChuLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jlbTrangChu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnTrangChuLayout.setVerticalGroup(
            jpnTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnTrangChuLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jlbTrangChu)
                .addContainerGap())
        );

        jpnSanPham.setBackground(new java.awt.Color(152, 205, 205));

        jlbSanPham.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jlbSanPham.setText("SẢN PHẨM");

        javax.swing.GroupLayout jpnSanPhamLayout = new javax.swing.GroupLayout(jpnSanPham);
        jpnSanPham.setLayout(jpnSanPhamLayout);
        jpnSanPhamLayout.setHorizontalGroup(
            jpnSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnSanPhamLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jlbSanPham)
                .addContainerGap(106, Short.MAX_VALUE))
        );
        jpnSanPhamLayout.setVerticalGroup(
            jpnSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnSanPhamLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jlbSanPham)
                .addContainerGap())
        );

        jpnNhaCungCap.setBackground(new java.awt.Color(152, 205, 205));

        jlbNhaCungCap.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jlbNhaCungCap.setText("NHÀ CUNG CẤP");

        javax.swing.GroupLayout jpnNhaCungCapLayout = new javax.swing.GroupLayout(jpnNhaCungCap);
        jpnNhaCungCap.setLayout(jpnNhaCungCapLayout);
        jpnNhaCungCapLayout.setHorizontalGroup(
            jpnNhaCungCapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnNhaCungCapLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jlbNhaCungCap)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnNhaCungCapLayout.setVerticalGroup(
            jpnNhaCungCapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnNhaCungCapLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jlbNhaCungCap)
                .addContainerGap())
        );

        jpnThongKe.setBackground(new java.awt.Color(152, 205, 205));

        jlbThongKe.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jlbThongKe.setText("THỐNG KÊ");

        javax.swing.GroupLayout jpnThongKeLayout = new javax.swing.GroupLayout(jpnThongKe);
        jpnThongKe.setLayout(jpnThongKeLayout);
        jpnThongKeLayout.setHorizontalGroup(
            jpnThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnThongKeLayout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jlbThongKe)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpnThongKeLayout.setVerticalGroup(
            jpnThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnThongKeLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jlbThongKe)
                .addContainerGap())
        );

        jpnHoaDonNH.setBackground(new java.awt.Color(152, 205, 205));

        jlbHoaDonNH.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jlbHoaDonNH.setText(" HÓA ĐƠN NHẬP HÀNG");

        javax.swing.GroupLayout jpnHoaDonNHLayout = new javax.swing.GroupLayout(jpnHoaDonNH);
        jpnHoaDonNH.setLayout(jpnHoaDonNHLayout);
        jpnHoaDonNHLayout.setHorizontalGroup(
            jpnHoaDonNHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnHoaDonNHLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jlbHoaDonNH)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnHoaDonNHLayout.setVerticalGroup(
            jpnHoaDonNHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnHoaDonNHLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jlbHoaDonNH)
                .addContainerGap())
        );

        jpnHoaDonBH.setBackground(new java.awt.Color(152, 205, 205));

        jlbHoaDonBH.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jlbHoaDonBH.setText("HÓA ĐƠN BÁN HÀNG");

        javax.swing.GroupLayout jpnHoaDonBHLayout = new javax.swing.GroupLayout(jpnHoaDonBH);
        jpnHoaDonBH.setLayout(jpnHoaDonBHLayout);
        jpnHoaDonBHLayout.setHorizontalGroup(
            jpnHoaDonBHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnHoaDonBHLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jlbHoaDonBH)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnHoaDonBHLayout.setVerticalGroup(
            jpnHoaDonBHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnHoaDonBHLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jlbHoaDonBH)
                .addContainerGap())
        );

        jpnNhapHang.setBackground(new java.awt.Color(152, 205, 205));

        jlbNhapHang.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jlbNhapHang.setText("NHẬP HÀNG");

        javax.swing.GroupLayout jpnNhapHangLayout = new javax.swing.GroupLayout(jpnNhapHang);
        jpnNhapHang.setLayout(jpnNhapHangLayout);
        jpnNhapHangLayout.setHorizontalGroup(
            jpnNhapHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnNhapHangLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jlbNhapHang)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnNhapHangLayout.setVerticalGroup(
            jpnNhapHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnNhapHangLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jlbNhapHang)
                .addContainerGap())
        );

        jpnNhanVien.setBackground(new java.awt.Color(152, 205, 205));

        jlbNhanVien.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jlbNhanVien.setText("NHÂN VIÊN");

        javax.swing.GroupLayout jpnNhanVienLayout = new javax.swing.GroupLayout(jpnNhanVien);
        jpnNhanVien.setLayout(jpnNhanVienLayout);
        jpnNhanVienLayout.setHorizontalGroup(
            jpnNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnNhanVienLayout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jlbNhanVien)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnNhanVienLayout.setVerticalGroup(
            jpnNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnNhanVienLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jlbNhanVien)
                .addContainerGap())
        );

        jpnTaiKhoan.setBackground(new java.awt.Color(152, 205, 205));

        jlbTaiKhoan.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jlbTaiKhoan.setText("TÀI KHOẢN");

        javax.swing.GroupLayout jpnTaiKhoanLayout = new javax.swing.GroupLayout(jpnTaiKhoan);
        jpnTaiKhoan.setLayout(jpnTaiKhoanLayout);
        jpnTaiKhoanLayout.setHorizontalGroup(
            jpnTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTaiKhoanLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jlbTaiKhoan)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnTaiKhoanLayout.setVerticalGroup(
            jpnTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTaiKhoanLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jlbTaiKhoan)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpnBanHang.setBackground(new java.awt.Color(152, 205, 205));
        jlbBanHang.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jlbBanHang.setText("BÁN HÀNG");

        javax.swing.GroupLayout jpnBanHangLayout = new javax.swing.GroupLayout(jpnBanHang);
        jpnBanHang.setLayout(jpnBanHangLayout);
        jpnBanHangLayout.setHorizontalGroup(
            jpnBanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnBanHangLayout.createSequentialGroup()
                .addGap(110, 110, 110)
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
        Change.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangeActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jpnMenuLayout = new javax.swing.GroupLayout(jpnMenu);
        jpnMenu.setLayout(jpnMenuLayout);
        jpnMenuLayout.setHorizontalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addGroup(jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnMenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jpnBanHang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jpnTrangChu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jpnThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jpnNhaCungCap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jpnHoaDonNH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jpnHoaDonBH, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jpnNhapHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jpnNhanVien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jpnTaiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jpnMenuLayout.createSequentialGroup()
                                .addComponent(jpnSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jpnMenuLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Change, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LogOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpnMenuLayout.setVerticalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnBanHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnNhapHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnHoaDonBH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnHoaDonNH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Change, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout jpnViewLayout = new javax.swing.GroupLayout(jpnView);
        jpnView.setLayout(jpnViewLayout);
        jpnViewLayout.setHorizontalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 524, Short.MAX_VALUE)
        );
        jpnViewLayout.setVerticalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 642, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpnRootLayout = new javax.swing.GroupLayout(jpnRoot);
        jpnRoot.setLayout(jpnRootLayout);
        jpnRootLayout.setHorizontalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRootLayout.createSequentialGroup()
                .addComponent(jpnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpnView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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

    private void LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LogOutActionPerformed

    private void ChangeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChangeMouseClicked
        // TODO add your handling code here:
        //SuaTTCaNhan cp = new SuaTTCaNhan(this, rootPaneCheckingEnabled, getCurrentAcc());
        //cp.setVisible(true);
    }//GEN-LAST:event_ChangeMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Change;
    private javax.swing.JButton LogOut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel jlbBanHang;
    private javax.swing.JLabel jlbHoaDonBH;
    private javax.swing.JLabel jlbHoaDonNH;
    private javax.swing.JLabel jlbNhaCungCap;
    private javax.swing.JLabel jlbNhanVien;
    private javax.swing.JLabel jlbNhapHang;
    private javax.swing.JLabel jlbSanPham;
    private javax.swing.JLabel jlbTaiKhoan;
    private javax.swing.JLabel jlbThongKe;
    private javax.swing.JLabel jlbTrangChu;
    private javax.swing.JPanel jpnBanHang;
    private javax.swing.JPanel jpnHoaDonBH;
    private javax.swing.JPanel jpnHoaDonNH;
    private javax.swing.JPanel jpnMenu;
    private javax.swing.JPanel jpnNhaCungCap;
    private javax.swing.JPanel jpnNhanVien;
    private javax.swing.JPanel jpnNhapHang;
    private javax.swing.JPanel jpnRoot;
    private javax.swing.JPanel jpnSanPham;
    private javax.swing.JPanel jpnTaiKhoan;
    private javax.swing.JPanel jpnThongKe;
    private javax.swing.JPanel jpnTrangChu;
    private javax.swing.JPanel jpnView;
    // End of variables declaration//GEN-END:variables
}
