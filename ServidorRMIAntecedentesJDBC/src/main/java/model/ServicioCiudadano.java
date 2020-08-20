/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import estuctural.Ciudadano;
import estuctural.Delito;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import persistencia.Conexion;

/**
 *
 * @author Estudiantes
 */
public class ServicioCiudadano {
    
    public boolean eliminarCiudadano(String cedula)
    {
        
    }
    
    public boolean agregarCiudadano(String cedula, int tipoDocumento, String nombre, String apellido, Date fechaNacimiento, boolean genero)
    {
        
    }
    public Ciudadano darCiudadanoPorCedula(String cedula)
    {
        
    }
    public ArrayList<Ciudadano> darCiudadanos()
    {
        Conexion conn = null;
        ResultSet rs = null;
        Ciudadano ciudadano = new Ciudadano();
        ArrayList<Ciudadano> ciudadanos = new ArrayList<Ciudadano>();
        
        try {
            conn = Conexion.getInstance();
            rs = conn.executeQuery(ciudadano.leerTodos());
            while(rs.next()){
                String di = rs.getString("di");
                int tipoDocumento = rs.getInt("tipo_documento");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                java.sql.Date fechaNacimiento = rs.getDate("fecha_nacimiento");
                boolean genero = rs.getBoolean("genero");
                
                ciudadano = new Ciudadano(di, tipoDocumento, nombre, apellido, fechaNacimiento, genero);
                
                ciudadanos.add(ciudadano);
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            Conexion.close(rs);
        }
        return ciudadanos;
    }
    
    public boolean actualizarCiudadano(String cedula, int tipoDocumento, String nombre, String apellido, Date fechaNacimiento, boolean genero)
    {
        
    }
}
