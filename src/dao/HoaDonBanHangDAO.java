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
import model.HoaDonBanHangModel;

public class HoaDonBanHangDAO implements DAOInterface<HoaDonBanHangModel> {

    public static HoaDonBanHangDAO getInstance() {
        return new HoaDonBanHangDAO();
    }

    @Override
    public int insert(HoaDonBanHangModel t) {
        int ketQua = 0;
        try {
            Connection con = OracleJDBCConnection.getJDBCConnection();
            String sql = "INSERT INTO HOADON (mahd, manv, tenkh, sdt, ngayin, tongtien, ghichu) VALUES (?,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getMaHD());
            pst.setString(2, t.getNguoiTao());
            pst.setString(3, t.getTenKH());
            pst.setString(4, t.getSdt());
            pst.setDate(5, t.getThoiGianTao());
            pst.setDouble(6, t.getTongTien());
            pst.setString(7, t.getGhiChu());
            ketQua = pst.executeUpdate();
            OracleJDBCConnection.closeConnection(con);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public int update(HoaDonBanHangModel t) {
        int ketQua = 0;
        try {
            Connection con = OracleJDBCConnection.getJDBCConnection();
            String sql = "UPDATE HOADON SET manv='" + t.getNguoiTao() 
                    + "',tenkh='" + t.getTenKH() + "', sdt='" + t.getSdt()
                    + "', ngayin='" + t.getThoiGianTao() + "', tongtien=" + t.getTongTien()
                    + ", ghichu='" + t.getGhiChu() + "' WHERE mahd=" + t.getMaHD() + "'";
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
    public int delete(HoaDonBanHangModel t) {
        int ketQua = 0;
        try {
            Connection con = OracleJDBCConnection.getJDBCConnection();
            String sql = "DELETE FROM HOADON WHERE mahd=?";
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
    public ArrayList<HoaDonBanHangModel> selectAll() {
        ArrayList<HoaDonBanHangModel> ketQua = new ArrayList<HoaDonBanHangModel>();
        try {
            Connection con = OracleJDBCConnection.getJDBCConnection();
            String sql = "SELECT * FROM HOADON ORDER BY ngayin DESC";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String maPhieu = rs.getString("mahd");
                String nguoiTao = rs.getString("manv");
                String tenKH = rs.getString("tenkh");
                String sdt = rs.getString("sdt");
                Date thoiGianTao = rs.getDate("ngayin");
                double tongTien = rs.getDouble("tongtien");
                String ghiChu = rs.getString("ghichu");
                HoaDonBanHangModel p = new HoaDonBanHangModel(tenKH, sdt, maPhieu, nguoiTao, 
                        thoiGianTao, ChiTietHoaDonBanHangDAO.getInstance().selectAll(maPhieu), tongTien, ghiChu);
                ketQua.add(p);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public HoaDonBanHangModel selectById(String t) {
        HoaDonBanHangModel ketQua = null;
        try {
            Connection con = OracleJDBCConnection.getJDBCConnection();
            String sql = "SELECT * FROM HOADON WHERE mahd=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String maPhieu = rs.getString("mahd");
                String nguoiTao = rs.getString("manv");
                String tenKH = rs.getString("tenkh");
                String sdt = rs.getString("sdt");
                Date thoiGianTao = rs.getDate("ngayin");
                double tongTien = rs.getDouble("tongtien");
                String ghiChu = rs.getString("ghichu");
                ketQua = new HoaDonBanHangModel(tenKH, sdt, maPhieu, nguoiTao, thoiGianTao, ChiTietHoaDonBanHangDAO.getInstance().selectAll(maPhieu), tongTien, ghiChu);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }
}
