package pooAvanzado.relacion10.ejercicio1;

import pooAvanzado.Ejercicio1.Titular;

public class Main {

	public static void main(String[] args) {
		Titular titular = new Titular("Mari", 30);
		CuentaCredito cuenta = new CuentaCredito(titular, 300, 500);
		
		MenuCuentaCredito cuentaMenu = new MenuCuentaCredito();
		cuentaMenu.menuCredito(cuenta);

	}

}
