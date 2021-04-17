package pooAvanzado.Ejercicio1;

import pooAvanzado.Ejercicio1.exception.CantidadARetirarMenorQueSaldoException;
import pooAvanzado.Ejercicio1.exception.TitularNoValidoException;

public class Main {

	public static void main(String[] args) throws Exception {
		Titular titularJoven = new Titular("Antonio", 22);
		//Titular titularJoven1 = new Titular("Sofía", 50);
		Titular titularNormal = new Titular("María", 50);
		
		try {
			CuentaJoven cuentaJoven = new CuentaJoven(titularJoven, 200);
			//CuentaJoven cuentaJoven1 = new CuentaJoven(titularJoven1, 20);
			System.out.println(cuentaJoven.esTitutlarValido());
			//System.out.println(cuentaJoven1.esTitutlarValido());
			cuentaJoven.mostrar();
			try {
				cuentaJoven.retirarDinero(100);
				System.out.println(cuentaJoven.getSaldo());
			} catch (CantidadARetirarMenorQueSaldoException e) {
				e.printStackTrace();
			}
		} catch (TitularNoValidoException e) {
			e.printStackTrace();
		}
	
		Cuenta cuentaNormal = new Cuenta(titularNormal, 2200);
		cuentaNormal.getBonificacion();
		try {
			cuentaNormal.retirarDinero(300);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(cuentaNormal.getSaldo());
		
	}
	
}
