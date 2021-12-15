/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ModeloDatos.ClaseDatosPersonal;
import Vista.FrmMenuPrincipal;
import Vista.FrmPersonal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author CLAUDIO CRUZADO E
 */
public class ControladorMenu implements ActionListener{

    FrmMenuPrincipal menu = new FrmMenuPrincipal();
    
    public ControladorMenu(FrmMenuPrincipal menu){
        this.menu = menu;
        this.menu.btnInicio.addActionListener(this);
        this.menu.btnRecursosH.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == menu.btnRecursosH){
            FrmPersonal per = new FrmPersonal();
            ClaseDatosPersonal cl = new ClaseDatosPersonal();
            ControladorPersonal conper = new ControladorPersonal(per, cl);
            conper.IniciarTextos();
            per.setVisible(true);
        }
    }
    
}
