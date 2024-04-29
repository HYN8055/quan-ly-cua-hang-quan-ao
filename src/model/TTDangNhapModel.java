
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
    private String email;
    private String role;

    public TTDangNhapModel() {
    }

    public TTDangNhapModel(String MaNV, String user, String password, String email, String role) {
        this.MaNV = MaNV;
        this.user = user;
        this.password = password;
        this.email = email;
        this.role = role;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.MaNV);
        hash = 53 * hash + Objects.hashCode(this.user);
        hash = 53 * hash + Objects.hashCode(this.password);
        hash = 53 * hash + Objects.hashCode(this.email);
        hash = 53 * hash + Objects.hashCode(this.role);
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
        if (!Objects.equals(this.MaNV, other.MaNV)) {
            return false;
        }
        if (!Objects.equals(this.user, other.user)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        return Objects.equals(this.role, other.role);
    }

    @Override
    public String toString() {
        return "TTDangNhapModel{" + "MaNV=" + MaNV + ", user=" + user + ", password=" + password + ", email=" + email + ", role=" + role + '}';
    }
    
    

}

    