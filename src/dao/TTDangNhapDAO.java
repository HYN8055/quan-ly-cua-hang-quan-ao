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

public class TTDangNhapDAO implements DAOInterface<TTDangNhapModel> {

    public static TTDangNhapDAO getInstance() {
        return new TTDangNhapDAO();
    }

    @Override
    public int insert(TTDangNhapModel t) {
        int ketQua = 0;
        try {
            Connection con = OracleJDBCConnection.getJDBCConnection();
            String sql = "INSERT INTO TTDANGNHAP (manv, tendn, matkhau, email, vaitro) VALUES (?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getMaNV());
            pst.setString(2, t.getUser());
            pst.setString(3, t.getPassword());
            pst.setString(4, t.getEmail());
            pst.setString(5, t.getRole());
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
            String sql = "UPDATE TTDANGNHAP SET tendn='" + t.getUser() + 
                    ",matkhau='" + t.getPassword() + ", email='" + t.getEmail() 
                    + ", vaitro'" + t.getRole();
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
            String sql = "DELETE FROM TTDangNhap WHERE manv=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getMaNV());
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
            String sql = "SELECT * FROM TTDANGNHAP";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String idName = rs.getString("manv");
                String userName = rs.getString("tendn");
                String password = rs.getString("matkhau");
                String email = rs.getString("email");
                String role = rs.getString("vaitro");

                TTDangNhapModel tk = new TTDangNhapModel(idName, userName, password, email, role);
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
        TTDangNhapModel ttdn = null;
        try {
            Connection con = OracleJDBCConnection.getJDBCConnection();
            String sql = "SELECT * FROM TTDANGNHAP WHERE tendn=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String idName = rs.getString("manv");
                String userName = rs.getString("tendn");
                String password = rs.getString("matkhau");
                String email = rs.getString("email");
                String role = rs.getString("vaitro");
                
                ttdn = new TTDangNhapModel(idName, userName, password, email, role);
            }
            OracleJDBCConnection.closeConnection(con);
        } catch (Exception e) {
            // TODO: handle exception           
        }
        return ttdn;
    }
    
        public int updatePassword(String email, String password) {
        int ketQua = 0;
        try {
            Connection con = OracleJDBCConnection.getJDBCConnection();
            String sql = "UPDATE TTDANGNHAP SET matkhau='" + password
                    + "' WHERE email='" + email + "'";
            PreparedStatement pst = con.prepareStatement(sql);

            ketQua = pst.executeUpdate();
            OracleJDBCConnection.closeConnection(con);

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }
}
