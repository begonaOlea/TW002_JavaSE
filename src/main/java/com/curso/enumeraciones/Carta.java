package com.curso.enumeraciones;

import java.util.Random;

public class Carta {
	
	private Palos palo;
	private int numero; 
	
	public Carta() {
		Random rd = new Random();
		this.numero = rd.nextInt(10) + 1; //numero del 0 al 9 y sumo 1
		Palos[] palos = Palos.values();
		this.palo = palos[rd.nextInt(4)];
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
		
		return palo.getValor();
				
//		int valor = 0;
//		switch (palo) {
//		case OROS:
//			valor = 4;
//			break;
//		case COPAS:
//			valor = 3;
//			break;
//		case ESPADAS:
//			valor = 2;
//			break;
//		case BASTOS:
//			valor = 1;
//			break;
//		}
//		return valor;
	}

	@Override
	public String toString() {
		return "Carta [palo=" + palo + ", numero=" + numero + "]";
	}
	
	

}
