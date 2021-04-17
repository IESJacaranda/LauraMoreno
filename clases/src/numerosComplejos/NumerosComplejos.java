package numerosComplejos;

public class NumerosComplejos {
	
	private double parteReal1;
	private double parteImaginaria1;

	
	

	public NumerosComplejos() {}
	
	public NumerosComplejos(double parteReal1, double parteImaginaria1) {
		this.parteReal1 = parteReal1;
		this.parteImaginaria1 = parteImaginaria1;
		
	}
	
	
	
	
	//**********GETTERS Y SETTERS***********//
	public double getParteReal1() {
		return parteReal1;
	}

	public void setParteReal1(double parteReal1) {
		this.parteReal1 = parteReal1;
	}

	public double getParteImaginaria1() {
		return parteImaginaria1;
	}

	public void setParteImaginaria1(double parteImaginaria1) {
		this.parteImaginaria1 = parteImaginaria1;
	}


	
	
	//*********MÉTODOS DEL PROBLEMA************//
	
	//SUMA:
	
	public NumerosComplejos sumaComplejos(NumerosComplejos complejo) {
		return new NumerosComplejos(this.getParteReal1() + complejo.getParteReal1(),
									this.getParteImaginaria1() + complejo.getParteImaginaria1());
	}
	
	//RESTA:
	
	public NumerosComplejos restaCompleja(NumerosComplejos complejo) {
		
		return new NumerosComplejos(this.getParteReal1()-complejo.getParteReal1(),
									this.getParteImaginaria1()-complejo.getParteImaginaria1());
	}
	
	//MOSTRAR NÚMERO:
	//FORMA 1:
	public String getNumComplejo() {
		return "El número complejo es: (" + this.parteReal1 + "." + this.parteImaginaria1 + ")";
	}
	
	//FORMA 2: 
	@Override
	public String toString() {
		return this.parteReal1 + "." + this.parteImaginaria1;
	}
	
	
	//MÉTODO EQUALS PARA COMPARAR DOS NÚMEROS COMPLEJOS:
	@Override
	public boolean equals (Object complejo) {
		boolean equals = false;
		
		if (this==complejo) {
			equals = true; 
			
			
		}else{
		NumerosComplejos nuevoComplejo = (NumerosComplejos) complejo;
			equals = (this.parteReal1 == nuevoComplejo.parteReal1) && (this.parteImaginaria1 == nuevoComplejo.parteImaginaria1);
		}
		
		return equals;
		
	}
	
	//FORMA 2 PARA EL MÉTODO EQUAL USANDO INSTANCEOF:
//	public boolean equals(Object obj) {
//		boolean sonIguales = false;
//		if(this==obj) {
//			sonIguales = true;
//		}else if (obj instanceof NumerosComplejos) {
//			if(((NumerosComplejos)obj).getParteReal1()==this.getParteReal1() && ((NumerosComplejos)obj).getParteImaginaria1() == this.getParteImaginaria1()) {
//				sonIguales = true;
//			}
//		}return sonIguales;
//	}
	
	
	
}
