package DominioProblema;

import java.util.Scanner;

public class Administrador {

	private String usuario;
	private String clave;

	public String pedirUsuario() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Por favor ingrese su Usuario: ");
		usuario = teclado.nextLine();

		return usuario;
	}

	public String pedirClave() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Por favor ingrese su Clave: ");
		clave = teclado.nextLine();

		return clave;
	}

	public String getUsuario() {
		return this.usuario;
	}

	public String getClave() {
		return this.clave;
	}

}