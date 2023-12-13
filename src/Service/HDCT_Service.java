/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;


import java.util.ArrayList;
import model.HoaDonChiTiet;
import java.sql.*;
import utility.DBConnect;

/**
 *
 * @author Admin
 */
public class HDCT_Service {
    
    public ArrayList<HoaDonChiTiet>getAll(){
        ArrayList<HoaDonChiTiet> listhdct = new ArrayList<>();
        String sql = "select * from CHITIETHOADON";
        try {
            Connection cn = DBConnect.getConnection();
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                HoaDonChiTiet hdct = new HoaDonChiTiet();
                 hdct.setMaHd(rs.getString("MaHD"));
                 hdct.setMaSp(rs.getString("MaSP"));
                 hdct.setSl(rs.getInt("sl"));
                 hdct.setGia(rs.getDouble("GiaBan"));
                 listhdct.add(hdct);
                 
            }
        } catch (Exception e) {
            System.out.println("Service.HDCT_Service.getAll()"+e);
        }
        return listhdct;
    }
     public Integer addHoaDonCT(HoaDonChiTiet hd) {
          String sql = "insert into CHITIETHOADON values(?,?,?)";
        try {
           Connection con = DBConnect.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);           
            
             ps.setString(1, hd.getMaSp());
             
              ps.setInt(2, hd.getSl());
              ps.setDouble(3, hd.getGia());
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}
