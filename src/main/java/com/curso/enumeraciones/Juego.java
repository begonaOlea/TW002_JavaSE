package com.curso.enumeraciones;

public class Juego {
	
	
	public static void main(String[] args) {
		
		 Carta c1 = new Carta(Palos.COPAS,4);
		 Carta c2 = new Carta(Palos.OROS, 2);
		
	     String resultado = Juego.jugar(c1,c2);
	     System.out.println(resultado);
		 
 
	}
	
	public static String jugar(Carta c1, Carta c2) {
		
		
		String r = "empate";
		
		if ( c1.getNumero() > c2.getNumero()) {
			r ="gana c1";
		}else if( c1.getNumero() < c2.getNumero()) {
			r ="gana c2";
		}else {
			//empatan en numero - juega por palo
			if(c1.getValor() > c2.getValor()) {
				r = "gana c1";
			}else if(c1.getValor() < c2.getValor()) {
				r = "gana c2";
			}
		}
		
		
		return r;
	}

}
