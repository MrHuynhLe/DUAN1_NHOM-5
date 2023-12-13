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
import model.SanPham;
import utility.DBConnect;

/**
 *
 * @author admin
 */
public class KhachHang_SerVice {

    public ArrayList<KhachHang> getAllKhachHang() {
        ArrayList<KhachHang> list = new ArrayList<>();
        String sql = "select KHACHHANG.MaKH,KHACHHANG.TenKH,GioiTinh,DiaChi,SDT,Loai,Sum(TongTien) as TongChiTieu from KHACHHANG\n" +
"join HOADON on HOADON.MaKH = KHACHHANG.MaKH\n" +
"group by KHACHHANG.MaKH,KHACHHANG.TenKH,GioiTinh,DiaChi,SDT,Loai";
        Connection cn = DBConnect.getConnection();
        PreparedStatement pstm;
        try {
            pstm = cn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                KhachHang kh = new KhachHang();

                kh.setMaKH(rs.getString("MaKH"));
                kh.setTenKH(rs.getString("TenKH"));
                kh.setGioitinh(rs.getString("GioiTinh"));
                kh.setDiaChi(rs.getString("DiaChi"));
                kh.setSDT(rs.getString("SDT"));
                kh.setLoai(rs.getString("Loai"));
                kh.setChiTieu(rs.getDouble("TongChiTieu"));
                list.add(kh);
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(KhachHang_SerVice.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }
    
    
    public Object addKhachHang(KhachHang kh) {
        Integer row = null;
        String sql = "insert into KHACHHANG values (?,?,?,?,?,?,?)";
        Connection cn = DBConnect.getConnection();
        try {
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, kh.getMaKH());
            pstm.setString(2, kh.getTenKH());            
            pstm.setString(3, kh.getGioitinh());
            pstm.setString(4, kh.getDiaChi());
            pstm.setString(5, kh.getSDT());
            pstm.setString(6, kh.getLoai());
            pstm.setDouble(7, kh.getChiTieu());
            
            row = pstm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(KhachHang_SerVice.class.getName()).log(Level.SEVERE, null, ex);
        }
        return row;
    }
    
    public Object UpdateKhachHang(KhachHang kh) {
        Integer row = null;
        String sql = "update KHACHHANG set TenKH =? , GioiTinh =? , DiaChi= ? , SDT=? , Loai = ? ,TongChiTieu =? \n" +
"	where MaKH = ?";
        Connection cn = DBConnect.getConnection();
        try {
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(7, kh.getMaKH());
            pstm.setString(1, kh.getTenKH());            
            pstm.setString(2, kh.getGioitinh());
            pstm.setString(3, kh.getDiaChi());
            pstm.setString(4, kh.getSDT());
            pstm.setString(5, kh.getLoai());
            pstm.setDouble(6, kh.getChiTieu());
            row = pstm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(KhachHang_SerVice.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return row;
    }
        
      public Object XoaKH(String MaKH) {
        Integer row = null;
        String sql = "delete from KHACHHANG where MaKH = ?";
        Connection cn = DBConnect.getConnection();
        try {
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, MaKH);
            
            row = pstm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(KhachHang_SerVice.class.getName()).log(Level.SEVERE, null, ex);
        }
        return row;
    }
      
      public List<KhachHang> timkiem(String Ten) {
        List<KhachHang> listTim = new ArrayList<>();
        String sql = "select MaKH,TenKH,GioiTinh,DiaChi,SDT,Loai from KHACHHANG where TenKH like ?";
        Connection cn = DBConnect.getConnection();
        try {
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setObject(1, Ten);
            ResultSet rs = pstm.executeQuery();
             while (rs.next()) {
                KhachHang kh = new KhachHang();
                kh.setMaKH(rs.getString("MaKH"));
                kh.setTenKH(rs.getString("TenKH"));
                kh.setGioitinh(rs.getString("GioiTinh"));
                kh.setDiaChi(rs.getString("DiaChi"));
                kh.setSDT(rs.getString("SDT"));
                kh.setLoai(rs.getString("Loai"));
                kh.setChiTieu(rs.getDouble("TongChiTieu"));
                listTim.add(kh);
            }

        return listTim;
            
        } catch (SQLException ex) {
            Logger.getLogger(NhaCungCap_SerVice.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }
      
      public KhachHang findBySDT(String sdt) {
        KhachHang kh = null;
        String sql = "select * from KhachHang where SDT like ?";
        Connection cn = DBConnect.getConnection();
        try {
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, sdt);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {

                String MaKH = rs.getString("MaKH");
                String TenKH = rs.getString("TenKH");
                String Gioitinh  = rs.getString("GioiTInh");
                String DiaChi = rs.getString("DiaChi");
                String SDT = rs.getString("SDT");
                String Loai = rs.getString("Loai");
                Double ChiTieu = rs.getDouble("TongChiTieu");
               kh = new KhachHang(MaKH, TenKH, Gioitinh, DiaChi, SDT, Loai, ChiTieu);
            }
            return kh;
        } catch (Exception e) {
            System.out.println(e);
        }
        return kh;
    }

    

}
