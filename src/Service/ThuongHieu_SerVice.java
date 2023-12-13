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
import model.ThuongHieu;
import utility.DBConnect;

/**
 *
 * @author admin
 */
public class ThuongHieu_SerVice {
    public ArrayList<ThuongHieu> getAllThuongHieu() {
        ArrayList<ThuongHieu> list = new ArrayList<>();
        String sql = "select * from THUONGHIEU";
        Connection cn =DBConnect.getConnection();
        PreparedStatement pstm;
        try {
            pstm = cn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                ThuongHieu TH = new ThuongHieu();
                
                TH.setMathuonghieu(rs.getString("Mathuonghieu"));
                TH.setTenthuonghieu(rs.getString("Tenthuonghieu"));
                TH.setEmail(rs.getString("Email"));
                list.add(TH);
            }
        } catch (Exception ex) {
           java.util.logging.Logger.getLogger(ThuongHieu_SerVice.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }
}
