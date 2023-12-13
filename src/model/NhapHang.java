/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


public class NhapHang {
    private String maPN;
    private String maSP;
    private String nhaCC;
    private int soLuong;
    private Double giaNhap;
    private String ngayNhap;
    private Double tongTien;

    public NhapHang() {
    }

    public NhapHang(String maPN, String maSP, String nhaCC, int soLuong, Double giaNhap, String ngayNhap, Double tongTien) {
        this.maPN = maPN;
        this.maSP = maSP;
        this.nhaCC = nhaCC;
        this.soLuong = soLuong;
        this.giaNhap = giaNhap;
        this.ngayNhap = ngayNhap;
        this.tongTien = tongTien;
    }

    public void setTongTien(Double tongTien) {
        this.tongTien = tongTien;
    }

    public Double getTongTien() {
         return soLuong*giaNhap;
    }
   

    public String getMaPN() {
        return maPN;
    }

    public void setMaPN(String maPN) {
        // Kiểm tra hợp lệ ở đây nếu cần
        this.maPN = maPN;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        // Kiểm tra hợp lệ ở đây nếu cần
        this.maSP = maSP;
    }

    public String getNhaCC() {
        return nhaCC;
    }

    public void setNhaCC(String nhaCC) {
        // Kiểm tra hợp lệ ở đây nếu cần
        this.nhaCC = nhaCC;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        // Kiểm tra hợp lệ ở đây nếu cần
        this.soLuong = soLuong;
    }

    public Double getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(Double giaNhap) {
        // Kiểm tra hợp lệ ở đây nếu cần
        this.giaNhap = giaNhap;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        // Kiểm tra hợp lệ ở đây nếu cần
        this.ngayNhap = ngayNhap;
    }

    @Override
    public String toString() {
        return "NhapHang{" +
                "maPN='" + maPN + '\'' +
                ", maSP='" + maSP + '\'' +
                ", nhaCC='" + nhaCC + '\'' +
                ", soLuong=" + soLuong +
                ", giaNhap=" + giaNhap +
                ", ngayNhap=" + ngayNhap +
                '}';
    }

   
}