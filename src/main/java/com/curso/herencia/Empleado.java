package com.curso.herencia;
import java.util.Date;

public class Empleado {
	
	public static final double SALARIO_BASE = 13000.0;

	//ATRIBUTOS
	protected String nombre;
	protected double salario;
	protected Date fechaNacimiento;
	
	//CONSTRUCTORES
	
	public Empleado(String nombre, double salario, Date fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.salario = salario;
		this.fechaNacimiento = fechaNacimiento;
	}

	public Empleado(String nombre, double salario) {
		this(nombre,salario,null);
	}

	public Empleado(String nombre, Date fechaNacimiento) {
		this(nombre,SALARIO_BASE,fechaNacimiento);
	}


	//METODOS
	
	public String getDetalles() {
		return "nombre " + this.nombre + "- salario " + salario 
				+"- f nac " + fechaNacimiento;				
	}
	
	public double calculaNomina() {
		return salario / 12;
	}
}

class Gerente extends Empleado{
	public String departamento;
	
	
	//CONSTRUCTOR
	public Gerente(String nombre, double salario, String dep) {
		super(nombre,salario);
		this.departamento = dep;
		System.out.println("..... constructo de Gerente" );
	}
	
	public Gerente(String nombre, String dep) {
		this(nombre,Empleado.SALARIO_BASE,dep);
	}
	 
	
	@Override
	public String getDetalles() {
		
		return super.getDetalles() + " - depart " + departamento;
	}
	
	public void mandar() {
		System.out.println("mando mucho");
	}
}


class Director extends Gerente{
	public double vehiculoEmpresa;
	
	public void aumentarComision() {
		System.out.println("... aumento comision");
	}
	
	@Override
	public double calculaNomina() {
		
		return salario / 10 + 3000;
	}
}
class Ingeniero extends Empleado{}
class Secretario extends Empleado{}


