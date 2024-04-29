/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import database.OracleJDBCConnection;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.SanPhamModel;

/**
 *
 * @author Nhu Pham
 */
public class SanPhamDAO implements DAOInterface<SanPhamModel> {

    public static SanPhamDAO getInstance() {
        return new SanPhamDAO();
    }

    @Override
    public int insert(SanPhamModel s) {
        int ketQua = 0;
        try {
            Connection con = OracleJDBCConnection.getJDBCConnection();
            String sql = "INSERT INTO SANPHAM (masp, tensp, giaban, gianhap, soluong, kichthuoc, chatlieu, mancc, xuatxu) VALUES (?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, s.getMaSP());
            pst.setString(2, s.getTenSP());
            pst.setDouble(3, s.getGiabanSP());
            pst.setDouble(4, s.getGianhapSP());
            pst.setInt(5, s.getSoLuongSP());
            pst.setString(6, s.getKichThuoc());
            pst.setString(7, s.getChatLieu());
            pst.setString(8, s.getMaNCC());
            pst.setString(9, s.getXuatXu());
            ketQua = pst.executeUpdate();
            OracleJDBCConnection.closeConnection(con);
        } catch (Exception e) {
            // TODO: handle exception
            JOptionPane.showMessageDialog(null, "Không thêm được sản phẩm " + s.getMaSP(), "Lỗi", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
        return ketQua;
    }

    /**
     *
     * @param s
     * @return
     */
    @Override
    public int update(SanPhamModel s) {
        int ketQua = 0;
        try {
            Connection con = OracleJDBCConnection.getJDBCConnection();
            String sql = "UPDATE SANPHAM SET tensp='" + s.getTenSP() + "', giaban=" + s.getGiabanSP() + ", gianhap=" + s.getGianhapSP()+ ", soluong=" + s.getSoLuongSP()+ ", kichthuoc='" + s.getKichThuoc()+ "', chatlieu='" + s.getChatLieu()+ "', mancc='" + s.getMaNCC()+ "', xuatxu='" + s.getXuatXu() + "' WHERE masp='" + s.getMaSP() + "'";
              PreparedStatement pst = con.prepareStatement(sql);
//            pst.setString(1, s.getMaSP());
//            pst.setString(2, s.getTenSP());
//            pst.setDouble(3, s.getGiabanSP());
//            pst.setDouble(4, s.getGianhapSP());
//            pst.setInt(5, s.getSoLuongSP());
//            pst.setString(6, s.getKichThuoc());
//            pst.setString(7, s.getChatLieu());
//            pst.setString(8, s.getMaNCC());
//            pst.setString(9, s.getXuatXu());
//            pst.setString(10, s.getMaSP());
            ketQua = pst.executeUpdate();
            
            //OracleJDBCConnection.closeConnection(con);
        } catch (SQLException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public int delete(SanPhamModel s) {
        int ketQua = 0;
        try {
            Connection con = OracleJDBCConnection.getJDBCConnection();
            String sql = "DELETE FROM SANPHAM WHERE masp=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, s.getMaSP());
            ketQua = pst.executeUpdate();
            OracleJDBCConnection.closeConnection(con);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public ArrayList<SanPhamModel> selectAll() {
        ArrayList<SanPhamModel> ketQua = new ArrayList<SanPhamModel>();
        try {
            Connection con = OracleJDBCConnection.getJDBCConnection();
            String sql = "SELECT * FROM SANPHAM";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String maSP = rs.getString("masp");
                String tenSP = rs.getString("tensp");
                double giabanSP = rs.getDouble("giaban");
                double gianhapSP = rs.getDouble("gianhap");
                int soLuongSP = rs.getInt("soluong");
                String kichThuoc = rs.getString("kichthuoc");
                String chatLieu = rs.getString("chatlieu");
                String maNCC = rs.getString("mancc");
                String xuatXu = rs.getString("xuatxu");
                SanPhamModel sp = new SanPhamModel(maSP, tenSP, giabanSP, gianhapSP, soLuongSP, kichThuoc, chatLieu, maNCC, xuatXu);
                ketQua.add(sp);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public SanPhamModel selectById(String s) {
        model.SanPhamModel ketQua = null;
        try {
            Connection con = OracleJDBCConnection.getJDBCConnection();
            String sql = "SELECT * FROM SANPHAM WHERE masp=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, s);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String maSP = rs.getString("masp");
                String tenSP = rs.getString("tensp");
                double giabanSP = rs.getDouble("giaban");
                double gianhapSP = rs.getDouble("gianhap");
                int soLuongSP = rs.getInt("soluong");
                String kichThuoc = rs.getString("kichthuoc");
                String chatLieu = rs.getString("chatlieu");
                String maNCC = rs.getString("mancc");
                String xuatXu = rs.getString("xuatxu");
                ketQua = new SanPhamModel(maSP, tenSP, giabanSP, gianhapSP, soLuongSP, kichThuoc, chatLieu, maNCC, xuatXu);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }
}

