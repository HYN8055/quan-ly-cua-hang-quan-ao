/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Objects;

public class HoaDonModel {

    private String maHD;
    private String nguoiTao;
    private Timestamp thoiGianTao;
    private ArrayList<ChiTietHoaDonModel> CTHD;
    private double tongTien;
    private String ghiChu;

    public HoaDonModel() {
    }

    public HoaDonModel(String maHD, String nguoiTao, Timestamp thoiGianTao, ArrayList<ChiTietHoaDonModel> CTHD, double tongTien, String ghiChu) {
        this.maHD = maHD;
        this.nguoiTao = nguoiTao;
        this.thoiGianTao = thoiGianTao;
        this.CTHD = CTHD;
        this.tongTien = tongTien;
        this.ghiChu = ghiChu;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getNguoiTao() {
        return nguoiTao;
    }

    public void setNguoiTao(String nguoiTao) {
        this.nguoiTao = nguoiTao;
    }

    public Timestamp getThoiGianTao() {
        return thoiGianTao;
    }

    public void setThoiGianTao(Timestamp thoiGianTao) {
        this.thoiGianTao = thoiGianTao;
    }

    public ArrayList<ChiTietHoaDonModel> getCTHD() {
        return CTHD;
    }

    public void setCTHD(ArrayList<ChiTietHoaDonModel> CTHD) {
        this.CTHD = CTHD;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.maHD);
        hash = 97 * hash + Objects.hashCode(this.nguoiTao);
        hash = 97 * hash + Objects.hashCode(this.thoiGianTao);
        hash = 97 * hash + Objects.hashCode(this.CTHD);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.tongTien) ^ (Double.doubleToLongBits(this.tongTien) >>> 32));
        hash = 97 * hash + Objects.hashCode(this.ghiChu);
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
        final HoaDonModel other = (HoaDonModel) obj;
        if (Double.doubleToLongBits(this.tongTien) != Double.doubleToLongBits(other.tongTien)) {
            return false;
        }
        if (!Objects.equals(this.maHD, other.maHD)) {
            return false;
        }
        if (!Objects.equals(this.nguoiTao, other.nguoiTao)) {
            return false;
        }
        if (!Objects.equals(this.ghiChu, other.ghiChu)) {
            return false;
        }
        if (!Objects.equals(this.thoiGianTao, other.thoiGianTao)) {
            return false;
        }
        return Objects.equals(this.CTHD, other.CTHD);
    }

    @Override
    public String toString() {
        return "HoaDonModel{" + "maHD=" + maHD + ", nguoiTao=" + nguoiTao + ", thoiGianTao=" + thoiGianTao + ", CTHD=" + CTHD + ", tongTien=" + tongTien + ", ghiChu=" + ghiChu + '}';
    }
    
    
}
