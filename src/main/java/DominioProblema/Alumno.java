package DominioProblema;

import Datos.AdminDatos;

public class Alumno {

	private String matricula;
	private String contrasena;
	public Alumno(String matricula, String contrasena) {
		this.matricula = matricula;
		this.contrasena = contrasena;
	}

	public boolean validarDatos(){
		AdminDatos admin = new AdminDatos();
		return admin.buscarCoincidencias(this.matricula, this.contrasena);
	}
	public boolean registrar(){
		AdminDatos admin = new AdminDatos();
		if (admin.buscarMatricula(this.matricula)&&!admin.buscarRegistrados(this.matricula)) {
			admin.registrarAlumno(this.matricula, this.contrasena);
			return true;
		}else {
			return false;
		}
	}

	public String getMatricula() {
		return this.matricula;
	}

	/**
	 * 
	 * @param matricula
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getContrasena() {
		return this.contrasena;
	}

	/**
	 * 
	 * @param contrasena
	 */
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}


}