package ficheroLibros2.registro;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ListaProvincias {
	
	private List<Provincia>provincias;
	
	public ListaProvincias() {
		this.provincias = new ArrayList<Provincia>();
		
	}
	
	public void addProvincia(Provincia p, Localidad l, Materia m, Centro c, Curso cu) {
		if(!provincias.contains(p)) {
			provincias.add(p);
		}else {
			provincias.get(provincias.indexOf(p)).addLocalidad(l, m, c, cu);
		}
	}

	public List<Provincia> getProvincias() {
		return provincias;
	}

	public void setProvincias(List<Provincia> provincias) {
		this.provincias = provincias;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((provincias == null) ? 0 : provincias.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof ListaProvincias))
			return false;
		ListaProvincias other = (ListaProvincias) obj;
		if (provincias == null) {
			if (other.provincias != null)
				return false;
		} else if (!provincias.equals(other.provincias))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Provincias: "+"\n");
		
		for (Provincia provincia : provincias) {
			sb.append(provincia.toString()+"\n");
		}
		return sb.toString();
	}
	
	
	
										/*****************************
										 *      CONSEGUIR DATOS      *
										 ****************************/
	public void cargarDatos(ListaProvincias lp) throws Exception {
		
		//LEEMOS EL FICHERO PARA INTRODUCIR LOS DATOS EN EL OBETO
		try (BufferedReader filtroLectura = new BufferedReader(new FileReader(".\\ficheros\\gratuidadlibrosdetextoandalucia.csv"))){
			String linea = "";
			
			while((linea = filtroLectura.readLine())!= null) { 
				String values[] = linea.split(",");
				if(values.length <= 11) {
					Libro l = new Libro(values[9],values[8],values[7],values[10]);
					Materia m = new Materia(l,values[6]);
					Curso cu = new Curso(values[5]);
					Centro c = new Centro(values[2],values[4], values[3]);
					Localidad lo = new Localidad(values[1]);
					Provincia p = new Provincia(values[0]);
					
					cu.addMateria(m);
					c.addCurso(cu, m);
					lo.addCentro(m, c, cu);
					p.addLocalidad(lo, m, c, cu);
					lp.addProvincia(p, lo, m, c, cu);
				}
			}
			
			//PASAMOS EL CONTENIDO DEL OBJETO A JSON BONITO
			final Gson gson = new GsonBuilder().setPrettyPrinting().create();
			final String resul = gson.toJson(lp);
			
			//LO ESCRIBIMOS EN UN NUEVO ARCHIVO
			FileWriter fw = new FileWriter(".\\ficheros\\resul.json");
			PrintWriter pw = new PrintWriter(fw);
			pw.println(resul);
			
			fw.close();
			pw.close();
			
		}
	}
							
											/**********************
											 *  MÉTODOS PROPIOS   *
											 **********************/
	//1. Editorial más usada en cada una de las provincias.
	public String editorialMasUsada() {
		
		Map<String, Integer>editoriales =  new HashMap<String, Integer>();
		StringBuilder sb = new StringBuilder("Las editoriales más usadas en cada provincia son: \n");
		
		for (Provincia provincia : provincias) {
			sb.append(provincia.getNombre()+": ");
			for(Localidad localidad: provincia.getLocalidades()) {
				for(Centro centro: localidad.getCentros()) {
					for(Curso curso: centro.getCursos()) {
						
						//MATERIAS --> SACA EDITORIALES
						for(Materia materia: curso.getMaterias()) {
							if(!editoriales.containsKey(materia.getLibro().getEditorial())) {
								editoriales.put(materia.getLibro().getEditorial(), 0);
							}else {
								int cont = editoriales.get(materia.getLibro().getEditorial());
								editoriales.put(materia.getLibro().getEditorial(),cont++);
							}
						}
						
					}
				}
			}
			//DENTRO DE PROVINCIAS --> ORDENANDO EL MAPA CON ENTRY
			List<Entry<String, Integer>> list = new ArrayList<>(editoriales.entrySet());
			list.sort(Entry.comparingByValue());
			sb.append(list.get(list.size()-1)+"\n");
		}
		return sb.toString();
	}
	
	
	
	
	
	
}
		
