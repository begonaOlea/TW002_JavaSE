package com.curso.statics;

public class PruebasStatic {
	
	public static void main(String[] args) {
		
		
		System.out.println(Contador.contador);
		
		Contador c1 = new Contador();
		Contador c2 = new Contador();
		
		System.out.println("c1 numSerie " + c1.getNumeroSerie());
		System.out.println("c2 numSerie " + c2.getNumeroSerie());
		System.out.println(Contador.contador);
		
		
		//-------------------------
		
		System.out.println(Contador2.getContador());
		
		
		
		
		
		
		
	}

}
