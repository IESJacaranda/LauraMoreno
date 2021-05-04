package body;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import Exception.GeneradorNoIncluidoException;

//SE HAN USADO HASHSET YA QUE SI SE INTENTA INTRODUCIR UN GENERADOR YA EXISTENTE, NO SE AÑADIRÁ A LA LISTA
public class Empresa {
	
	private Set<AbstractGenerador> eolicos; 
	private Set<AbstractGenerador> solares; 
	private String nombreEmpresa;
	
	public Empresa(String nombreEmpresa) {
		this.eolicos = new HashSet<AbstractGenerador>(); 
		this.solares = new HashSet<AbstractGenerador>();
	}
	
	public void addGenerador(AbstractGenerador generador) {
		if(generador instanceof Eolico) {
			eolicos.add(generador);
		}else{
			solares.add(generador);
		}
	}
	
	public void mostrarPorFecha() {
		List<AbstractGenerador> todos = new ArrayList<AbstractGenerador>(eolicos);
		todos.addAll(solares);
		Collections.sort(todos);
		
		Iterator<AbstractGenerador> it = todos.iterator();
		while(it.hasNext()){
			System.out.println(it.next().toString() +"\n");
		}
	}
	
	public void mostrarPorLocalidad() {
		List<AbstractGenerador> todos = new ArrayList<AbstractGenerador>(eolicos);
		todos.addAll(solares);
		Collections.sort(todos, new OrdenaLocalidad());
		
		Iterator<AbstractGenerador> it = todos.iterator();
		while(it.hasNext()){
			System.out.println(it.next().toString() +"\n");
		}
	}
	
	public void mostrarEolicos() {
		Iterator<AbstractGenerador> it = eolicos.iterator();
		while(it.hasNext()){
			System.out.println(it.next().toString() +"\n");
		}
	}
	
	public void borraGenerador(int cod) throws GeneradorNoIncluidoException {
		List<AbstractGenerador> todos = new ArrayList<AbstractGenerador>(eolicos);
		todos.addAll(solares);
		
		int cont = 0;
		Iterator<AbstractGenerador> it = todos.iterator();
		while(it.hasNext()){
			if(it.next().getCodigo() == cod) {
				cont++;
				if(it.next() instanceof Eolico) {
					eolicos.remove(it.next());
				}else {
					solares.remove(it.next());
			}
		}
			}if(cont == 0) {
				throw new GeneradorNoIncluidoException();				
			}
	}
	
	public String mostrarTotalEnergia() {
		int result = 0;
		Set<AbstractGenerador> todos = new HashSet<AbstractGenerador>(eolicos);
		todos.addAll(solares);
		Iterator<AbstractGenerador> it = todos.iterator();
		while(it.hasNext()){
			result += it.next().getPotencia();
		}
		return "La energía total generada por la empresa es de " + result;
	}
	
	public boolean existeGeneradorEnLocalidad(String localidad) {
		boolean result = false;
		Set<AbstractGenerador> todos = new HashSet<AbstractGenerador>(eolicos);
		todos.addAll(solares);
		Iterator<AbstractGenerador> it = todos.iterator();
		while(it.hasNext()){
			if(it.next().getLocalidad().equals(localidad)) {
				result = true;
			}
		}
		return result;
	}
	

}
