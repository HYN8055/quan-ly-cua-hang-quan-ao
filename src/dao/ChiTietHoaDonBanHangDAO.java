/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import database.OracleJDBCConnection;
import model.ChiTietHoaDonModel;
import model.HoaDonModel;

public class ChiTietHoaDonBanHangDAO implements DAOInterface<ChiTietHoaDonModel> {

    public static ChiTietHoaDonBanHangDAO getInstance() {
        return new ChiTietHoaDonBanHangDAO();
    }

    @Override
    public int insert(ChiTietHoaDonModel t) {
        int ketQua = 0;
        try {
            Connection con = OracleJDBCConnection.getJDBCConnection();
            String sql = "INSERT INTO CTHD (mahd, masp, soLuong, dongia, tongtien) VALUES (?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getMaHD());
            pst.setString(2, t.getMaSP());
            pst.setInt(3, t.getSoLuong());
            pst.setDouble(4, t.getDonGia());
            pst.setDouble(5, t.getTongTien());
            ketQua = pst.executeUpdate();
            OracleJDBCConnection.closeConnection(con);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public int update(ChiTietHoaDonModel t) {
        int ketQua = 0;
        try {
            Connection con = OracleJDBCConnection.getJDBCConnection();
            String sql = "UPDATE CTHD SET masp='" + t.getMaSP() 
                     + "', soluong=" + t.getSoLuong() +", dongia=" + t.getDonGia()
                    + ", tongtien=" + t.getTongTien() + "WHERE mahd='" + t.getMaHD() 
                    + "' AND masp='" + t.getMaSP();
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
    public int delete(ChiTietHoaDonModel t) {
        int ketQua = 0;
        try {
            Connection con = OracleJDBCConnection.getJDBCConnection();
            String sql = "DELETE FROM CTHD WHERE mahd=?";
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

    public ArrayList<ChiTietHoaDonModel> selectAll(String t) {
        ArrayList<ChiTietHoaDonModel> ketQua = new ArrayList<ChiTietHoaDonModel>();
        try {
            Connection con = OracleJDBCConnection.getJDBCConnection();
            String sql = "SELECT * FROM CTHD WHERE mahd=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String maPhieu = rs.getString("mahd");
                String masp = rs.getString("masp");
                int soLuong = rs.getInt("soluong");
                double donGia = rs.getDouble("dongia");
                double tongTien = rs.getDouble("tongtien");
                ChiTietHoaDonModel ctp = new ChiTietHoaDonModel(maPhieu, masp, soLuong, donGia, tongTien);
                ketQua.add(ctp);
            }
            OracleJDBCConnection.closeConnection(con);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public ArrayList<ChiTietHoaDonModel> selectAll() {
        ArrayList<ChiTietHoaDonModel> ketQua = new ArrayList<ChiTietHoaDonModel>();
        try {
            Connection con = OracleJDBCConnection.getJDBCConnection();
            String sql = "SELECT * FROM CTHD";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String maPhieu = rs.getString("mahd");
                String masp = rs.getString("masp");
                int soLuong = rs.getInt("soluong");
                double donGia = rs.getDouble("dongia");
                double tongTien = rs.getDouble("tongtien");
                ChiTietHoaDonModel ctp = new ChiTietHoaDonModel(maPhieu, masp, soLuong, donGia, tongTien);
                ketQua.add(ctp);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public ChiTietHoaDonModel selectById(String t) {
        ChiTietHoaDonModel ketQua = null;
        try {
            Connection con = OracleJDBCConnection.getJDBCConnection();
            String sql = "SELECT * FROM CTHD WHERE mahd=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String maPhieu = rs.getString("mahd");
                String masp = rs.getString("masp");
                int soLuong = rs.getInt("soluong");
                double donGia = rs.getDouble("dongia");
                double tongTien = rs.getDouble("tongtien");
                ketQua = new ChiTietHoaDonModel(maPhieu, masp, soLuong, donGia, tongTien);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }
}
