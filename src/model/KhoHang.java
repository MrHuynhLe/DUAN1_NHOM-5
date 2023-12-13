/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class KhoHang {
    private String MaSP;
    private String TenSP;
    private int soLuong;
    

    
 public String getTrangThai(){
     if(this.soLuong >= 100) return "Còn hàng";
     else
     if(this.soLuong >= 50 ) return "Sắp hết";
     else
         return "Hết hàng";
     
 }
    public KhoHang() {
    }

    public KhoHang(String MaSP, String TenSP, int soLuong,String ngayNhap) {
        this.MaSP = MaSP;
        this.TenSP = TenSP;
        this.soLuong = soLuong;
       
      
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
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        return "KhoHang{" + "MaSP=" + MaSP + ", TenSP=" + TenSP + ", soLuong=" + soLuong + '}';
    }

   
 

  

  
  
}