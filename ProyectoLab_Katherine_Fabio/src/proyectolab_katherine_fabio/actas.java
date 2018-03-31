/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectolab_katherine_fabio;

import java.io.File;
import java.io.Serializable;

/**
 *
 * @author KATHERINE
 */
public class actas implements Serializable{
    
    private String contenid_Acta;
    private int votos;
    private File ruta;
   private static final long SerialVersionUID=777L;//version
    public String getContenid_Acta() {
        return contenid_Acta;
    }

    public void setContenid_Acta(String contenid_Acta) {
        this.contenid_Acta = contenid_Acta;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }

    public actas() {
    }

    public actas(String contenid_Acta, int votos, File ruta) {
        this.contenid_Acta = contenid_Acta;
        this.votos = votos;
        this.ruta = ruta;
    }

    

    @Override
    public String toString() {
        return "actas{" + "contenid_Acta=" + contenid_Acta + ", votos=" + votos + '}';
    }
    
    
}
