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
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getContrasena() {
		return this.contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	public Menu editarMenu(Menu menu) {
		// TODO - implement Admin.editarMenu
		throw new UnsupportedOperationException();
	}
	public Menu borrarMenu(Menu menu) {
		// TODO - implement Admin.borrarMenu
		throw new UnsupportedOperationException();
	}
	public void crearMenu() {
		// TODO - implement Admin.crearMenu
		throw new UnsupportedOperationException();
	}
}