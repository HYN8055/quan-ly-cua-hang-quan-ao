
package controller.emplyees;
import view.employees.TrangChu;
import view.employees.SanPham;
import bean.employees.DanhMucBean;
import view.employees.HoaDonBH;
import view.employees.NhaCungCap;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.BorderLayout;
import java.util.*;
import java.awt.event.*;
import view.employees.BanHang;
import view.employees.DoiTraHang;
import view.employees.HoaDonNH;
import view.employees.HoaDonDT;
import view.employees.NhapHang;
import view.employees.TaiKhoan;
import view.employees.ThongKe;
import view.employees.ThongTin;
import view.employees.XuatHang;

/**
 *
 * @author hyn09
 */
public class ChuyenManHinhController {
    private JPanel root;
    private String kindSelected = "";
    
    private List<DanhMucBean> listItem= null;

    public ChuyenManHinhController(JPanel jpnRoot) {
        this.root = jpnRoot;
    }
    public void setView(JPanel jpnItem, JLabel jlbItem){
        kindSelected="TrangChu";
        jpnItem.setBackground(new Color(96,100,191));
        jlbItem.setBackground(new Color(96,100,191));
        
        root.removeAll();
        root.setLayout(new BorderLayout());
        root.add(new TrangChu());
        root.validate();
        root.repaint();
    }
    
    public void setEvent(List<DanhMucBean> listItem){
        this.listItem = listItem;
        for(DanhMucBean item : listItem){
            item.getJlb().addMouseListener(new LabelEvent(item.getKind(),item.getJpn(),item.getJlb()));
        }
    }
    
    class LabelEvent implements MouseListener{
        
        private JPanel node;
        private String kind;
        
        private JPanel jpnItem;
        private JLabel jlbItem;

        public LabelEvent(String kind, JPanel jpnItem, JLabel jlbItem) {
            this.kind = kind;
            this.jpnItem = jpnItem;
            this.jlbItem = jlbItem;
        }
        
        

        @Override
        public void mouseClicked(MouseEvent e) {
            switch (kind){
                case "TrangChu" -> node = new TrangChu();
                case "SanPham" -> node=new SanPham();
                case "NhaCungCap" -> node=new NhaCungCap();
                case "BanHang" -> node=new BanHang();
                case "NhapHang" -> node=new NhapHang();
                case "HoaDonBH" -> node=new HoaDonBH();
                case "HoaDonNH" -> node=new HoaDonNH();
                case "HoaDonDT" -> node=new HoaDonDT();
                case "TaiKhoan" -> node=new TaiKhoan();
                case "ThongKe" -> node=new ThongKe();
                case "ThongTin" -> node=new ThongTin();
                default -> {
                    node = new TrangChu();
                }

            }
            root.removeAll();
            root.setLayout(new BorderLayout());
            root.add(node);
            root.validate();
            root.repaint();
            setChangeBackground(kind);
        }

        @Override
        public void mousePressed(MouseEvent e) {
            kindSelected = kind;
            jpnItem.setBackground(new Color(125,125,125));
            jlbItem.setBackground(new Color(125,125,125));
               
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            jpnItem.setBackground(new Color(255, 255, 255));
            jlbItem.setBackground(new Color(255, 255, 255));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            if(!kindSelected.equalsIgnoreCase(kind)){
                jpnItem.setBackground(new Color(152,205,205));
                jlbItem.setBackground(new Color(152,205,205));
            }
        }
        
        
    }
    
    private void setChangeBackground(String kind){
        for (DanhMucBean item : listItem){
            if(item.getKind().equalsIgnoreCase(kind)){
                item.getJpn().setBackground(new Color(255, 255, 255));
                item.getJlb().setBackground(new Color(255, 255, 255));
            }else{
                item.getJpn().setBackground(new Color(152,205,205));
                item.getJlb().setBackground(new Color(152,205,205));
            }
    }
    }
            
}
