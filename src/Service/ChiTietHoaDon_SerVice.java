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
import java.util.logging.Logger;
import model.ChiTietHoaDon;
import model.HoaDon;
import model.KhachHang;
import model.KhuyenMai;
import model.NhanVien;
import model.SanPham;
import utility.DBConnect;

/**
 *
 * @author admin
 */
public class ChiTietHoaDon_SerVice {
    public ArrayList<ChiTietHoaDon> getAllChiTietHoaDon() {
        ArrayList<ChiTietHoaDon> list = new ArrayList<>();
        try {
            String sql = "Select * from HOADON\n"
                    + "JOIN NHANVIEN ON NHANVIEN.MaNV = HOADON.MaNV\n"
                    + "JOIN KHACHHANG ON KHACHHANG.MaKH = HOADON.MaKH\n"
                    + "JOIN CHITIETHOADON ON CHITIETHOADON.MaHD = HOADON.MaHD\n"
                    + "JOIN SANPHAM ON SANPHAM.MaSP = CHITIETHOADON.MaSP\n"
                    + "JOIN KHUYENMAI ON KHUYENMAI.MaKM = HOADON.MaKM";
            Connection cn = DBConnect.getConnection();
            PreparedStatement pstm = cn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                NhanVien nv = new NhanVien();
                nv.setMaNV(rs.getString("MaNV"));
                
                KhachHang kh = new KhachHang();
                kh.setMaKH(rs.getString("MaKH"));
                
                HoaDon hd = new HoaDon();
                hd.setNgayBan(rs.getString("NgayBan"));
                
                KhuyenMai km = new KhuyenMai();
                km.setMaKM(rs.getString("MaKM"));
                
                SanPham sp = new SanPham();
                sp.setTenSP(rs.getString("TenSP"));
                
                ChiTietHoaDon cthd = new ChiTietHoaDon();
                cthd.setNhanvien(nv);
                cthd.setTenkhachhang(kh);
                cthd.setMaHD(rs.getString("MaHD"));
                cthd.setMaSP(rs.getString("MaSP"));
                cthd.setSoLuong(rs.getInt("SoLuong"));
                cthd.setGiaBan(rs.getDouble("GiaBan"));
                cthd.setMakhuyenmai(km);
                cthd.setNgayban(hd);
                list.add(cthd);
                
            }
        } catch (Exception e) {
            Logger.getLogger(SanPham_SerVice.class.getName()).log(Level.SEVERE, null, e);
        }
        return list;
    }
}
