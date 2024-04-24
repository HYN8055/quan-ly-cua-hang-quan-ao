/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Tran Nhat Sinh
 */
public class HoaDonNhapHangModel extends HoaDonModel {

    private String nhaCungCap;

    public HoaDonNhapHangModel() {
    }

    public HoaDonNhapHangModel(String nhaCungCap) {
        this.nhaCungCap = nhaCungCap;
    }

    public HoaDonNhapHangModel(String nhaCungCap, String maPhieu, Timestamp thoiGianTao, String nguoiTao, ArrayList<ChiTietHoaDonModel> CTPhieu, double tongTien) {
        //super(maPhieu, thoiGianTao, nguoiTao, ChiTietHoaDonModel, tongTien);
        this.nhaCungCap = nhaCungCap;
    }


    private HoaDonNhapHangModel(String maPhieu, Timestamp thoiGianTao, String nguoiTao, ArrayList<ChiTietHoaDonModel> CTPhieu, double tongTien) {
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
        return "PhieuNhap{" + "nhaCungCap=" + nhaCungCap + " maPhieu"+ this.getMaHD()+'}';
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
