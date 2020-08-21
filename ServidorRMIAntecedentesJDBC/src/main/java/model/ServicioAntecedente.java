/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import estuctural.Antecedente;
import estuctural.TipoDocumento;
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
    
    public boolean agregarAntecedente(String ciudadanoDi, int delitoCodigo, String ciudad, Date fechaDelito, int sentencia, String estado)
    {
        
    }
    
    public boolean actualizarAntecedente(String ciudadanoDi, int delitoCodigo, String ciudad, Date fechaDelito, int sentencia, String estado) 
    {
        
    }

    public boolean eliminarAntecedente(String ciudadanoDi, int delitoCodigo) 
    {
        
    }
 
}
