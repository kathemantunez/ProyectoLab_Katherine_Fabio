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
class admin_u_candidato {
    private ArrayList<Usuario_Candidato> lista_candidatos=new ArrayList();
    private File archivo=null;
     public admin_u_candidato(String path) {
        archivo=new File(path);
    }

    public admin_u_candidato() {
    }

    public ArrayList<Usuario_Candidato> getLista_candidatos() {
        return lista_candidatos;
    }

    public void setLista_candidatos(ArrayList<Usuario_Candidato> lista_candidatos) {
        this.lista_candidatos = lista_candidatos;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
     
      public void setU_candidato(Usuario_Candidato a){
        lista_candidatos.add(a);
    }
    
    public void cargarArchivo(){
        try {
         lista_candidatos=new ArrayList();
         Usuario_Candidato temp;
         if(archivo.exists()){
             FileInputStream entrada
                     =new FileInputStream(archivo);
             ObjectInputStream objeto=new ObjectInputStream(entrada);
             try {
                 while((temp=(Usuario_Candidato)objeto.readObject())!=null){
                     lista_candidatos.add(temp);
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
         for (Usuario_Candidato t : lista_candidatos) {
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
        
    
    
    



