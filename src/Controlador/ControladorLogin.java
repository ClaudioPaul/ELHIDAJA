/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.FrmLogin;
import Vista.FrmMenuPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author CLAUDIO CRUZADO E
 */
public class ControladorLogin implements ActionListener{
    
    FrmLogin login = new FrmLogin();
    
    public ControladorLogin(FrmLogin login){
        this.login = login;
        this.login.btnIngresar.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == login.btnIngresar){
            FrmMenuPrincipal menu = new FrmMenuPrincipal();
            ControladorMenu conmenu = new ControladorMenu(menu);
            menu.setVisible(true);
        }
    }
    
}
