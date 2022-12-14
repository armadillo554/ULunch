package DominioProblema;

import java.util.Scanner;

public class Alumno {

	private String matricula;
	private String clave;


	public String pedirMatricula() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Por favor ingrese su Matricula: ");
		matricula = teclado.nextLine();

		return matricula;
	}

	public String pedirClave() {
		Scanner t = new Scanner(System.in);
		System.out.println("Por favor ingrese su Clave: ");
		clave = t.nextLine();

		return clave;
	}

	public String getMatricula() {
		return this.matricula;
	}

	public String getClave() {
		return this.clave;
	}

}