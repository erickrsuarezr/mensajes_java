/**
 * 
 */
package mensajes_app;

import java.sql.Connection;

public class Inicio {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conexion conexion = new Conexion();
		
		try(Connection cnx = conexion.get_connection()){
			 
		}
		catch(Exception e){
			System.out.println(e);
		}

	}

}
