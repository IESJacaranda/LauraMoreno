package examen;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Feria {

	private List<Calle> calles;

	public Feria() {
		this.calles = new ArrayList<Calle>();

	}

	public List<Calle> getCalles() {
		return calles;
	}

	public void addCalle(Calle c, Caseta cas) {
		if (!this.calles.contains(c)) {
			this.calles.add(c);
		} else {
			this.calles.get(this.calles.indexOf(c)).addCaseta(cas);
		}
	}

	/**
	 * PRIMER MÉTODO
	 * 
	 * @param nomCalle
	 * @return CASETAS QUE COMPONEN ESA CALLE SIN USAR LOS GETTERS DE LAS LISTAS
	 */
	public String muestraCasetasCalle(String nomCalle) {
		StringBuilder sb = new StringBuilder();

		for (Calle calle : calles) {
			boolean resul = false;
			if (calle.getCalle().equals(nomCalle) && resul == false) {
				sb.append(calle.muestraCasetas());

				resul = true;
			}

		}
		return sb.toString();
	}

	// SEGUNDO MÉTODO
	public String muestraNumCasetasPorCalle() {

		StringBuilder sb = new StringBuilder();
		for (Calle calle : calles) {
			sb.append(calle.getCalle() + ": " + calle.muestraNumCasetas() + "\n");
		}
		return sb.toString();
	}

	// TERCER MÉTODO: ELIMINAR
	public void eliminaCaseta(String nomCalle, int numCaseta) throws Exception {
		for (Calle calle : calles) {
			boolean resul = false;
			if (calle.getCalle().equals(nomCalle) && resul == false) {
				calle.eliminaCaseta(numCaseta);
				resul = true;
			}
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((calles == null) ? 0 : calles.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Feria))
			return false;
		Feria other = (Feria) obj;
		if (calles == null) {
			if (other.calles != null)
				return false;
		} else if (!calles.equals(other.calles))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("La feria se compone de: ");
		for (Calle calle : calles) {
			sb.append(calle.toString());
		}
		return sb.toString();
	}

	/***************
	 * CAGAR DATOS
	 * 
	 * @throws Exception *
	 ***************/
	public void cargaDatos(Feria f) throws Exception {
		try (BufferedReader filtroLectura = new BufferedReader(new FileReader(".\\fichero\\casetasferia2021.csv"))) {
			String linea = "";

			while ((linea = filtroLectura.readLine()) != null) {
				String values[] = linea.split(",");
				if (values.length <= 8) {

					Calle calle = new Calle(values[1], values[7]);
					Caseta caseta = new Caseta(values[0], values[2], values[3], values[4], values[5], values[6]);
					calle.addCaseta(caseta);
					f.addCalle(calle, caseta);

				}
			}

			
			final Gson gson = new GsonBuilder().setPrettyPrinting().create();
			final String resul = gson.toJson(f.toString());// .toString() se puede poner pero para verlo mejor en windows lo dejo
												// sin toString;

			FileWriter fw = new FileWriter(".\\fichero\\resul.json");
			PrintWriter pw = new PrintWriter(fw);
			pw.println(resul);

			fw.close();
			pw.close();
		}

	}

}
