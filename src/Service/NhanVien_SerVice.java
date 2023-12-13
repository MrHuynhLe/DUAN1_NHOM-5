/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import model.NhanVien;
import utility.DBConnect;

/**
 *
 * @author admin
 */
public class NhanVien_SerVice {
    public ArrayList<NhanVien>getAll(){
        ArrayList<NhanVien> lst = new ArrayList<>();
        String sql = "select * from NHANVIEN";
        Connection cn = DBConnect.getConnection();
        try {
            PreparedStatement pstm = cn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while(rs.next()){
                NhanVien s = new NhanVien();
                s.setMaNV(rs.getString("MaNV"));
                s.setTennv(rs.getString("Tennv"));
                s.setGioitinh(rs.getString("GioiTinh"));
                s.setDiaChi(rs.getString("DiaChi"));
                s.setDienThoai(rs.getString("DienThoai"));
                s.setEmail(rs.getString("Email"));
                s.setLuong(rs.getDouble("Luong"));
                s.setChucVu(rs.getString("ChucVu"));
                lst.add(s);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return lst;
    }
    public Integer addNV(NhanVien nv){
        Integer row = null;
        String sql = "insert NHANVIEN(MaNV, Tennv,GioiTinh,DiaChi,DienThoai, Email,Luong,ChucVu) values(?,?,?,?,?,?,?,?)";
        Connection cn =  DBConnect.getConnection();
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, nv.getMaNV());
            pst.setString(2, nv.getTennv());
            pst.setString(3, nv.getGioitinh());
            pst.setString(4, nv.getDiaChi());
            pst.setString(5, nv.getDienThoai());
            pst.setString(6, nv.getEmail());
            pst.setDouble(7, nv.getLuong());
            pst.setString(8, nv.getChucVu());
           row = pst.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return row;
    }
   public Integer updateNV(NhanVien nv){
       Integer row = null;
       String sql = "update NHANVIEN\n" +
"            set Tennv =?, GioiTinh=?, DiaChi=?, DienThoai=?, Email=?,Luong = ?, ChucVu=?\n" +
"                where MaNV=?";
       Connection cn = DBConnect.getConnection();
       try {
           PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(8, nv.getMaNV());
            pst.setString(1, nv.getTennv());
            pst.setString(2, nv.getGioitinh());
            pst.setString(3, nv.getDiaChi());
            pst.setString(4, nv.getDienThoai());
            pst.setString(5, nv.getEmail());
            pst.setDouble(6, nv.getLuong());
            pst.setString(7, nv.getChucVu());
            row = pst.executeUpdate();
       } catch (Exception e) {
           System.out.println(e);
       }
       return row;
}
   public Integer deleteNV(String MaNV){
       Integer row = null;
       String sql = "delete from NHANVIEN where MaNV=?";
       Connection cn = DBConnect.getConnection();
       try {
           PreparedStatement pst = cn.prepareStatement(sql);
           pst.setString(1, MaNV);
           row = pst.executeUpdate();
       } catch (Exception e) {
           System.out.println(e);
       }
       return row;
   }
   public List<NhanVien> find(String ten) {
    List<NhanVien> timk = new ArrayList<>();
    String sql = "SELECT * FROM NHANVIEN WHERE Tennv LIKE ?";
    Connection cn = DBConnect.getConnection();
    try {
        PreparedStatement pstm = cn.prepareStatement(sql);
        pstm.setObject(1, "%" + ten + "%");
        ResultSet rs = pstm.executeQuery();
        while (rs.next()) {
           NhanVien s = new NhanVien();
                s.setMaNV(rs.getString("MaNV"));
                s.setTennv(rs.getString("Tennv"));
                s.setGioitinh(rs.getString("GioiTinh"));
                s.setDiaChi(rs.getString("DiaChi"));
                s.setDienThoai(rs.getString("DienThoai"));
                s.setEmail(rs.getString("Email"));
                s.setLuong(rs.getDouble("Luong"));
                s.setChucVu(rs.getString("ChucVu"));

            timk.add(s);
        }
        return timk;
    } catch (Exception e) {
        System.out.println(e);
    }
    return null;
}

}
