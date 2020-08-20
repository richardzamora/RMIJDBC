/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;
import estuctural.Ciudadano;
import java.util.ArrayList;

/**
 *
 * @author richa
 */
public class ServicioAntecedentes extends UnicastRemoteObject implements IServicioAntecedentes{

    
    public ServicioAntecedentes() {
    }

    @Override
    public void eliminarCiudadano(String cedula) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void agregarCiudadano(String cedula, Integer tipoDocumento, String nombre, String apellido, Date fechaNacimiento, boolean genero) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Ciudadano darCiudadanoPorCedula(String cedula) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Ciudadano> darCiudadanos() throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizarCiudadano(String cedula, Integer tipoDocumento, String nombre, String apellido, Date fechaNacimiento, boolean genero) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
