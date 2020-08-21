/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import estuctural.Antecedente;
import estuctural.Ciudadano;
import estuctural.Delito;
import estuctural.TipoDocumento;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.ServicioAntecedentesPenales;
import persistencia.Conexion;

/**
 *
 * @author Estudiantes
 */
public class AplicacionServidorRMI {
    
    public void pruebaBaseDatos(ServicioAntecedentesPenales model)
    {
        try {
            
        ArrayList<Ciudadano> delitos = model.darCiudadanos();
        for(Ciudadano crimen : delitos)
            {
                System.out.println(crimen.toString());
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            ServicioAntecedentesPenales model = new ServicioAntecedentesPenales();
            LocateRegistry.createRegistry(1099);
            Naming.rebind("//192.168.16.13/ServidorAntecedentes", model);
            System.out.println("Servidor Antecedentes operando");
            Conexion.getInstance();
            //--------------------------------------------------------------
        }catch(Exception e){
            System.out.println("Error! : " +e);
        }
    }
    
}
