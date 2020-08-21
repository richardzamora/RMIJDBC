/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estuctural;

import java.io.Serializable;
import java.sql.Date;

/**
 *
 * @author Richard
 */
public class Ciudadano implements Serializable{
   
    private String di;
    private Integer tipoDocumento;
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
    //True posee cromosoma Y. False de lo contrario. XD 
    private boolean genero;

    public Ciudadano() {
    }

    public Ciudadano(String cedula, Integer tipoDocumento, String nombre, String apellido, Date fechaNacimiento, boolean genero) {
        this.di = cedula;
        this.tipoDocumento = tipoDocumento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
    }

    public String getCedula() {
        return di;
    }

    public void setCedula(String cedula) {
        this.di = cedula;
    }

    public Integer getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(Integer tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public boolean isHombre() {
        return genero;
    }

    public void setGenero(boolean genero) {
        this.genero = genero;
    }
    
    
    public boolean equals(Object objeto)
    {
        if(objeto==null)
            return false;
        Ciudadano ciudadano = (Ciudadano)objeto;
        if(this.getCedula().equals(ciudadano.getCedula()))
            return true;
        else
            return false;
    }
    
    public int hashCode(){
        return this.getCedula().hashCode();
    }

    @Override
    public String toString() {
        return "Ciudadano{" + "di=" + di + ", tipoDocumento=" + tipoDocumento + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimiento=" + fechaNacimiento + ", genero=" + genero + '}';
    }

}
