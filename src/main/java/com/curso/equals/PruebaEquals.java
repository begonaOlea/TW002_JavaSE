package com.curso.equals;

public class PruebaEquals {
	
	public static void main(String[] args) {
		
		int a  = 2;
		int b =  2;
		
		if (a == b) {
			System.out.println("a y b son iguales");
		}
		
		Punto p1 = new Punto(0,2);
		Punto p2 = new Punto(0,2);
		
		System.out.println("p1 == p2 es " + (p1 == p2)); //false
		System.out.println("p equals p2 es " + (p1.equals(p2))); //true
		
		//POOL STRING
		
		
		String n1 = "Laura";
		String n2 = "Laura";
		String n3 = new String("Laura");
		String n4 = "Pedro";
		String n5 = new String("Laura");
		
		n1 = n1.concat(" Ramos");
		
		System.out.println(n1);
		
		System.out.println("n1 == n2 es " + (n1 == n2)); //true
		System.out.println("n1 equals n2 es " + (n1.equals(n2))); //true
		
	
		System.out.println(p1); //p1.toSTring();
		
		
		
		
		
		
		
	}

}