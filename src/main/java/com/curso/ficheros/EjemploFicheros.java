package com.curso.ficheros;

import java.io.*;
import java.util.Scanner;

public class EjemploFicheros {

	public static void main(String[] args) throws IOException {

		// crea un fichero
		File fichero = new File("carta1.txt");
		try {
			boolean esNuevo = fichero.createNewFile();
			if (esNuevo) {
				System.out.println("He creado el fichero");
			} else {
				System.out.println("ya existe el fichero");
			}

		} catch (IOException e) {
			System.out.println("Error de escritura en disco");
			e.printStackTrace();
		}

		// crear un diretorio

		File directorio = new File("midirectorio");
		boolean creado = directorio.mkdir();
		System.out.println("¿he creado el directorio? " + creado);

		String[] contiene = directorio.list();

		// crea un fichero en el directorio
		File f2 = new File(directorio, "carta3.txt");
		f2.createNewFile();

		// escribir

		//try (PrintWriter salida = new PrintWriter(f2)) {
		try (PrintWriter salida = 
				new PrintWriter(new FileWriter(f2,true))) {
		
			salida.println("linea 1");
			salida.println("linea 2");
			salida.flush();
			
		}catch(IOException e){
			System.out.println("No pudo escribir el fichero " + e.getMessage());
		}
		//finally {
			// salida.close();
		//}
		
		
		//leer
		
		try(BufferedReader entrada =
				new BufferedReader(new FileReader(f2))){
			String linea = null;
			do {
				linea = entrada.readLine();
				System.out.println(". " + linea);
			}while(linea != null );
		}
		
		//leer con scanner
		System.out.println("..... scanner ......");
		Scanner sc = new Scanner(f2);
		//por defecto el separador es el space
		sc.useDelimiter("/n");
		String linea = null;
		while (sc.hasNext()) {
			linea = sc.next();
			System.out.println(linea);
		}
		
		
		
		
		
		
		

	}
}
