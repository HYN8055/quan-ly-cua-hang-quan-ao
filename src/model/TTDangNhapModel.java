
package model;

import java.util.Objects;

/**
 *
 * @author hyn09
 */
public class TTDangNhapModel {
    private String MaNV;
    private String user;
    private String password;
    private String role;
    private int status;

    public TTDangNhapModel() {
    }

    public TTDangNhapModel(String MaNV, String user, String password, String role, int status) {
        this.MaNV = MaNV;
        this.user = user;
        this.password = password;
        this.role = role;
        this.status = status;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.MaNV);
        hash = 23 * hash + Objects.hashCode(this.user);
        hash = 23 * hash + Objects.hashCode(this.password);
        hash = 23 * hash + Objects.hashCode(this.role);
        hash = 23 * hash + this.status;
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
        final TTDangNhapModel other = (TTDangNhapModel) obj;
        if (this.status != other.status) {
            return false;
        }
        if (!Objects.equals(this.MaNV, other.MaNV)) {
            return false;
        }
        if (!Objects.equals(this.user, other.user)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        return Objects.equals(this.role, other.role);
    }

    @Override
    public String toString() {
        return "TaikhoanDAO{" + "MaNV=" + MaNV + ", user=" + user + ", password=" + password + ", role=" + role + ", status=" + status + '}';
    }

    
}