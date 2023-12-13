/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import java.util.List;
import model.TaiKhoan;

/**
 *
 * @author admin
 */
public interface TaiKhoanSERInterface {
    public List<TaiKhoan> roleLogin(String username, String password);
    
    public String updateMatKhau(TaiKhoan tk);
}
