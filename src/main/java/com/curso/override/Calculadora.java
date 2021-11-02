package com.curso.override;

public class Calculadora {
	public int suma(int n1, int n2) {
		return n1 + n2;
	}
	
	//sobrecargar
	public int suma(long n1) {
		return (int) (n1 + n1);
	}
	
	public static void main(String[] args) {
		CalculadoraMarciana c = new CalculadoraMarciana();
	}
	
}

class CalculadoraMarciana extends Calculadora{
	
	//sobreescribiendo
	@Override
	public int suma(int n1) {
		return 2;
	}
}


