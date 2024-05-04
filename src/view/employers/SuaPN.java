/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view.employers;

//import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.FlatLightLaf;
import controller.TimSanPham;
import dao.ChiTietHoaDonBanHangDAO;
import dao.ChiTietHoaDonNhapHangDAO;
import dao.HoaDonBanHangDAO;
import dao.HoaDonNhapHangDAO;
import dao.NhaCungCapDAO;
import dao.NhanVienDAO;
import dao.SanPhamDAO;
import java.sql.Date;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.QUESTION_MESSAGE;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import model.ChiTietHoaDonModel;
import model.HoaDonBanHangModel;
import model.HoaDonNhapHangModel;
import model.NhaCungCapModel;
import model.SanPhamModel;

/**
 *
 * @author hyn09
 */
public class SuaPN extends javax.swing.JDialog {
    private DefaultTableModel tblModel;
    DecimalFormat formatter = new DecimalFormat("###,###,###");
    private ArrayList<SanPhamModel> allProduct;
    private HoaDonNhapHangModel phieunhap;
    private ArrayList<ChiTietHoaDonModel> CTPhieu;
    private ArrayList<ChiTietHoaDonModel> CTPhieuOld;
    private HoaDonNH parent;
    private static final ArrayList<NhaCungCapModel> arrNcc = NhaCungCapDAO.getInstance().selectAll();

    public SuaPN(javax.swing.JPanel parent, javax.swing.JFrame owner, boolean modal) throws UnsupportedLookAndFeelException {
        super(owner, modal);
        UIManager.setLookAndFeel(new FlatLightLaf());
        initComponents();
        setLocationRelativeTo(null);
        // Lay thong tin 
        allProduct = SanPhamDAO.getInstance().selectAll();
        this.parent = (HoaDonNH) parent;
        this.phieunhap = this.parent.getPhieuNhapSelect();
        CTPhieu = ChiTietHoaDonNhapHangDAO.getInstance().selectAll(phieunhap.getMaHD());
        CTPhieuOld = ChiTietHoaDonNhapHangDAO.getInstance().selectAll(phieunhap.getMaHD());
        // Hien thi thong tin
        initTable();
        loadDataToTableProduct(allProduct);
        loadDataToTableNhapHang();
        displayInfo();
    }

    private SuaPN(JFrame jFrame, boolean b) {
        super(jFrame, b);
        initComponents();
        setLocationRelativeTo(null);
    }

    private void displayInfo() {
        txtMaPhieu.setText(phieunhap.getMaHD());
        textTongTien.setText(formatter.format(phieunhap.getTongTien()) + "đ");
        txtNguoiTao.setText(NhanVienDAO.getInstance().selectById(phieunhap.getNguoiTao()).getMaNV());
        txtGhiChu.setText(phieunhap.getGhiChu().trim());
        int vitri = loadNccToComboBox();
        cboNhaCungCap.setSelectedIndex(vitri);
    }

    private int loadNccToComboBox() {
        int vitri = -1;
        for (int i = 0; i < arrNcc.size(); i++) {
            cboNhaCungCap.addItem(arrNcc.get(i).getTenNCC());
            if (arrNcc.get(i).getMaNCC().equals(phieunhap.getNhaCungCap())) {
                vitri = i;
            }
        }
        return vitri;
    }

    public final void initTable() {
        tblModel = new DefaultTableModel();
        String[] headerTbl = new String[]{"Mã sản phẩm", "Tên sản phẩm", "Số lượng", "Đơn giá"};
        tblModel.setColumnIdentifiers(headerTbl);
        tblSanPham.setModel(tblModel);
        tblSanPham.getColumnModel().getColumn(0).setPreferredWidth(5);
        tblSanPham.getColumnModel().getColumn(1).setPreferredWidth(50);
        tblSanPham.getColumnModel().getColumn(2).setPreferredWidth(50);
        tblNhapHang.getColumnModel().getColumn(0).setPreferredWidth(50);
        tblNhapHang.getColumnModel().getColumn(1).setPreferredWidth(50);
        tblNhapHang.getColumnModel().getColumn(2).setPreferredWidth(250);
        tblSanPham.setDefaultEditor(Object.class, null);
    }

    private void loadDataToTableProduct(ArrayList<SanPhamModel> arrProd) {
        try {
            tblModel.setRowCount(0);
            for (var i : arrProd) {
                tblModel.addRow(new Object[]{
                    i.getMaSP(), i.getTenSP(), i.getSoLuongSP(), formatter.format(i.getGianhapSP()) + "đ"
                });
            }
        } catch (Exception e) {
        }
    }

    public double tinhTongTien() {
        double tt = 0;
        for (var i : CTPhieu) {
            tt += i.getDonGia() * i.getSoLuong();
        }
        return tt;
    }

    public SanPhamModel findSanPham(String maSP) {
        for (var i : allProduct) {
            if (maSP.equals(i.getMaSP())) {
                return i;
            }
        }
        return null;
    }

    public ChiTietHoaDonModel findCTPhieu(String maSP) {
        for (var i : CTPhieu) {
            if (maSP.equals(i.getMaSP())) {
                return i;
            }
        }
        return null;
    }

