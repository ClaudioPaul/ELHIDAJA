/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDatos;

import ModeloClases.ClasePersonal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author CLAUDIO CRUZADO E
 */
public class ClaseDatosPersonal {
    Conexion conexion;
    
    public ClaseDatosPersonal(){
        conexion = new Conexion();
    }
    
     public String Registrar(int dni, String nombre, String apellidoP, String apellidoM,
             int telefono, String direccion, String sexo, String correo, String fechaI, String fechaN){
        String rptaRegistro=null;
        try {
            Connection accesoBD = conexion.getConexion();
            CallableStatement cs = accesoBD.prepareCall("{ call RegistarPersonal(?,?,?,?,?,?,?,?,?,?)}");
            cs.setInt(1, dni);
            cs.setString(2, nombre);
            cs.setString(3, apellidoP);
            cs.setString(4, apellidoM);
            cs.setInt(5, telefono);
            cs.setString(6, direccion);
            cs.setString(7, sexo);
            cs.setString(8, correo);
            cs.setString(9, fechaI);
            cs.setString(10, fechaN);

            int numFAfectadas = cs.executeUpdate();

            if(numFAfectadas>0){
                rptaRegistro= "PERSONAL REGISTRADO CON EXITO";
            }
        } catch (Exception e) {
        }
        return rptaRegistro;
    }
     
    
    public ArrayList<ClasePersonal> BuscarPersonal(int dni){
        ArrayList<ClasePersonal> listaPersonal =new ArrayList();
        ClasePersonal personal;
        try {
            Connection accesoBD = conexion.getConexion();
            CallableStatement cs = accesoBD.prepareCall("{ call ValidarPersonal (?)}");
            cs.setInt(1, dni);
            ResultSet rs = cs.executeQuery();
            while(rs.next()){
                personal = new ClasePersonal();
                personal.setDNI(rs.getInt(1));
                listaPersonal.add(personal);
                int numFAfectadas = cs.executeUpdate();
            }
        } catch (Exception e) {
            
        }
        return listaPersonal;
    }
   
}
