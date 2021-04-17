package entornos;

public class Tema <E>{

	private int ID;
	private String descripcion;
	
	public java.util.Collection libro = new java.util.TreeSet<E>();
	
	Tema esSuper;
	public java.util.Collection esSuper2= new java.util.TreeSet<E>();
}
