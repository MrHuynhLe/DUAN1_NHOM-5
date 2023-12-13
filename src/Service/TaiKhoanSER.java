/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import java.util.List;
import model.TaiKhoan;

/**
 *
 * @author admin
 */
public class TaiKhoanSER implements TaiKhoanSERInterface{
    TaiKhoan_SerVice tser = new TaiKhoan_SerVice(); 
    
    @Override
    public List<TaiKhoan> roleLogin(String username, String password) {
        return tser.roleLogin(username, password);
    }

    @Override
    public String updateMatKhau(TaiKhoan tk) {
        if (tser.updateMatKhau(tk)) {
            return "Đổi mật khẩu thành công";
        } else {
            return "Đổi mật khẩu thất bại";
        }
   }
    
}
