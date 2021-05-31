package examen;

import java.util.Comparator;

public class OrdenaListaPorNumero implements Comparator<Caseta> {

	@Override
	public int compare(Caseta o1, Caseta o2) {

		return o1.getNumero().compareTo(o2.getNumero());//Al haberlo puesto como un String, puedo hacerlo con el compareTo
	}

}
