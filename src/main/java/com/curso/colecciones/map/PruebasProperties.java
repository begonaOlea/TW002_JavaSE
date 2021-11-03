package com.curso.colecciones.map;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import com.curso.colecciones.set.Alumno;

public class PruebasProperties {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		//leer los datos de datos.properties
		//creo un objeto alumno
		
		Properties prop =  new Properties();
        prop.load( new FileReader("datos.properties"));
		
        int id = Integer.parseInt( prop.get("id").toString() );
        Alumno a = new Alumno(id, prop.get("nombre").toString() );
        
		System.out.println("recupero " + a);
	}
}
