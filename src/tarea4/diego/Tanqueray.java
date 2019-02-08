/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea4.diego;

/**
 *
 * @author diego
 */
public class Tanqueray {
    
    private String graduacion;
    private int precio;

    public Tanqueray(String graduacion, int precio) {
        this.graduacion = graduacion;
        this.precio = precio;
    }

    public Tanqueray() {
    }

    public String getGraduacion() {
        return graduacion;
    }

    public void setGraduacion(String graduacion) {
        this.graduacion = graduacion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
}
