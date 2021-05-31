package main;

import java.io.IOException;

import ficheroPaises.body.LecturaFicheros;

public class Main {

	public static void main(String[] args) {
		LecturaFicheros l = new LecturaFicheros();
		//System.out.println(l);
		try {
			l.imprimeDatos();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
