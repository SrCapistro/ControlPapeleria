/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlpapeleria;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author Mrcap
 * @verion 1.1 , 31/05/2021
 */
public class ControlArchivos {
    
    
    public int GuardarProducto(Catalogo Producto){
        int elementoGuardado = 0;
        File f = new File("Productos.txt");
        FileOutputStream fo = null;
        ObjectOutputStream oo = null;
        
        try{
            f = new File("Productos.txt");
            fo = new FileOutputStream(f, true);
            oo = new ObjectOutputStream(fo);
            
            oo.writeObject(Producto);
            elementoGuardado = 1;
        }catch(Exception e){
            System.out.println(e.toString());
            elementoGuardado = 0;
        }finally{
               if(oo!=null){
                   try{
                       oo.close();
                   }catch(IOException e1){
                       elementoGuardado = 0;
                   }
               }
            }
        
        
        return elementoGuardado;
    }
    
    public String LeerProducto(String id){
                File f = null;
        FileInputStream fi = null;
        Catalogo producto = null;
        String nombreProducto = "";
        try{
            f = new File ("Productos.txt");
            fi = new FileInputStream(f);            
            while(true){
                ObjectInputStream oi = new ObjectInputStream(fi);
                producto = (Catalogo) oi.readObject();
                String idi = producto.getID().toString();
                
                if(idi.equals(id)){
                    nombreProducto = producto.getNombre();
                    
                }
             
            }
        }
        catch(Exception e1){
             e1.printStackTrace();
        }
        finally{
            try{
                fi.close();
            }
            catch(java.io.IOException e1){
                System.out.println("Excepción:" + e1.toString());
            }catch(java.lang.NullPointerException n1){

            }
        }
        return nombreProducto;
    }
}

