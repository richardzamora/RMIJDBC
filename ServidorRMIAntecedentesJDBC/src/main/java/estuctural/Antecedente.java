/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estuctural;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Richard
 */
public class Antecedente implements Serializable, CRUD{
    
    private int id;
    private String ciudadanoDi;
    private int delitoCodigo;
    private String ciudad;
    private Date fechaDelito;
    private int sentencia;
    private String estado;

    public Antecedente() {
    }

    public Antecedente(String ciudadanoDi, int delitoCodigo, String ciudad, Date fechaDelito, int sentencia, String estado) {
        this.ciudadanoDi = ciudadanoDi;
        this.delitoCodigo = delitoCodigo;
        this.ciudad = ciudad;
        this.fechaDelito = fechaDelito;
        this.sentencia = sentencia;
        this.estado = estado;
    }
    
    public Antecedente(int id,String ciudadanoDi, int delitoCodigo, String ciudad, Date fechaDelito, int sentencia, String estado) {
        this.id = id;
        this.ciudadanoDi = ciudadanoDi;
        this.delitoCodigo = delitoCodigo;
        this.ciudad = ciudad;
        this.fechaDelito = fechaDelito;
        this.sentencia = sentencia;
        this.estado = estado;
    }

    public String getCiudadanoDi() {
        return ciudadanoDi;
    }

    public void setCiudadanoDi(String ciudadanoDi) {
        this.ciudadanoDi = ciudadanoDi;
    }

    public int getDelitoCodigo() {
        return delitoCodigo;
    }

    public void setDelitoCodigo(int delitoCodigo) {
        this.delitoCodigo = delitoCodigo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Date getFechaDelito() {
        return fechaDelito;
    }

    public void setFechaDelito(Date fechaDelito) {
        this.fechaDelito = fechaDelito;
    }

    public int getSentencia() {
        return sentencia;
    }

    public void setSentencia(int sentencia) {
        this.sentencia = sentencia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Antecedente{" + "id=" + id + ", ciudadanoDi=" + ciudadanoDi + ", delitoCodigo=" + delitoCodigo + ", ciudad=" + ciudad + ", fechaDelito= '" + fechaDelito + "', sentencia=" + sentencia + ", estado=" + estado + '}';
    }

    
    @Override
    public String crear() {
        return "INSERT INTO public.antecedentes(\n" +
"	ciudadano_di, delito_codigo, ciudad, fecha_delito, sentencia, estado)\n" +
"	VALUES ('"+ ciudadanoDi +"', "+ delitoCodigo +", '"+ ciudad +"', "+ fechaDelito +", "+ sentencia +",'"+ estado +"');";
    }

    @Override
    public String leer() {
        return "SELECT id, ciudadano_di, delito_codigo, ciudad, fecha_delito, sentencia, estado\n" +
"	FROM public.antecedentes WHERE id = "+ id +";";
    }

    @Override
    public String leerTodos() {
        return "SELECT id, ciudadano_di, delito_codigo, ciudad, fecha_delito, sentencia, estado\n" +
"	FROM public.antecedentes;";
    }

    @Override
    public String actualizar() {
        return "UPDATE public.antecedentes\n" +
"	SET ciudadano_di='"+ ciudadanoDi +"', delito_codigo="+ delitoCodigo +", ciudad='"+ ciudad +"', fecha_delito= '"+ fechaDelito +"', sentencia="+ sentencia +", estado='"+ estado +"'\n" +
"	WHERE id = "+ id +";";
    }

    @Override
    public String eliminar() {
        return "DELETE FROM public.antecedentes\n" +
"	WHERE id = "+ id +";";
    }
}
