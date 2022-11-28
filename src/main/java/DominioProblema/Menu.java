package DominioProblema;

import Datos.*;

import java.util.Scanner;

public class Menu {

	private Alumno alumno;
	private AdminDatos adminDatos;

	public void ingresar() {
		// TODO - implement Menu.ingresar
		throw new UnsupportedOperationException();
	}

	public void registrar() {
		// TODO - implement Menu.registrar
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param datosComprobante
	 * @param matricula
	 */
	public void generarComprobante(String[] datosComprobante, int matricula) {
		// TODO - implement Menu.generarComprobante
		throw new UnsupportedOperationException();
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
						anonimo();
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
	public static void anonimo(){
		System.out.println("Estos son los menus del dia ");
		imprimirMenu(generarMenu());
	}
	//    Metodo en progreso
//    public static String[][] menusDisponibles(String[][] menusGenerados){
//        generarMenu();
//
//        return
//    }
	public static String [][] generarMenu(){
		String[][] menusDisponibles=new String[1][8];
//        String[][] menusDisponibles={{"Menu1", "Casino los Notros", "Valor= 3000$", "Plato de fondo1", "Plato de entrada1", "Postre1", "Jugo1", "Pan"},
//                {"Menu2", "Casino las araucarias", "Valor=2800", "Plato de fondo2", "Plato de entrada2", "Postre2", "Jugo2", "Pan"}};
		Scanner teclado = new Scanner(System.in);
		for (int i=0;i<menusDisponibles.length;i++){
			for (int j=0;j<menusDisponibles[i].length;j++){
				switch (j){
					case 0:
						System.out.println("Nombre del menu");
						menusDisponibles[i][j]=teclado.next();
						break;
					case 1:
						System.out.println("Casino");
						menusDisponibles[i][j]=teclado.next();
						break;
					case 2:
						System.out.println("Valor del menu");
						menusDisponibles[i][j]=teclado.next();
						break;
					case 3:
						System.out.println("Plato de entrada");
						menusDisponibles[i][j]=teclado.next();
						break;
					case 4:
						System.out.println("Plato de fondo");
						menusDisponibles[i][j]=teclado.next();
						break;
					case 5:
						System.out.println("Jugo");
						menusDisponibles[i][j]=teclado.next();
						break;
					case 6:
						System.out.println("Postre");
						menusDisponibles[i][j]=teclado.next();
						break;
					case 7:
						System.out.println("Pan");
						menusDisponibles[i][j]=teclado.next();
						break;
				}
			}
		}
		return menusDisponibles;
	}
	public static void imprimirMenu(String [][] menu){
		for (int x=0; x < menu.length; x++) {
			System.out.print("|");
			for (int y=0; y < menu[x].length; y++) {
				System.out.print (menu[x][y]);
				if (y!=menu[x].length-1) System.out.print("\t");
			}
			System.out.println("|");
		}
	}

}