/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.rmi.*;
import logica.estuctural.Antecedente;

/**
 *
 * @author Estudiantes
 */
public interface IServicioHola extends Remote{
    
    public String decirHola(String nombre) throws RemoteException;
    
    public String mostrarAntecedente(Antecedente antecedente) throws RemoteException;
}
