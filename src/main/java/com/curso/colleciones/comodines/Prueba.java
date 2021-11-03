package com.curso.colleciones.comodines;

import java.util.*;

public class Prueba {

	public static void main(String[] args) {
		ArrayList<Cuenta> lista = new ArrayList<Cuenta>();
		lista.add(new CuentaAhorro());
		lista.add(new CuentaCorriente());
		
		
		ArrayList<CuentaAhorro> lista2 = new ArrayList<CuentaAhorro>();
		lista.add(new CuentaAhorro());
		lista.add(new CuentaAhorro());
		
		hazAlgo(lista);
		hazAlgo(lista2);
		
		hazAlgo2(lista);
		hazAlgo2(lista2);
	}
	
	
	public static void  hazAlgo(List<Cuenta> lista) {
		for(Cuenta c: lista) {
			System.out.println(c);
		}
	}
	
	public static void hazAlgo2(List<? extends Cuenta> lista) {
		for(Cuenta c: lista) {
			System.out.println(c);
		}
	}
	
	
	
	
}
