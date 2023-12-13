/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.KhoHang;
import utility.DBConnect;

/**
 *
 * @author admin
 */
public class KhoHang_SerVice {
    public ArrayList<KhoHang> getAll(){
        ArrayList<KhoHang> list = new ArrayList<>();
        Connection cn = DBConnect.getConnection();
        String sql = "Select MaSP,TenSP,Soluong from SANPHAM";
        try {
            PreparedStatement pstm = cn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while(rs.next()){
                KhoHang kh = new KhoHang();
                
                kh.setMaSP(rs.getString("MaSP"));
                kh.setTenSP(rs.getString("TenSP"));
                kh.setSoLuong(rs.getInt("SoLuong"));
                
                list.add(kh);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    
}
}
