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
import model.NhapHang;
import model.SanPham;
import model.ThuongHieu;
import model.XuatXu;
import utility.DBConnect;
public class NhapHang_Service {
    public ArrayList<NhapHang> getAllNH(){
        ArrayList<NhapHang> lst = new ArrayList<>();
        String sql = "Select * from NHAPHANG";
        Connection cn = DBConnect.getConnection();
        try {
            PreparedStatement pstm = cn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while(rs.next()){
                NhapHang n = new NhapHang();
                n.setMaPN(rs.getString("MaPN"));
                n.setMaSP(rs.getString("MaSP"));
                n.setNhaCC(rs.getString("MaNCC"));
                n.setSoLuong(rs.getInt("SoLuong"));
                n.setGiaNhap(rs.getDouble("GiaNhap"));
                n.setTongTien(rs.getDouble("TongTien"));
                n.setNgayNhap(rs.getString("NgayNhap"));
                lst.add(n);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return lst;
    }

    public Integer add(NhapHang h) {
        Integer row = null;
        String sql = "insert into NHAPHANG(MaSP,MaNCC,SoLuong,GiaNhap,TongTien,NgayNhap) values(?,?,?,?,?,?)";
        Connection cn = DBConnect.getConnection();
        try {
            PreparedStatement pmt = cn.prepareStatement(sql);
           
            pmt.setString(1, h.getMaSP());
            pmt.setString(2, h.getNhaCC());
            pmt.setInt(3, h.getSoLuong());
            pmt.setDouble(4, h.getGiaNhap());
            pmt.setDouble(5, h.getTongTien());
            pmt.setString(6, h.getNgayNhap());
            row = pmt.executeUpdate();
            
            
        } catch (Exception e) {
            System.out.println(e);
        }
        return row;
   
    }
    public Integer deleteNV(int MaPN){
       Integer row = null;
       String sql = "delete from NHAPHANG where MaPN = ?";
       Connection cn = DBConnect.getConnection();
       try {
           PreparedStatement pst = cn.prepareStatement(sql);
           pst.setInt(1, MaPN);
           row = pst.executeUpdate();
       } catch (Exception e) {
           System.out.println(e);
       }
       return row;
   }
    
    public List<SanPham> getNCC(String Masp) {
        List<SanPham> listNCC = new ArrayList<>();
        String sql = "Select MaNCC from SANPHAM where MaSP like ?";
        Connection cn = DBConnect.getConnection();
        try {
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setObject(1, Masp);
            ResultSet rs = pstm.executeQuery();
             while (rs.next()) {
                
                SanPham sp = new SanPham();
                sp.setMaccc(rs.getString("MaSP"));
  
                listNCC.add(sp);
                
                
            }
            
            
        return listNCC;
            
        } catch (SQLException ex) {
            Logger.getLogger(NhaCungCap_SerVice.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }
    
     public Integer getSl(String MaSP){
       Integer row = null;
       String sql = "select sum(SoLuong) from NHAPHANG\n" +
"	where MaSP like ?";
       Connection cn = DBConnect.getConnection();
       try {
           PreparedStatement pst = cn.prepareStatement(sql);
           pst.setString(1, MaSP);
           row = pst.executeUpdate();
       } catch (Exception e) {
           System.out.println(e);
       }
       return row;
   }
}