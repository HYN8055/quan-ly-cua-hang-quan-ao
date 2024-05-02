/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.HoaDonBanHangDAO;
import java.util.ArrayList;
import model.HoaDonBanHangModel;

/**
 *
 * @author Nhu Pham
 */
public class TimHDBH {

    public static TimHDBH getInstance() {
        return new TimHDBH();
    }
    
    public ArrayList<HoaDonBanHangModel> searchTatCa(String text) {
        ArrayList<HoaDonBanHangModel> result = new ArrayList<>();
        ArrayList<HoaDonBanHangModel> armt = HoaDonBanHangDAO.getInstance().selectAll();
        for (var phieu : armt) {
            if (phieu.getMaHD().toLowerCase().contains(text.toLowerCase())
                    || phieu.getNguoiTao().toLowerCase().contains(text.toLowerCase())
                    || phieu.getGhiChu().toLowerCase().contains(text.toLowerCase())
                    || phieu.getSdt().toLowerCase().contains(text.toLowerCase())
                    || phieu.getTenKH().toLowerCase().contains(text.toLowerCase())) {
                result.add(phieu);
            }

        }
        return result;
    }
    
    public ArrayList<HoaDonBanHangModel> searchMaPhieu(String text) {
        ArrayList<HoaDonBanHangModel> result = new ArrayList<>();
        ArrayList<HoaDonBanHangModel> armt = HoaDonBanHangDAO.getInstance().selectAll();
        for (var phieu : armt) {
            if (phieu.getMaHD().toLowerCase().contains(text.toLowerCase())) {
                result.add(phieu);
            }
        }
        return result;
    }

    public ArrayList<HoaDonBanHangModel> searchNguoiTao(String text) {
        ArrayList<HoaDonBanHangModel> result = new ArrayList<>();
        ArrayList<HoaDonBanHangModel> armt = HoaDonBanHangDAO.getInstance().selectAll();
        for (var phieu : armt) {
            if (phieu.getNguoiTao().toLowerCase().contains(text.toLowerCase())) {
                result.add(phieu);
            }

        }
        return result;
    }
}
