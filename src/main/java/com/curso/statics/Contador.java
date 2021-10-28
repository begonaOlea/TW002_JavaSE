package com.curso.statics;

public class Contador {
	
	private int numeroSerie;
	public static int contador;
	
	public Contador() {
		contador ++;
		this.numeroSerie = contador;
	}

	public int getNumeroSerie() {
		return numeroSerie;
	}
}
