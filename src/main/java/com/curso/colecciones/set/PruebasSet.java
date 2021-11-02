package com.curso.colecciones.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import com.curso.equals.Punto;

public class PruebasSet {
	
	public static void main(String[] args) {
		
		//SET -   no duplicados
		
	    //  HashSet    -  no ordenado
		//  LinkedHashSet   - orden de insercion
		//  TreeSet        - orden natural (Comparable / Comparator)
		
		Set<String> s = new TreeSet<String>();
				 // new LinkedHashSet<String>();
				       //new HashSet<String>();
		
		s.add("Hola");
		s.add("Adios");
		s.add("Zanahoria");
		s.add("Negacion");
		s.add("Hola");
		
		for(String dato : s) {
			System.out.println(dato.toUpperCase());
		}
		
		Set<Alumno> lista = // new HashSet();
				            //new LinkedHashSet();
				            // new TreeSet();
				            new TreeSet(new ComparadorPorNombre());
		
		lista.add(new Alumno(8, "Laura"));
		lista.add(new Alumno(1, "Mario"));
		lista.add(new Alumno(8, "Laura Ramos"));
		lista.add(new Alumno(10, "Antonio"));
		
		for(Alumno a: lista) {
			System.out.println(a);
		}
			
		
		
		
	}

}
