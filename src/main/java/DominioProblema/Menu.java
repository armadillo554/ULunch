package DominioProblema;

public class Menu {

	private String nombre;
	private String tipo;
	private String precio;
	private String platoEntrada;
	private String platoFondo;
	private String postre;
	private String jugo;
	private String pan;
	private String casino;

	public void imprimirMenusDelDia() {

	}

	public Menu(String nombre, String tipo, String precio, String platoEntrada, String platoFondo, String postre, String jugo, String pan, String casino) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.precio = precio;
		this.platoEntrada = platoEntrada;
		this.platoFondo = platoFondo;
		this.postre = postre ;
		this.jugo = jugo;
		this.pan = pan;
		this.casino = casino;
	}

	public String getNombre() {
		return nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public String getPrecio() {
		return precio;
	}

	public String getPlatoEntrada() {
		return platoEntrada;
	}

	public String getPlatoFondo() {
		return platoFondo;
	}

	public String getPan() {
		return pan;
	}

	public String getJugo() {
		return jugo;
	}

	public String getPostre() {
		return postre;
	}

	public String getCasino() {
		return casino;
	}
}