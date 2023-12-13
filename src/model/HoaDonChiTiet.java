/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class HoaDonChiTiet {
    
    private String maHd;
    private String maSp;
    private int sl;
    private Double gia;

    public HoaDonChiTiet() {
    }

    public HoaDonChiTiet(String maHd, String maSp, int sl, Double gia) {
        this.maHd = maHd;
        this.maSp = maSp;
        this.sl = sl;
        this.gia = gia;
    }

    public String getMaHd() {
        return maHd;
    }

    public void setMaHd(String maHd) {
        this.maHd = maHd;
    }

    public String getMaSp() {
        return maSp;
    }

    public void setMaSp(String maSp) {
        this.maSp = maSp;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public Double getGia() {
        return gia;
    }

    public void setGia(Double gia) {
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "HoaDonChiTiet{" + "maHd=" + maHd + ", maSp=" + maSp + ", sl=" + sl + ", gia=" + gia + '}';
    }
   
}
