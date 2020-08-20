/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

/**
 *
 * @author Richard
 */
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class Conexion {

	private static Conexion conexion= null;
	
	private Connection con;
	
	private Conexion() {
		
		Properties conProperties = new Properties();
		
		try {
			String url = "jdbc:postgresql://127.0.0.1:5432/antecedentesPenales";
			String user = "postgres";
			String password = "postgres";

			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection(url, user ,password);
			
			System.out.println("Me conecte");
		}catch (Exception error) {
			error.printStackTrace();
		}
	}
	
	public static Conexion getInstance() {
		if(conexion == null) {
			conexion = new Conexion();
		}
		return conexion;
	}
	
	public ResultSet executeQuery(String sql) {
		ResultSet rs = null;
		
		try {
//			PreparedStatement
			Statement st = con.createStatement();
			rs = st.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	
	public boolean executeUpdate(String sql) {
		int row = 0;
		
		try {
			Statement st = con.createStatement();
			row = st.executeUpdate(sql);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
        
        public static void close(ResultSet rs){
        try {
            rs.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    public static void close(PreparedStatement stmt){
        try {
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    public static void close(Connection conn){
        try {
            conn.close();
        } catch (SQLException ex) {
           ex.printStackTrace(System.out);
        }
    }
}