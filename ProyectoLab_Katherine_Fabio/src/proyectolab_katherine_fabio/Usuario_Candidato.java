/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectolab_katherine_fabio;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author KATHERINE
 */
public class Usuario_Candidato extends Usuario{
     private ArrayList<Certificaciones> certificaciones=new ArrayList();
    private ArrayList<Publicaciones> publicaciones=new ArrayList();
    private ArrayList<Seguidores> seguidores=new ArrayList();
    private String name;

    public Usuario_Candidato() {
    }

    public Usuario_Candidato(String name, String nombre_usuario, String contraseña, Date fecha_nacimiento, String correo, String sexo, String nombre) {
        super(nombre_usuario, contraseña, fecha_nacimiento, correo, sexo, nombre);
        this.name = name;
    }

    public ArrayList<Certificaciones> getCertificaciones() {
        return certificaciones;
    }

    public void setCertificaciones(ArrayList<Certificaciones> certificaciones) {
        this.certificaciones = certificaciones;
    }

    public ArrayList<Publicaciones> getPublicaciones() {
        return publicaciones;
    }

    public void setPublicaciones(ArrayList<Publicaciones> publicaciones) {
        this.publicaciones = publicaciones;
    }

    public ArrayList<Seguidores> getSeguidores() {
        return seguidores;
    }

    public void setSeguidores(ArrayList<Seguidores> seguidores) {
        this.seguidores = seguidores;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
