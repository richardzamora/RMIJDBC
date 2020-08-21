/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import estuctural.Delito;
import estuctural.TipoDocumento;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import persistencia.Conexion;

/**
 *
 * @author Estudiantes
 */
public class ServicioTipoDocumento {
    
     public TipoDocumento darTipoDocumentoPorCodigo(int codigo)
     {
         
     }
    
    public ArrayList<TipoDocumento> darTipoDocumentos()
    {
        Conexion conn = null;
        ResultSet rs = null;
        TipoDocumento tipoDocumento = new TipoDocumento();
        ArrayList<TipoDocumento> tipoDocumentos = new ArrayList<TipoDocumento>();
        
        try {
            conn = Conexion.getInstance();
            rs = conn.executeQuery(tipoDocumento.leerTodos());
            while(rs.next()){
                int codigo = rs.getInt("codigo");
                String siglas = rs.getString("siglas");
                String descripcion = rs.getString("descripcion");
                
                tipoDocumento = new TipoDocumento(codigo, siglas, descripcion);
                
                tipoDocumentos.add(tipoDocumento);
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            Conexion.close(rs);
        }
        return tipoDocumentos;
    }
}
