/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Objects;


public class HoaDonNhapHangModel extends HoaDonModel {

    private String nhaCungCap;

    public HoaDonNhapHangModel() {
    }

    public HoaDonNhapHangModel(String nhaCungCap) {
        this.nhaCungCap = nhaCungCap;
    }

    public HoaDonNhapHangModel(String nhaCungCap, String maHD, String nguoiTao, Date thoiGianTao, ArrayList<ChiTietHoaDonModel> CTHD, double tongTien, String ghiChu) {
        super(maHD, nguoiTao, thoiGianTao, CTHD, tongTien, ghiChu);
        this.nhaCungCap = nhaCungCap;
    }


    private HoaDonNhapHangModel(String maHD, String nguoiTao, Date thoiGianTao, ArrayList<ChiTietHoaDonModel> CTHD, double tongTien, String ghiChu) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNhaCungCap() {
        return nhaCungCap;
    }

    public void setNhaCungCap(String nhaCungCap) {
        this.nhaCungCap = nhaCungCap;
    }

    @Override
    public String toString() {
        return "HoaDonNhapHang{" + "nhaCungCap=" + nhaCungCap + " maHD"+ this.getMaHD()+'}';
    }

    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.nhaCungCap);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final HoaDonNhapHangModel other = (HoaDonNhapHangModel) obj;
        return Objects.equals(this.nhaCungCap, other.nhaCungCap) && Objects.equals(this.getMaHD(), other.getMaHD()) && Double.doubleToLongBits(this.getTongTien()) != Double.doubleToLongBits(other.getTongTien()
        );
    }
    

    
}
