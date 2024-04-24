/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.emplyees;

import dao.TaiKhoanDAO;
import java.util.ArrayList;
import model.TTDangNhapModel
;
/**
 *
 * @author sinh
 */
public class TimTaiKhoan {

    public static TimTaiKhoan getInstance() {
        return new TimTaiKhoan();
    }

    public ArrayList<TTDangNhapModel> searchTatCaAcc(String text) {
        ArrayList<TTDangNhapModel> result = new ArrayList<>();
        ArrayList<TTDangNhapModel> armt = TaiKhoanDAO.getInstance().selectAll();
        for (var tk : armt) {
            if (tk.getMaNV().toLowerCase().contains(text.toLowerCase())
                    || tk.getUser().toLowerCase().contains(text.toLowerCase())
                    || tk.getRole().toLowerCase().contains(text.toLowerCase())) {
                result.add(tk);
            }
        }
        return result;
    }

    public ArrayList<TTDangNhapModel> searchMaNV(String text) {
        ArrayList<TTDangNhapModel> result = new ArrayList<>();
        ArrayList<TTDangNhapModel> armt = TaiKhoanDAO.getInstance().selectAll();
        for (var tk : armt) {
            if (tk.getMaNV().toLowerCase().contains(text.toLowerCase())) {
                result.add(tk);
            }
        }
        return result;
    }

    public ArrayList<TTDangNhapModel> searchUserName(String text) {
        ArrayList<TTDangNhapModel> result = new ArrayList<>();
        ArrayList<TTDangNhapModel> armt = TaiKhoanDAO.getInstance().selectAll();
        for (var tk : armt) {
            if (tk.getUser().toLowerCase().contains(text.toLowerCase())) {
                result.add(tk);
            }
        }
        return result;
    }

    public ArrayList<TTDangNhapModel> searchRole(String text) {
        ArrayList<TTDangNhapModel> result = new ArrayList<>();
        ArrayList<TTDangNhapModel> armt = TaiKhoanDAO.getInstance().selectAll();
        for (var tk : armt) {
            if (tk.getRole().toLowerCase().contains(text.toLowerCase())) {
                result.add(tk);
            }
        }
        return result;
    }
}
