/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion2_proyectolab_fabio_katherine;

/**
 *
 * @author KATHERINE
 */
public class Nodo {
    public Object dato;
    public Nodo siguiente;
    
    public Nodo(Object dato){
        this.dato=dato;
        
    }
    public Nodo(Object d,Nodo n){
        dato=d;
        siguiente=n;
    }
}
