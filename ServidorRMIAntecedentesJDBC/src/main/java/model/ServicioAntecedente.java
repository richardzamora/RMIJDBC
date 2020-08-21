/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import estuctural.Antecedente;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import persistencia.Conexion;

/**
 *
 * @author Estudiantes
 */
public class ServicioAntecedente {
    
    public ArrayList<Antecedente> darAntecedentes()
    {
        Conexion conn = null;
        ResultSet rs = null;
        Antecedente antecedente = new Antecedente();
        ArrayList<Antecedente> antecedentes = new ArrayList<Antecedente>();
        
        try {
            conn = Conexion.getInstance();
            rs = conn.executeQuery(antecedente.leerTodos());
            while(rs.next()){
                
                int id = rs.getInt("id");
                String ciudadanoDi = rs.getString("ciudadano_di");
                int delitoCodigo = rs.getInt("delito_codigo");
                String ciudad = rs.getString("ciudad");
                java.sql.Date fechaDelito = rs.getDate("fecha_delito");
                int sentencia = rs.getInt("sentencia");
                String estado = rs.getString("estado");
                antecedente = new Antecedente(id,ciudadanoDi, delitoCodigo, ciudad, fechaDelito, sentencia, estado);
                
                antecedentes.add(antecedente);
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            Conexion.close(rs);
        }
        return antecedentes;
    }
    public Antecedente darAntecedentePorId(int pId)
    {
        Conexion conn = null;
        ResultSet rs = null;
        Antecedente antecedente = new Antecedente();
        antecedente.setId(pId);
        boolean encontrado = false;
        try {
            conn = Conexion.getInstance();
            rs = conn.executeQuery(antecedente.leer());
            while(rs.next()){
                
                int id = rs.getInt("id");
                String ciudadanoDi = rs.getString("ciudadano_di");
                int delitoCodigo = rs.getInt("delito_codigo");
                String ciudad = rs.getString("ciudad");
                java.sql.Date fechaDelito = rs.getDate("fecha_delito");
                int sentencia = rs.getInt("sentencia");
                String estado = rs.getString("estado");
                antecedente = new Antecedente(id,ciudadanoDi, delitoCodigo, ciudad, fechaDelito, sentencia, estado);
                
                encontrado = true;
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            Conexion.close(rs);
        }
        
        if(encontrado)
            return antecedente;
        else
            return null;
    }
    
    public boolean agregarAntecedente(String ciudadanoDi, int delitoCodigo, String ciudad, Date fechaDelito, int sentencia, String estado)
    {
        Conexion conn = Conexion.getInstance();
        Antecedente antecedente = new Antecedente(ciudadanoDi, delitoCodigo, ciudad, fechaDelito, sentencia, estado);
        return conn.executeUpdate(antecedente.crear());
    }
    
    public boolean actualizarAntecedente(int id, String ciudadanoDi, int delitoCodigo, String ciudad, Date fechaDelito, int sentencia, String estado) 
    {
        Conexion conn = Conexion.getInstance();
        Antecedente antecedente = new Antecedente(id, ciudadanoDi, delitoCodigo, ciudad, fechaDelito, sentencia, estado);
        return conn.executeUpdate(antecedente.actualizar());
    }

    public boolean eliminarAntecedente(int id) 
    {
        Conexion conn = Conexion.getInstance();
        Antecedente antecedente = new Antecedente();
        antecedente.setId(id);
        return conn.executeUpdate(antecedente.eliminar());
    }
    
    public int darSentenciaTotalPorCiudadano(String ciudadanoDi)
    {
        int sentencia = 0;
        sentencia = darAntecedentes().stream().filter(antecedente -> (antecedente.getCiudadanoDi().equals(ciudadanoDi))).map(antecedente -> antecedente.getSentencia()).reduce(sentencia, Integer::sum);

//        for(Antecedente antecedente:darAntecedentes())
//        {
//            if(antecedente.getCiudadanoDi().equals(ciudadanoDi))
//            {
//                sentencia+=antecedente.getSentencia();
//            }
//        }
        return sentencia;
    }
    
    public ArrayList<Antecedente> darAntecedentesPorCiudadano(String ciudadanoDi)
    {
        ArrayList<Antecedente> antecedentes = new ArrayList<>();
        
        for(Antecedente antecedente : darAntecedentes())
        {
            if(antecedente.getCiudadanoDi().equals(ciudadanoDi))
            {
                antecedentes.add(antecedente);
            }
        }
        return antecedentes;
    }
    
    public ArrayList<Antecedente> darAntecedentesPorDelito(int delitoCodigo)
    {
        ArrayList<Antecedente> antecedentes = new ArrayList<>();
        
        for(Antecedente antecedente : darAntecedentes())
        {
            if(antecedente.getDelitoCodigo()==delitoCodigo)
            {
                antecedentes.add(antecedente);
            }
        }
        return antecedentes;
    }
    
    public ArrayList<Antecedente> darAntecedentesPorCiudadanoYDelito(String ciudadanoDi, int delitoCodigo)
    {
        ArrayList<Antecedente> antecedentes = new ArrayList<>();
        
        for(Antecedente antecedente : darAntecedentes())
        {
            if(antecedente.getCiudadanoDi().equals(ciudadanoDi) && antecedente.getDelitoCodigo()==delitoCodigo)
            {
                antecedentes.add(antecedente);
            }
        }
        return antecedentes;
    }
}
