package simuGeneradores2.body;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Empresa {
	private String nombre;
	private HashSet <AbsGenerador>generadores;
	
	public Empresa(String nombre) {
		super();
		this.nombre = nombre;
		this.generadores = new HashSet<AbsGenerador>();
	}

	public void addSolar(AbsGenerador solar) {
		if(solar instanceof Solar) {
		generadores.add(solar);}
	}
	
	public void addEolico(AbsGenerador eolico) {
		if(eolico instanceof Eolico) {
		generadores.add(eolico);}
	}
		
	public String toString() {
		StringBuilder sb = new StringBuilder("Los generadores con los que cuenta la empresa son: ");
		List<AbsGenerador>lista = new ArrayList<AbsGenerador>(generadores);
		Collections.sort(lista);
		for(AbsGenerador i: lista) {
			sb.append(i+ "\n");
		}
		return sb.toString();
	}
	
	public String toStringLocal() {
		StringBuilder sb = new StringBuilder("Los generadores con los que cuenta la empresa son: ");
		List<AbsGenerador>lista = new ArrayList<AbsGenerador>(generadores);
		Collections.sort(lista, new ComparaLocalidad());
		for(AbsGenerador i: lista) {
			sb.append(i+ "\n");
		}
		return sb.toString();
	}
	
	public String muestraEolios() {
		StringBuilder sb = new StringBuilder("Los generadores eólicos con los que cuenta la empresa son: ");
		for(AbsGenerador i: generadores) {
			if(i instanceof Eolico) {
				sb.append(i + "\n");
			}
		}
		return sb.toString();
	}
	
	public void borraGenerador(int cod) throws Exception {
		boolean fin = false;
		Iterator<AbsGenerador>it = generadores.iterator();
		while(it.hasNext() && !fin) {
			AbsGenerador gene = it.next();
			if(gene.getCodigo()==cod) {
				generadores.remove(gene);
				fin = true;
			}
		}
		if(!fin) {
			throw new Exception("No existe el generador que desea eliminar");
		}
	}
	
	public String muestraEnergia() {
		double resul = 0;
		for(AbsGenerador i: generadores) {
			resul += i.getPotencia();
		}
		return "El total de energía producida por la empresa es de "+ resul;
	}
	
	public String existeLocal(String local) {
		boolean fin = false;
		Iterator<AbsGenerador> it=generadores.iterator();
		while(it.hasNext() && !fin) {
			AbsGenerador next = it.next();
			if(next.getLocalidad().equals(local)) {
				fin = true;
			}
		}
		return fin ? "¡EXISTE!" : "No hay generadores en la localidad que busca";
	}
}
