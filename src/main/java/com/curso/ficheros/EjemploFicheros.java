package com.curso.ficheros;

import java.io.*;

public class EjemploFicheros {

	
	public static void main(String[] args) throws IOException {
		
		
		//crea un fichero
		File fichero = new File("carta1.txt");
		try {
			boolean esNuevo = fichero.createNewFile();
			if(esNuevo) {
				System.out.println("He creado el fichero");
			}else {
				System.out.println("ya existe el fichero");
			}
			
		} catch (IOException e) {
			System.out.println("Error de escritura en disco");
			e.printStackTrace();
		}
		
		
		//crear un diretorio
		
		File directorio = new File("midirectorio");
		boolean creado = directorio.mkdir();
		System.out.println("¿he creado el directorio? " + creado);
		
		String[] contiene = directorio.list();
		
		//crea un fichero en el directorio
		File f2 = new File(directorio,"carta3.txt");
		f2.createNewFile();
		
		//leer
		//escribir
		
		
		
	}
}
