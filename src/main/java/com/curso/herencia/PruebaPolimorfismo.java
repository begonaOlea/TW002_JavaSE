package com.curso.herencia;


public class PruebaPolimorfismo {
	
	public static void main(String[] args) {
		
		Empleado e = new Gerente();
	
		gestiona(new Ingeniero());
		
	}
	
	public static void gestiona(Empleado e) {
		e.getDetalles();
	}
	
	public static void generarNominasEmpresa(Empleado[] lista) {

		for(Empleado e : lista) {
			System.out.println(". " + e.nombre + " - "
					+ " salario " + e.calculaNomina());
		}
	}

}
