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
public interface TK_Interface {
    
    public List<TaiKhoan> roleLogin(String username, String password);
    
    public boolean updateMatKhau(TaiKhoan tk);
}
