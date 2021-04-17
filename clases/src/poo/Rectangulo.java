package poo;

public class Rectangulo {
	
	/*************************************
	 * 	DECLARACI�N DE LONGITUD Y ANCHO *
	 *************************************/
	
	int longitud;
	int ancho;
	/*this. hace referencia al objeto que llama, sin "this." es el valor introducido por par�metro*/
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
	 * Solo devolver� la longitud en caso de ser >0 y <20
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
	 * Solo devolver� el ancho en caso de ser >0 y <20
	 */
	public void setAncho(int ancho) {
		if (ancho>0 && ancho<=20) {
			this.ancho = ancho;
		}else {
			this.ancho = 1;
	    }
	}
	
	/*************************************
	 * 	DECLARACI�N DE AREA Y PERIMETRO *
	 *************************************/
	//lleva this. porque no recibe par�metro al que hacer referencia. Necesita el de Rect�ngulo.
	public int getArea() {
		return this.ancho*this.longitud;
	}

	
	public int getPerimetro() {
		return 2*(this.longitud + this.ancho);
	}

	
	/*************************************
	 * 	        STRING TOSTRING          *
	 *************************************/
	//REPRESENTACI�N EN STRING DE UN OBJETO. LO QUE IMPRIME EN VEZ DE EL IDENTIFICADOR. ESTO ERES T� AHORA RECT�NGULO.
	@Override
	public String toString() {
		return "El per�metro del rect�ngulo es de " + getPerimetro() + " y su �rea es de " + getArea();
	}
	
}
