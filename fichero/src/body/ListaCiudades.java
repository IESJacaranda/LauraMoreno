package body;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

public class ListaCiudades {
	
	private HashSet<Ciudad> ciudades = new HashSet<Ciudad>();

	public ListaCiudades() {
		super();
		this.ciudades = new HashSet<Ciudad> ();
	}
	
	public void cargarDatos(String f) {
		//TRY CON RECURSO DONDE CREO DIRECTAMENTE EL BUFFEREDREADER Y FILEREADER
		//ES AUTOCLOSEABLE --> TANTO EL BUFFEREDREADER COMO EL FILEREADER
		try (BufferedReader filtroLectura = new BufferedReader(new FileReader(".\\ficheros\\body\\city.txt"))){
			String linea = filtroLectura.readLine();
			
			while(linea != null) {
				String values[] = linea.split(",");
				Ciudad d = new Ciudad(Integer.parseInt(values[0]),values[1], Integer.parseInt(values[2]));
				this.ciudades.add(d);//No es necesario comprobar que esté repetido porque es un HashSet
				linea = filtroLectura.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public HashSet<Ciudad> getCiudades() {
		return ciudades;
	}

	@Override
	public String toString() {
		return "ListaCiudades [ciudades=" + ciudades + "]";
	}
	
	
}
