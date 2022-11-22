package DominioProblema;

import java.util.Scanner;

public class Alumno {

	private int matricula;
	private String clave;

	public int pedirMatricula() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Por favor ingrese su Matricula: ");
		matricula = teclado.nextInt();;

		return matricula;
	}

	public String pedirClave() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Por favor ingrese su Clave: ");
		clave = teclado.nextLine();

		return clave;
	}

	public int getMatricula() {
		return this.matricula;
	}

	public String getClave() {
		return this.clave;
	}

}