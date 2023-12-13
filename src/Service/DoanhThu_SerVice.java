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
import model.DoanhThu;
import model.HoaDon;
import utility.DBConnect;

/**
 *
 * @author admin
 */
public class DoanhThu_SerVice {

    public ArrayList<DoanhThu> getAllDt() {
        ArrayList<DoanhThu> list = new ArrayList<>();
        try {
            String sql = "select NgayBan, count(NgayBan) as 'Số Hóa Đơn', sum(TongTien) as 'Tổng Doanh Thu' \n"
                    + "	from HOADON\n"
                    + "	group by NgayBan";
            Connection cn = DBConnect.getConnection();
            PreparedStatement pstm = cn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                DoanhThu dt = new DoanhThu();
                dt.setNgayban(rs.getString("NgayBan"));
                dt.setSoHD(rs.getInt("Số Hóa Đơn"));
                dt.setTongDoanhThu(rs.getDouble("Tổng Doanh Thu"));

                list.add(dt);

            }
        } catch (Exception e) {
            Logger.getLogger(DoanhThu_SerVice.class.getName()).log(Level.SEVERE, null, e);
        }
        return list;
    }

    public ArrayList<DoanhThu> getAllDtsp() {
        ArrayList<DoanhThu> listdtsp = new ArrayList<>();
        try {
            String sql = "select Sum(TongTien) as TongTien,MaSP from HOADON join CHITIETHOADON on HOADON.MaHD = CHITIETHOADON.MaHD\n"
                    + " group by MaSP";
            Connection cn = DBConnect.getConnection();
            PreparedStatement pstm = cn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                DoanhThu dt = new DoanhThu();
                dt.setMaSP(rs.getString("MaSP"));
                dt.setTongDoanhThu(rs.getDouble("TongTien"));

                listdtsp.add(dt);

            }
        } catch (Exception e) {
            Logger.getLogger(DoanhThu_SerVice.class.getName()).log(Level.SEVERE, null, e);
        }
        return listdtsp;
    }

    public Double sumThongKeDoanhThuByYear(int year) {
        double tong = 0;
        String sql = "SELECT SUM(TongTien) as TongTien \n"
                + "FROM HOADON \n"
                + "WHERE YEAR(NgayBan) = YEAR(GETDATE())";
        try {
            Connection cn = DBConnect.getConnection();
            PreparedStatement pstm = cn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                tong = rs.getLong(1);
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return tong;
    }

}
