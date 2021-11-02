package com.curso.colecciones.set;

import java.util.List;
import java.util.Vector;

public class PruebaList {
	
	public static void main(String[] args) {
	
		List<Alumno> lista = new Vector(); 
		                     //new ArrayList();
		
		
		lista.add(new Alumno(1, "Laura"));
		lista.add(new Alumno(2, "Pedro"));
		lista.add(0,new Alumno(4, "Rosa") );
		
		Alumno a = lista.get(0);
		System.out.println(a);
	}
	
	
	

}
