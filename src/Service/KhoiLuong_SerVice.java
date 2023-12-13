/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import java.lang.System.Logger;
import java.util.ArrayList;
import model.KhoiLuong;
import java.sql.*;
import java.util.logging.Level;
import utility.DBConnect;

/**
 *
 * @author admin
 */
public class KhoiLuong_SerVice {
    public ArrayList<KhoiLuong> getAllKhoiLuong() {
        ArrayList<KhoiLuong> list = new ArrayList<>();
        String sql = "select * from KHOILUONG";
        Connection cn =DBConnect.getConnection();
        PreparedStatement pstm;
        try {
            pstm = cn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                KhoiLuong KL = new KhoiLuong();
                KL.setMaKhoiLuong(rs.getString("MaKhoiLuong"));
                KL.setKhoiLuong(rs.getString("KhoiLuong"));
                list.add(KL);
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(KhoiLuong_SerVice.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }
}
