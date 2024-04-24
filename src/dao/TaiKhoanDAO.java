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
import javax.swing.JOptionPane;
import model.TTDangNhapModel;

public class TaiKhoanDAO implements DAOInterface<TTDangNhapModel> {

    public static TaiKhoanDAO getInstance() {
        return new TaiKhoanDAO();
    }

    @Override
    public int insert(TTDangNhapModel t) {
        int ketQua = 0;
        try {
            Connection con = OracleJDBCConnection.getJDBCConnection();
            String sql = "INSERT INTO Account (MANV, TENDN, MATKHAU, ROLE, TRANGTHAI) VALUES (?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getMaNV());
            pst.setString(2, t.getUser());
            pst.setString(3, t.getPassword());
            pst.setString(4, t.getRole());
            pst.setInt(5, t.getStatus());
            ketQua = pst.executeUpdate();
            OracleJDBCConnection.closeConnection(con);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public int update(TTDangNhapModel t) {
        int ketQua = 0;
        try {
            Connection con = OracleJDBCConnection.getJDBCConnection();
            String sql = "UPDATE Account SET MANV='" + t.getMaNV() + "',TENDN='" + t.getUser() + 
                    ",MATKHAU='" + t.getPassword() + ", ROLE='" + t.getRole() 
                    + ", TINHTRANG='" + t.getStatus();
            PreparedStatement pst = con.prepareStatement(sql);
            OracleJDBCConnection.closeConnection(con);

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public int delete(TTDangNhapModel t) {
        int ketQua = 0;
        try {
            Connection con = OracleJDBCConnection.getJDBCConnection();
            String sql = "DELETE FROM Account WHERE MANV=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getUser());
            ketQua = pst.executeUpdate();
            OracleJDBCConnection.closeConnection(con);

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public ArrayList<TTDangNhapModel> selectAll() {
        ArrayList<TTDangNhapModel> ketQua = new ArrayList<TTDangNhapModel>();
        try {
            Connection con = OracleJDBCConnection.getJDBCConnection();
            String sql = "SELECT * FROM TAIKHOAN";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String fullName = rs.getString("MANV");
                String userName = rs.getString("TENDN");
                String password = rs.getString("MATKHAU");
                String role = rs.getString("ROLE");
                int status = rs.getInt("TRANGTHAI");

                TTDangNhapModel tk = new TTDangNhapModel(fullName, userName, password, role, status);
                ketQua.add(tk);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public TTDangNhapModel selectById(String t) {
        TTDangNhapModel tk = null;
        try {
            Connection con = OracleJDBCConnection.getJDBCConnection();
            String sql = "SELECT * FROM TAIKHOAN WHERE MANV=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String fullName = rs.getString("MANV");
                String userName = rs.getString("TENDN");
                String password = rs.getString("MATKHAU");
                String role = rs.getString("ROLE");
                int status = rs.getInt("TRANGTHAI");
                
                tk = new TTDangNhapModel(fullName, userName, password, role, status);
            }
            OracleJDBCConnection.closeConnection(con);
        } catch (Exception e) {
            // TODO: handle exception           
        }
        return tk;
    }
    
        public int updatePassword(String email, String password) {
        int ketQua = 0;
        try {
            Connection con = OracleJDBCConnection.getJDBCConnection();
            String sql = "UPDATE TAIKHOAN SET MATKHAU=? WHERE EMAIL=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, password);
            pst.setString(2, email);

            ketQua = pst.executeUpdate();
            OracleJDBCConnection.closeConnection(con);

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }
}
