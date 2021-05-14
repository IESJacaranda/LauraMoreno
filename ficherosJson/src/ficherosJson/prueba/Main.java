package ficherosJson.prueba;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class Main {

	public static void main(String[]args)throws IOException{
		
		BufferedReader buffer = new BufferedReader(new FileReader(".\\ficheros\\prueba.json"));
		String ficheroCadena = "";
		String aux = buffer.readLine();{
			while (aux!=null) {
				ficheroCadena = ficheroCadena + aux;
				aux = buffer.readLine();
			}
			
		System.out.println(ficheroCadena);
		
		Gson gson = new Gson();
		
//		Properties propiedades = gson.fromJson(ficheroCadena, Properties.class);
//		
//		System.out.println(propiedades.getProperty("nombre"));
//		System.out.println(propiedades.getProperty("apellidos"));
//		System.out.println(propiedades.getProperty("edad"));
//		
//		
//		Persona p1 = gson.fromJson(ficheroCadena, Persona.class);
//		System.out.println(p1);
		
		//Si tuviéramos ya la clase creada con el array dentro, solo mencionaríamos a esa clase pero como no es así, hay que crear un nuevo objeto aquí
		//Sería así (con la clase ListaPersona) ListaPersona l = gson.fromJson(ficheroCadena, ListaPersona.class);
		//También habría que añadir el nombre de la lista("lista") en el json --> {"lista":[ (se añaden {} al principio y al final y se añade el nombre de la lista con "" y : )
		ArrayList<Persona>lista = gson.fromJson(ficheroCadena, new TypeToken<ArrayList<Persona>>(){}.getType());
		
		for(Persona p: lista) {
			System.out.println(p);
		}
		}
	}
}
