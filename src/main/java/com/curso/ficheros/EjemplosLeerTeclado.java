package com.curso.ficheros;

import java.io.Console;
import java.io.PrintStream;
import java.util.Scanner;

public class EjemplosLeerTeclado {
	
	public static void main(String[] args) {
		
		// Console
		// Scanner
		
		PrintStream salida = System.out;
//		Console consola = System.console();
//		consola.format("Introduce un numero");
//		
//		String numero = consola.readLine();
//		 
		
		Scanner sc = new Scanner(System.in); // lee del teclado
		
		salida.print("Indroduce un nombre: ");
		String nombre = sc.next(); 
		salida.println(" hola " + nombre);
		salida.print("Dime tu id:  ");
		//if (sc.hasNextInt() ) {
			int id = sc.nextInt();
		//}
			
		salida.printf("Eres %s con identificaro %d", nombre , id);
		
		 
		
		
		
		
		
		
		
		
		
		 
	}

}
