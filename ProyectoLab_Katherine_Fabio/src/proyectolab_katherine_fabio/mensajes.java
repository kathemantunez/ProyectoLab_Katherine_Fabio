/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectolab_katherine_fabio;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author KATHERINE
 */
public class mensajes {
     private Usuario emisor;//quien envia el mensaje
    private Usuario receptor;// el que lo reccibe
    private String asunto;
    private String descripcion;
    private Date fecha;

    public mensajes() {
    }

    public mensajes(Usuario emisor, Usuario receptor, String asunto, String descripcion, Date fecha) {
        this.emisor = emisor;
        this.receptor = receptor;
        this.asunto = asunto;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    

    public Usuario getEmisor() {
        return emisor;
    }

    public void setEmisor(Usuario emisor) {
        this.emisor = emisor;
    }

    public Usuario getReceptor() {
        return receptor;
    }

    public void setReceptor(Usuario receptor) {
        this.receptor = receptor;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "emisor=" + emisor + ", receptor=" + receptor + ", asunto=" + asunto + ", descripcion=" + descripcion + ", fecha=" + fecha ;
    }

    
}
