package primerosTests;

public class Aritmetica {
	 private float ultimoResultado;//ATRIBUTO. ENTONCES HAY QUE USAR @AFTEREACH, SI NO LO TUVIERA, SER�A @AFTEREACH
	    public float suma(float primerSumando, float segundoSumando) {
	        return ultimoResultado = primerSumando + segundoSumando;
	    }
	    public float resta(float minuendo, float sustraendo) {
	        return ultimoResultado = minuendo - sustraendo;
	    }
	    public float multiplicacion(float primerFactor,
	        float segundoFactor) {
	        return ultimoResultado = primerFactor * segundoFactor;
	    }
	    public float division(float dividendo, float divisor) {
	        return ultimoResultado = dividendo / divisor;
	    }
	    public float getUltimaResultado() {
	        return ultimoResultado;
	  }
}