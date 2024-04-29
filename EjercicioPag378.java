package com.ejercicios;

import java.util.Scanner;

public class EjercicioPag378 {
	//VARIABLE GLOBAL
	static int a1 = 0;
	static int a2 = 1;
	static int a3 = 0;
	static int indice = 0;
	
	public static void main(String[] args) {
		
		/*Recorre el array tecnologies de forma recursiva*/
		String [] tecnologies = {"Markdown", "Regexp", "HTML", "CSS", "JS", "SQL", "Java"};
		recorrer(tecnologies, 0);
		
		System.out.println();
		
		/*Recorre el array anterior hasta llegar a HTML*/
		recorrerHastaX(tecnologies, 0, "HTML");
		
		/*Fibonnacci de forma recursiva hasta que un numero pasado por parametro
		  dentro de la funcion recursiva superer el siguiente numero recursivo
		  SERIE FIBONACCI: 1 1 2 3 5 8 13 21 34 55*/
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\n\nIntroduce un número: ");
		int num = sc.nextInt();
		fibonacci(num);
		
		/*Invierte la palabra "supercalifragilisticoespialidoso" mediante una función recursiva*/
		String palabraLarga = "supercalifragilisticoespialidoso";
		invertirPalabra(palabraLarga);
	}
	
	public static void recorrer(String[]array ,int i) {
		if(i == array.length) {
			return;
		}
		System.out.print(array[i] + " - ");
		recorrer(array, i+1);
	}
	public static void recorrerHastaX(String[]array ,int i, String elemento) {
		System.out.print(array[i] + " - ");
		
		if(array[i] == elemento) {
			return;
		}
		
		recorrerHastaX(array, i+1, elemento);
	}
	public static void fibonacci(int max) {
		if(a3 == max) {
			return;
		}
		a1 = a2;
		a2 = a3;
		a3 = a1 + a2;
		System.out.println(a3);
		fibonacci(max);
	}
	public static void invertirPalabra(String palabraLarga) {
		if(indice >= palabraLarga.length()) {
			return;
		}
		invertirPalabra(palabraLarga.substring(1));
        System.out.print(palabraLarga.charAt(0));
	}
}
