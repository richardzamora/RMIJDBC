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
import java.util.Set;
import estuctural.Antecedente;
import java.util.ArrayList;


/**
 *
 * @author Richard
 */
public interface IServicioAntecedentes extends Remote{

    public void datosPrueba() throws RemoteException;
    
    public void eliminarCiudadano(String cedula) throws RemoteException;
    
    public void agregarCiudadano(String cedula, Integer tipoDocumento, String nombre, String apellido, Date fechaNacimiento, boolean genero) throws RemoteException;
    
    public Ciudadano darCiudadanoPorCedula(String cedula)throws RemoteException;
    
    public ArrayList<Ciudadano> darCiudadanos() throws RemoteException;
    
    public void actualizarCiudadano(String cedula, Integer tipoDocumento, String nombre, String apellido, Date fechaNacimiento, boolean genero)throws RemoteException;
    
}
