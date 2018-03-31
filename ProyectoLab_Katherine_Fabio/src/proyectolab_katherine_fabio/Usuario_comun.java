/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectolab_katherine_fabio;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author KATHERINE
 */
public class Usuario_comun extends Usuario {
    private String direccion;
    private ArrayList<mensajes> mensajes_enviados=new ArrayList();
     private ArrayList<mensajes> mensajes_recibidos=new ArrayList();
    private ArrayList<Usuario_Candidato> candidatos_seguir=new ArrayList();
    private File Archivo;//cambiar
    private ArrayList<Usuario_comun> amigos=new ArrayList();
    private String name2;
    

    public Usuario_comun(String direccion, File Archivo, String name2, String nombre_usuario, String contraseña, Date fecha_nacimiento, String correo, String sexo, String nombre) {
        super(nombre_usuario, contraseña, fecha_nacimiento, correo, sexo, nombre);
        this.direccion = direccion;
        this.Archivo = Archivo;
        this.name2 = name2;
    }

    public void setCandidatos_seguir2(ArrayList<Usuario_Candidato> candidatos_seguir) {
        this.candidatos_seguir = candidatos_seguir;
    }

    public void setAmigos2(ArrayList<Usuario_comun> amigos) {
        this.amigos = amigos;
    }

    

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

   

    public Usuario_comun() {
    }

   

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<mensajes> getMensajes_enviados() {
        return mensajes_enviados;
    }

    public void setMensajes_enviados(ArrayList<mensajes> mensajes_enviados) {
        this.mensajes_enviados = mensajes_enviados;
    }

    public ArrayList<mensajes> getMensajes_recibidos() {
        return mensajes_recibidos;
    }

    public void setMensajes_recibidos(ArrayList<mensajes> mensajes_recibidos) {
        this.mensajes_recibidos = mensajes_recibidos;
    }

    

    public ArrayList<Usuario_Candidato> getCandidatos_seguir() {
        return candidatos_seguir;
    }

    public void setCandidatos_seguir(Usuario_Candidato candidatos_seguir) {
        this.candidatos_seguir.add(candidatos_seguir);
    }

    

    public File getArchivo() {
        return Archivo;
    }

    public void setArchivo(File Archivo) {
        this.Archivo = Archivo;
    }

    public ArrayList<Usuario_comun> getAmigos() {
        return amigos;
    }

    public void setAmigos(Usuario_comun amigos) {
        this.amigos.add(amigos);
    }

    

    @Override
    public String toString() {
        return name2 ;
    }

    
    
}
