package body;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ListaFinal {
	
	Set<ComponenteList>componentes;

	public ListaFinal() {
		super();
		this.componentes = new HashSet<ComponenteList>();
		leerFinal();
		escribirFinal();
	}

	public Set<ComponenteList> getComponentes() {
		return componentes;
	}

	public void setComponenetes(Set<ComponenteList> componentes) {
		this.componentes = componentes;
	}
	
	public void leerFinal() {
		try (BufferedReader filtroLectura = new BufferedReader(new FileReader(".\\ficheros\\body\\temporal.txt"))){
			String linea = filtroLectura.readLine();
			
			while(linea != null) {
				String values[] = linea.split(",");
				ComponenteList d = new ComponenteList(values[0], values[1], values[2], values[3]);
				this.componentes.add(d);
				linea = filtroLectura.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void escribirFinal() {
		try (BufferedWriter filtroEscritura = new BufferedWriter(new FileWriter(".\\ficheros\\body\\resul.txt"))) {
			List <ComponenteList>lista = new ArrayList<ComponenteList>(componentes);
			Collections.sort(lista, new CompararNumDirec());
			
			for(ComponenteList p: lista) {
				filtroEscritura.write(p.toString());
				filtroEscritura.newLine();
			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
