/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectolab_katherine_fabio;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author KATHERINE
 */
public class Usuario implements Serializable{
     private String nombre_usuario;//*
    private String contraseña;
    private Date fecha_nacimiento;//*
    private String correo;
    private String sexo;
    private String nombre;
     private static final long SerialVersionUID=777L;//version

    public Usuario(String nombre_usuario, String contraseña, Date fecha_nacimiento, String correo, String sexo, String nombre) {
        this.nombre_usuario = nombre_usuario;
        this.contraseña = contraseña;
        this.fecha_nacimiento = fecha_nacimiento;
        this.correo = correo;
        this.sexo = sexo;
        this.nombre = nombre;
    }

    

    public Usuario() {
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

   

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre_usuario=" + nombre_usuario + ", contrase\u00f1a=" + contraseña + ", fecha_nacimiento=" + fecha_nacimiento + ", correo=" + correo + ", sexo=" + sexo + ", nombre=" + nombre + '}';
    }

    
    
    
}
