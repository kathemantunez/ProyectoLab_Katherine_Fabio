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
public class LISTA {
    //Lista enlazada para usuarios  
   protected Nodo inicio,fin;
    
    
    public LISTA(){
        inicio=null;
        fin=null;
    }
    public void agregarAlInicio(Object elemento){
        inicio =new Nodo(elemento, inicio);
        if(fin==null){
            fin=inicio;
        }
        
    }
    //muestra datos
    public void mostarlista(){
        Nodo recorrer=inicio;
        while(recorrer!=null){
            System.out.println("["+recorrer.dato+"]--->");
            recorrer=recorrer.siguiente;
            
        }
        
    }   
}