    private void loadDataToTableNhapHang() {
        try {
            DefaultTableModel tblNhapHangmd = (DefaultTableModel) tblNhapHang.getModel();
            tblNhapHangmd.setRowCount(0);

            for (int i = 0; i < CTPhieu.size(); i++) {
                tblNhapHangmd.addRow(new Object[]{
                    i + 1, CTPhieu.get(i).getMaSP(), findSanPham(CTPhieu.get(i).getMaSP()).getTenSP(), CTPhieu.get(i).getSoLuong(), formatter.format(CTPhieu.get(i).getDonGia()) + "đ", formatter.format(CTPhieu.get(i).getDonGia()*CTPhieu.get(i).getSoLuong()) + "đ"
                });
            }
        } catch (Exception e) {
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnReset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSanPham = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtSoLuong = new javax.swing.JTextField();
        btnAddP = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtGhiChu = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtMaPhieu = new javax.swing.JTextField();
        txtNguoiTao = new javax.swing.JTextField();
        cboNhaCungCap = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblNhapHang = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        btnDel = new javax.swing.JButton();
        btnEditSL = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        textTongTien = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(230, 255, 243));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(32, 178, 170));
        jLabel3.setText("Tìm kiếm");

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(32, 178, 170));
        btnReset.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconlammoi2.png"))); // NOI18N
        btnReset.setText("Làm mới");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnReset)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSearch)
                    .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        tblSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "Số lượng", "Đơn giá"
            }
        ));
        jScrollPane1.setViewportView(tblSanPham);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(32, 178, 170));
        jLabel9.setText("Số lượng");

        txtSoLuong.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSoLuong.setText("1");

        btnAddP.setBackground(new java.awt.Color(32, 178, 170));
        btnAddP.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAddP.setForeground(new java.awt.Color(255, 255, 255));
        btnAddP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icondaucong.png"))); // NOI18N
        btnAddP.setText("Thêm");
        btnAddP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(btnAddP, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(226, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddP, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel5.setBackground(new java.awt.Color(230, 255, 243));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(32, 178, 170));
        jLabel4.setText("Mã phiếu nhập");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(32, 178, 170));
        jLabel5.setText("Người tạo");

        txtGhiChu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGhiChuActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(32, 178, 170));
        jLabel6.setText("Tên nhà cung cấp");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(32, 178, 170));
        jLabel7.setText("Ghi chú");

        txtMaPhieu.setEnabled(false);

        txtNguoiTao.setEnabled(false);

        cboNhaCungCap.setBackground(new java.awt.Color(32, 178, 170));
        cboNhaCungCap.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cboNhaCungCap.setForeground(new java.awt.Color(255, 255, 255));
        cboNhaCungCap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboNhaCungCapActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMaPhieu, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNguoiTao, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtGhiChu, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                    .addComponent(cboNhaCungCap, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMaPhieu, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cboNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtGhiChu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNguoiTao, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel7)))
                .addGap(16, 16, 16))
        );

        tblNhapHang.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblNhapHang);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        btnDel.setBackground(new java.awt.Color(32, 178, 170));
        btnDel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnDel.setForeground(new java.awt.Color(255, 255, 255));
        btnDel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconxoa1.png"))); // NOI18N
        btnDel.setText("Xóa sản phẩm");
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });

        btnEditSL.setBackground(new java.awt.Color(32, 178, 170));
        btnEditSL.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnEditSL.setForeground(new java.awt.Color(255, 255, 255));
        btnEditSL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconsua1.png"))); // NOI18N
        btnEditSL.setText("Sửa số lượng");
        btnEditSL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditSLActionPerformed(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(32, 178, 170));
        btnSave.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/luu_icon.png"))); // NOI18N
        btnSave.setText("Lưu");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(32, 178, 170));
        jLabel8.setText("Tổng tiền");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(btnDel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEditSL))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(28, 28, 28)
                        .addComponent(textTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(btnSave)))
                .addGap(60, 60, 60))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditSL, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(textTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        // TODO add your handling code here:
        int i_row = tblNhapHang.getSelectedRow();
        if (i_row == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn sản phẩm để xoá khỏi phiếu nhập hàng !");
        } else {
            CTPhieu.remove(i_row);
            textTongTien.setText(formatter.format(tinhTongTien()) + "đ");
            loadDataToTableNhapHang();
        }
    }//GEN-LAST:event_btnDelActionPerformed

    private void cboNhaCungCapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboNhaCungCapActionPerformed
        // TODO add your handling code here:
        String luaChon = arrNcc.get(cboNhaCungCap.getSelectedIndex()).getMaNCC();
        ArrayList<SanPhamModel> sp = SanPhamDAO.getInstance().selectByNCC(luaChon);
        loadDataToTableProduct(sp);
    }//GEN-LAST:event_cboNhaCungCapActionPerformed

    private void txtGhiChuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGhiChuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGhiChuActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        if (CTPhieu.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn sản phẩm để nhập hàng !","Cảnh báo", JOptionPane.WARNING_MESSAGE);
        } else if(txtGhiChu.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin phiếu nhập hàng!", "Cảnh báo", JOptionPane.WARNING_MESSAGE);
        } else {
            // Set so luong san pham cua tung loai ve ban dau   
            SanPhamDAO spdao = SanPhamDAO.getInstance();
            for (var ct : CTPhieuOld) {
                spdao.updateSoLuong(spdao.selectById(ct.getMaSP()), ct.getMaSP(), spdao.selectById(ct.getMaSP()).getSoLuongSP()- ct.getSoLuong());
                System.out.println(ct.getSoLuong());
            }
            for (var ct : CTPhieu) {
                spdao.updateSoLuong(spdao.selectById(ct.getMaSP()), ct.getMaSP(), spdao.selectById(ct.getMaSP()).getSoLuongSP()+ ct.getSoLuong());
                System.out.println(ct.getSoLuong());
            }
            // Lay thoi gian hien tai
            long now = System.currentTimeMillis();
            Date ngayTao = new Date(now);
            // Tao doi tuong phieu nhap
           HoaDonNhapHangModel pn = new HoaDonNhapHangModel(phieunhap.getNhaCungCap(), phieunhap.getMaHD(), txtNguoiTao.getText(), ngayTao, CTPhieu, tinhTongTien(), phieunhap.getGhiChu());
            try {
                int kq = HoaDonNhapHangDAO.getInstance().update(pn);
                if(kq > 0) {
                    ChiTietHoaDonNhapHangDAO.getInstance().delete(CTPhieuOld.get(CTPhieuOld.size() - 1));
                    for (var i : CTPhieu) {
                        ChiTietHoaDonNhapHangDAO.getInstance().insert(i);  
                } 
                    JOptionPane.showMessageDialog(this, "Cập nhật thành công !");
                    this.parent.loadDataToTable();
                    this.dispose();
                } else {
                    JOptionPane.showConfirmDialog(this, "Cập nhật không thành công !");
                }
            } catch (Exception e) {
                JOptionPane.showConfirmDialog(this, "Đã xảy ra lỗi !");
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnEditSLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditSLActionPerformed
        // TODO add your handling code here:
        int i_row = tblNhapHang.getSelectedRow();
        if (i_row == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn sản phẩm để sửa số lượng !");
        } else {
            String newSL = JOptionPane.showInputDialog(this, "Nhập số lượng cần thay đổi", "Thay đổi số lượng", QUESTION_MESSAGE);
            if (newSL != null) {
                int soLuong;
                try {
                    soLuong = Integer.parseInt(newSL);
                    CTPhieu.get(i_row).setSoLuong(soLuong);
                    loadDataToTableNhapHang();
                    textTongTien.setText(formatter.format(tinhTongTien()) + "đ");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Vui lòng nhập số lượng ở dạng số nguyên!");
                }
            }
        }
    }//GEN-LAST:event_btnEditSLActionPerformed

    private void btnAddPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPActionPerformed
        // TODO add your handling code here:
        int i_row = tblSanPham.getSelectedRow();
        if (i_row == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn sản phẩm để nhập hàng !");
        } else {
            int soluong = Integer.parseInt(txtSoLuong.getText().trim());
            ChiTietHoaDonModel ct = findCTPhieu((String) tblSanPham.getValueAt(i_row, 0));
            if (ct != null) {
                ct.setSoLuong(ct.getSoLuong() + soluong);
            } else {
                SanPhamModel sp = TimSanPham.getInstance().searchId((String) tblSanPham.getValueAt(i_row, 0));
                ChiTietHoaDonModel ctp = new ChiTietHoaDonModel(phieunhap.getMaHD(), sp.getMaSP(), soluong, sp.getGianhapSP(), soluong*sp.getGianhapSP());
                CTPhieu.add(ctp);
            }
            loadDataToTableNhapHang();
            textTongTien.setText(formatter.format(tinhTongTien()) + "đ");
        }
    }//GEN-LAST:event_btnAddPActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // TODO add your handling code here:
        DefaultTableModel tblsp = (DefaultTableModel) tblSanPham.getModel();
        String textSearch = txtSearch.getText().toLowerCase();
        ArrayList<SanPhamModel> sp = new ArrayList<>();
        for (SanPhamModel i : allProduct) {
            if (i.getMaSP().concat(i.getMaSP()).toLowerCase().contains(textSearch)) {
                sp.add(i);
            }
        }
        loadDataToTableProduct(sp);
    }//GEN-LAST:event_txtSearchKeyReleased

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        txtSearch.setText("");
        loadDataToTableProduct(allProduct);
    }//GEN-LAST:event_btnResetActionPerformed

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
            java.util.logging.Logger.getLogger(SuaPN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SuaPN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SuaPN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SuaPN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SuaPN dialog = new SuaPN(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAddP;
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnEditSL;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cboNhaCungCap;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblNhapHang;
    private javax.swing.JTable tblSanPham;
    private javax.swing.JTextField textTongTien;
    private javax.swing.JTextField txtGhiChu;
    private javax.swing.JTextField txtMaPhieu;
    private javax.swing.JTextField txtNguoiTao;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtSoLuong;
    // End of variables declaration//GEN-END:variables
}
