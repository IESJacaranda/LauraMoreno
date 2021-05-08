package body;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import enumerado.EPrioridad;

public class Empresa {
	
	//CONSTRUYO HASHSETS PORQUE NO DEBEN REPETIRSE LAS TAREAS
	
	protected HashSet<AbsTarea>realizadas;
	protected HashSet<AbsTarea>noRealizadas;

	public Empresa() {
		this.realizadas = new HashSet<AbsTarea>();
		this.noRealizadas = new HashSet<AbsTarea>();
	}
	
	public boolean addTareaEmpresa(String decrip, String prioridad, String departamento) {
		boolean resul = false;
		AbsTarea tarea = null;
		try {
			tarea = new Propia(decrip, prioridad, departamento);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		if(!noRealizadas.contains(tarea)) {//entiendo que se refiere solo a una lista porque una tarea ya realizada puede darse luego de nuevo si algo que la empresa debe hacer mucho
			noRealizadas.add(tarea);//no se van a repetir pero como hay que comprobarlo para que devuelva false o true he añadido mas codigo
			resul = true;
			}
		return resul;
	}
	
	public boolean addTareaCliente(String decrip, String prioridad, String cliente, String localidad) {
		boolean resul = false;
		AbsTarea tarea = null;
		try {
			tarea = new DeCliente(decrip, prioridad, cliente, localidad);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		if(!noRealizadas.contains(tarea)) {
			noRealizadas.add(tarea);
			resul = true;
			}
		return resul;
	}
	
	//devolverá un String con el listado de tareas pendientes de realizar
	//ordenados de forma ascendente por la fecha de creación
	public String mostrarTareas() {
		StringBuilder sb = new StringBuilder("Las tareas pendientes son: \n");
		List<AbsTarea>lista = new ArrayList<AbsTarea>(noRealizadas);
		Collections.sort(lista);//compareTo las compara por fecha de creacion
		for(AbsTarea i: lista) {
			sb.append(i+ "\n");
		}
		return sb.toString();
	}
	
	/**
	 *  devolverá un String con el listado de tareas existentes ordenados
		de forma que salgan primero las tareas de prioridad Alta, luego las medias y luego las bajas.
		Para las tareas con la misma prioridad se ordenarán de forma alfabética por la descripción
	 * @return String ordenado
	 */
	public String mostrarTareasPrioridad() {
		StringBuilder sb = new StringBuilder("Las tareas totales son: \n");
		List<AbsTarea>lista = new ArrayList<AbsTarea>(noRealizadas);
		lista.addAll(realizadas);//entiendo que las existentes se refiere a las dos listas
		Collections.sort(lista, new ComparaPrioridad());//comparator
		for(AbsTarea i: lista) {
			sb.append(i+ "\n");
		}
		return sb.toString();
	}
	
	/**
	 * devolverá un String en el que se muestre el número de tareas
		pendientes de cada tipo, es decir, algo así como : “Alta- 3, Media-10, Baja-2” si tenemos
		pendiente 3 tareas de prioridad alta, 10 de prioridad media y 2 de prioridad baja.
	 * @return String tareas pendientes
	 */
	public String numTareasPendientes() {
		StringBuilder sb = new StringBuilder();
		List<AbsTarea>lista = new ArrayList<AbsTarea>(noRealizadas);
		lista.addAll(realizadas);
		int contA =0;
		int contB=0;
		int contM=0;
		for(AbsTarea i: lista) {
			if(i.getPrioridad().equals(EPrioridad.ALTA)){
				contA++;
			}else if(i.getPrioridad().equals(EPrioridad.MEDIA)) {
				contM++;
			}else {
				contB++;
			}
		}
			sb.append("Alta-"+contA+", Media-"+contM+", Baja-"+contB);
		return sb.toString();
	}
	
	/**
	 * este método
		no debe devolver nada y debe añadir la tarea que tiene la descripción y la fecha de creación
		que recibe como argumento a la lista de tareas resueltas y asignarle la fecha de solución
		que se le pasa por parámetros.
		 Si la fecha de solución que recibe como parámetro es menor
		que la fecha de creación o no existe la tarea se deberá lanzar la correspondiente excepción.
	 * @param String
	 * @param fecha
	 * @param fecha
	 * @throws Exception 
	 */
	public void resolverTarea(String descripcion , LocalDate fechaFin ,LocalDate fechaCreacion) throws Exception {
		boolean fin = false;
		Iterator<AbsTarea>it = realizadas.iterator();
		LocalDate fechaAlt = null;
		
		while(it.hasNext() && !fin) {
			AbsTarea ta = it.next();
			
				if(ta.getDescrip().equals(descripcion) && fechaCreacion==ta.getFechaAlta()) {
					noRealizadas.remove(ta);
					realizadas.add(ta);
					fin = true;
					fechaAlt = ta.getFechaAlta();
					ta.setFechaFin(fechaFin);
				}
			
		}
		if(!fin || fechaAlt.isAfter(fechaFin)) { //De esta manera se comprueban ambas cosas y no tiene que estar en el bucle
				throw new Exception("No se puede realizar la operación");
		}
	}
	
	
}



