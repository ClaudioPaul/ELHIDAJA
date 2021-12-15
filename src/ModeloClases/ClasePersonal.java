/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloClases;

/**
 *
 * @author CLAUDIO CRUZADO E
 */
public class ClasePersonal {
    private int idPersonal;
    private int DNI;
    private String nombre;
    private String apellidoP;
    private String apellidoM;
    private int telefono;
    private String direccion;
    private String sexo;
    private String correo;
    private String fechaI;
    private String fechaN;

    public ClasePersonal() {
    }

    public ClasePersonal(int idPersonal, int DNI, String nombre, String apellidoP, String apellidoM, int telefono, String direccion, String sexo, String correo, String fechaI, String fechaN) {
        this.idPersonal = idPersonal;
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.telefono = telefono;
        this.direccion = direccion;
        this.sexo = sexo;
        this.correo = correo;
        this.fechaI = fechaI;
        this.fechaN = fechaN;
    }

    public int getIdPersonal() {
        return idPersonal;
    }

    public void setIdPersonal(int idPersonal) {
        this.idPersonal = idPersonal;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getFechaI() {
        return fechaI;
    }

    public void setFechaI(String fechaI) {
        this.fechaI = fechaI;
    }

    public String getFechaN() {
        return fechaN;
    }

    public void setFechaN(String fechaN) {
        this.fechaN = fechaN;
    }
    
    
    
}
