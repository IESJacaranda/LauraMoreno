package body;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

public class ListaDirecciones {
	
	private HashSet<Direccion> direcciones = new HashSet<Direccion>();

	public ListaDirecciones() {
		super();
		this.direcciones = new HashSet<Direccion>();
	}

	public void cargarDatos(String f) {
		try (BufferedReader filtroLectura = new BufferedReader(new FileReader(".\\ficheros\\body\\address2.txt"))){
			String linea = filtroLectura.readLine();
			
			while(linea != null) {
				String values[] = linea.split(",");
				
				if(values.length>=4) {
				Direccion d = new Direccion(Integer.parseInt(values[0]), values[1], Integer.parseInt(values[4]));
				this.direcciones.add(d);
				}
				linea = filtroLectura.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	
	public HashSet<Direccion> getDirecciones() {
		return direcciones;
	}

	@Override
	public String toString() {
		return "ListaDirecciones [direcciones=" + direcciones + "]";
	}
	
	
}
