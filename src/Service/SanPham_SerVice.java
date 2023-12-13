/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class SanPham_SerVice {

    public ArrayList<SanPham>  GetAllSanPham() {
         ArrayList<SanPham> list = new ArrayList<>();
        try {
            String sql ="select MaSP,TenSP,Soluong,Gia,NHACUNGCAP.MaNCC ,\n" +
"	THUONGHIEU.Mathuonghieu,THUONGHIEU.Tenthuonghieu, XUATXU.MaXX,XUATXU.Tennuoc,KHOILUONG.MaKhoiLuong,KHOILUONG.KhoiLuong\n" +
"	from SANPHAM\n" +
"	join NHACUNGCAP on NHACUNGCAP.MaNCC = SANPHAM.MaNCC\n" +
"	join THUONGHIEU on THUONGHIEU.Mathuonghieu = SANPHAM.Mathuonghieu\n" +
"	join XUATXU on XUATXU.MaXX = SANPHAM.MaXX\n" +
"	join KHOILUONG on KHOILUONG.MaKhoiLuong = SANPHAM.MaKhoiLuong	";
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
                
                SanPham sp = new SanPham();
                sp.setMaSP(rs.getString("MaSP"));
                sp.setTenSP(rs.getString("TenSP"));
                sp.setSoLuong(rs.getInt("Soluong"));
                sp.setGia(rs.getDouble("Gia"));
                sp.setMaccc(rs.getString("MaNCC"));
                sp.setThuonghieu(TH);
                sp.setXuatxu(XX);
                sp.setKhoiluong(KL);
                
                list.add(sp);
                
                
            }
        } catch (Exception e) {
            Logger.getLogger(SanPham_SerVice.class.getName()).log(Level.SEVERE, null, e);
            
        }

        return list;
    }
    
    public Object addSanPham(SanPham sp) {
        Integer row = null;
        String sql = "insert into  SANPHAM (MaSP,TenSP,Soluong,Gia,MaNCC,Mathuonghieu,MaXX,MaKhoiLuong) \n" +
"	values (?,?,?,?,?,?,?,? )";
        Connection cn = DBConnect.getConnection();
        try {
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, sp.getMaSP());
            pstm.setString(2, sp.getTenSP());            
            pstm.setInt(3, sp.getSoLuong());
            pstm.setDouble(4, sp.getGia());
            pstm.setString(5, sp.getMaccc());
            pstm.setString(6, sp.getThuonghieu().getMathuonghieu());
            pstm.setString(7, sp.getXuatxu().getMaXX());
            pstm.setString(8, sp.getKhoiluong().getMaKhoiLuong());
            
            row = pstm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SanPham_SerVice.class.getName()).log(Level.SEVERE, null, ex);
        }
        return row;
    }
    
    
    
     public Object UpdateSanPham(SanPham sp) {
        Integer row = null;
        String sql = "update SANPHAM set TenSP =?,Soluong=?,Gia=?,MaNCC= ?,Mathuonghieu=?,MaXX=?,MaKhoiLuong=? where MaSP = ?";
        Connection cn = DBConnect.getConnection();
        try {
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(8, sp.getMaSP());
            pstm.setString(1, sp.getTenSP());
            pstm.setInt(2, sp.getSoLuong());
            pstm.setDouble(3, sp.getGia());
            pstm.setString(4, sp.getMaccc());
            pstm.setString(5, sp.getThuonghieu().getMathuonghieu());
            pstm.setString(6, sp.getXuatxu().getMaXX());
            pstm.setString(7, sp.getKhoiluong().getMaKhoiLuong());
            
            row = pstm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SanPham_SerVice.class.getName()).log(Level.SEVERE, null, ex);
        }
        return row;
    }


      public Object XoaSanPham(String MaSP) {
        Integer row = null;
        String sql = "delete from SANPHAM where MaSP = ?";
        Connection cn = DBConnect.getConnection();
        try {
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, MaSP);
            
            row = pstm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SanPham_SerVice.class.getName()).log(Level.SEVERE, null, ex);
        }
        return row;
    }
      
      public List<SanPham> timkiemSp(String Ten) {
        List<SanPham> listTimSP = new ArrayList<>();
        String sql = "select MaSP,TenSP,Soluong,Gia,NHACUNGCAP.MaNCC ,\n" +
"	THUONGHIEU.Mathuonghieu,THUONGHIEU.Tenthuonghieu, XUATXU.MaXX,XUATXU.Tennuoc,KHOILUONG.MaKhoiLuong,KHOILUONG.KhoiLuong\n" +
"	from SANPHAM\n" +
"	join NHACUNGCAP on NHACUNGCAP.MaNCC = SANPHAM.MaNCC\n" +
"	join THUONGHIEU on THUONGHIEU.Mathuonghieu = SANPHAM.Mathuonghieu\n" +
"	join XUATXU on XUATXU.MaXX = SANPHAM.MaXX\n" +
"	join KHOILUONG on KHOILUONG.MaKhoiLuong = SANPHAM.MaKhoiLuong	\n" +
"	where TenSP like ?";
        Connection cn = DBConnect.getConnection();
        try {
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setObject(1, Ten);
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
                sp.setMaccc(rs.getString("MaNCC"));
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
      
       public List<SanPham> getById(String Id) {
        List<SanPham> listTimSP = new ArrayList<>();
        String sql = "select MaSP,TenSP,Soluong,Gia,NHACUNGCAP.MaNCC ,\n" +
"	THUONGHIEU.Mathuonghieu,THUONGHIEU.Tenthuonghieu, XUATXU.MaXX,XUATXU.Tennuoc,KHOILUONG.MaKhoiLuong,KHOILUONG.KhoiLuong\n" +
"	from SANPHAM\n" +
"	join NHACUNGCAP on NHACUNGCAP.MaNCC = SANPHAM.MaNCC\n" +
"	join THUONGHIEU on THUONGHIEU.Mathuonghieu = SANPHAM.Mathuonghieu\n" +
"	join XUATXU on XUATXU.MaXX = SANPHAM.MaXX\n" +
"	join KHOILUONG on KHOILUONG.MaKhoiLuong = SANPHAM.MaKhoiLuong	\n" +
"	where MaSP like ?";
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
                sp.setMaccc(rs.getString("MaNCC"));
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
       
       public SanPhamCT find(String ma) {
        SanPhamCT sp = null;
        String sql = "select  MaSP,TenSP,Soluong,Gia from SANPHAM where MaSP like ?";
        Connection cn = DBConnect.getConnection();
        try {
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, ma);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {

                String id = rs.getString("MaSp");
                String ten = rs.getString("TenSp");
                Integer sl = rs.getInt("Soluong");
                Double gia = rs.getDouble("Gia");
                Double tt = sl * gia;
                sp = new SanPhamCT(id, ten, sl, gia, tt);
            }
            return sp;
        } catch (Exception e) {
            System.out.println(e);
        }
        return sp;
    }
       
        public SanPham findByMaSP(String MaSp) {
        SanPham sp = null;
        String sql = "select Gia from SANPHAM" +
"	where MaSP like ?" ;
        Connection cn = DBConnect.getConnection();
        try {
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, MaSp);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                
                Double Gia = rs.getDouble("Gia");

                sp = new SanPham(null,null,0,Gia,null,null,null,null);
                
               
            }
            return sp;
        } catch (Exception e) {
            System.out.println(e);
        }
        return sp;
    }
        
        public String updateSl(String maSP,int soLuong) throws SQLException{
         String sql = "update SANPHAM set Soluong = ? where MaSP like ?";
        Connection cn = DBConnect.getConnection();
        
            PreparedStatement pstm = cn.prepareCall(sql);
             pstm.setInt(1,soLuong );
            pstm.setString(2,maSP);
           
           int rowsUpdated = pstm.executeUpdate();

        pstm.close();
        cn.close();

        if (rowsUpdated > 0) {
            return "Sửa thành công!";
        } else {
            return "Không có sản phẩm nào được sửa!";
        }
     } 

}
