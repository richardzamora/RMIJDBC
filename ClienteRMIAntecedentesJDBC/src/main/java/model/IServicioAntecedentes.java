/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import gui.Cambiable;
import java.rmi.Remote;
import java.rmi.RemoteException;
import logica.estuctural.Ciudadano;

import java.util.ArrayList;
import java.util.Date;
import java.util.Set;
import javax.swing.JOptionPane;
import logica.estuctural.Antecedente;
import logica.estuctural.Ciudadano.TipoDocumento;


/**
 *
 * @author Richard
 */
public interface IServicioAntecedentes extends Remote{

    public void datosPrueba() throws RemoteException;
    
    public void eliminarCiudadano(String cedula, TipoDocumento tipoDocumento) throws RemoteException;
    
    public void agregarCiudadano(String nombre, String apellido, String direccion, Date fecha, String cedula, TipoDocumento tipoDocumento) throws RemoteException;
    
    public Ciudadano darCiudadanoPorCedula(String cedula, TipoDocumento tipoDocumento)throws RemoteException;
    
    public Set<Ciudadano> darCiudadanos() throws RemoteException;
    
    public void actualizarCiudadano(String nombre, String apellido, String direccion, Date fecha, String cedula, TipoDocumento tipoDocumento)throws RemoteException;
    
    public void aniadirAntecedenteCiudadano(Antecedente ant, String cedula, TipoDocumento tipoDocumento)throws RemoteException;
    
    public Antecedente darPrimerAntecedente(String cedula, TipoDocumento tipoDocumento) throws RemoteException;
}
