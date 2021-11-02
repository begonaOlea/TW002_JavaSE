package com.curso.enumeraciones;

public enum Palos {

	OROS (20),
	COPAS (40),
	BASTOS (50),
	ESPADAS (90);

	private final int valor;
	
	private Palos(int valor) {
		this.valor = valor;
	}
	
	public int getValor() {
		return valor;
	}
	
}
