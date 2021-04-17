package relacion8;

import java.util.Scanner;

public class Fecha {
	
	static final int[] MESES_31_DIAS = {1,3,5,7,8,10,12};
	static final int[] MESES_30_DIAS = {4,6,9,11}; //¿Por qué al poner 09 me da fallo?
	static final String[] MESES = {"enero", "febrero", "marzo", "abril", "mayo","junio"
			, "julio", "agosto", "septiembre","octubre","noviembre", "diciembre"};
	
	public static void main(String[] args) {
		try {
			
			pasarAFormatoLargo(pideDatos())	;
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
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
	
	
	public static boolean esFechaCorrecta(int[]fecha) throws NoEsFechaCorrectaException {
		boolean esFechaCorrecta = false;
		
		if(fecha[0]<=diasDeUnMes30_31(fecha[1], fecha[2])) {
			esFechaCorrecta = true;
		}else {
			throw new NoEsFechaCorrectaException();
		}
		return esFechaCorrecta;
	}
	
	
	/**
	 * Método principal 
	 * Se comprueba previamente si la fecha introducida es correcta.
	 * @param fecha (int[])
	 * @return String en el que se devuelve el formato largo de la fecha introducida.
	 */
	public static String pasarAFormatoLargo(int[]fecha) {
		String fechaFormatoLargo = "";
		
		try {
			if(esFechaCorrecta(fecha)) {
				fechaFormatoLargo = "La fecha en formato largo es "+ fecha[0] + " de " + MESES[fecha[1]-1]
						+ " de " + fecha[2];
			}
		} catch (NoEsFechaCorrectaException e) {
			e.printStackTrace();
		}
		
		return fechaFormatoLargo;
	}
	
	
	static Scanner teclado = new Scanner(System.in);
	
	
	/**
	 * Pedimos los datos necesarios para mostrar la fecha en formato largo
	 * @throws DiasInexistentesExeption
	 * @throws MesesInexistentesException
	 * @throws AnioInexistenteException
	 */
	public static int[] pideDatos() throws DiasInexistentesExeption, MesesInexistentesException, AnioInexistenteException {
		int[] fecha = new int[3];
		
		System.out.println("Introduce los días del mes: ");
		fecha[0] = Integer.parseInt(teclado.nextLine());
		if(fecha[0] >31 || fecha[0]<1) {
			throw new DiasInexistentesExeption();}
		
		System.out.println("Introduce el mes: ");
		fecha[1] = Integer.parseInt(teclado.nextLine());
		if(fecha[1] >12 || fecha[1] < 1) {
			throw new MesesInexistentesException();}
		
		System.out.println("Introduce el año: ");
		fecha[2] = Integer.parseInt(teclado.nextLine());
		if(fecha[2] < 0) {
			throw new AnioInexistenteException();}
		
		return fecha;
	}
	
	
}
