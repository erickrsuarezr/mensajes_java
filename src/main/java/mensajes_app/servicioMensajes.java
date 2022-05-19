package mensajes_app;

import java.util.Scanner;

public class servicioMensajes {
	
	public static void  crearMensaje(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Escriba el mensaje");
		String mensaje = scan.nextLine();
		System.out.println("Escriba su nombre");
		String autor = scan.nextLine();
		
		mensaje registro = new mensaje();
		registro.setMENSAJE(mensaje);
		registro.setAUTOR_MENSAJE(autor);
		mensajeDAO.crearMensajeBD(registro);
		
	}
	public static void  listarMensaje(){
		
	}
	public static void  borrarMensaje(){
		
	}
	public static void  editarMensaje(){
		
	}
}
