package DominioProblema;

import java.util.Scanner;

public class Menu {

	private Alumno alumno;
	private AdminDatos adminDatos;

	public void menu() {
		Scanner sn = new Scanner(System.in);
		boolean salir = false;
		int opcion;

		while (!salir) {

			System.out.println("1. INICIAR SESIÓN");
			System.out.println("2. ENTRAR COMO INVITADO");
			System.out.println("3. REGISTRARSE");
			System.out.println("4. SALIR");

			try {

				System.out.println("Escribe una de las opciones");
				opcion = sn.nextInt();

				switch (opcion) {
					case 1:
						ingresar();
						break;
					case 2:
						System.out.println("Has seleccionado la opcion: Entrar como Invitado");
						break;
					case 3:
						registrar();
						break;
					case 4:
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


	public void ingresar() {
		alumno.pedirMatricula();
		alumno.pedirClave();
		if (adminDatos.buscarCoincidencias(alumno.getMatricula(), alumno.getClave())) {
			System.out.println("Inicio sesión con éxito");
		}else{
			System.out.println("Inicio de sesión fallido, intente nuevamente");
			ingresar();
		}


	}

	public void registrar() {
		alumno.pedirMatricula();
		alumno.pedirClave();

		adminDatos.registrarAlumno(alumno.getMatricula(), alumno.getClave());
	}

	public void generarComprobante(String[] datosComprobante, int matricula) {

	}

}