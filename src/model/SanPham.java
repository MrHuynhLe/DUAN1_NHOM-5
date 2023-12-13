/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class SanPham {
    private String MaSP;
    private String TenSP;
    private int SoLuong;
    private Double Gia;
    private String  Maccc;
    private ThuongHieu thuonghieu;
    private KhoiLuong khoiluong;
    private XuatXu  xuatxu;
    

    public SanPham() {
    }

    public SanPham(String MaSP, String TenSP, int SoLuong, Double Gia, String Maccc, ThuongHieu thuonghieu, KhoiLuong khoiluong, XuatXu xuatxu) {
        this.MaSP = MaSP;
        this.TenSP = TenSP;
        this.SoLuong = SoLuong;
        this.Gia = Gia;
        this.Maccc = Maccc;
        this.thuonghieu = thuonghieu;
        this.khoiluong = khoiluong;
        this.xuatxu = xuatxu;
    }

    public String getMaSP() {
        return MaSP;
    }

    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public Double getGia() {
        return Gia;
    }

    public void setGia(Double Gia) {
        this.Gia = Gia;
    }

    public String getMaccc() {
        return Maccc;
    }

    public void setMaccc(String Maccc) {
        this.Maccc = Maccc;
    }

    public ThuongHieu getThuonghieu() {
        return thuonghieu;
    }

    public void setThuonghieu(ThuongHieu thuonghieu) {
        this.thuonghieu = thuonghieu;
    }

    public KhoiLuong getKhoiluong() {
        return khoiluong;
    }

    public void setKhoiluong(KhoiLuong khoiluong) {
        this.khoiluong = khoiluong;
    }

    public XuatXu getXuatxu() {
        return xuatxu;
    }

    public void setXuatxu(XuatXu xuatxu) {
        this.xuatxu = xuatxu;
    }

    @Override
    public String toString() {
        return "SanPham{" + "MaSP=" + MaSP + ", TenSP=" + TenSP  + ", SoLuong=" + SoLuong + ", Gia=" + Gia + ", Maccc=" + Maccc + ", thuonghieu=" + thuonghieu + ", khoiluong=" + khoiluong + ", xuatxu=" + xuatxu + '}';
    }

   
    
    public String  getTrangThai(){
        if (this.SoLuong <= 0 ) 
            return "Hết Hàng";
        else
            return "Còn Hàng";    
    }
    
    
    

    
    
}
