/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.KhachHang;
import model.KhoiLuong;
import model.NhaCungCap;
import model.SanPham;
import model.SanPhamCT;
import model.ThuongHieu;
import model.XuatXu;
import utility.DBConnect;

/**
 *
 * @author admin
 */
public class SanPhamCT_Service {
     public ArrayList<SanPhamCT>  GetAllSanPham() {
         ArrayList<SanPhamCT> list = new ArrayList<>();
        try {
            String sql ="Select  SANPHAM.MaSP,TenSP, SANPHAM.Soluong,Gia,THUONGHIEU.Mathuonghieu,THUONGHIEU.Tenthuonghieu,\n" +
"XUATXU.MaXX,XUATXU.Tennuoc, KHOILUONG.MaKhoiLuong,KHOILUONG.KhoiLuong\n" +
"from SANPHAM\n" +

"	join KHOILUONG on KHOILUONG.MaKhoiLuong = SANPHAM.MaKhoiLuong\n" +
"	join THUONGHIEU on THUONGHIEU.Mathuonghieu = SANPHAM.Mathuonghieu\n" +
"	join XUATXU on XUATXU.MaXX = SANPHAM.MaXX";
            Connection con = DBConnect.getConnection();
            PreparedStatement pstm = con.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();

            while (rs.next()) {
                
                ThuongHieu TH = new ThuongHieu();
                TH.setMathuonghieu(rs.getString("Mathuonghieu"));
                TH.setTenthuonghieu(rs.getString("Tenthuonghieu"));

                XuatXu XX = new XuatXu();
                XX.setMaXX(rs.getString("MaXX"));
                XX.setTennuoc(rs.getString("Tennuoc"));
                
                KhoiLuong KL = new KhoiLuong();
                KL.setMaKhoiLuong(rs.getString("MaKhoiLuong"));
                KL.setKhoiLuong(rs.getString("KhoiLuong"));
                
                SanPhamCT sp = new SanPhamCT();
                sp.setMaSp(rs.getString("MaSP"));
                sp.setTenSp(rs.getString("TenSP"));
                sp.setSoLuong(rs.getInt("Soluong"));
                sp.setGiaBan(rs.getDouble("Gia"));
                sp.setTongTien(rs.getDouble("TongTien"));
                
                list.add(sp);
                
                
            }
        } catch (Exception e) {
            Logger.getLogger(SanPham_SerVice.class.getName()).log(Level.SEVERE, null, e);
            
        }

        return list;
    }
     
       public List<SanPham> getById(String Id) {
        List<SanPham> listTimSP = new ArrayList<>();
        String sql = "Select  SANPHAM.MaSP,TenSP, SANPHAM.Soluong,Gia,THUONGHIEU.Mathuonghieu,THUONGHIEU.Tenthuonghieu,\n" +
"XUATXU.MaXX,XUATXU.Tennuoc, KHOILUONG.MaKhoiLuong,KHOILUONG.KhoiLuong\n" +
"from SANPHAM\n" +
"	join KHOILUONG on KHOILUONG.MaKhoiLuong = SANPHAM.MaKhoiLuong\n" +
"	join THUONGHIEU on THUONGHIEU.Mathuonghieu = SANPHAM.Mathuonghieu\n" +
"	join XUATXU on XUATXU.MaXX = SANPHAM.MaXX\n" +
"where MaSp like ?";
        Connection cn = DBConnect.getConnection();
        try {
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setObject(1, Id);
            ResultSet rs = pstm.executeQuery();
             while (rs.next()) {
                
                ThuongHieu TH = new ThuongHieu();
                TH.setMathuonghieu(rs.getString("Mathuonghieu"));
                TH.setTenthuonghieu(rs.getString("Tenthuonghieu"));

                XuatXu XX = new XuatXu();
                XX.setMaXX(rs.getString("MaXX"));
                XX.setTennuoc(rs.getString("Tennuoc"));
                
                KhoiLuong KL = new KhoiLuong();
                KL.setMaKhoiLuong(rs.getString("MaKhoiLuong"));
                KL.setKhoiLuong(rs.getString("KhoiLuong"));
                
                SanPham sp = new SanPham();
                sp.setMaSP(rs.getString("MaSP"));
                sp.setTenSP(rs.getString("TenSP"));
                sp.setSoLuong(rs.getInt("Soluong"));
                sp.setGia(rs.getDouble("Gia"));
                sp.setThuonghieu(TH);
                sp.setXuatxu(XX);
                sp.setKhoiluong(KL);
                
                listTimSP.add(sp);
                
                
            }
            
            
        return listTimSP;
            
        } catch (SQLException ex) {
            Logger.getLogger(NhaCungCap_SerVice.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }
       
       
}
    
   