package poo;

public class Cuenta {
	//Solo declaro lo que voy a dar. Lo que e¡necesito solo lo paso por argumentos.
	private double saldo;
	private int numeroIngresos;
	private int numeroReintegros;

	public Cuenta () {}
	
	public Cuenta (double saldo) {
		this.saldo = saldo;
		
	}


	//OPERACION 1
	public void hacerReintegro(double reintegro) {
		if (saldo > 0 && saldo >=reintegro && reintegro>0) {
			saldo -= reintegro;
			numeroReintegros++;
			System.out.println("Reintegro realizado correctamente.");
		}else {
			System.out.println("La operación no se puede realizar.");
		}
	}
	
	//OPERACION 2
	public void hacerIngreso(double ingreso) {
		if (ingreso>0) {
			saldo+=ingreso;
			numeroIngresos++;
			System.out.println("Operación realizada correctamente");
		}else {
			System.out.println("La operación no se puede realizar");
			//tambien se podría poner:
			//throw new Exception("La operación no se puede realizar");
		}
	}
	
	//OPERACION 3
	public String getStatus() {
		return "El saldo es "+ this.saldo + " el número de ingresos es "+this.numeroIngresos+" el de reintegros "+this.numeroReintegros;
	}
	
	//OPERACION 4
	public double getSaldoFinal() {
			return this.saldo;
		}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getNumeroIngresos() {
		return numeroIngresos;
	}

	public void setNumeroIngresos(int numeroIngresos) {
		this.numeroIngresos = numeroIngresos;
	}

	public int getNumeroReintegros() {
		return numeroReintegros;
	}

	public void setNumeroReintegros(int numeroReintegros) {
		this.numeroReintegros = numeroReintegros;
	}

	
	
	}
