package body;

import java.time.LocalDate;

public interface ITemporizable {

	// devuelva el número de días transcurridos entre la fecha de creación de la tarea y el
	//parámetro. Siempre debe devolver un valor positivo.
	long numDias(LocalDate fecha);
}
