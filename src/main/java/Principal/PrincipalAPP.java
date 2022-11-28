package Principal;

import DominioProblema.Menu;

import GUIs.VentanaAppUsuario;

import java.util.Scanner;

public class PrincipalAPP {

	public static void main(String[] args) {
		VentanaAppUsuario gui = new VentanaAppUsuario();
		gui.setVisible(true);
	}
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