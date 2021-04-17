package galaxiaMuyMuyLejana;

public class Personaje {

	private String nombrePersonaje;
	private int capDestruccion;
	private double estatura;
	private int peso;
	private String especie;
	private Pelicula primeraPeli;
	
	
	
	
	public Personaje() {}
	
	public Personaje (String nombrePersonaje, int capDestruccion, double estatura, int peso, String especie) {
		this.nombrePersonaje = nombrePersonaje;
		this.capDestruccion = capDestruccion;
		this.estatura = estatura;
		this.peso = peso;
		this.especie = especie;
//		this.primeraPeli = primeraPeli;
	}

	
	
		
	public String getNombrePersonaje() {
		return nombrePersonaje;
	}

	public void setNombrePersonaje(String nombrePersonaje) {
		this.nombrePersonaje = nombrePersonaje;
	}

	public int getCapDestruccion() {
		return capDestruccion;
	}

	public void setCapDestruccion(int capDestruccion) {
		if(capDestruccion > 0 && capDestruccion < 101) {
			this.capDestruccion = capDestruccion;
		}else {
			System.out.println("La capacidad de destrucción debe estar entre 1 y 100.");	
		}
	}

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	public Pelicula getPrimeraPeli() {
		return primeraPeli;
	}

	public String setPrimeraPeli (Pelicula primeraPeli) {
		this.primeraPeli = primeraPeli;
		return "La primera película en la que salió es: " + primeraPeli;
	}
	
	
	
	
	
	
	/**
	 * Comprueba el peso y la capacidad de destrucción del personaje.
	 * @return el mayor de las dos cifras. En caso de ser iguales, se devuelven los dos.
	 */
	public String mayorDestOPeso() {
		String mayor;
		if(this.capDestruccion > this.peso) {
			mayor = " y su capacidad de destrucción es de: " + this.capDestruccion + ".";
			
		}else if(this.capDestruccion < this.peso){ 
			mayor = " y su peso es de: " + this.peso + " kilos.";
		}else {
			mayor = ", su peso es de: " + this.peso + " kilos y su capacidad de destrucción es la misma: " +this.capDestruccion;
		}
		return mayor;
	}
	
	
	
	
	
	@Override
	public String toString() {
		return this.nombrePersonaje +", " +  this.estatura + ", " + this.especie + mayorDestOPeso();
	}
	
	
	
	
	
	
	
}
