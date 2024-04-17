
package view.employees;
import controller.emplyees.ChuyenManHinhController;
import java.util.*;
import bean.employees.DanhMucBean;

/**
 *
 * @author hyn09
 */
public class MainJFrame extends javax.swing.JFrame {

    public MainJFrame() {
        initComponents();
        
        setTitle("QUẢN LÝ CỬA HÀNG BÁN QUẦN ÁO");
        ChuyenManHinhController controller=new ChuyenManHinhController(jpnView);
        controller.setView(jpnTrangChu, jlbTrangChu);
        
        List <DanhMucBean> listItem = new ArrayList <>() ;
        listItem.add(new DanhMucBean("TrangChu", jpnTrangChu, jlbTrangChu));
        listItem.add(new DanhMucBean("SanPham", jpnSanPham, jlbSanPham));
        listItem.add(new DanhMucBean("NhaCungCap", jpnNhaCungCap, jlbNhaCungCap));
        listItem.add(new DanhMucBean("BanHang", jpnBanHang, jlbBanHang));
        listItem.add(new DanhMucBean("NhapHang", jpnNhapHang, jlbNhapHang));
        listItem.add(new DanhMucBean("DoiTraHang", jpnDoiTra, jlbDoiTra));
        listItem.add(new DanhMucBean("HoaDonBH", jpnHoaDonBH, jlbHoaDonBH));
        listItem.add(new DanhMucBean("HoaDonNH", jpnHoaDonNH, jlbHoaDonNH));
        listItem.add(new DanhMucBean("HoaDonDT", jpnHoaDonDT, jlbHoaDonDT));
        listItem.add(new DanhMucBean("TaiKhoan", jpnTaiKhoan, jlbTaiKhoan));
        listItem.add(new DanhMucBean("ThongKe", jpnThongKe, jlbThongKe));
        listItem.add(new DanhMucBean("ThongTin", jpnThongTin, jlbThongTin));
        controller.setEvent(listItem);
        
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
        jpnTrangChu = new javax.swing.JPanel();
        jlbTrangChu = new javax.swing.JLabel();
        jpnSanPham = new javax.swing.JPanel();
        jlbSanPham = new javax.swing.JLabel();
        jpnNhaCungCap = new javax.swing.JPanel();
        jlbNhaCungCap = new javax.swing.JLabel();
        jpnThongKe = new javax.swing.JPanel();
        jlbThongKe = new javax.swing.JLabel();
        jpnDoiTra = new javax.swing.JPanel();
        jlbDoiTra = new javax.swing.JLabel();
        jpnHoaDonNH = new javax.swing.JPanel();
        jlbHoaDonNH = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jpnHoaDonBH = new javax.swing.JPanel();
        jlbHoaDonBH = new javax.swing.JLabel();
        jpnNhapHang = new javax.swing.JPanel();
        jlbNhapHang = new javax.swing.JLabel();
        jpnHoaDonDT = new javax.swing.JPanel();
        jlbHoaDonDT = new javax.swing.JLabel();
        jpnTaiKhoan = new javax.swing.JPanel();
        jlbTaiKhoan = new javax.swing.JLabel();
        jpnThongTin = new javax.swing.JPanel();
        jlbThongTin = new javax.swing.JLabel();
        jpnBanHang = new javax.swing.JPanel();
        jlbBanHang = new javax.swing.JLabel();
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

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel7)
                .addContainerGap(27, Short.MAX_VALUE))
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

        jpnSanPham.setBackground(new java.awt.Color(255, 255, 255));

        jlbSanPham.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jlbSanPham.setText("SẢN PHẨM");

        javax.swing.GroupLayout jpnSanPhamLayout = new javax.swing.GroupLayout(jpnSanPham);
        jpnSanPham.setLayout(jpnSanPhamLayout);
        jpnSanPhamLayout.setHorizontalGroup(
            jpnSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnSanPhamLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jlbSanPham)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnSanPhamLayout.setVerticalGroup(
            jpnSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnSanPhamLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jlbSanPham)
                .addContainerGap())
        );

        jpnNhaCungCap.setBackground(new java.awt.Color(255, 255, 255));

        jlbNhaCungCap.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jlbNhaCungCap.setText("NHÀ CUNG CẤP");

        javax.swing.GroupLayout jpnNhaCungCapLayout = new javax.swing.GroupLayout(jpnNhaCungCap);
        jpnNhaCungCap.setLayout(jpnNhaCungCapLayout);
        jpnNhaCungCapLayout.setHorizontalGroup(
            jpnNhaCungCapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnNhaCungCapLayout.createSequentialGroup()
                .addGap(98, 98, 98)
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

        jpnThongKe.setBackground(new java.awt.Color(255, 255, 255));

        jlbThongKe.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jlbThongKe.setText("THỐNG KÊ");

        javax.swing.GroupLayout jpnThongKeLayout = new javax.swing.GroupLayout(jpnThongKe);
        jpnThongKe.setLayout(jpnThongKeLayout);
        jpnThongKeLayout.setHorizontalGroup(
            jpnThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnThongKeLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jlbThongKe)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnThongKeLayout.setVerticalGroup(
            jpnThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnThongKeLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jlbThongKe)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpnDoiTra.setBackground(new java.awt.Color(255, 255, 255));

        jlbDoiTra.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jlbDoiTra.setText("ĐỔI/TRẢ HÀNG");

        javax.swing.GroupLayout jpnDoiTraLayout = new javax.swing.GroupLayout(jpnDoiTra);
        jpnDoiTra.setLayout(jpnDoiTraLayout);
        jpnDoiTraLayout.setHorizontalGroup(
            jpnDoiTraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnDoiTraLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jlbDoiTra)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnDoiTraLayout.setVerticalGroup(
            jpnDoiTraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnDoiTraLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jlbDoiTra)
                .addContainerGap())
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
                .addGap(84, 84, 84))
        );
        jpnHoaDonNHLayout.setVerticalGroup(
            jpnHoaDonNHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnHoaDonNHLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jlbHoaDonNH)
                .addContainerGap())
        );

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("ĐĂNG XUẤT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                .addGap(88, 88, 88))
        );
        jpnHoaDonBHLayout.setVerticalGroup(
            jpnHoaDonBHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnHoaDonBHLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jlbHoaDonBH)
                .addContainerGap())
        );

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

        jpnHoaDonDT.setBackground(new java.awt.Color(255, 255, 255));

        jlbHoaDonDT.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jlbHoaDonDT.setText("HÓA ĐƠN ĐỔI/TRẢ HÀNG");

        javax.swing.GroupLayout jpnHoaDonDTLayout = new javax.swing.GroupLayout(jpnHoaDonDT);
        jpnHoaDonDT.setLayout(jpnHoaDonDTLayout);
        jpnHoaDonDTLayout.setHorizontalGroup(
            jpnHoaDonDTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnHoaDonDTLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jlbHoaDonDT)
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jpnHoaDonDTLayout.setVerticalGroup(
            jpnHoaDonDTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnHoaDonDTLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jlbHoaDonDT)
                .addContainerGap())
        );

        jpnTaiKhoan.setBackground(new java.awt.Color(255, 255, 255));

        jlbTaiKhoan.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jlbTaiKhoan.setText("TÀI KHOẢN");

        javax.swing.GroupLayout jpnTaiKhoanLayout = new javax.swing.GroupLayout(jpnTaiKhoan);
        jpnTaiKhoan.setLayout(jpnTaiKhoanLayout);
        jpnTaiKhoanLayout.setHorizontalGroup(
            jpnTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTaiKhoanLayout.createSequentialGroup()
                .addGap(111, 111, 111)
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

        jpnThongTin.setBackground(new java.awt.Color(255, 255, 255));

        jlbThongTin.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jlbThongTin.setText("ĐỔI THÔNG TIN");

        javax.swing.GroupLayout jpnThongTinLayout = new javax.swing.GroupLayout(jpnThongTin);
        jpnThongTin.setLayout(jpnThongTinLayout);
        jpnThongTinLayout.setHorizontalGroup(
            jpnThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnThongTinLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jlbThongTin)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnThongTinLayout.setVerticalGroup(
            jpnThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnThongTinLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jlbThongTin)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        javax.swing.GroupLayout jpnMenuLayout = new javax.swing.GroupLayout(jpnMenu);
        jpnMenu.setLayout(jpnMenuLayout);
        jpnMenuLayout.setHorizontalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpnTrangChu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnDoiTra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnNhaCungCap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnHoaDonNH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnHoaDonBH, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnNhapHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnHoaDonDT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnTaiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnThongTin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnBanHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnMenuLayout.setVerticalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnBanHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnNhapHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnDoiTra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnHoaDonBH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnHoaDonNH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnHoaDonDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpnViewLayout = new javax.swing.GroupLayout(jpnView);
        jpnView.setLayout(jpnViewLayout);
        jpnViewLayout.setHorizontalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 405, Short.MAX_VALUE)
        );
        jpnViewLayout.setVerticalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel jlbBanHang;
    private javax.swing.JLabel jlbDoiTra;
    private javax.swing.JLabel jlbHoaDonBH;
    private javax.swing.JLabel jlbHoaDonDT;
    private javax.swing.JLabel jlbHoaDonNH;
    private javax.swing.JLabel jlbNhaCungCap;
    private javax.swing.JLabel jlbNhapHang;
    private javax.swing.JLabel jlbSanPham;
    private javax.swing.JLabel jlbTaiKhoan;
    private javax.swing.JLabel jlbThongKe;
    private javax.swing.JLabel jlbThongTin;
    private javax.swing.JLabel jlbTrangChu;
    private javax.swing.JPanel jpnBanHang;
    private javax.swing.JPanel jpnDoiTra;
    private javax.swing.JPanel jpnHoaDonBH;
    private javax.swing.JPanel jpnHoaDonDT;
    private javax.swing.JPanel jpnHoaDonNH;
    private javax.swing.JPanel jpnMenu;
    private javax.swing.JPanel jpnNhaCungCap;
    private javax.swing.JPanel jpnNhapHang;
    private javax.swing.JPanel jpnRoot;
    private javax.swing.JPanel jpnSanPham;
    private javax.swing.JPanel jpnTaiKhoan;
    private javax.swing.JPanel jpnThongKe;
    private javax.swing.JPanel jpnThongTin;
    private javax.swing.JPanel jpnTrangChu;
    private javax.swing.JPanel jpnView;
    // End of variables declaration//GEN-END:variables
}
