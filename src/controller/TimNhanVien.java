/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author Nhu Pham
 */
import dao.NhanVienDAO;
import java.util.ArrayList;
import model.NhanVienModel;

/**
 *
 * @author sinh
 */
public class TimNhanVien {

    public static TimNhanVien getInstance() {
        return new TimNhanVien();
    }

    public ArrayList<NhanVienModel> searchTatCa(String text) {
        ArrayList<NhanVienModel> result = new ArrayList<>();
        ArrayList<NhanVienModel> armt = NhanVienDAO.getInstance().selectAll();
        for (var nv : armt) {
            if (nv.getMaNV().toLowerCase().contains(text.toLowerCase())
                    || nv.getTenNV().toLowerCase().contains(text.toLowerCase())
                    || nv.getSdt().toLowerCase().contains(text.toLowerCase())
                    || nv.getDiaChi().toLowerCase().contains(text.toLowerCase())
                    || nv.getEmail().toLowerCase().contains(text.toLowerCase())) {
                result.add(nv);
            }
        }
        return result;
    }

    public ArrayList<NhanVienModel> searchTenNV(String text) {
        ArrayList<NhanVienModel> result = new ArrayList<>();
        ArrayList<NhanVienModel> armt = NhanVienDAO.getInstance().selectAll();
        for (var nv : armt) {
            if (nv.getTenNV().toLowerCase().contains(text.toLowerCase())) {
                result.add(nv);
            }
        }
        return result;
    }

    public ArrayList<NhanVienModel> searchMaNV(String text) {
        ArrayList<NhanVienModel> result = new ArrayList<>();
        ArrayList<NhanVienModel> armt = NhanVienDAO.getInstance().selectAll();
        for (var nv : armt) {
            if (nv.getMaNV().toLowerCase().contains(text.toLowerCase())) {
                result.add(nv);
            }
        }
        return result;
    }

    public ArrayList<NhanVienModel> searchDiaChi(String text) {
        ArrayList<NhanVienModel> result = new ArrayList<>();
        ArrayList<NhanVienModel> armt = NhanVienDAO.getInstance().selectAll();
        for (var nv : armt) {
            if (nv.getDiaChi().toLowerCase().contains(text.toLowerCase())) {
                result.add(nv);
            }
        }
        return result;
    }

    public ArrayList<NhanVienModel> searchEmail(String text) {
        ArrayList<NhanVienModel> result = new ArrayList<>();
        ArrayList<NhanVienModel> armt = NhanVienDAO.getInstance().selectAll();
        for (var nv : armt) {
            if (nv.getEmail().toLowerCase().contains(text.toLowerCase())) {
                result.add(nv);
            }
        }
        return result;
    }
    
    public ArrayList<NhanVienModel> searchSdt(String text) {
        ArrayList<NhanVienModel> result = new ArrayList<>();
        ArrayList<NhanVienModel> armt = NhanVienDAO.getInstance().selectAll();
        for (var nv : armt) {
            if (nv.getSdt().toLowerCase().contains(text.toLowerCase())) {
                result.add(nv);
            }
        }
        return result;
    }
}

