/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectolab_katherine_fabio;

import java.io.Serializable;

/**
 *
 * @author KATHERINE
 */
class Publicaciones implements Serializable{
    private String texto;
//    private Usuario_Candidato nombre_candidato;
    private String nombre_Candidato;
private static final long SerialVersionUID=777L;//version
    public Publicaciones() {
    }

    public String getNombre_Candidato() {
        return nombre_Candidato;
    }

    public void setNombre_Candidato(String nombre_Candidato) {
        this.nombre_Candidato = nombre_Candidato;
    }

    public Publicaciones(String texto, String nombre_Candidato) {
        this.texto = texto;
        this.nombre_Candidato = nombre_Candidato;
    }

 

    

  

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString() {
        return "Publicaciones de "+nombre_Candidato+":" + texto ;
    }
}
