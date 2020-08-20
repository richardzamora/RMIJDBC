/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import estuctural.Delito;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import persistencia.Conexion;

/**
 *
 * @author Estudiantes
 */
public class ServicioDelito {
    public Delito darDelitoPorCodigo(int codigo)
    {
        
    }
    
    public ArrayList<Delito> darDelitos()
    {
        Conexion conn = null;
        ResultSet rs = null;
        Delito delito = new Delito();
        ArrayList<Delito> delitos = new ArrayList<Delito>();
        
        try {
            conn = Conexion.getInstance();
            rs = conn.executeQuery(delito.leerTodos());
            while(rs.next()){
                int codigo = rs.getInt("codigo");
                String nombre = rs.getString("nombre");
                int penaMinima = rs.getInt("pena_minima");
                int penaMaxima = rs.getInt("pena_maxima");
                
                delito = new Delito(codigo, nombre, penaMinima, penaMaxima);
                
                delitos.add(delito);
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            Conexion.close(rs);
        }
        return delitos;
    }
}
