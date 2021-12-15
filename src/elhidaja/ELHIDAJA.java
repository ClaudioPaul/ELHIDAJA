/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elhidaja;

import Controlador.ControladorLogin;
import Vista.FrmLogin;
import Vista.FrmPersonal;

/**
 *
 * @author CLAUDIO CRUZADO E
 */
public class ELHIDAJA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FrmLogin login = new FrmLogin();
        Controlador.ControladorLogin conl = new ControladorLogin(login);
        login.setVisible(true);
    }
    
}
