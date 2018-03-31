/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectolab_katherine_fabio;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author KATHERINE
 */
public class admin_publicaciones {
     private ArrayList<Publicaciones> lista_publicaciones=new ArrayList();
    private File archivo=null;
     public admin_publicaciones(String path) {
        archivo=new File(path);
    }

    public ArrayList<Publicaciones> getLista_publicaciones() {
        return lista_publicaciones;
    }

    public void setLista_publicaciones(ArrayList<Publicaciones> lista_publicaciones) {
        this.lista_publicaciones = lista_publicaciones;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
     
      public void set_publi(Publicaciones a){
        lista_publicaciones.add(a);
    }
    
    public void cargarArchivo(){
        try {
         lista_publicaciones=new ArrayList();
         Publicaciones temp;
         if(archivo.exists()){
             FileInputStream entrada
                     =new FileInputStream(archivo);
             ObjectInputStream objeto=new ObjectInputStream(entrada);
             try {
                 while((temp=(Publicaciones)objeto.readObject())!=null){
                     lista_publicaciones.add(temp);
                 }
             } catch (EOFException e) {
                 //ENCONTRO EL FINAL DEL ARCHIVO
             }
             objeto.close();
             entrada.close();
         }
     } catch (Exception e) {
         e.printStackTrace();
     }
 }
    public void escribirArchivo(){
         FileOutputStream fw=null;
     ObjectOutputStream bw=null;
     
     try {
         
         fw=new FileOutputStream(archivo);
         bw=new ObjectOutputStream(fw);
         for (Publicaciones t : lista_publicaciones) {
             bw.writeObject(t);
             
         }
         bw.flush();
         
         
     } catch (Exception ex) {
     }finally{
         try {
             bw.close();
             fw.close();
         } catch (Exception e) {
         }
     }
 }
    
}
