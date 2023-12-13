/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class KhoiLuong {
    private String MaKhoiLuong;
    private String KhoiLuong;

    public KhoiLuong() {
    }

    public String getMaKhoiLuong() {
        return MaKhoiLuong;
    }

    public void setMaKhoiLuong(String MaKhoiLuong) {
        this.MaKhoiLuong = MaKhoiLuong;
    }

    public String getKhoiLuong() {
        return KhoiLuong;
    }

    public void setKhoiLuong(String KhoiLuong) {
        this.KhoiLuong = KhoiLuong;
    }

    @Override
    public String toString() {
        return MaKhoiLuong + "-" + KhoiLuong;
    }
    
    
    
    
    
}
