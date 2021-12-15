/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ModeloDatos.ClaseDatosPersonal;
import Vista.FrmPersonal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author CLAUDIO CRUZADO E
 */
public class ControladorPersonal implements ActionListener{

    FrmPersonal per = new FrmPersonal();
    ClaseDatosPersonal cl = new ClaseDatosPersonal();
    
    public ControladorPersonal(FrmPersonal per, ClaseDatosPersonal cl){
        this.per = per;
        this.cl = cl;
        this.per.btnContinuar.addActionListener(this);
        this.per.btnBuscar.addActionListener(this);
        this.per.btnSalir.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == per.btnContinuar){
            if(per.txtDni.getText().trim().length() !=0 &&
               per.txtNombre.getText().trim().length() !=0 &&
               per.txtApellidoP.getText().trim().length() !=0 &&
               per.txtApellidoM.getText().trim().length() !=0 &&
               per.txtTelefono.getText().trim().length() !=0 &&
               per.txtDireccion.getText().trim().length() !=0 &&
               per.cmbSexo.getSelectedItem().toString().trim().length() !=0 &&
               per.txtEmail.getText().trim().length() !=0){
               
               int dni = Integer.parseInt(per.txtDni.getText());
               String nombre = per.txtNombre.getText();
               String apellidoP = per.txtApellidoP.getText();
               String apellidoM = per.txtApellidoM.getText();
               int telefono = Integer.parseInt(per.txtTelefono.getText());
               String direccion = per.txtDireccion.getText();
               String sexo = per.cmbSexo.getSelectedItem().toString();
               String correo = per.txtEmail.getText();
               
               
               // FECHA DE INGRESO
               int año = per.dateFechaI.getCalendar().get(Calendar.YEAR);
               int mes = per.dateFechaI.getCalendar().get(Calendar.MONTH) + 1;
               int dia = per.dateFechaI.getCalendar().get(Calendar.DAY_OF_MONTH);

               String fechaI =(año+"-"+mes+"-"+dia);

               
               // FECHA DE NACIMIENTO
               int año1 = per.dateFechaN.getCalendar().get(Calendar.YEAR);
               int mes1 = per.dateFechaN.getCalendar().get(Calendar.MONTH) + 1;
               int dia1 = per.dateFechaN.getCalendar().get(Calendar.DAY_OF_MONTH);

               String fechaN =(año1+"-"+mes1+"-"+dia1);
               
          
               String rptaRegistro = cl.Registrar(dni, nombre, apellidoP, apellidoM, telefono, direccion, sexo, correo, fechaI, fechaN);
               
                    if(rptaRegistro!=null){
                        JOptionPane.showMessageDialog(null, rptaRegistro);
                    }else{
                        JOptionPane.showMessageDialog(null, "ERROR EN REGISTRAR");
                    }
            }else{
                JOptionPane.showMessageDialog(null, "NO SE PERMITEN CAMPOS VACIOS");
            }
        } 
        
        if(ae.getSource() == per.btnBuscar){
            if(per.txtBuscar.getText().trim().length() !=0){
                
                int dni = Integer.parseInt(per.txtBuscar.getText());
                
                int numRegistros = cl.BuscarPersonal(dni).size();
                
                if(numRegistros > 0){
                    JOptionPane.showMessageDialog(per, "YA EXISTE UN REGISTRO");
                } else{
                    JOptionPane.showMessageDialog(per, "NO EXISTE REGISTRO");
                    per.txtDni.setText(per.txtBuscar.getText());
                }
                
            }else{
                JOptionPane.showMessageDialog(null, "INGRESE EL DNI PARA BUSCAR");
            }
        }

        if(ae.getSource() == per.btnSalir){
            per.dispose();
        }
             
    }
    
}
