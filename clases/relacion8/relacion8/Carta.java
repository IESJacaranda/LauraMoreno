package relacion8;

import java.util.concurrent.ThreadLocalRandom;

public class Carta {
	
	private String palo;
	private int numero;
	private final String[] palos = {"copas", "bastos", "espadas", "oro"};

	public Carta(){
		this.numero = ThreadLocalRandom.current().nextInt(1, 12);
		this.palo = palos[ThreadLocalRandom.current().nextInt(0, 3)];
	}
	
	public Carta(int numero, String palo) {
		this.numero = numero;
		this.palo = palo;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean sonIguales = false;
		if (this == obj) {
			sonIguales = true;
		}else if (obj != null && obj instanceof Carta) {
			if(((Carta)obj).numero == this.numero && ((Carta)obj).palo == this.palo){
				sonIguales = true;
			}
		}
		return sonIguales;
	}

	@Override
	public String toString() {
		return this.numero + " de " + this.palo;
	}
}
