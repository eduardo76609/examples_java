package com.lineadecodigo.java.basico;

/**
 * @file NumeroPar.java
 * @version 1.0
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   18/diciembre/2006
 * @url  http://lineadecodigo.com/java/numeros-pares-en-java/
 * @description C�digo que nos ayuda a saber si un n�mero es par con Java
 */

public class NumeroPar {

	static boolean esPar(int numero){
	    if (numero%2==0) return true; else return false;
	}

	public static void main(String[] args) {

		if (esPar(4) )
		    System.out.println("El numero es par");
		else
		    System.out.println("El n�mero es impar");

		if (!esPar(5))
		    System.out.println("El n�mero es impar");

	}

}
