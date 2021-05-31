package ficheroPaises.body;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class LecturaFicheros {

	private List<ClaseContenedor> datosFinales;

	public LecturaFicheros() {
		datosFinales = new ArrayList<ClaseContenedor>();
		try {
			cargarDatosPais();
			cargarDatosCity();
			cargarDatosAddress();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (ClaseContenedor c : datosFinales) {
			sb.append(c.toString() + "\n");
		}
		return sb.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datosFinales == null) ? 0 : datosFinales.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof LecturaFicheros))
			return false;
		LecturaFicheros other = (LecturaFicheros) obj;
		if (datosFinales == null) {
			if (other.datosFinales != null)
				return false;
		} else if (!datosFinales.equals(other.datosFinales))
			return false;
		return true;
	}

	public List<ClaseContenedor> getDatosFinales() {
		return datosFinales;
	}

	public void setDatosFinales(List<ClaseContenedor> datosFinales) {
		this.datosFinales = datosFinales;
	}

	/****************
	 * CARGAR DATOS
	 ***************/

	// PAÍSES
	public void cargarDatosPais() throws Exception {
		ClaseContenedor c = null;
		try (BufferedReader filtroLectura = new BufferedReader(new FileReader(".\\fichero\\country.txt"))) {

			String linea = "";

			while ((linea = filtroLectura.readLine()) != null) {
				String values[] = linea.split(",");
				if (values.length <= 3) {
					c = new ClaseContenedor(values[0], values[1]);
					this.datosFinales.add(c);
				}
			}
		}
	}

	// CIUDADES
	public void cargarDatosCity() throws FileNotFoundException, IOException {
		String idCountry = "";
		try (BufferedReader filtroLectura = new BufferedReader(new FileReader(".\\fichero\\city.txt"))) {
			String linea = "";
			while ((linea = filtroLectura.readLine()) != null) {
				String values[] = linea.split(",");
				if (values.length <= 4) {
					idCountry = values[2];

					try {
						ClaseContenedor cla = this.datosFinales
								.get(this.datosFinales.indexOf(new ClaseContenedor(idCountry)));
						int num = cla.getNumCiudades();
						num++;
						cla.setNumCiudades(num);
						cla.setId_city(values[0]);
					} catch (Exception e) {
						System.out.println("");
					}
				}
			}
		}
	}

	// DIRECCIONES
	public void cargarDatosAddress() throws FileNotFoundException, IOException {
		try (BufferedReader filtroLectura = new BufferedReader(new FileReader(".\\fichero\\address2.txt"))) {
			String linea = "";
			while ((linea = filtroLectura.readLine()) != null) {
				String values[] = linea.split(",");
				if (values.length <= 6 && values.length>2) {

					boolean resul = false;
					Iterator<ClaseContenedor> c = this.datosFinales.iterator();
					while (c.hasNext() && !resul) {
						ClaseContenedor s = c.next();
						if (values[4].equals(s.getId_city())) {
							int num = s.getNumDirecciones();
							num++;
							s.setNumDirecciones(num);
							resul = true;
						}
					}
				}
			}
		}
	}

	public void imprimeDatos() throws IOException {
		FileWriter fw = new FileWriter(".\\fichero\\resul.json");

		try (BufferedWriter filtroEscritura = new BufferedWriter(fw)) {

			final Gson prettyGson = new GsonBuilder().setPrettyPrinting().create();
			final String representacionBonita = prettyGson.toJson(datosFinales);

			PrintWriter pw = new PrintWriter(fw);
			pw.println(representacionBonita);

			pw.close();

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
