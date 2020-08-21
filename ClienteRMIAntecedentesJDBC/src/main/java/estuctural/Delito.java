/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estuctural;

import java.io.Serializable;

/**
 *
 * @author richa
 */
public class Delito implements Serializable{
    private int codigo;
    private String nombre;
    private int penaMinima;
    private int penaMaxima;

    public Delito() {
    }

    public Delito(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public Delito(int codigo, String nombre, int penaMinima, int penaMaxima) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.penaMinima = penaMinima;
        this.penaMaxima = penaMaxima;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPenaMinima() {
        return penaMinima;
    }

    public void setPenaMinima(int penaMinima) {
        this.penaMinima = penaMinima;
    }

    public int getPenaMaxima() {
        return penaMaxima;
    }

    public void setPenaMaxima(int penaMaxima) {
        this.penaMaxima = penaMaxima;
    }

    @Override
    public String toString() {
        return "Delito{" + "codigo=" + codigo + ", nombre=" + nombre + ", penaMinima=" + penaMinima + ", penaMaxima=" + penaMaxima + '}';
    }

}
