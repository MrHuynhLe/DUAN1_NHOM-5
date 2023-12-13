/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class ThuongHieu {
    private String Mathuonghieu;
    private String Tenthuonghieu;
    private String Email;

    public ThuongHieu() {
    }

    public ThuongHieu(String Mathuonghieu, String Tenthuonghieu, String Email) {
        this.Mathuonghieu = Mathuonghieu;
        this.Tenthuonghieu = Tenthuonghieu;
        this.Email = Email;
    }

    public String getMathuonghieu() {
        return Mathuonghieu;
    }

    public void setMathuonghieu(String Mathuonghieu) {
        this.Mathuonghieu = Mathuonghieu;
    }

    public String getTenthuonghieu() {
        return Tenthuonghieu;
    }

    public void setTenthuonghieu(String Tenthuonghieu) {
        this.Tenthuonghieu = Tenthuonghieu;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    @Override
    public String toString() {
        return Tenthuonghieu;
    }
}
