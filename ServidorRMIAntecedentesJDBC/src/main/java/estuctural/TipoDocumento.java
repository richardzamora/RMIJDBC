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
public class TipoDocumento implements Serializable, CRUD{
    private int codigo;
    private String siglas;
    private String descripcion;

    public TipoDocumento() {
    }

    public TipoDocumento(int codigo, String siglas, String descripcion) {
        this.codigo = codigo;
        this.siglas = siglas;
        this.descripcion = descripcion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getSiglas() {
        return siglas;
    }

    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "TipoDocumento{" + "codigo=" + codigo + ", siglas=" + siglas + ", descripcion=" + descripcion + '}';
    }
    
    

    @Override
    public String crear() {
        return "INSERT INTO public.tipo_documentos(\n" +
"	codigo, siglas, descripcion)\n" +
"	VALUES ("+ codigo +", '"+ siglas +"', '"+ descripcion +"');";
    }

    @Override
    public String leer() {
        return "SELECT codigo, siglas, descripcion\n" +
"	FROM public.tipo_documentos WHERE codigo="+ codigo +";";
    }

    @Override
    public String leerTodos() {
        return "SELECT codigo, siglas, descripcion\n" +
"	FROM public.tipo_documentos;";
    }

    @Override
    public String actualizar() {
        return "UPDATE public.tipo_documentos\n" +
"	SET codigo="+ codigo +", siglas='"+ siglas +"', descripcion='"+ descripcion +"'\n" +
"	WHERE codigo="+ codigo +";";
    }

    @Override
    public String eliminar() {
        return "DELETE FROM public.tipo_documentos\n" +
"	WHERE codigo="+ codigo +";";
    }
    
}