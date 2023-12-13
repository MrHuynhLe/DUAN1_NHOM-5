/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class DoanhThu {
    private String Ngayban;
    private int SoHD;
    private double TongDoanhThu;
    private String MaSP;
    

    public DoanhThu() {
    }

    public DoanhThu(String Ngayban, int SoHD, double TongDoanhThu, String MaSP) {
        this.Ngayban = Ngayban;
        this.SoHD = SoHD;
        this.TongDoanhThu = TongDoanhThu;
        this.MaSP = MaSP;
    }

    public String getNgayban() {
        return Ngayban;
    }

    public void setNgayban(String Ngayban) {
        this.Ngayban = Ngayban;
    }

    public int getSoHD() {
        return SoHD;
    }

    public void setSoHD(int SoHD) {
        this.SoHD = SoHD;
    }

    public double getTongDoanhThu() {
        return TongDoanhThu;
    }

    public void setTongDoanhThu(double TongDoanhThu) {
        this.TongDoanhThu = TongDoanhThu;
    }

    public String getMaSP() {
        return MaSP;
    }

    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    }

    

    
    
}
