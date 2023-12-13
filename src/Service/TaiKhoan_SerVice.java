/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.TaiKhoan;
import utility.DBConnect;

/**
 *
 * @author admin
 */
public class TaiKhoan_SerVice implements TK_Interface{

    public static String checkUser(String TenDangNhap, String MatKhau) {
        String ChucVu = "";

        try {
            String sql = "select TenDangNhap, MatKhau, ChucVu from TAIKHOAN \n"
                    + "	join NHANVIEN on NHANVIEN.MaNV = TAIKHOAN.TenDangNhap\n"
                    + "	where TenDangNhap like ? and  MatKhau like ? ";
            Connection con = DBConnect.getConnection();
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, TenDangNhap);
            pstm.setString(2, MatKhau);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                ChucVu = rs.getString("ChucVu");
            }

        } catch (Exception e) {
            System.out.println("Lỗi check : " + e.getMessage());
        }
        return ChucVu;
    }

   
    
    
    @Override
     public List<TaiKhoan> roleLogin(String username, String password) {
        List<TaiKhoan> listRM = new ArrayList<>();
        String sql = "select NHANVIEN.MaNV, NHANVIEN.ChucVu from TAIKHOAN \n" +
"	join NHANVIEN on TAIKHOAN.TenDangNhap = NHANVIEN.MaNV\n" +
"	where TenDangNhap = ? AND MatKhau = ?";

        try {
            PreparedStatement ps = DBConnect.getConnection().prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                TaiKhoan roleModel = new TaiKhoan(rs.getString(1), rs.getString(2));
                listRM.add(roleModel);
            }
        } catch (SQLException e) {
            e.getMessage();
        }
        return listRM;
    }

    @Override
    public boolean updateMatKhau(TaiKhoan tk) {
        String sql = "update TAIKHOAN set MatKhau = ? where TenDangNhap = ?";
        try {
            PreparedStatement ps = DBConnect.getConnection().prepareStatement(sql);
            ps.setObject(1, tk.getMatKhau());
            ps.setObject(2, tk.getTenDangNhap());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            return false;
        }
    }

}
