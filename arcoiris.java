package com.ejerciciosColores;

import java.util.Random;
import java.util.Scanner;

public class arcoiris {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Escribeme algo:  ");
		String frase = sc.nextLine();
		String fraseNueva = "";
				
		for (int i = 0; i < frase.length(); i++) {
			String letraFormateada = formato(frase.split("")[i]);
			fraseNueva += letraFormateada;
		}
		System.out.println("\n" + fraseNueva);
	}
	public static String formato(String letra) {
		int indice = random(ANSIColors.listaFormatos.size());
		return ANSIColors.listaFormatos.get(indice) + letra;
	}
	
	public static int random(int num) {
		Random rn = new Random();
		return rn.nextInt(num);
	}
	
}