/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class XuatXu {
    
    private String MaXX;
    private String Tennuoc;

    public XuatXu() {
    }

    public XuatXu(String MaXX, String Tennuoc) {
        this.MaXX = MaXX;
        this.Tennuoc = Tennuoc;
    }

    public String getMaXX() {
        return MaXX;
    }

    public void setMaXX(String MaXX) {
        this.MaXX = MaXX;
    }

    public String getTennuoc() {
        return Tennuoc;
    }

    public void setTennuoc(String Tennuoc) {
        this.Tennuoc = Tennuoc;
    }

    @Override
    public String toString() {
        return Tennuoc;
    }
    
}
