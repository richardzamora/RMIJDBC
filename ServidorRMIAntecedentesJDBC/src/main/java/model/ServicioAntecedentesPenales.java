/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import estuctural.Antecedente;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;
import estuctural.Ciudadano;
import estuctural.Delito;
import estuctural.TipoDocumento;
import java.util.ArrayList;

/**
 *
 * @author richa
 */
public class ServicioAntecedentesPenales extends UnicastRemoteObject implements IServiciosAntecedentesPenales{

    ServicioCiudadano servicioCiudadano;
    ServicioAntecedente servicioAntecedente;
    ServicioDelito servicioDelito;
    ServicioTipoDocumento servicioTipoDocumento;
    
    public ServicioAntecedentesPenales() {
        servicioAntecedente = new ServicioAntecedente();
        servicioCiudadano = new ServicioCiudadano();
        servicioDelito = new ServicioDelito();
        servicioTipoDocumento = new ServicioTipoDocumento();
    }

    @Override
    public boolean eliminarCiudadano(String cedula) throws RemoteException {
       return servicioCiudadano.eliminarCiudadano(cedula);
    }

    @Override
    public boolean agregarCiudadano(String cedula, int tipoDocumento, String nombre, String apellido, Date fechaNacimiento, boolean genero) throws RemoteException {
        return servicioCiudadano.agregarCiudadano(cedula, tipoDocumento, nombre, apellido, fechaNacimiento, genero);
    }

    @Override
    public Ciudadano darCiudadanoPorCedula(String cedula) throws RemoteException {
        return servicioCiudadano.darCiudadanoPorCedula(cedula);
    }

    @Override
    public ArrayList<Ciudadano> darCiudadanos() throws RemoteException {
        return servicioCiudadano.darCiudadanos();
    }

    @Override
    public boolean actualizarCiudadano(String cedula, int tipoDocumento, String nombre, String apellido, Date fechaNacimiento, boolean genero) throws RemoteException {
        return servicioCiudadano.actualizarCiudadano(cedula, tipoDocumento, nombre, apellido, fechaNacimiento, genero);
    }

    @Override
    public Delito darDelitoPorCodigo(int codigo) throws RemoteException {
        return servicioDelito.darDelitoPorCodigo(codigo);
    }

    @Override
    public ArrayList<Delito> darDelitos() throws RemoteException {
        return servicioDelito.darDelitos();
    }

    @Override
    public ArrayList<Antecedente> darAntecedentes() throws RemoteException {
        return servicioAntecedente.darAntecedentes();
    }

    @Override
    public boolean agregarAntecedente(String ciudadanoDi, int delitoCodigo, String ciudad, Date fechaDelito, int sentencia, String estado) throws RemoteException {
        return servicioAntecedente.agregarAntecedente(ciudadanoDi, delitoCodigo, ciudad, fechaDelito, sentencia, estado);
    }

    @Override
    public boolean actualizarAntecedente(String ciudadanoDi, int delitoCodigo, String ciudad, Date fechaDelito, int sentencia, String estado) throws RemoteException {
        return servicioAntecedente.actualizarAntecedente(ciudadanoDi, delitoCodigo, ciudad, fechaDelito, sentencia, estado);
    }

    @Override
    public boolean eliminarAntecedente(String ciudadanoDi, int delitoCodigo) throws RemoteException {
        return servicioAntecedente.eliminarAntecedente(ciudadanoDi, delitoCodigo);
    }

    @Override
    public TipoDocumento darTipoDocumentoPorCodigo(int codigo) throws RemoteException {
        return servicioTipoDocumento.darTipoDocumentoPorCodigo(codigo);
    }

    @Override
    public ArrayList<TipoDocumento> darTipoDocumentos() throws RemoteException {
        return servicioTipoDocumento.darTipoDocumentos();
    }

}
