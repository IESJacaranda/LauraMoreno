package ejercicio3;

import exceptions.JarraLlenaExceptions;
import exceptions.VaciarJarra;

public class Jarra {

	private int capacidad;
	private int aguaContenida = 0;
	private int totalDeAgua; //esta variable debería ser estática.
	
	public Jarra () {}
	
	
	public Jarra(int capacidad, int aguaContenida) throws Exception {
		this.capacidad = capacidad;
		
		if(capacidad< aguaContenida) {
			throw new Exception("El agua contenida debe ser menor o igual a la capacidad. Cambie los datos introducidos.");
		}
	
		this.aguaContenida=aguaContenida;
		
	}

	
	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public int getAguaContenida() {
		return aguaContenida;
	}

	public void setAguaContenida(int cervezaContenida) {
		this.aguaContenida = cervezaContenida;
	}

	public int getTotalDeAgua() {
		return totalDeAgua;
	}

	public void setTotalDeAgua(int totalDeAgua) {
		this.totalDeAgua = totalDeAgua;
	}
	
	
	public void llenarJarra() throws JarraLlenaExceptions {
		if(this.capacidad == this.aguaContenida) {
			throw new JarraLlenaExceptions();
		}
		this.aguaContenida = this.capacidad;
		this.totalDeAgua += this.capacidad;
	}
	
	public void vaciarJarra() throws VaciarJarra {//añadir que si ya está vacía, no se puede vaciar más
		if(this.aguaContenida == 0) {
			throw new VaciarJarra();
		}
		
		this.aguaContenida = 0;
	}
	
	
	public void volcarJarra(Jarra jarra) throws Exception {
		if(jarra.aguaContenida<jarra.capacidad) {
			
			if(this.aguaContenida==(jarra.capacidad-jarra.aguaContenida)) {
				this.totalDeAgua += this.aguaContenida;
				this.aguaContenida = 0;
				jarra.aguaContenida = jarra.capacidad;
				
			}
			else if (this.aguaContenida > (jarra.capacidad-jarra.aguaContenida)) {
				this.totalDeAgua += jarra.capacidad-jarra.aguaContenida;
				jarra.aguaContenida = jarra.capacidad;
				this.aguaContenida -= (jarra.capacidad-jarra.aguaContenida);
				
			}
			else {
				this.totalDeAgua += this.aguaContenida;
				jarra.aguaContenida += this.aguaContenida;
				this.aguaContenida = 0;
				
			}
			
		}else{
			throw new Exception ("No se puede llenar más la jarra.");
		}
	}
	
	@Override
	public String toString() {
		return "Capacidad: "+this.capacidad +"\nAgua contenida: "+ this.aguaContenida;
	}
	
	
	public String totalAguaUsada() {
		return "El total de agua que se ha gastado llenado jarras es "+this.totalDeAgua + " litros." ;
	}
	
}
