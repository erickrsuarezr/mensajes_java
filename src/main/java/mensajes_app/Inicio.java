/**
 * 
 */
package mensajes_app;

import java.util.Scanner;

public class inicio {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int opcion =  0;
		
		do {
			System.out.println("-----------------------------------");
			System.out.println("Aplicación de  mensajes");
			System.out.println("1.-Crear mensaje");
			System.out.println("2.-Listar mensajes");
			System.out.println("3.-Editar mensaje");
			System.out.println("4.-Eliminar mensaje");
			System.out.println("5.-Salir");
			//Se lee  la opcion del usuario
			opcion = scan.nextInt();
			
			switch (opcion) {
				case 1:
					servicioMensajes.crearMensaje();
					break;
				case 2:
					servicioMensajes.listarMensaje();
					break;
				case 3:
					servicioMensajes.editarMensaje();
					break;
				case 4:
					servicioMensajes.borrarMensaje();
					break;
				default:
					break;
			}
			
		}while(opcion !=5);
		
		

	}

}
