/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class NhanVien {
    private String MaNV;
    private String Tennv;
    private String Gioitinh;
    private String DiaChi;
    private String DienThoai;
    private String Email;
    private Double Luong;
    private String ChucVu;

    public NhanVien() {
    }

    public NhanVien(String MaNV, String Tennv, String Gioitinh, String DiaChi, String DienThoai, String Email, Double Luong, String ChucVu) {
        this.MaNV = MaNV;
        this.Tennv = Tennv;
        this.Gioitinh = Gioitinh;
        this.DiaChi = DiaChi;
        this.DienThoai = DienThoai;
        this.Email = Email;
        this.Luong = Luong;
        this.ChucVu = ChucVu;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getTennv() {
        return Tennv;
    }

    public void setTennv(String Tennv) {
        this.Tennv = Tennv;
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

    public String getDienThoai() {
        return DienThoai;
    }

    public void setDienThoai(String DienThoai) {
        this.DienThoai = DienThoai;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public Double getLuong() {
        return Luong;
    }

    public void setLuong(Double Luong) {
        this.Luong = Luong;
    }

    public String getChucVu() {
        return ChucVu;
    }

    public void setChucVu(String ChucVu) {
        this.ChucVu = ChucVu;
    }

    @Override
    public String toString() {
        return  MaNV ;
    }
    
    
    
    
    
    
            
    
}
