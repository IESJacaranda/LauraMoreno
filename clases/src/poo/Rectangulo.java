package poo;

public class Rectangulo {
	
	/*************************************
	 * 	DECLARACIÓN DE LONGITUD Y ANCHO *
	 *************************************/
	
	int longitud;
	int ancho;
	/*this. hace referencia al objeto que llama, sin "this." es el valor introducido por parámetro*/
	/*Constructor sin argumentos. Para llamarlo solo longitud*/
	public Rectangulo (){
		this.longitud = 1;
		this.ancho = 1;
	}
	
	
	/*Contructor con argumentos. Para llamarlo, necesario this.longitud*/
	public Rectangulo (int longitud, int ancho) {
		setLongitud(longitud);
		setAncho(ancho);
	}
	
	public int getLongitud() {
		return longitud;
	}
	/*
	 * Solo devolverá la longitud en caso de ser >0 y <20
	 */
	public void setLongitud(int longitud) {
		if (longitud >0 && longitud<=20){
			this.longitud = longitud;
		}else {
			this.longitud = 1;
		}
	}
	public int getAncho() {
		return ancho;
	}
	/*
	 * Solo devolverá el ancho en caso de ser >0 y <20
	 */
	public void setAncho(int ancho) {
		if (ancho>0 && ancho<=20) {
			this.ancho = ancho;
		}else {
			this.ancho = 1;
	    }
	}
	
	/*************************************
	 * 	DECLARACIÓN DE AREA Y PERIMETRO *
	 *************************************/
	//lleva this. porque no recibe parámetro al que hacer referencia. Necesita el de Rectángulo.
	public int getArea() {
		return this.ancho*this.longitud;
	}

	
	public int getPerimetro() {
		return 2*(this.longitud + this.ancho);
	}

	
	/*************************************
	 * 	        STRING TOSTRING          *
	 *************************************/
	//REPRESENTACIÓN EN STRING DE UN OBJETO. LO QUE IMPRIME EN VEZ DE EL IDENTIFICADOR. ESTO ERES TÚ AHORA RECTÁNGULO.
	@Override
	public String toString() {
		return "El perímetro del rectángulo es de " + getPerimetro() + " y su área es de " + getArea();
	}
	
}
