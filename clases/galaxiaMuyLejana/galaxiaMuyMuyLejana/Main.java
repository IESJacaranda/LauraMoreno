package galaxiaMuyMuyLejana;

public class Main {
//¿Qué hacer cuando falta un personaje?, es decir, cuando hay menos de tres personajes.
	public static void main(String[] args) {
		
		Personaje pers1 = new Personaje("Mari Carmen García", 10, 1.70, 66, "marciana");
		Personaje pers2 = new Personaje("André Martínez", 5, 2.0, 90, "bicho");
		Personaje pers3 = new Personaje("Zola Laureles", 9, 1.5, 49, "gusano");
		
		Pelicula peli1 = new Pelicula ();
		
		
		
		peli1.setPersonaje1(pers1);
		peli1.setAnyoEstreno(1999);
		peli1.setNombrePeli("Pasión de marcianos");
		peli1.setPersonaje1(pers1);
		peli1.setPersonaje2(pers2);
		peli1.setPersonaje3(pers3);
		
			
		pers1.setPrimeraPeli(peli1);
			
		//System.out.println(pers1.getEstatura());
		System.out.println(peli1.toString());
		System.out.println(pers1.toString());
	}

}
