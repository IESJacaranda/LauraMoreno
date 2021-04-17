package maquinaCafe2;

public class Maquina {

	public final static double PRECIO_CAFE_LECHE = 1.5;
	public final static double PRECIO_CAFE_SOLO = 1.0; 
	public final static double PRECIO_LECHE = 0.8;
	
	
	private int vasos = 80;
	private int depositoLeche = 50;
	private int depositoCafe = 50;
	private double monedero = 2.0;
	
	
	public Maquina (){}
	
	public Maquina (int vasos, int depositoLeche, int depositoCafe, double monedero) {
		this.vasos = vasos;
		this.depositoCafe = depositoCafe;
		this.depositoLeche = depositoLeche;
		this.monedero = monedero;
	}
	
	public String toString() {
		return "El estado de la máquina es: " + this.depositoCafe +" dosis de café " + this.depositoLeche + " dosis de leche, "+this.vasos+" vasos y "+this.monedero+" euros en el monedero.";
	}
	
	public void vaciarMonedero() {
		this.monedero = 0.0;
	}
	
	public void llenarDepositos() {
		this.depositoCafe = 50;
		this.depositoLeche = 50;
		this.vasos = 80;
	}
	
	public String cafeSolo(double dineroIntroducido) throws Exception {
		String mensaje="";
		if(this.depositoCafe<1 && this.vasos<1) {
			throw new Exception ("La máquina no posee suficientes suministros.");
			
		}else if(dineroIntroducido < PRECIO_CAFE_SOLO) {
			throw new Exception ("El dinero introducido es insuficiente.");
			
		}else if (dineroIntroducido == PRECIO_CAFE_SOLO) {
			mensaje = "Producto servido.";
			this.monedero += dineroIntroducido;
			
		}else if (dineroIntroducido > PRECIO_CAFE_SOLO) {
			if((dineroIntroducido - PRECIO_CAFE_SOLO) <= this.monedero) {
				mensaje = "Recoge tu cambio de "+ (dineroIntroducido - PRECIO_CAFE_SOLO) + " euros.";
				this.monedero += PRECIO_CAFE_SOLO;
				
			}else {
				throw new Exception ("El monedero de la máquina es insuficiente como para darle vuelta. Lo sentimos.");
			}
		}return mensaje;
	}
	
	
	
}
