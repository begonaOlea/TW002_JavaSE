package com.curso.colecciones.map;

import java.util.*;
import com.curso.colecciones.set.Alumno;
import com.curso.colecciones.set.ComparadorPorNombre;

public class PruebaMap {
	
	public static void main(String[] args) {
		// Map<key, value>
		Map<Integer,Alumno> miMap = new HashMap();
		
		Alumno a1 = new Alumno(1, "Laura");
		Alumno a2 = new Alumno(8, "Pedro");
		Alumno a3 = a1;
		Alumno a4 = new Alumno(3, "Roberto");
		
		miMap.put(1, a1);
		miMap.put(39, a2);
		miMap.put(40, a3);
		miMap.put(50, a4);
		
		Alumno a5 = miMap.get(1); //a1, a3 y a5 apuntan a Laura
		
		//miMap.put(1, new Alumno(10,"Carlos"));
		
		
		System.out.println(miMap);
		
		
		Set<Integer> clave = miMap.keySet();
		
		Collection<Alumno> valores = miMap.values();
		System.out.println("Lista de valores....");
		for(Alumno a : valores) {
			System.out.println(a);
		}
		
		// key es el alumno y value es un double con la nota
		Map<Alumno, Double> notasPorAlumno = //new LinkedHashMap<Alumno, Double>();
		                                         //new HashMap();
		                                         //new TreeMap();
				               new TreeMap(new ComparadorPorNombre());     
		
		
		Alumno aa1 = new Alumno(1, "Laura");
		Alumno aa2 = new Alumno(8, "Pedro");
		Alumno aa3 =  new Alumno(8, "Pedro");
		Alumno aa4 = new Alumno(3, "Ana");
		
		
		notasPorAlumno.put(aa1, 9.0);
		notasPorAlumno.put(aa2, 8.0);
		notasPorAlumno.put(aa3, 6.0);
		notasPorAlumno.put(aa4, 6.6);
		
		double notaDeLaura = notasPorAlumno.get(aa1); //9.0
		
		//recorre el array mostrando nombre alumno y  la notas
		
		System.out.println(".... Notas ...... ");
		Set<Alumno> claves = notasPorAlumno.keySet();
		for(Alumno key: claves) {
//			System.out.println(". " + key.getNombre() + ": " 
//		                            + notasPorAlumno.get(key));
			
			System.out.printf(". El alumno %s tiene una nota de %5.3f %n",
					key.getNombre() , notasPorAlumno.get(key));
		}		
		
		
		
		
		
		
		
		
		
	}

}
