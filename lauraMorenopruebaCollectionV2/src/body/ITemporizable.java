package body;

import java.time.LocalDate;

public interface ITemporizable {

	// devuelva el n�mero de d�as transcurridos entre la fecha de creaci�n de la tarea y el
	//par�metro. Siempre debe devolver un valor positivo.
	long numDias(LocalDate fecha);
}
