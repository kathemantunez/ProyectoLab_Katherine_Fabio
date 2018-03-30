/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectolab_katherine_fabio;

/**
 *
 * @author KATHERINE
 */
class Publicaciones {
    private String texto;
    private String nombre_candidato;

    public Publicaciones(String texto, String nombre_candidato) {
        this.texto = texto;
        this.nombre_candidato = nombre_candidato;
    }

    public String getNombre_candidato() {
        return nombre_candidato;
    }

    public void setNombre_candidato(String nombre_candidato) {
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
        return "Publicaciones de:"+nombre_candidato+":" + texto ;
    }
}
