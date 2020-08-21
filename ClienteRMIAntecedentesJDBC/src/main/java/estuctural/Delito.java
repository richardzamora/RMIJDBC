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
public class Delito implements Serializable, CRUD{
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

    @Override
    public String crear() {
        return "INSERT INTO public.delitos(\n" +
"	codigo, nombre, pena_minima, pena_maxima)\n" +
"	VALUES ("+ codigo +", '"+ nombre +"', "+ penaMinima +", "+ penaMaxima +");";
    }

    @Override
    public String leer() {
        return "SELECT codigo, nombre, pena_minima, pena_maxima\n" +
"	FROM public.delitos WHERE codigo="+ codigo +";";
    }

    @Override
    public String leerTodos() {
        return "SELECT codigo, nombre, pena_minima, pena_maxima\n" +
"	FROM public.delitos;";
    }

    @Override
    public String actualizar() {
        return "UPDATE public.delitos\n" +
"	SET codigo="+ codigo +", nombre='"+ nombre +"', pena_minima="+ penaMinima +", pena_maxima="+ penaMaxima +"\n" +
"	WHERE codigo="+ codigo +";";
    }

    @Override
    public String eliminar() {
        return "DELETE FROM public.delitos\n" +
"	WHERE codigo="+ codigo +";";
    }
    
    
}
