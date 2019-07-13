package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import edu.udem.java2.ejemplo1.vo.Persona;

public class JDBCUtil  {
	
	public static Persona obtenerPersona(String login, String password) {
		Persona persona = null; 
		
		try( Connection conn = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");
			 Statement stm = conn.createStatement();
			) {
			
			//Carga el driver
			Class.forName("org.h2.Driver");
			ResultSet resultado = stm.executeQuery("select * from users where login='" + login +"' and  password='" + password + "'");
			
			while(resultado.next()){
				persona = new Persona();
				persona.setApellido(resultado.getString("apellido"));
				persona.setNombre(resultado.getString("nombre"));
				persona.setUsuario(resultado.getString("login"));
				persona.setPassword(resultado.getString("password"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return persona;
	}
}
