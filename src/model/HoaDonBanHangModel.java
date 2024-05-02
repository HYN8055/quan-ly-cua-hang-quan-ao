/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Nhu Pham
 */
public class HoaDonBanHangModel extends HoaDonModel {
    private String tenKH;
    private String sdt;

    public HoaDonBanHangModel() {
    }

    public HoaDonBanHangModel(String tenKH, String sdt) {
        this.tenKH = tenKH;
        this.sdt = sdt;
    }
    
    public HoaDonBanHangModel(String tenKH, String sdt, String maHD, String nguoiTao, Date thoiGianTao, ArrayList<ChiTietHoaDonModel> CTHD, double tongTien, String ghiChu) {
        super(maHD, nguoiTao, thoiGianTao, CTHD, tongTien, ghiChu);
        this.tenKH = tenKH;
        this.sdt = sdt;
    }
    
    private HoaDonBanHangModel(String maHD, String nguoiTao, Date thoiGianTao, ArrayList<ChiTietHoaDonModel> CTHD, double tongTien, String ghiChu) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    @Override
    public String toString() {
        return "{HoaDonBanHang" + "TenKH=" + tenKH + "SDT=" + sdt + " maHD"+ this.getMaHD()+'}';
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.tenKH);
        hash = 37 * hash + Objects.hashCode(this.sdt);
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
        final HoaDonBanHangModel other = (HoaDonBanHangModel) obj;
        if (Objects.equals(this.tenKH, other.tenKH) && Objects.equals(this.getMaHD(), other.getMaHD()) && Double.doubleToLongBits(this.getTongTien()) != Double.doubleToLongBits(other.getTongTien())) {
            return true;
        }
        return Objects.equals(this.sdt, other.sdt);
    }
    
    
}
