/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectolab_katherine_fabio;

import java.util.Date;

/**
 *
 * @author KATHERINE
 */
public class Usuario {
     private String nombre_usuario;//*
    private String contraseña;
    private String fecha_nacimiento;//*
    private String correo;
    private String sexo;
    private String nombre;

    public Usuario(String nombre_usuario, String contraseña, String fecha_nacimiento, String correo, String sexo, String nombre) {
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

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
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
