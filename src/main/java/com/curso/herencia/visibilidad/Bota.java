package com.curso.herencia.visibilidad;

import com.curso.herencia.Calcetin;

public class Bota {
	
    public void calzar(Calcetin c) {
		
		//c.a= 2;
		c.b = 3;
		c.c = 4; 
		c.d = 5;
	}

}

class Media extends Calcetin{
	
	public void algo() {
		this.d = 3;
		this.a = 2;
	}
}
