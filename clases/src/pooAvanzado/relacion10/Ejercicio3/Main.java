package pooAvanzado.relacion10.Ejercicio3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import pooAvanzado.relacion10.Ejercicio3.Exception.ClerigoFuerzaNoPermitida;
import pooAvanzado.relacion10.Ejercicio3.Exception.ClerigoIteligenciaNoPermitida;
import pooAvanzado.relacion10.Ejercicio3.Exception.FuerzaMagoNoPermitidaException;
import pooAvanzado.relacion10.Ejercicio3.Exception.FuerzaNoPermitidaException;
import pooAvanzado.relacion10.Ejercicio3.Exception.InteligenciaMagoNoPermitida;
import pooAvanzado.relacion10.Ejercicio3.Exception.InteligenciaNoPermitida;
import pooAvanzado.relacion10.Ejercicio3.Exception.RazaNoPermitidaException;
import pooAvanzado.relacion10.Ejercicio3.Exception.VidaMaximaNoPermitida;

public class Main {

	public static void main(String[] args) {
		//CREACIÓN DE PERSONAJES
		Mago A = null, B = null; Clerigo C = null;
		try {
			A = new Mago("Merlín", "orco", 13, 18, 80);
			B = new Mago("Zacarías", "humano", 15, 20, 70);
			C = new Clerigo("Pablo", "enano", 18, 13, 60, "Madonna");
		} catch (RazaNoPermitidaException | FuerzaNoPermitidaException | InteligenciaNoPermitida | VidaMaximaNoPermitida
				| FuerzaMagoNoPermitidaException | InteligenciaMagoNoPermitida| ClerigoFuerzaNoPermitida | ClerigoIteligenciaNoPermitida e) {
			System.out.println(e.getMessage());
		}
		
		//IMPRIMIR DATOS
		System.out.println(A.toString());
		System.out.println(B.toString());
		System.out.println(C.toString());
		
		//APRENDER HECHIZOS
		A.aprendeHechizo("Congelar");
		A.aprendeHechizo("Lanzar Fuego");
		B.aprendeHechizo("Controlar animales");
		
		//IMPRIMIR DATOS DE LOS MAGOS
		System.out.println(A.toString());
		System.out.println(B.toString());
		
		//LANZAR HECHIZOS
		A.lanzaHechizo(B, "Congelar");
		B.lanzaHechizo(A, "Controlar animales");
		
		//CURACIÓN
		C.curar(B);
		
		//LANZA HECHIZO DE NUEVO
		A.lanzaHechizo(B, "Lanzar Fuego");
		
		//VOLVER A IMPRIMIR DATOS
		System.out.println(A.toString());
		System.out.println(B.toString());
		System.out.println(C.toString());
		
		
		List<AbstractPersonaje> personajes = new ArrayList<>();
		Collections.sort(personajes);
	}
}
