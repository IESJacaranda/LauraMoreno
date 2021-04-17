package relacion8;

public class DiaDeUnMes {
	
	static final int[] MESES_31_DIAS = {1,3,5,7,8,10,12};
	static final int[] MESES_30_DIAS = {4,6,9,11};
	
	public static int diasDeUnMes30_31(int mes, int anio) {
		int dias = 0;
		
		for(int i=0; i<MESES_30_DIAS.length;i++) {
			if(mes == MESES_30_DIAS[i]) {
				dias = 30;}}
		
		for(int i=0; i<MESES_31_DIAS.length;i++) {
			if(mes == MESES_31_DIAS[i]) {
				dias = 31;}}
		
		if(mes == 2) {
			if(esAnyoBisiesto(anio)) {
				dias = 29;
			}else {
				dias = 28;}}
		
		return dias;
	}

	public static boolean esAnyoBisiesto(int anio) {
		boolean esBisiesto;
		
		if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) {
			esBisiesto = true;
		}else {
			esBisiesto = false;}
		return esBisiesto;
	}
	
	
	public static boolean esFechaCorrecta(int[]fecha) {
		boolean esFechaCorrecta = false;
		
		if(fecha[0]<=diasDeUnMes30_31(fecha[1], fecha[2])) {
			esFechaCorrecta = true;
		}
		return esFechaCorrecta;
	}

	
}
