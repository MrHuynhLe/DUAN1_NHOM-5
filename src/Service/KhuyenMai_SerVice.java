/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import model.KhuyenMai;
import model.NhaCungCap;
import utility.DBConnect;

/**
 *
 * @author admin
 */
public class KhuyenMai_SerVice {
    public ArrayList<KhuyenMai> getAllKhuyenMai() {
        ArrayList<KhuyenMai> list = new ArrayList<>();
        String sql = "select * from KHUYENMAI";
        Connection cn = DBConnect.getConnection();
        PreparedStatement pstm;
        try {
            pstm = cn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                KhuyenMai KM = new KhuyenMai();

                KM.setMaKM(rs.getString("MaKM"));
                KM.setTenChươngTrinh(rs.getString("TenChuongTrinh"));
                KM.setDieukien(rs.getString("DieuKien"));
                KM.setNgayBatDau(rs.getString("NgayBatDau"));
                KM.setNgayKetThuc(rs.getString("NgayKetThuc"));
                KM.setTile(Float.parseFloat(rs.getString("TiLeKM")));
                list.add(KM);
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(KhuyenMai_SerVice.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }

    public Integer addKhuyenMai(KhuyenMai km) {
        Integer row = null;
        String sql = "Insert into KHUYENMAI(MaKM, TenChuongTrinh, DieuKien, NgayBatDau, NgayKetThuc,TiLeKM)\n"
                + "values (?,?,?,?,?,?)";
        Connection cn = DBConnect.getConnection();
        try {
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, km.getMaKM());
            pstm.setString(2, km.getTenChươngTrinh());
            pstm.setString(3, km.getDieukien());
            pstm.setString(4, km.getNgayBatDau());
            pstm.setString(5, km.getNgayKetThuc());
            pstm.setFloat(6, km.getTile());
            row = pstm.executeUpdate();
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(KhuyenMai_SerVice.class.getName()).log(Level.SEVERE, null, ex);

        }
        return row;
    }

    public Integer updateKhuyenMai(KhuyenMai km) {
        Integer row = null;
        String sql = "update KHUYENMAI\n"
                + "set TenChuongTrinh =?, DieuKien=?, NgayBatDau=?, NgayKetThuc=?,TiLeKM = ?\n"
                + "where MaKM=?";
        Connection cn = DBConnect.getConnection();
        try {
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(6, km.getMaKM());
            pstm.setString(1, km.getTenChươngTrinh());
            pstm.setString(2, km.getDieukien());
            pstm.setString(3, km.getNgayBatDau());
            pstm.setString(4, km.getNgayKetThuc());
            pstm.setFloat(5, km.getTile());
            row = pstm.executeUpdate();
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(KhuyenMai_SerVice.class.getName()).log(Level.SEVERE, null, ex);
        }
        return row;
    }

    public Integer deleteKhachHang(String MaKM) {
        Integer row = null;
        String sql = "delete from KHUYENMAI\n"
                + "where MaKM=?";
        Connection cn = DBConnect.getConnection();
        try {
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, MaKM);

            row = pstm.executeUpdate();
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(KhuyenMai_SerVice.class.getName()).log(Level.SEVERE, null, ex);
        }
        return row;

    }
    
}
