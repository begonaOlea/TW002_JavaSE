package com.curso.statics;

public class Contador2 {
	
	private int numeroSerie;
	private static int contador;
	
	static {
		System.out.println("... solo lo hace una vez . En la carga de la clases");
	    contador = 455;
	    String s = null;
	    s.toLowerCase();
	}
	
	
	public Contador2() {
		contador ++;
		this.numeroSerie = contador;
	}

	public int getNumeroSerie() {
		return numeroSerie;
	}
	
	public static int getContador() {
		return contador;
	}
}
