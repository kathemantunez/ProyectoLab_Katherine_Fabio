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
    private Usuario_Candidato nombre_candidato;
private static final long SerialVersionUID=777L;//version
    public Publicaciones() {
    }

    public Publicaciones(String texto, Usuario_Candidato nombre_candidato) {
        this.texto = texto;
        this.nombre_candidato = nombre_candidato;
    }

    public Usuario_Candidato getNombre_candidato() {
        return nombre_candidato;
    }

    public void setNombre_candidato(Usuario_Candidato nombre_candidato) {
        this.nombre_candidato = nombre_candidato;
    }

    

  

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString() {
        return "Publicaciones de "+nombre_candidato+":" + texto ;
    }
}
