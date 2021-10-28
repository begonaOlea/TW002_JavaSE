package com.curso.herencia;

import java.util.Date;

public class PruebaHerencia {
	
	public static void main(String[] args) {
		
		Empleado e = new Empleado();
		e.nombre = "Luis";
		e.salario = 3000.0;
		e.fechaNacimiento = new Date();
	
		System.out.println(e.getDetalles());
		
		
		Gerente g = new Gerente();
		g.nombre = "Maria";
		g.salario = 4000.0;
		g.fechaNacimiento = new Date();
		g.departamento = "Desarrollo";
	
		System.out.println(g.getDetalles());
		
		
		
	}

}
