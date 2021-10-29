package com.curso.enumeraciones;

public class Carta {
	
	private Palos palo;
	private int numero; 
	
	public Carta() {
		//pendiente
	}

	public Carta(Palos palo, int numero) {
		super();
		this.palo = palo;
		this.numero = numero;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public Palos getPalo() {
		return palo;
	}
	
	public int  getValor() {
		int valor = 0;
		switch (palo) {
		case OROS:
			valor = 4;
			break;
		case COPAS:
			valor = 3;
			break;
		case ESPADAS:
			valor = 2;
			break;
		case BASTOS:
			valor = 1;
			break;
		}
		return valor;
	}
	

}
