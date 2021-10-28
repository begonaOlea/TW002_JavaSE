package com.curso.tipos;

public class EjemploTiposDatos {
	
	//var de instancia o atributos

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
        //var locales del metodo main
		
		// var de referencia
		String s = "Hola"; // s es una var de ref 
						   // que apunta a un objeto String
		
		//var de tipos primitivos
		int a = 2;   //a es una var de tipo prim qeu contiene
		             // el valor 2
		
		//booleanos
		boolean activo = true; //false
		
		
		//caracter
		char letra = 'a';
		char l = '\u03A6'; //16 bits
		
		System.out.println("letra es "+ l);
		
		char letraA = 56;
		
		
		System.out.println("letra es "+ letraA);
		
		//enteros  byte, short , int , long
		//  8, 16, 32 y 64 bits
		
		byte numByte = 2; // -128 ... 0 ... 127 bytes
		byte numByte2 =  (byte) 128;
		
		System.out.println(numByte2);
		
		int numInt = numByte;
		
		int numInt2 = 444499999;
		
		long numLong = 2l;//2L
		
		//clase wrapper / clase emboltorio
		Integer nn = 1;
		Integer n3 = new Integer(1);
		Long ll = 2l;
		
		//decimal  -  float -  double
		//             32   y   64 bits
		
		double d = 3.0; // 3.0 literal de tipo double
		double d2 = 3.0d; //D
		
		
		float f = (float)d;
		
		float f2 = 3.0f;// 3.0F
		
		float f3 = 0;  //int cabe en un float 
		
		

	}//fin main
	

}
