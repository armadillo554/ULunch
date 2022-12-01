package Datos;
import DominioProblema.Menu;

import java.io.*;
import java.util.Scanner;

public class AdminDatos {

	private String archivoAlumnos = "C:\\Users\\Pablo Perez\\Desktop\\Programacion\\Proyecto\\Usuarios.txt";
	private String archivoAdmin = "C:\\Users\\Pablo Perez\\Desktop\\Programacion\\Proyecto\\Administradores.txt";
	private String archivoMatriculas="C:\\Users\\Pablo Perez\\Desktop\\Programacion\\Proyecto\\Matriculas.txt";

	public void imprimirMenus() {
	}


	public boolean buscarCoincidencias(String  matricula, String clave) {
		Scanner x;
		boolean existe = false;
		String tempMatricula = "";
		String tempClave = "";

		try{
			x = new Scanner(new File(archivoAlumnos));
			x.useDelimiter("[;\n]");

			while(x.hasNext() && !existe)
			{
				tempMatricula = x.next();
				tempClave = x.next();

				if(tempMatricula.trim().equals(matricula.trim()) && tempClave.trim().equals(clave.trim()))
				{
					existe=true;
			}
			}
			x.close();
		}
		catch(Exception e)
		{
			System.out.println("Error");
		}
		return existe;
	}

	public boolean buscarCoincidenciasAdmin(String usuario, String clave) {
		Scanner x;
		boolean existe = false;
		String tempUsuario = "";
		String tempClave = "";

		try{
			x = new Scanner(new File(archivoAdmin));
			x.useDelimiter("[;\n]");

			while(x.hasNext() && !existe)
			{
				tempUsuario = x.next();
				tempClave = x.next();

				if(tempUsuario.trim().equals(usuario.trim()) && tempClave.trim().equals(clave.trim()))
				{
					existe=true;
				}
			}
			x.close();
		}
		catch(Exception e)
		{
			System.out.println("Error");
		}
		return existe;
	}

	public boolean buscarRegistrado(String matricula){
		boolean encontrado = false;
		try {
				BufferedReader br=new BufferedReader(new FileReader(archivoAlumnos));
				String linea="";
				while ((linea= br.readLine())!=null) {
					String[] textoSeparado = linea.split(";");
					if(textoSeparado[0].equalsIgnoreCase(matricula)) {
						encontrado = true;
						break;

					}

				}

		} catch (IOException e) {

			System.out.println("Error Inesperado, intente nuevamente");
		}
		return encontrado;
	}

	public boolean buscarMatricula(String matricula){
		boolean encontrado = false;
		try {
			BufferedReader br=new BufferedReader(new FileReader(archivoMatriculas));
			String linea="";
			while ((linea= br.readLine())!=null) {
				if(linea.equalsIgnoreCase(matricula)) {
					encontrado = true;
					break;
				}

			}

		} catch (IOException e) {

			System.out.println("Error Inesperado, intente nuevamente");
		}
		return encontrado;
	}

	public void registrarAlumno(String matricula, String clave) {
		try {
			FileWriter escribir = new FileWriter(archivoAlumnos, true);

				escribir.write(matricula+";"+clave);
				escribir.write("\n");

			escribir.close();
		}
		catch (Exception e) {
			System.out.println("Error al escribir");
		}
	}


	public void editarMenu() {

	}


	public void agregarMenu(Menu menu) {

	}

	public void eliminarMenu() {

	}


	//public String[] buscarMenu(int menu) {

	//}

}