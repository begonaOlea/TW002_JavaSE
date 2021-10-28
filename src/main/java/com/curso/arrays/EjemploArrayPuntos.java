package com.curso.arrays;

public class EjemploArrayPuntos {

	public static void main(String[] args) {
		
			//declarar un array de Puntos 
		Punto[] puntos;
		    // crear un objeto array de Puntos con 5 elementos (new )
		  
		puntos = new Punto[5];
		
		  //  recorrer  y mostar los elemenos del array  (todos son null)
         for(Punto p: puntos) {
        	 System.out.println(p);
         }
		  
		//en la posición 1 añadir un punto con coordenadas 2, 5
		
		puntos[1] = new Punto(2,5);
		//en la posición 2 añadir un punot con coordenadsas 4, 6
		puntos[2] = new Punto(4,6);
		
		// null, (2,5), (4,6), null, null

		//recorrer y mostar las cooerdenasd de los puntos que 
		//tiene el array . Ojo ! evitar NullPointerException
		
		
		  for(Punto p: puntos) {
			  if(p != null) {
	        	 System.out.println(p.getX() + ", " + p.getY());
			  }else {
				 System.out.println(" no hay punto ");
			  }
	      }
		
		  // crear un array de 3 puntos
		  
		  Punto[] triangulo = {
				  new Punto(2,5),
				  new Punto(12,7),
				  new Punto(4,53)
		  };
		  
		  int[] cantidades = { 2, 5, 6, 67};	
		
	}

}
