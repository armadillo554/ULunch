package DominioProblema;

import Datos.AdminDatos;

public class Admin {

	private String usuario;
	private String contrasena;

	public Admin(String usuario, String contrasena) {
		this.usuario = usuario;
		this.contrasena = contrasena;
	}
	public boolean validarDatos() {
		AdminDatos admin = new AdminDatos();
		return admin.buscarCoincidenciasAdmin(this.usuario,this.contrasena);
	}
	public String getUsuario() {
		return this.usuario;
	}

	/**
	 * 
	 * @param usuario
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
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

	/**
	 * 
	 * @param menu
	 */
	public Menu editarMenu(Menu menu) {
		// TODO - implement Admin.editarMenu
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param menu
	 */
	public Menu borrarMenu(Menu menu) {
		// TODO - implement Admin.borrarMenu
		throw new UnsupportedOperationException();
	}

	public void crearMenu() {
		// TODO - implement Admin.crearMenu
		throw new UnsupportedOperationException();
	}


}