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
class admin_u_comun {
      private ArrayList<Usuario_comun> lista_comun=new ArrayList();
    private File archivo=null;
     public admin_u_comun(String path) {
        archivo=new File(path);
    }

    public ArrayList<Usuario_comun> getLista_comun() {
        return lista_comun;
    }

    public void setLista_comun(ArrayList<Usuario_comun> lista_comun) {
        this.lista_comun = lista_comun;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
      public void setU_comun(Usuario_comun a){
        lista_comun.add(a);
    }
    
    public void cargarArchivo(){
        try {
         lista_comun=new ArrayList();
         Usuario_comun temp;
         if(archivo.exists()){
             FileInputStream entrada
                     =new FileInputStream(archivo);
             ObjectInputStream objeto=new ObjectInputStream(entrada);
             try {
                 while((temp=(Usuario_comun)objeto.readObject())!=null){
                     lista_comun.add(temp);
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
         for (Usuario_comun t : lista_comun) {
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
        
    
    
    




