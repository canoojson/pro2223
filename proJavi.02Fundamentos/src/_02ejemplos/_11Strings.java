package _02ejemplos;

import java.util.Scanner;

public class _11Strings {
	public static void main(String[] args) {
		//Permite guardar textos entrecomillados
		String nombre = "Javi";
		String apellido = "Garcia";
		
		//Podemos concatenar y asignar a otra variable
		String nombreCompleto = nombre + " " + apellido;
		System.out.println("Mi nombre es : " + nombreCompleto);
		
		//Leer un texto por teclado
		Scanner tec = new Scanner(System.in);
		System.out.println("Domicilio: ");
		String domicilio = tec.nextLine(); 
		
		System.out.println("Poblacion: ");
		String poblacion = tec.next(); //Solo lee la primera palabra
		//aunque el usuario escriba varias
		
		System.out.println(domicilio);
		System.out.println(poblacion);
		
		
		
	}
}
