/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import java.util.ArrayList;
import model.KhoiLuong;
import java.sql.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.NhaCungCap;
import utility.DBConnect;
/**
 *
 * @author admin
 */
public class NhaCungCap_SerVice {
    public ArrayList<NhaCungCap> getAllNhaCungCap() {
        ArrayList<NhaCungCap> list = new ArrayList<>();
        String sql = "select * from NHACUNGCAP";
        Connection cn =DBConnect.getConnection();
        PreparedStatement pstm;
        try {
            pstm = cn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                NhaCungCap NC = new NhaCungCap();
                
                NC.setMaNCC(rs.getString("MaNCC"));
                NC.setTenNCC(rs.getString("TenNCC"));
                NC.setDiaChi(rs.getString("DiaChi"));
                NC.setEmail(rs.getString("Email"));
                
                list.add(NC);
            }
        } catch (Exception ex) {
           java.util.logging.Logger.getLogger(NhaCungCap_SerVice.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }
    
    public Object addNhaCC(NhaCungCap ncc) {
        Integer row = null;
        String sql = "insert into NHACUNGCAP values (?,?,?,?)";
        Connection cn = DBConnect.getConnection();
        try {
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, ncc.getMaNCC());
            pstm.setString(2, ncc.getTenNCC());
            pstm.setString(3, ncc.getEmail());
            pstm.setString(4, ncc.getDiaChi());
            
            row = pstm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(NhaCungCap_SerVice.class.getName()).log(Level.SEVERE, null, ex);
        }
        return row;
    }
    
    
    public Object updateNhaCC(NhaCungCap ncc) {
        Integer row = null;
        String sql = "update NHACUNGCAP set TenNCC = ?, Email = ?, DiaChi = ? where MaNCC = ?";
        Connection cn = DBConnect.getConnection();
        try {
            PreparedStatement pstm = cn.prepareStatement(sql);
            
            pstm.setString(1, ncc.getTenNCC());
            pstm.setString(2, ncc.getEmail());
            pstm.setString(3, ncc.getDiaChi());
            pstm.setString(4, ncc.getMaNCC());
            
            row = pstm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(NhaCungCap_SerVice.class.getName()).log(Level.SEVERE, null, ex);
        }
        return row;
    }
    
    
    public Object deleteNhaCC(String MaNCC) {
        Integer row = null;
        String sql = "delete from NHACUNGCAP where MaNCC = ?";
        Connection cn = DBConnect.getConnection();
        try {
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, MaNCC);

            row = pstm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(NhaCungCap_SerVice.class.getName()).log(Level.SEVERE, null, ex);
        }
        return row;
    }
    
    
    public List<NhaCungCap> timkiemNhaCC(String Ma) {
        List<NhaCungCap> listTim = new ArrayList<>();
        String sql = "select MaNCC , TenNCC , Email, DiaChi from NHACUNGCAP where MaNCC like ?";
        Connection cn = DBConnect.getConnection();
        try {
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setObject(1, Ma);
            ResultSet rs = pstm.executeQuery();
             while (rs.next()){
                 NhaCungCap ncc = new NhaCungCap();
                 ncc.setMaNCC(rs.getString("MaNCC"));
                 ncc.setTenNCC(rs.getString("TenNCC"));
                 ncc.setEmail(rs.getString("Email"));
                 ncc.setDiaChi(rs.getString("DiaChi"));
                 
                 listTim.add(ncc);
             }
            
            
        return listTim;
            
        } catch (SQLException ex) {
            Logger.getLogger(NhaCungCap_SerVice.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }
    
    public NhaCungCap findByMaSP(String MaSp) {
        NhaCungCap ncc = null;
        String sql = "select NHACUNGCAP.MaNCC,TenNCC,DiaChi,Email from NHACUNGCAP \n" +
"	join SANPHAM on SANPHAM.MaNCC = NHACUNGCAP.MaNCC \n" +
"	where MaSP like ?\n" +
"		";
        Connection cn = DBConnect.getConnection();
        try {
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, MaSp);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                
                String MaNCC = rs.getString("MaNCC");
                String TenNCC = rs.getString("TenNCC");
                String  DiaChi= rs.getString("DiaChi");
                String Email = rs.getString("Email");
               ncc = new NhaCungCap(MaNCC, TenNCC, DiaChi, Email);
            }
            return ncc;
        } catch (Exception e) {
            System.out.println(e);
        }
        return ncc;
    }
}
