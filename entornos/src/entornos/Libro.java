package entornos;

public class Libro <E>{
	private String ISBN;
	private String titulo;
	private String autor;
	private String editorial;
	private int anyo;
	
	public java.util.Collection tema = new java.util.TreeSet<E>();

}
