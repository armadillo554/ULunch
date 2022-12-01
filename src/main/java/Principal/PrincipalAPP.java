package Principal;

import Datos.AdminDatos;
import DominioProblema.Menu;
import GUIs.VentanaAppUsuario;

import java.util.Scanner;

public class PrincipalAPP {

	public static void main(String[] args) {
		AdminDatos datos = new AdminDatos();
		datos.registrarAlumno("20652598786","12345");
	//	if(datos.registrarAlumno("20584002819","123456")){
	//		System.out.println("Encontrada");
	//	}else{
	//		System.out.println("No Encontrada");

		}
	//	if (datos.buscarCoincidenciasAdmin("admin1", "12345")) {
	//		System.out.println("Inicio sesión con éxito");
	//	} else {
	//		System.out.println("Inicio de sesión fallido, intente nuevamente");

	//			VentanaAppUsuario gui = new VentanaAppUsuario();
	//			gui.setVisible(true);
	//	}

	public static void menu(){
		Scanner sn = new Scanner(System.in);
		boolean salir = false;
		int opcion;

		while (!salir) {

			System.out.println("1. INICIAR SESIÓN");
			System.out.println("2. ENTRAR COMO INVITADO");
			System.out.println("3. SALIR");

			try {

				System.out.println("Escribe una de las opciones");
				opcion = sn.nextInt();

				switch (opcion) {
					case 1:
						System.out.println("Has seleccionado la opcion: Iniciar Sesión");
						break;
					case 2:
						System.out.println("Has seleccionado la opcion: Entrar como Invitado");
//						anonimo();
						break;
					case 3:
						salir = true;
						break;
					default:
						System.out.println("Escriba sólo números entre 1 y 3");
				}
			} catch (Exception e) {
				System.out.println("Debes insertar un número");
				sn.next();
			}
		}
	}
}