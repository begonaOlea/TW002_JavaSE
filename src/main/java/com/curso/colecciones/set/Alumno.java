package com.curso.colecciones.set;

import java.util.Objects;

public class Alumno implements Comparable<Alumno> {
	
	private int id;
	private String nombre;
	
	public Alumno(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Alumno [id=" + id + ", nombre=" + nombre + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return id == other.id;
	}

	/*
	 *  devuelve 0 si son iguales
	 *    numero positivo si es mayor this de o
	 *    numero negativo si es menor
	 */
	@Override
	public int compareTo(Alumno o) {
		
		return this.id - o.id;
	}

	
}
