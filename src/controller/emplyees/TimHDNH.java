/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.emplyees;

import dao.HoaDonNhapHangDAO;
import java.util.ArrayList;
import model.HoaDonNhapHangModel;

/**
 *
 * @author Nhu Pham
 */
public class TimHDNH {
    public static TimHDNH getInstance() {
        return new TimHDNH();
    }
    
    public ArrayList<HoaDonNhapHangModel> searchTatCa(String text) {
        ArrayList<HoaDonNhapHangModel> result = new ArrayList<>();
        ArrayList<HoaDonNhapHangModel> armt = HoaDonNhapHangDAO.getInstance().selectAll();
        for (var phieu : armt) {
            if (phieu.getMaHD().toLowerCase().contains(text.toLowerCase())
                    || phieu.getNhaCungCap().toLowerCase().contains(text.toLowerCase())
                    || phieu.getNguoiTao().toLowerCase().contains(text.toLowerCase())
                    || phieu.getGhiChu().toLowerCase().contains(text.toLowerCase())) {
                result.add(phieu);
            }

        }
        return result;
    }

    public ArrayList<HoaDonNhapHangModel> searchMaPhieuNhap(String text) {
        ArrayList<HoaDonNhapHangModel> result = new ArrayList<>();
        ArrayList<HoaDonNhapHangModel> armt = HoaDonNhapHangDAO.getInstance().selectAll();
        for (var phieu : armt) {
            if (phieu.getMaHD().toLowerCase().contains(text.toLowerCase())) {
                result.add(phieu);
            }

        }
        return result;
    }

    public ArrayList<HoaDonNhapHangModel> searchNhaCungCap(String text) {
        ArrayList<HoaDonNhapHangModel> result = new ArrayList<>();
        ArrayList<HoaDonNhapHangModel> armt = HoaDonNhapHangDAO.getInstance().selectAll();
        for (var phieu : armt) {
            if (phieu.getNhaCungCap().toLowerCase().contains(text.toLowerCase())) {
                result.add(phieu);
            }

        }
        return result;
    }

    public ArrayList<HoaDonNhapHangModel> searchNguoiTao(String text) {
        ArrayList<HoaDonNhapHangModel> result = new ArrayList<>();
        ArrayList<HoaDonNhapHangModel> armt = HoaDonNhapHangDAO.getInstance().selectAll();
        for (var phieu : armt) {
            if (phieu.getNguoiTao().toLowerCase().contains(text.toLowerCase())) {
                result.add(phieu);
            }
        }
        return result;
    }

}
