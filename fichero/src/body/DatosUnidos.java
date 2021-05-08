package body;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

public class DatosUnidos {

	ListaPaises lp;
	ListaCiudades lc;
	ListaDirecciones ld;

	public DatosUnidos() {
		this.lp = new ListaPaises();
		try {
			lp.cargarDatos(".\\ficheros\\body\\country.txt");
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.lc = new ListaCiudades();
		lc.cargarDatos(".\\ficheros\\body\\city.txt");
		this.ld = new ListaDirecciones();
		ld.cargarDatos(".\\ficheros\\body\\address.txt");
	}

	public void crearFicheroTemporal(String f) {
		try (BufferedWriter filtroEscritura = new BufferedWriter(new FileWriter(f))) {
			Iterator<Pais> it = lp.getPaises().iterator();
			while (it.hasNext()) {
				// PAISES Y CIUDADES
				Pais p = it.next();
				Integer numCiudades = contarCiudades(p.countryId);
				Integer numDirecciones = contarDirecciones(p.getCountryId());
				filtroEscritura.write(p.getName() + "," + p.getCountryId() + "," + numCiudades.toString() + ","
						+ numDirecciones.toString());

				filtroEscritura.newLine();
			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	private int contarCiudades(int paisId) {
		int cont = 0;
		Iterator<Ciudad> it = lc.getCiudades().iterator();
		while (it.hasNext()) {
			if (it.next().getPaisId() == paisId)
				cont++;
		}
		return cont;
	}

	private int contarDirecciones(int paisId) {
		Iterator<Ciudad> di = lc.getCiudades().iterator();
		int cont = 0;
		while (di.hasNext()) {
			Ciudad c = di.next();
			if (c.getPaisId() == paisId) {
				Iterator<Direccion> it = ld.getDirecciones().iterator();
				while (it.hasNext()) {
					Direccion d = it.next();
					if (d.getCiudadId() == c.getCiudadId())
						cont++;
				}

			}
		}
		return cont;
	}

}
