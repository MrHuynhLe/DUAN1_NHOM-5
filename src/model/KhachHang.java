/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class KhachHang {

    private String MaKH;
    private String TenKH;
    private String Gioitinh;
    private String DiaChi;
    private String SDT;
    private String Loai;
    private Double ChiTieu;

    public KhachHang() {
    }

    public KhachHang(String MaKH, String TenKH, String Gioitinh, String DiaChi, String SDT, String Loai, Double ChiTieu) {
        this.MaKH = MaKH;
        this.TenKH = TenKH;
        this.Gioitinh = Gioitinh;
        this.DiaChi = DiaChi;
        this.SDT = SDT;
        this.Loai = Loai;
        this.ChiTieu = ChiTieu;
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    public String getTenKH() {
        return TenKH;
    }

    public void setTenKH(String TenKH) {
        this.TenKH = TenKH;
    }

    public String getGioitinh() {
        return Gioitinh;
    }

    public void setGioitinh(String Gioitinh) {
        this.Gioitinh = Gioitinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getLoai() {
        return Loai;
    }

    public void setLoai(String Loai) {
        this.Loai = Loai;
    }

    public Double getChiTieu() {
        return ChiTieu;
    }

    public void setChiTieu(Double ChiTieu) {
        this.ChiTieu = ChiTieu;
    }

    @Override
    public String toString() {
        return  MaKH ;
    }

}
