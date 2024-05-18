/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import database.OracleJDBCConnection;
import java.util.ArrayList;
import java.util.Date;
import model.ThongKeProduct;
import java.sql.*;

public class ThongKeDAO {

    public static ThongKeDAO getInstance() {
        return new ThongKeDAO();
    }

    public ArrayList<ThongKeProduct> getThongKe() {
        ArrayList<ThongKeProduct> ketQua = new ArrayList<ThongKeProduct>();
        try {
            Connection con = OracleJDBCConnection.getJDBCConnection();
            String sql = "SELECT t1.masp, tensp ,slNhap,slXuat FROM(\n"
                    + "	SELECT masp, SUM(soluong) AS slNhap FROM CTNHAP \n"
                    + "	JOIN PHIEUNHAPHANG ON PHIEUNHAPHANG.mapnh = CTNHAP.mapnh\n"
                    + "	GROUP BY masp\n"
                    + ") t1 \n"
                    + "JOIN(\n"
                    + "	SELECT masp, SUM(soluong) AS slXuat FROM CTHD \n"
                    + "	JOIN HOADON ON HOADON.mahd = CTHD.mahd \n"
                    + "	GROUP BY masp\n"
                    + ") t2\n"
                    + "ON t1.masp = t2.masp\n"
                    + "JOIN SANPHAM ON t1.masp = SANPHAM.masp";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String maMay = rs.getString("masp");
                String tenMay = rs.getString("tensp");
                int slNhap = rs.getInt("slNhap");
                int slXuat = rs.getInt("slXuat");
                ThongKeProduct p = new ThongKeProduct(maMay, tenMay, slNhap, slXuat);
                ketQua.add(p);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }
}
