/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Random;

/**
 *
 * @author admin
 */
public class KhuyenMai {

    private String MaKM;
    private String TenChươngTrinh;
    private String Dieukien;
    private String NgayBatDau;
    private String NgayKetThuc;
    private float Tile;
    

    public KhuyenMai() {
    }

    public KhuyenMai(String MaKM, String TenChươngTrinh, String Dieukien, String NgayBatDau, String NgayKetThuc, float Tile) {
        this.MaKM = MaKM;
        this.TenChươngTrinh = TenChươngTrinh;
        this.Dieukien = Dieukien;
        this.NgayBatDau = NgayBatDau;
        this.NgayKetThuc = NgayKetThuc;
        this.Tile = Tile;
    }

    public String getMaKM() {
        return MaKM;
    }

    public void setMaKM(String MaKM) {
        this.MaKM = MaKM;
    }

    public String getTenChươngTrinh() {
        return TenChươngTrinh;
    }

    public void setTenChươngTrinh(String TenChươngTrinh) {
        this.TenChươngTrinh = TenChươngTrinh;
    }

    public String getDieukien() {
        return Dieukien;
    }

    public void setDieukien(String Dieukien) {
        this.Dieukien = Dieukien;
    }

    public String getNgayBatDau() {
        return NgayBatDau;
    }

    public void setNgayBatDau(String NgayBatDau) {
        this.NgayBatDau = NgayBatDau;
    }

    public String getNgayKetThuc() {
        return NgayKetThuc;
    }

    public void setNgayKetThuc(String NgayKetThuc) {
        this.NgayKetThuc = NgayKetThuc;
    }

    public float getTile() {
        return Tile;
    }

    public void setTile(float Tile) {
        this.Tile = Tile;
    }

    @Override
    public String toString() {
        return MaKM;
    }

        

    

    
   

}
