package body;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Set;

public class ListaPaises {

	private Set<Pais>paises;

	public ListaPaises() {
		super();
		this.paises = new HashSet<Pais>();
	}
	
	public void cargarDatos (String f) throws Exception {
		
		FileReader flujoLectura = new FileReader(".\\ficheros\\body\\country.txt");//HAY QUE INDICAR LA RUTA DESDE EL PROYECTO
		BufferedReader filtroLectura = new BufferedReader(flujoLectura);//ABRE ESPACIO DE MEMORIA PARA LEER EL ARCHIVO
		String linea = filtroLectura.readLine();
		
		while(linea != null) {
			String values[] = linea.split(",");
			Pais p = new Pais(Integer.parseInt(values[0]),values[1]);
			if(this.paises.contains(p)) {
				throw new Exception("Pais repetido");
		}else {
			this.paises.add(p);
			linea = filtroLectura.readLine();
		}
		}
		flujoLectura.close();
		filtroLectura.close();
	}

	public Set<Pais> getPaises() {
		return paises;
	}

	@Override
	public String toString() {
		
		return "ListaPaises [paises=" + paises + "]";
	}
	
	
	
}
