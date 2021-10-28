package com.curso.arrays;

public class EjemplosArrays {

	public static void main(String[] args) {
		
		//declarar un array de tipos int
		int[] array;
		
		// asignarle una array de 10 elementos
		array = new int[10];
		
		// leer el primer elemento del array
		System.out.println(array[0]);
		
		// asignar un valor 3 al último elementos del array
		array[array.length-1] =3;
		
		//recorrer el array y mostar sus valores
		
		//modo 1
		for(int i = 0; i < array.length ; i++) {
			System.out.println(array[i]);
		}
		
		
		//modo 2
		for(int valor : array ) {
			System.out.println(valor);
		}

		

	}

}
