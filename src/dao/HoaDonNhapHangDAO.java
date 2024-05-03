/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import database.OracleJDBCConnection;
import model.HoaDonModel;
import model.HoaDonNhapHangModel;

public class HoaDonNhapHangDAO implements DAOInterface<HoaDonNhapHangModel> {

    public static HoaDonNhapHangDAO getInstance() {
        return new HoaDonNhapHangDAO();
    }

    @Override
    public int insert( HoaDonNhapHangModel t) {
        int ketQua = 0;
        try {
            Connection con = OracleJDBCConnection.getJDBCConnection();
            String sql = "INSERT INTO PHIEUNHAPHANG (mapnh, manv, mancc, ngaytao, tongtien, ghichu) VALUES (?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getMaHD());
            pst.setString(2, t.getNguoiTao());
            pst.setString(3, t.getNhaCungCap());
            pst.setDate(4, t.getThoiGianTao());
            pst.setDouble(5, t.getTongTien());
            pst.setString(6, t.getGhiChu());
            ketQua = pst.executeUpdate();
            OracleJDBCConnection.closeConnection(con);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public int update(HoaDonNhapHangModel t) {
        int ketQua = 0;
        try {
            Connection con = OracleJDBCConnection.getJDBCConnection();
            String sql = "UPDATE PHIEUNHAPHANG SET manv='" + t.getNguoiTao()
                    + "', mancc='" + t.getNhaCungCap() 
                    + "', ngaytao='" + t.getThoiGianTao()
                    + "', tongtien=" + t.getTongTien()
                    + ", ghichu='" + t.getGhiChu()
                    + "WHERE mapnh='" + t.getMaHD() + "'";
            PreparedStatement pst = con.prepareStatement(sql);
            ketQua = pst.executeUpdate();
            OracleJDBCConnection.closeConnection(con);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public int delete(HoaDonNhapHangModel t) {
        int ketQua = 0;
        try {
            Connection con = OracleJDBCConnection.getJDBCConnection();
            String sql = "DELETE FROM PHIEUNHAPHANG WHERE mapnh=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getMaHD());
            ketQua = pst.executeUpdate();
            OracleJDBCConnection.closeConnection(con);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public ArrayList<HoaDonNhapHangModel> selectAll() {
        ArrayList<HoaDonNhapHangModel> ketQua = new ArrayList<HoaDonNhapHangModel>();
        try {
            Connection con = OracleJDBCConnection.getJDBCConnection();
            String sql = "SELECT * FROM PHIEUNHAPHANG ORDER BY ngaytao DESC";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String maPhieu = rs.getString("mapnh");
                String nguoiTao = rs.getString("manv");
                String maNhaCungCap = rs.getString("mancc");
                Date thoiGianTao = rs.getDate("ngaytao");
                double tongTien = rs.getDouble("tongtien");
                String ghiChu = rs.getString("ghichu");
                HoaDonNhapHangModel p = new HoaDonNhapHangModel(maNhaCungCap, maPhieu, nguoiTao, thoiGianTao, ChiTietHoaDonNhapHangDAO.getInstance().selectAll(maPhieu), tongTien, ghiChu);
                ketQua.add(p);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public HoaDonNhapHangModel selectById(String t) {
        HoaDonNhapHangModel ketQua = null;
        try {
            Connection con = OracleJDBCConnection.getJDBCConnection();
            String sql = "SELECT * FROM PHIEUNHAPHANG WHERE mapnh=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String maPhieu = rs.getString("mapnh");
                String nguoiTao = rs.getString("manv");
                String maNhaCungCap = rs.getString("mancc");
                Date thoiGianTao = rs.getDate("ngaytao");
                double tongTien = rs.getDouble("tongtien");
                String ghiChu = rs.getString("ghichu");
                ketQua = new HoaDonNhapHangModel(maNhaCungCap, maPhieu, nguoiTao, thoiGianTao, ChiTietHoaDonNhapHangDAO.getInstance().selectAll(maPhieu), tongTien, ghiChu);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }
}
