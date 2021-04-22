package pooAvanzado.ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Yate extends Barco {

	private int camarotes;
	private double potenciaCV;
	
	public Yate(double eslora, int anyo, String matricula, int camarotes, double potenciaCV) {
		super(eslora, anyo, matricula);
		this.camarotes = camarotes;
		this.potenciaCV = potenciaCV;
	}

	public void probando() {
		List<Yate> yates = new ArrayList<>();
		
		Iterator<Yate> it = yates.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}


	public double getPotenciaCV() {
		return potenciaCV;
	}

	public void setPotenciaCV(double potenciaCV) {
		this.potenciaCV = potenciaCV;
	}

	public int getCamarotes() {
		return camarotes;
	}

	public void setCamarotes(int camarotes) {
		this.camarotes = camarotes;
	}
}
