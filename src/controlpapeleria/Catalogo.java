/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlpapeleria;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author Mrcap
 * @verion 1.1 , 31/05/2021
 */
public class Catalogo implements Serializable{
    private String ID;
    private String nombre;
    private String tipo;
    private int cantidad;
    private String descripcion;
    private float precioUnitario;

    public Catalogo() {
    }

    public Catalogo(String ID, String nombre, String tipo, String descripcion, float precioUnitario) {
        this.ID = ID;
        this.nombre = nombre;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
    }

    
    public Catalogo(String ID, String nombre, String tipo, int cantidad, String descripcion, float precioUnitario) {
        this.ID = ID;
        this.nombre = nombre;
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(float precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
    
    private void writeObject(ObjectOutputStream s) throws IOException{
       s.writeObject(ID);
       s.writeObject(nombre);
       s.writeObject(tipo);
       s.writeObject(descripcion);
       s.writeObject(precioUnitario);
    }
    
     private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException{
        ID = (String) s.readObject();
        nombre = (String) s.readObject();
        tipo = (String) s.readObject();
        descripcion = (String) s.readObject();
        precioUnitario = (float) s.readObject();
    }
}
