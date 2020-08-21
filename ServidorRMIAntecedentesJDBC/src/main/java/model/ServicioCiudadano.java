/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import estuctural.Ciudadano;
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
        Conexion conn = Conexion.getInstance();
        Ciudadano ciudadano = new Ciudadano();
        ciudadano.setCedula(cedula);
        return conn.executeUpdate(ciudadano.eliminar());
    }
    
    public boolean agregarCiudadano(String cedula, int tipoDocumento, String nombre, String apellido, Date fechaNacimiento, boolean genero)
    {
        Conexion conn = Conexion.getInstance();
        java.sql.Date sDate = new java.sql.Date(fechaNacimiento.getTime());
        Ciudadano ciudadano = new Ciudadano(cedula, tipoDocumento, nombre, apellido, sDate, genero);
        return conn.executeUpdate(ciudadano.crear());
    }
    
    public Ciudadano darCiudadanoPorCedula(String cedula)
    {
        Conexion conn = null;
        ResultSet rs = null;
        Ciudadano ciudadano = new Ciudadano();
        ciudadano.setCedula(cedula);
        boolean encontrado = false;
        try {
            conn = Conexion.getInstance();
            rs = conn.executeQuery(ciudadano.leer());
            while(rs.next()){
                String di = rs.getString("di");
                int tipoDocumento = rs.getInt("tipo_documento");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                java.sql.Date fechaNacimiento = rs.getDate("fecha_nacimiento");
                boolean genero = rs.getBoolean("genero");
                
                ciudadano = new Ciudadano(di, tipoDocumento, nombre, apellido, fechaNacimiento, genero);
                encontrado = true;
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            Conexion.close(rs);
        }
        if(encontrado)
            return ciudadano;
        else
            return null;
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
        Conexion conn = Conexion.getInstance();
        java.sql.Date sDate = new java.sql.Date(fechaNacimiento.getTime());
        Ciudadano ciudadano = new Ciudadano(cedula, tipoDocumento, nombre, apellido, sDate, genero);
        return conn.executeUpdate(ciudadano.actualizar());
    }
}
