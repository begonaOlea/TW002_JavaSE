package com.curso.herencia;

public class Calcetin{
	
	private int a;
	public int b;
	int c; // de paquete
	protected int d;  //hijos esten o no en el mism paquete o
				      // clases del mismo paquete 

}

class Zapato{
	
	public void calzar(Calcetin c) {
		
		//c.a= 2;
		c.b = 3;
		c.c = 4; 
		c.d = 5;
	}
}


