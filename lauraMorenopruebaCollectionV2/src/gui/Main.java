package gui;

import java.time.LocalDate;

import body.Empresa;

public class Main {

	public static void main(String[] args) {
		Empresa e = new Empresa();
		
		System.out.println(e.addTareaCliente("hacer main", "BAJA", "SIEMENS", "Sevilla"));//hago syso porque devuelven true/false
		System.out.println(e.addTareaCliente("tener vacaciones", "ALTA", "LAURA SL", "Cordoba"));
		
		System.out.println(e.addTareaEmpresa("cosas", "MEDIA", "turismo"));
		System.out.println(e.addTareaEmpresa("romper el sistema", "BAJA", "Depart importante"));
		
		System.out.println(e.mostrarTareas());
		
		System.out.println(e.mostrarTareasPrioridad());
		
		System.out.println(e.numTareasPendientes());
		
		try {
			e.resolverTarea("hacer main", LocalDate.of(2022, 11, 30), LocalDate.of(2021, 05, 07));
		} catch (Exception e1) {
			System.out.println(e1.getMessage());
		}
		// :D
	}

}
