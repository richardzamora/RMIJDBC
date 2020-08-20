/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.rmi.Remote;
import java.rmi.RemoteException;
import estuctural.Ciudadano;

import java.util.Date;
import estuctural.Antecedente;
import estuctural.Delito;
import estuctural.TipoDocumento;
import java.util.ArrayList;


/**
 *
 * @author Richard
 */
public interface IServiciosAntecedentesPenales extends Remote{

    //----------------------------Ciudadano----------------------------
    public boolean eliminarCiudadano(String cedula) throws RemoteException;
    
    public boolean agregarCiudadano(String cedula, int tipoDocumento, String nombre, String apellido, Date fechaNacimiento, boolean genero) throws RemoteException;
    
    public Ciudadano darCiudadanoPorCedula(String cedula)throws RemoteException;
    
    public ArrayList<Ciudadano> darCiudadanos() throws RemoteException;
    
    public boolean actualizarCiudadano(String cedula, int tipoDocumento, String nombre, String apellido, Date fechaNacimiento, boolean genero)throws RemoteException;
    
    //----------------------------Delito----------------------------
    public Delito darDelitoPorCodigo(int codigo) throws RemoteException;
    
    public ArrayList<Delito> darDelitos() throws RemoteException;
    //----------------------------Antecedente----------------------------
    public Antecedente darAntecedentes() throws RemoteException;
    
    public boolean agregarAntecedente(String ciudadanoDi, int delitoCodigo, String ciudad, Date fechaDelito, int sentencia, String estado)throws RemoteException;
    
    public boolean actualizarAntecedente(String ciudadanoDi, int delitoCodigo, String ciudad, Date fechaDelito, int sentencia, String estado) throws RemoteException;

    public boolean eliminarAntecedente(String ciudadanoDi, int delitoCodigo) throws RemoteException;
    //----------------------------TipoDocumento----------------------------
    public TipoDocumento darTipoDocumentoPorCodigo(int codigo) throws RemoteException;
    
    public ArrayList<TipoDocumento> darTipoDocumentos() throws RemoteException;
    
}
