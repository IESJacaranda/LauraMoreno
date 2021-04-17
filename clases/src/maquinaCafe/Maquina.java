package maquinaCafe;

public class Maquina {
	
	public final static double PRECIO_CAFE = 1;
	public final static double PRECIO_LECHE = 0.8;
	public final static double PRECIO_CAFE_LECHE = 1.5;
	
	private int depositoCafe;
	private int depositoLeche;
	private int vasos;
	private double monedero;
	
	public Maquina () {
		this.depositoCafe = 50;
		this.depositoLeche = 50;
		this.vasos = 80;
		this.monedero = 50.0;
	}
	
	
	
	public int getDepositoCafe() {
		return depositoCafe;
	}



	public void setDepositoCafe(int depositoCafe) {
		this.depositoCafe = depositoCafe;
	}



	public int getDepositoLeche() {
		return depositoLeche;
	}



	public void setDepositoLeche(int depositoLeche) {
		this.depositoLeche = depositoLeche;
	}



	public int getVasos() {
		return vasos;
	}



	public void setVasos(int vasos) {
		this.vasos = vasos;
	}



	public double getMonedero() {
		return monedero;
	}



	public void setMonedero(double monedero) {
		this.monedero = monedero;
	}



	public void pedirCafeSolo() throws Exception {
		if (this.depositoCafe>0 && this.vasos>0) {
			this.depositoCafe--;
			this.vasos--;
			this.monedero += PRECIO_CAFE;
			System.out.println("Producto servido");
		}else {
			throw new Exception("Operación no permitida");
		}
	}
	
	public void pedirLeche() throws Exception {
		if(this.depositoLeche>0 && this.vasos>0) {
			this.depositoLeche--;
			this.vasos--;
			this.monedero += PRECIO_LECHE;
			System.out.println("Producto servido");
		}else {
			throw new Exception("Operación no permitida");
		}
	}
	
	public void pedirCafeConLeche () throws Exception {
		if(this.depositoLeche>0 && this.depositoCafe>0 && this.vasos>0) {
			this.depositoCafe--;
			this.vasos--;
			this.depositoLeche--;
			this.monedero += PRECIO_CAFE_LECHE;
			System.out.println("Producto servido");
		}else {
			throw new Exception("Operación no permitida");
		}
	}
	
	public String getStatus() {
		return "El deposito de leche es de: " + this.depositoLeche + "\n el depósito de café es de: "+this.depositoCafe + "\n y el dinero en el monedero es: "+this.monedero;
	}
	
	public String salirYApagar() {
		return "Gracias por su compra. Bye.";
	}
	
	public void llenarDepositos() {
		this.depositoCafe = 50;
		this.depositoLeche = 50;
		this.vasos = 80;
	}
	
	public void vaciarMonedero() {
		this.monedero = 0.0;
	}
	
	public boolean comprobarMonedero(double dineroIntroducido) {
		if (dineroIntroducido <= this.monedero) {
			return true;
		}else {
			return false;
		}
	}
	
	
	
}

