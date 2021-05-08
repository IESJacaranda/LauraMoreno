package relacion11.ejercicio7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Almacen {
	
	private static int CONTADOR_CLIENTE = 1;
	private static final int MAXIMO = 20;
	protected Map<Integer, Set<Integer>>almacen;
	
	public Almacen() {
		this.almacen = new HashMap<Integer, Set<Integer>>();
	}
	
	public void abrirCaja(int caja) throws Exception {
		if(almacen.containsKey(caja) || almacen.keySet().size() == MAXIMO) {
			throw new Exception("La caja no se puede abrir");
		}else {
			almacen.put(caja, new HashSet <Integer>());
		}
	}
	
	public void cerrarCaja(int caja) throws Exception {
		if(almacen.containsKey(caja) && almacen.get(caja).size()==0) {
			almacen.remove(caja);
		}else {
			throw new Exception("La caja no se puede cerrar");
		}
	}
	
	public String addCliente() {
		int numCli = CONTADOR_CLIENTE;
		CONTADOR_CLIENTE++;
		List<Integer>colas = new ArrayList<Integer>();
		for(Integer i: almacen.keySet()) {
			colas.add(almacen.get(i).size());
		}
		Collections.sort(colas, new ComparadorPorCliONum());
		return "Es usted el cliente número "+ numCli +" y debe ir a la caja número "+ colas.get(colas.size()-1);//comprobar que sea el num menor
		//CORREO INMA: ¿Cómo ordeno las keys y los size de los valores del mapa en el Comparator?
	}
	
	public String atiendeCliente(int caja, int codCli) throws Exception {
		if(!almacen.containsKey(caja) || almacen.get(caja).size()== 0) {
			throw new Exception("No se puede atender a ningún cliente en esta caja");
		}else {
			almacen.get(caja).remove(codCli);
		}
		return "Se ha atendido al cliente con número " + codCli;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((almacen == null) ? 0 : almacen.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Almacen))
			return false;
		Almacen other = (Almacen) obj;
		if (almacen == null) {
			if (other.almacen != null)
				return false;
		} else if (!almacen.equals(other.almacen))
			return false;
		return true;
	}
	
	

}
