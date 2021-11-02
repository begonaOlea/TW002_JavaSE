package com.curso.enumeraciones;

public class Juego {
	
	
	public static void main(String[] args) {
		
//		 Carta c1 = new Carta(Palos.COPAS,4);
//		 Carta c2 = new Carta(Palos.OROS, 2);
//		
//	     String resultado = Juego.jugar(c1,c2);
//	     System.out.println(resultado);
//		 
	     
	     System.out.println("--------------");
	     
	     Carta c3 = new Carta();
	     Carta c4 = new Carta();
	     
	     System.out.println(c3);
	     System.out.println(c4);
	     String resultado = Juego.jugar(c3,c4);
	     System.out.println(resultado);
	     
	     System.out.println(c3.getPalo().ordinal());
	     

	}
	
	public static String jugar(Carta c1, Carta c2) {
		
		String r = "empate";
		
		if ( c1.getNumero() > c2.getNumero()) {
			r ="gana c1";
		}else if( c1.getNumero() < c2.getNumero()) {
			r ="gana c2";
		}else {
			//empatan en número - juega por palo
			if(c1.getValor() > c2.getValor()) {
				r = "gana c1";
			}else if(c1.getValor() < c2.getValor()) {
				r = "gana c2";
			}
		}
		return r;
	}

}
