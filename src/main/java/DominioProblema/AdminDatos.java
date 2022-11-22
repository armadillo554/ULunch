package DominioProblema;
import java.io.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class AdminDatos {

	public void imprimirMenus() {
		JSONParser jsonParser = new JSONParser();

		try(FileReader reader = new FileReader("menuComida.json")){
			Object obj = jsonParser.parse(reader);

			JSONArray comidaLista = (JSONArray) obj;

		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		catch(ParseException e){
			e.printStackTrace();
		}
	}


	public boolean buscarCoincidencias(int matricula, String clave) {

	}


	public boolean buscarCoincidencias(String usuario, String clave) {

	}

	public void registrarAlumno(int matricula, String clave) {
		JSONObject alumno = new JSONObject();
		alumno.put("matricula",matricula);
		alumno.put("clave",clave);
	}

	public void editarMenu() {

	}


	public void agregarMenu(MenuComida menu) {

	}

	public void eliminarMenu() {

	}


	public String[] buscarMenu(int menu) {

	}

}