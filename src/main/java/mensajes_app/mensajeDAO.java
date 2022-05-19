package mensajes_app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class mensajeDAO {
	
	public static void crearMensajeBD(mensaje mensaje) {
		
		try (Connection conexion = mensajes_app.conexion.get_connection()){
			PreparedStatement  ps = null;
			
			try {
				String query= "INSERT INTO mensajes (mensaje, autor_mensaje, fecha_mensaje) VALUES (?,?, CURRENT_TIMESTAMP())";
				ps=conexion.prepareStatement(query);
				ps.setString(1, mensaje.getMENSAJE());
				ps.setString(2, mensaje.getAUTOR_MENSAJE());
				ps.executeUpdate();
				System.out.println("El mensaje se creó con exito");
			}catch(SQLException ex) {
				System.out.println(ex);
			}
			
		}catch(SQLException e){
			System.out.println(e);
		}
	}
	public static void leerMensajeBD() {
		
	}
	public static void borrarMensajeBD(int ID_MENSAJE) {
		
	}
	public static void actualizarMensajeBD(mensaje mensaje) {
		
	}

}
