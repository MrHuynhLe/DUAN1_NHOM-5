/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class ChiTietKhuyenMai {
    private String MaSP;
    private String MaKM;
    private float TiLeKM;

    public ChiTietKhuyenMai() {
    }

    public ChiTietKhuyenMai(String MaSP, String MaKM, float TiLeKM) {
        this.MaSP = MaSP;
        this.MaKM = MaKM;
        this.TiLeKM = TiLeKM;
    }

    public String getMaSP() {
        return MaSP;
    }

    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    }

    public String getMaKM() {
        return MaKM;
    }

    public void setMaKM(String MaKM) {
        this.MaKM = MaKM;
    }

    public float getTiLeKM() {
        return TiLeKM;
    }

    public void setTiLeKM(float TiLeKM) {
        this.TiLeKM = TiLeKM;
    }

    @Override
    public String toString() {
        return "ChiTietKhuyenMai{" + "MaSP=" + MaSP + ", MaKM=" + MaKM + ", TiLeKM=" + TiLeKM + '}';
    }
    
    
    
}
