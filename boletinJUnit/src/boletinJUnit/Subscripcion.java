package boletinJUnit;

public class Subscripcion {
	private int precio ; // precio total de la subscripción euro-cent
	private int periodo ; // periodo de subscripcion en meses
	/**
	* El constructor para crear una subscripciÃ³n.
	*/
	public Subscripcion(int p, int n) {
		precio = p ;
		periodo = n ;
	}
	/**
	* Calcula el precio de la subscripción mensual en euros,
	* redondeándolo por arriba al céntimo más cercano.
	*
	*/
	public double precioPorMes() {
		if (periodo<=0 || precio<=0) return 0 ;
		double r = (double) precio / (double) periodo ;
		double resto = r%1;

		if (resto > 0) {
			return r+1;
		}
		else {
			return r;
		}
	}
	/**
	* Este mÃ©todo cancela la subscripciÃ³n.
	*/
	public void cancel() {
		periodo = 0 ;
	}
	
}