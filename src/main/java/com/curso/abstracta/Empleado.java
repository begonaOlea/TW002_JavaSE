package com.curso.abstracta;

public abstract class Empleado {
	
	private String nombre;

	public Empleado(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	 public String getNombre() {
		return nombre;
	}
    public void setNombre(String nombre) {
		this.nombre = nombre;
	}
    
    
    public  abstract void trabajar();

    public static void main(String[] args) {
		Empleado[] lista =  new Empleado[4]; // servicio.getEmpleados();
		
		for(Empleado e : lista) {
			e.trabajar();
		}
		
		
		
	}
    
}

class Programador extends Empleado{

	public Programador(String nombre) {
		super(nombre);
	}

	@Override
	public void trabajar() {
		System.out.println("... programo ");
		
	}
	
}

class Analista extends Empleado{

	public Analista(String nombre) {
		super(nombre);
	}

	@Override
	public void trabajar() {
		System.out.println("... analiza ");
		
	}
	
}










