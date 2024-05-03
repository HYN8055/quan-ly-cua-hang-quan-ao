/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author Nhu Pham
 */
import dao.NhaCungCapDAO;
import java.util.ArrayList;
import model.NhaCungCapModel;

/**
 *
 * @author sinh
 */
public class TimNhaCungCap {

    public static TimNhaCungCap getInstance() {
        return new TimNhaCungCap();
    }

    public ArrayList<NhaCungCapModel> searchTatCa(String text) {
        ArrayList<NhaCungCapModel> result = new ArrayList<>();
        ArrayList<NhaCungCapModel> armt = NhaCungCapDAO.getInstance().selectAll();
        for (var ncc : armt) {
            if (ncc.getMaNCC().toLowerCase().contains(text.toLowerCase())
                    || ncc.getTenNCC().toLowerCase().contains(text.toLowerCase())
                    || ncc.getSdtNCC().toLowerCase().contains(text.toLowerCase())
                    || ncc.getDiaChi().toLowerCase().contains(text.toLowerCase())
                    || ncc.getEmailNCC().toLowerCase().contains(text.toLowerCase())) {
                result.add(ncc);
            }
        }
        return result;
    }

    public ArrayList<NhaCungCapModel> searchTenNCC(String text) {
        ArrayList<NhaCungCapModel> result = new ArrayList<>();
        ArrayList<NhaCungCapModel> armt = NhaCungCapDAO.getInstance().selectAll();
        for (var ncc : armt) {
            if (ncc.getTenNCC().toLowerCase().contains(text.toLowerCase())) {
                result.add(ncc);
            }
        }
        return result;
    }

    public ArrayList<NhaCungCapModel> searchMaNCC(String text) {
        ArrayList<NhaCungCapModel> result = new ArrayList<>();
        ArrayList<NhaCungCapModel> armt = NhaCungCapDAO.getInstance().selectAll();
        for (var ncc : armt) {
            if (ncc.getMaNCC().toLowerCase().contains(text.toLowerCase())) {
                result.add(ncc);
            }
        }
        return result;
    }

    public ArrayList<NhaCungCapModel> searchDiaChi(String text) {
        ArrayList<NhaCungCapModel> result = new ArrayList<>();
        ArrayList<NhaCungCapModel> armt = NhaCungCapDAO.getInstance().selectAll();
        for (var ncc : armt) {
            if (ncc.getDiaChi().toLowerCase().contains(text.toLowerCase())) {
                result.add(ncc);
            }
        }
        return result;
    }

    public ArrayList<NhaCungCapModel> searchEmail(String text) {
        ArrayList<NhaCungCapModel> result = new ArrayList<>();
        ArrayList<NhaCungCapModel> armt = NhaCungCapDAO.getInstance().selectAll();
        for (var ncc : armt) {
            if (ncc.getEmailNCC().toLowerCase().contains(text.toLowerCase())) {
                result.add(ncc);
            }
        }
        return result;
    }
    
    public ArrayList<NhaCungCapModel> searchSdt(String text) {
        ArrayList<NhaCungCapModel> result = new ArrayList<>();
        ArrayList<NhaCungCapModel> armt = NhaCungCapDAO.getInstance().selectAll();
        for (var ncc : armt) {
            if (ncc.getSdtNCC().toLowerCase().contains(text.toLowerCase())) {
                result.add(ncc);
            }
        }
        return result;
    }
}

