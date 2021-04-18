package pooAvanzado.relacion10.Ejercicio3;
import pooAvanzado.relacion10.Ejercicio3.Exception.FuerzaNoPermitidaException;
import pooAvanzado.relacion10.Ejercicio3.Exception.InteligenciaNoPermitida;
import pooAvanzado.relacion10.Ejercicio3.Exception.RazaNoPermitidaException;
import pooAvanzado.relacion10.Ejercicio3.Exception.VidaMaximaNoPermitida;

public abstract class AbstractPersonaje {
	protected String nombre;
	protected String raza;
	protected int fuerza;
	protected int inteligencia;
	protected int vidaMaxima;
	protected int vidaActual;
	
	/**
	 * No se le pasa la vida actual porque se crea con la misma vida máxima.
	 * @param nombre
	 * @param raza
	 * @param fuerza
	 * @param inteligencia
	 * @param vidaMaxima
	 * @throws RazaNoPermitidaException
	 * @throws FuerzaNoPermitidaException
	 * @throws InteligenciaNoPermitida
	 * @throws VidaMaximaNoPermitida
	 */
	public AbstractPersonaje(String nombre, String raza, int fuerza, int inteligencia, int vidaMaxima) 
			throws RazaNoPermitidaException, FuerzaNoPermitidaException, InteligenciaNoPermitida, VidaMaximaNoPermitida {
		//NOMBRE
		this.nombre = nombre;
		//RAZA
		if(!"humano".equals(raza) && !"elfo".equals(raza) && !"enano".equals(raza) && !"orco".equals(raza)) {
			throw new RazaNoPermitidaException();
		}else {
			this.raza = raza;
		}
		//FUERZA
		if(fuerza<0 || fuerza>20) {
			throw new FuerzaNoPermitidaException();
		}else {
			this.fuerza = fuerza;
		}
		//INTELIGENCIA
		if(inteligencia <0 || inteligencia > 20) {
			throw new InteligenciaNoPermitida();
		}else {
			this.inteligencia = inteligencia;
		}
		//VIDA_MÁXIMA Y VIDA_ACTUAL
		if(vidaMaxima < 0 || vidaMaxima > 100) {
			throw new VidaMaximaNoPermitida();
		}else {
			this.vidaMaxima = vidaMaxima;
			this.vidaActual = vidaMaxima;
		}
	}
	
	//TOSTRING
	@Override
	public String toString() {
		return "Nombre: " + nombre + ", raza: " + raza + ", fuerza: " + fuerza + ", inteligencia: "
				+ inteligencia + ", vidaMaxima: " + vidaMaxima + ", vidaActual: " + vidaActual;
	}

	//GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	public int getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}

	public int getVidaMaxima() {
		return vidaMaxima;
	}

	public void setVidaMaxima(int vidaMaxima) {
		this.vidaMaxima = vidaMaxima;
	}

	public int getVidaActual() {
		return vidaActual;
	}

	public void setVidaActual(int vidaActual) {
		this.vidaActual = vidaActual;
	}

}
