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
import model.NhanVienModel;

/**
 *
 * @author Nhu Pham
 */
public class NhanVienDAO implements DAOInterface<NhanVienModel> {

    public static NhanVienDAO getInstance() {
        return new NhanVienDAO();
    }

    @Override
    public int insert(NhanVienModel n) {
        int ketQua = 0;
        try {
            Connection con = OracleJDBCConnection.getJDBCConnection();
            String sql = "INSERT INTO NHANVIEN (manv, hoten, diachi, sdt, email) VALUES (?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, n.getMaNV());
            pst.setString(2, n.getTenNV());
            pst.setString(3, n.getDiaChi());
            pst.setString(4, n.getSdt());
            pst.setString(5, n.getEmail());
            ketQua = pst.executeUpdate();
            OracleJDBCConnection.closeConnection(con);
        } catch (Exception e) {
            // TODO: handle exception
            JOptionPane.showMessageDialog(null, "Không thêm được nhân viên " + n.getMaNV(), "Lỗi", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public int update(NhanVienModel n) {
        int ketQua = 0;
        try {
            Connection con = OracleJDBCConnection.getJDBCConnection();
            String sql = "UPDATE NHANVIEN SET hoten='" + n.getTenNV()+ 
                    "', diachi='" + n.getDiaChi() + "', sdt='" + n.getSdt()+"', email='" + 
                    n.getEmail() +"'  WHERE manv='" + n.getMaNV()+ "'";
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
    public int delete(NhanVienModel n) {
        int ketQua = 0;
        try {
            Connection con = OracleJDBCConnection.getJDBCConnection();
            String sql = "DELETE FROM NHANVIEN WHERE manv=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, n.getMaNV());
            ketQua = pst.executeUpdate();
            OracleJDBCConnection.closeConnection(con);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public ArrayList<NhanVienModel> selectAll() {
        ArrayList<NhanVienModel> ketQua = new ArrayList<NhanVienModel>();
        try {
            Connection con = OracleJDBCConnection.getJDBCConnection();
            String sql = "SELECT * FROM NHANVIEN";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String maNV = rs.getString("manv");
                String tenNV = rs.getString("hoten");
                String diaChi = rs.getString("diachi");
                String sdt = rs.getString("sdt");
                String email = rs.getString("email");
                NhanVienModel ncc = new NhanVienModel(maNV, tenNV, diaChi, sdt, email);
                ketQua.add(ncc);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public NhanVienModel selectById(String s) {
        NhanVienModel ketQua = null;
        try {
            Connection con = OracleJDBCConnection.getJDBCConnection();
            String sql = "SELECT * FROM NHANVIEN WHERE manv=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, s);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String maNV = rs.getString("manv");
                String tenNV = rs.getString("hoten");
                String diaChi = rs.getString("diachi");
                String sdt = rs.getString("sdt");
                String email = rs.getString("email");
                ketQua = new NhanVienModel(maNV, tenNV, diaChi, sdt, email);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }
}

