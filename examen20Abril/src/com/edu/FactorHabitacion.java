package com.edu;

public enum FactorHabitacion {
	
	SIMPLE(1.15),
	DOBLE(1.15),
	SUITE(1.9),
	SREUNIONES(1),
	SCELEBRACIONES(2.15);
	
	private double factor;
	
	FactorHabitacion(double factor){
		this.factor = factor;
	}

	public double getFactor() {
		return factor;
	}

}
