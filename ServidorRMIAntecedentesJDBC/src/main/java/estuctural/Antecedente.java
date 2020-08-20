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
public class Antecedente implements Serializable{
    
    
    private String tipoDeCrimen;
    private String detalles;
    private Date fechaDelito;
    private String ciudad;
    private int sentencia;
    private String estado;

    public Antecedente() {
    }

    public Antecedente(String tipoDeCrimen, String detalles, Date fechaDelito, String ciudad, int sentencia, String estado) {
        this.tipoDeCrimen = tipoDeCrimen;
        this.detalles = detalles;
        this.fechaDelito = fechaDelito;
        this.ciudad = ciudad;
        this.sentencia = sentencia;
        this.estado = estado;
    }

    public Antecedente(String tipoDeCrimen, String detalles, Date fechaDelito, String ciudad, int sentencia) {
        this.tipoDeCrimen = tipoDeCrimen;
        this.detalles = detalles;
        this.fechaDelito = fechaDelito;
        this.ciudad = ciudad;
        this.sentencia = sentencia;
        this.estado = "Activo";
    }

    
    
    public String getTipoDeCrimen() {
        return tipoDeCrimen;
    }

    public String getDetalles() {
        return detalles;
    }

    public Date getFechaDelito() {
        return fechaDelito;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setTipoDeCrimen(String tipoDeCrimen) {
        this.tipoDeCrimen = tipoDeCrimen;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public void setFechaDelito(Date fechaDelito) {
        this.fechaDelito = fechaDelito;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    
}
