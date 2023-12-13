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
import java.util.logging.Level;
import java.util.logging.Logger;
import model.HoaDon;
import utility.DBConnect;

/**
 *
 * @author admin
 */
public class HoaDon_SerVice {
    public ArrayList<HoaDon> getALL() {
        ArrayList<HoaDon> listHD = new ArrayList<>();
        try {
            String sql = "select HOADON.MaHD,MaNV,MaKM,TrangThai,TongTien,NgayBan,CHITIETHOADON.SoLuong,GiaBan,KHACHHANG.MaKH,SDT,TenKH,SANPHAM.TenSP from HOADON join CHITIETHOADON on HOADON.MaHD = CHITIETHOADON.MaHD\n"
                    + "                    join KHACHHANG on KHACHHANG.MaKH = HOADON.MaKH\n"
                    + "					join SANPHAM on SANPHAM.MaSP = CHITIETHOADON.MaSP";
            Connection con = DBConnect.getConnection();
            PreparedStatement pstm = con.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                HoaDon hd = new HoaDon();
                hd.setMaNV(rs.getString("MaNV"));
                hd.setMaHD(rs.getString("MaHD"));
                hd.setTenKH(rs.getString("TenKH"));
                hd.setSDT(rs.getString("SDT"));
                hd.setMaKH(rs.getString("MaKH"));
                hd.setTenSP(rs.getString("TenSP"));
                hd.setSoLuong(rs.getInt("SoLuong"));
                hd.setMaKM(rs.getString("MaKM"));
                hd.setGia(rs.getDouble("GiaBan"));
                hd.setNgayBan(rs.getString("NgayBan"));
                hd.setThanhTien(rs.getDouble("TongTien"));              
                hd.setTrangThai(rs.getString("TrangThai"));
                hd.setTongTien(hd.getTongTien());
                listHD.add(hd);
            }
        } catch (Exception e) {
            Logger.getLogger(HoaDon_SerVice.class.getName()).log(Level.SEVERE, null, e);
        }
        return listHD;
    }
     public Integer addHoaDon(HoaDon hd) {
          String sql = "insert into HOADON values(?,?,?,?,?,?)";
        try {
           Connection con = DBConnect.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            
          
            ps.setString(1, hd.getMaNV());
             ps.setString(2, hd.getMaKH());
              ps.setString(3, hd.getMaKM());
              ps.setString(4, hd.getNgayBan());
              ps.setDouble(5, hd.getThanhTien());
              ps.setString(6, hd.getTrangThai());
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
     
     public Integer updateSV (HoaDon s) {
       Integer row = null;
        String sql = "update HOADON set TrangThai = N'Đã thanh toán' where MaHD like ?";
        Connection cn = DBConnect.getConnection();
        try {
            PreparedStatement pstm = cn.prepareStatement(sql);
             pstm.setString(2, s.getMaHD());
            pstm.setString(1, s.getTrangThai());
           
          
            
            row = pstm.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return row;
   }
     public String updateHD(String maHD,String trangThai) throws SQLException{
         String sql = "update HOADON set TrangThai = ? where MaHD like ?";
        Connection cn = DBConnect.getConnection();
        
            PreparedStatement pstm = cn.prepareCall(sql);
             pstm.setString(1,trangThai );
            pstm.setString(2,maHD);
           
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
