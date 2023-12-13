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
import model.XuatXu;
import utility.DBConnect;

/**
 *
 * @author admin
 */
public class XuatXu_SerVice {
    public ArrayList<XuatXu> getAllXuatXu() {
        ArrayList<XuatXu> list = new ArrayList<>();
        String sql = "select * from XUATXU";
        Connection cn =DBConnect.getConnection();
        PreparedStatement pstm;
        try {
            pstm = cn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                XuatXu XX = new XuatXu();
                XX.setMaXX(rs.getString("MaXX"));
                XX.setTennuoc(rs.getString("Tennuoc"));
                list.add(XX);
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(XuatXu_SerVice.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }
}
