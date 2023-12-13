/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class HoaDon {
   private String MaNV;
    private String MaHD;
    private String SDT;
    private String tenKH;
    private String tenSP;
    private String maKH;
    private int soLuong;
    private Double gia;
    private String maKM;
    private Double thanhTien;
    private String ngayBan;
    private Double tongTien;
    private String trangThai;

    public HoaDon() {
    }

    public HoaDon(String MaNV, String MaHD, String SDT, String tenKH, String tenSP,String maKH, int soLuong, Double gia,String maKM, Double thanhTien, String ngayBan,Double tongTien, String trangThai) {
        this.MaNV = MaNV;
        this.MaHD = MaHD;
        this.SDT = SDT;
        this.tenKH = tenKH;
        this.tenSP = tenSP;
        this.maKH = maKH;
        this.soLuong = soLuong;
        this.gia = gia;
        this.maKM = maKM;
        this.thanhTien = thanhTien;
        this.ngayBan = ngayBan;
        this.tongTien = tongTien;
        this.trangThai = trangThai;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getMaHD() {
        return MaHD;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public Double getGia() {
        return gia;
    }

    public void setGia(Double gia) {
        this.gia = gia;
    }

    public Double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(Double thanhTien) {
        this.thanhTien = thanhTien;
    }

    public String getNgayBan() {
        return ngayBan;
    }

    public void setNgayBan(String ngayBan) {
        this.ngayBan = ngayBan;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public String getMaKM() {
        return maKM;
    }

    public void setMaKM(String maKM) {
        this.maKM = maKM;
    }

    public Double getTongTien() {
        return tongTien;
    }

    public void setTongTien(Double tongTien) {
        this.tongTien = gia*soLuong;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    @Override
    public String toString() {
        return "HoaDon{" + "MaNV=" + MaNV + ", MaHD=" + MaHD + ", SDT=" + SDT + ", tenKH=" + tenKH + ", tenSP=" + tenSP + ", maKH=" + maKH + ", soLuong=" + soLuong + ", gia=" + gia + ", maKM=" + maKM + ", thanhTien=" + thanhTien + ", ngayBan=" + ngayBan + ", tongTien=" + tongTien + ", trangThai=" + trangThai + '}';
    }

    

    

}
