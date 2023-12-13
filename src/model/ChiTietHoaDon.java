/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class ChiTietHoaDon {
    private NhanVien nhanvien;
    private KhachHang tenkhachhang;
    private String MaHD;
    private String MaSP;
    private int SoLuong;
    private double GiaBan;
    private KhuyenMai makhuyenmai;
    private HoaDon ngayban;

    public ChiTietHoaDon() {
    }

    public ChiTietHoaDon(NhanVien nhanvien, KhachHang tenkhachhang, String MaHD, String MaSP, int SoLuong, double GiaBan, KhuyenMai makhuyenmai, HoaDon ngayban) {
        this.nhanvien = nhanvien;
        this.tenkhachhang = tenkhachhang;
        this.MaHD = MaHD;
        this.MaSP = MaSP;
        this.SoLuong = SoLuong;
        this.GiaBan = GiaBan;
        this.makhuyenmai = makhuyenmai;
        this.ngayban = ngayban;
    }

    public NhanVien getNhanvien() {
        return nhanvien;
    }

    public void setNhanvien(NhanVien nhanvien) {
        this.nhanvien = nhanvien;
    }

    public KhachHang getTenkhachhang() {
        return tenkhachhang;
    }

    public void setTenkhachhang(KhachHang tenkhachhang) {
        this.tenkhachhang = tenkhachhang;
    }

    public String getMaHD() {
        return MaHD;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public String getMaSP() {
        return MaSP;
    }

    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public double getGiaBan() {
        return GiaBan;
    }

    public void setGiaBan(double GiaBan) {
        this.GiaBan = GiaBan;
    }

    public KhuyenMai getMakhuyenmai() {
        return makhuyenmai;
    }

    public void setMakhuyenmai(KhuyenMai makhuyenmai) {
        this.makhuyenmai = makhuyenmai;
    }

    public HoaDon getNgayban() {
        return ngayban;
    }

    public void setNgayban(HoaDon ngayban) {
        this.ngayban = ngayban;
    }

    @Override
    public String toString() {
        return "ChiTietHoaDon{" + "nhanvien=" + nhanvien + ", tenkhachhang=" + tenkhachhang + ", MaHD=" + MaHD + ", MaSP=" + MaSP + ", SoLuong=" + SoLuong + ", GiaBan=" + GiaBan + ", makhuyenmai=" + makhuyenmai + ", ngayban=" + ngayban + '}';
    }


    public Double getTongTien(){
       return this.SoLuong * this.GiaBan;
    } 
    
    
    
    
}
