package com.curso.excepciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PruebaExcepciones {
	
	public static void main(String[] args) {
		
		
		//Excepcion chequed
		
		File fichero = new File("carta.txt");
		
		try {
			fichero.createNewFile(); //throw new IOException("...")
			//ok lo ha creado 
		}catch (FileNotFoundException e) { 
			System.out.println("..... fichero no encontrado");
		}catch (IOException e) {
			//falla - aviso al usuario o plan b
			e.printStackTrace();
			System.out.println("error " + e.getMessage());
			System.out.println("No se pudo crear el fichero");
			return;
		}catch(Exception e) {
			System.out.println("fallo algo " + e.getMessage());
		}finally {
			System.out.println("se ejecuta siempre // ocurra o no el error"
					+ "aunque haga un return  o throw n");
		}
		
		
		//Excepciones no checked
		
		String s = null;
		//s = s.toUpperCase();  // NullPointerException
		
		String numero = "22a";
		
		int n = Integer.parseInt(numero); //NumberFormatException
		
		System.out.println(n);
		
		
		
		try {
			File fichero2 = new File("carta.txt");
			fichero2.createNewFile();
			
			Connection con = null;
			con.commit();
			
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println("error inesperado");
		}
		
		
//		try {
//			File fichero2 = new File("carta.txt");
//			fichero2.createNewFile();
//			
//			Connection con = null;
//			con.commit();
//
//			
//		}catch(IOException | SQLException ex) {
//			System.out.println(ex.getMessage());
//		}catch(Exception e) {
//			System.out.println("error inesperado");
//		}
//		

		
		//java.sql.Connection
		
		Connection con =null;
		try {
			con = DriverManager.getConnection("");
			con.commit();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally {
			try {
				if(con != null && ! con.isClosed()) {
				
					con.close();
				
			}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	    try(Connection c2 = DriverManager.getConnection("")){
	    	c2.commit();
	    } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		   
		
	}

}
