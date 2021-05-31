package examen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Calle {

	// He creado un arraylist porque así puesto acceder al índice de la lista. Al
	// ser un set desordenado no se puede sacar una posición concreta directamente.

	private String calle;
	private String id_calle;
	private List<Caseta> casetas;

	public Calle(String calle, String id_calle) {
		this.calle = calle;
		this.id_calle = id_calle;
		this.casetas = new ArrayList<Caseta>();

	}

	// PARA EL PRIMER MÉTODO
	public String muestraCasetas() {
		StringBuilder sb = new StringBuilder();
		for (Caseta caseta : casetas) {
			sb.append(caseta + "\n");
		}
		return sb.toString();
	}

	// PARA EL SEGUNDO MÉTODO
	public int muestraNumCasetas() {
		int num = 0;
		for (Caseta caseta : casetas) {
			num++;
		}
		return num;
	}

	// PARA EL TERCER MÉTODO
	public void eliminaCaseta(int numCaseta) throws Exception {
		String num = String.valueOf(numCaseta);
		int modul = 0;
		
		boolean resul = false;
		Iterator<Caseta> caset = casetas.iterator();
		while (caset.hasNext() && !resul) {
			Caseta caseta = (Caseta) caset.next();
			
			//ELIMINA CASETA
			if (resul == false && caseta.getNumero().equals(num)) {
				modul = Integer.valueOf(caseta.getModulo());
				casetas.remove(this.casetas.indexOf(caseta));
				resul = true;
			}

			if (resul == false) {
				throw new Exception("No existe caseta con ese número en esa calle");
			}
		}
		
		for (Caseta caseta : casetas) {
			//CONSIGUE MÓDULO Y CAMBIA NÚMEROS
			if(Integer.valueOf(caseta.getNumero()) > numCaseta) {
				int numero = Integer.valueOf(caseta.getNumero())-modul;
				caseta.setNumero(String.valueOf(numero));
			}
		}
	}

	public void addCaseta(Caseta cas) {
		if (!this.casetas.contains(cas)) {
			casetas.add(cas);
		}
	}

	public String getCalle() {
		return calle;
	}

	public String getId_calle() {
		return id_calle;
	}

	public List<Caseta> getCasetas() {
		return casetas;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_calle == null) ? 0 : id_calle.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Calle))
			return false;
		Calle other = (Calle) obj;
		if (id_calle == null) {
			if (other.id_calle != null)
				return false;
		} else if (!id_calle.equals(other.id_calle))
			return false;
		return true;
	}

	@Override
	public String toString() {
		Collections.sort(this.casetas, new OrdenaListaPorNumero());
		StringBuilder sb = new StringBuilder("Calle:" + this.calle + ", id_calle:" + this.id_calle + ", casetas:");
		for (Caseta c : casetas) {
			sb.append(c.toString() );
		}
		return sb.toString();
	}

}
