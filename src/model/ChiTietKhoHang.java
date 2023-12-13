/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class ChiTietKhoHang {
    private String MaPN;
    private String MaSP;
    private int SoLuong;
    private String GiaNhap;

    public ChiTietKhoHang() {
    }

    public ChiTietKhoHang(String MaPN, String MaSP, int SoLuong, String GiaNhap) {
        this.MaPN = MaPN;
        this.MaSP = MaSP;
        this.SoLuong = SoLuong;
        this.GiaNhap = GiaNhap;
    }

    public String getMaPN() {
        return MaPN;
    }

    public void setMaPN(String MaPN) {
        this.MaPN = MaPN;
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

    public String getGiaNhap() {
        return GiaNhap;
    }

    public void setGiaNhap(String GiaNhap) {
        this.GiaNhap = GiaNhap;
    }

    @Override
    public String toString() {
        return "ChiTietKhoHang{" + "MaPN=" + MaPN + ", MaSP=" + MaSP + ", SoLuong=" + SoLuong + ", GiaNhap=" + GiaNhap + '}';
    }
    
    
}
