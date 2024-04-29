/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Objects;

/**
 *
 * @author Nhu Pham
 */
public class NhanVienModel {
    private String maNV;
    private String tenNV;
    private String diaChi;
    private String sdt;
    private String email;

    public NhanVienModel() {
    }

    public NhanVienModel(String maNV, String tenNV, String diaChi, String sdt, String email) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.email = email;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.maNV);
        hash = 37 * hash + Objects.hashCode(this.tenNV);
        hash = 37 * hash + Objects.hashCode(this.diaChi);
        hash = 37 * hash + Objects.hashCode(this.sdt);
        hash = 37 * hash + Objects.hashCode(this.email);
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
        final NhanVienModel other = (NhanVienModel) obj;
        if (!Objects.equals(this.maNV, other.maNV)) {
            return false;
        }
        if (!Objects.equals(this.tenNV, other.tenNV)) {
            return false;
        }
        if (!Objects.equals(this.diaChi, other.diaChi)) {
            return false;
        }
        if (!Objects.equals(this.sdt, other.sdt)) {
            return false;
        }
        return Objects.equals(this.email, other.email);
    }

    @Override
    public String toString() {
        return "NhanVienModel{" + "maNV=" + maNV + ", tenNV=" + tenNV + ", diaChi=" + diaChi + ", sdt=" + sdt + ", email=" + email + '}';
    }
    
    
}
