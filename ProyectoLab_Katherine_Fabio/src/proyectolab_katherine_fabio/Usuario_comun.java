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
    private ArrayList<Correos> correos=new ArrayList();
    private ArrayList<Usuario_Candidato> candidatos_seguir=new ArrayList();
    private File Archivo;//cambiar
    private ArrayList<Amigos> amigos=new ArrayList();
    private String name2;
    

    public Usuario_comun(String direccion, File Archivo, String name2, String nombre_usuario, String contraseña, Date fecha_nacimiento, String correo, String sexo, String nombre) {
        super(nombre_usuario, contraseña, fecha_nacimiento, correo, sexo, nombre);
        this.direccion = direccion;
        this.Archivo = Archivo;
        this.name2 = name2;
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

    public ArrayList<Correos> getCorreos() {
        return correos;
    }

    public void setCorreos(ArrayList<Correos> correos) {
        this.correos = correos;
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

    public ArrayList<Amigos> getAmigos() {
        return amigos;
    }

    public void setAmigos(ArrayList<Amigos> amigos) {
        this.amigos = amigos;
    }

    @Override
    public String toString() {
        return name2 ;
    }

    
    
}
