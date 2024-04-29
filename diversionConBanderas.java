package com.ejerciciosColores;

import java.util.Iterator;
import java.util.Scanner;

public class diversionConBanderas {
	
	public static void main(String[] args) {
		//Declaramos Scanner
		Scanner sc = new Scanner(System.in);
		
		boolean salida = false;
		
		while(!salida){
		System.out.println("""
							¿Qué bandera quieres que te dibuje?
							
							- Elije una opción numérica -
							1. Ucrania
							2. Grecia
							3. Francia
							4. España
							5. Castilla y León
							6. Alemania
							0. ~SALIDA~
							""");
		int num = Integer.parseInt(sc.next());
		
		switch (num) {
			case 0: {
				System.out.println("ADIUUUUUUS, nos vemos pronto! 😉😊");
				salida = true;
				break;
			}
			case 1: {
				banderaUcraina();
				break;
			}
			case 2: {
				banderaGrecia();
				break;
			}
			case 3: {
				banderaFrancia();
				break;
			}
			case 4: {
				banderaEspaña();
				break;
			}
			case 5: {
				banderaCastilla();
				break;
			}
			case 6: {
				banderaAlemania();
				break;
			}
			default:
				System.out.println("Opción incorrecta");
			}
		
		
		}
		sc.close();
	}
	
	//BANDERAS
	public static void banderaUcraina() {
		String azulClaro = ANSIColors.LIGHT_BLUE_BACKGROUND;
		String amarillo = ANSIColors.YELLOW_BACKGROUND;
		
		System.out.printf(ANSIColors.RESET_TEXT + "\t" + ANSIColors.BOLD + ANSIColors.UNDERLINE + "UCRAINA" + "%n%n");
		System.out.printf(ANSIColors.RESET_TEXT);
		
		for (int i = 1; i <= 4; i++) {
			estructuraBandera(24, true, amarillo);
		}
		for (int i = 1; i <= 4; i++) {
			estructuraBandera(24, true, azulClaro);
		}
		System.out.printf(ANSIColors.RESET_TEXT + "\n");
	}
	public static void banderaGrecia() {
		String azulClaro = ANSIColors.LIGHT_BLUE_BACKGROUND;
		String blanco = ANSIColors.WHITE_BACKGROUND;
		
		System.out.printf(ANSIColors.RESET_TEXT + "\t" + ANSIColors.BOLD + ANSIColors.UNDERLINE + "GRECIA" + "%n%n");
		System.out.printf(ANSIColors.RESET_TEXT);
		
		estructuraBandera(4, false, azulClaro);
		estructuraBandera(3, false, blanco);
		estructuraBandera(20, true, azulClaro);
		estructuraBandera(4, false, azulClaro);
		estructuraBandera(3, false, blanco);
		estructuraBandera(4, false, azulClaro);
		estructuraBandera(16, true, blanco);
		estructuraBandera(11, false, blanco);
		estructuraBandera(16, true, azulClaro);
		estructuraBandera(4, false, azulClaro);
		estructuraBandera(3, false, blanco);
		estructuraBandera(4, false, azulClaro);
		estructuraBandera(16, true, blanco);
		estructuraBandera(4, false, azulClaro);
		estructuraBandera(3, false, blanco);
		estructuraBandera(20, true, azulClaro);
		estructuraBandera(27, true, blanco);
		estructuraBandera(27, true, azulClaro);
		estructuraBandera(27, true, blanco);
		estructuraBandera(27, true, azulClaro);

		System.out.printf(ANSIColors.RESET_TEXT + "\n");
	}
	public static void banderaFrancia() {
		String azulOscuro = ANSIColors.BLUE_BACKGROUND;
		String blanco = ANSIColors.WHITE_BACKGROUND;
		String rojo = ANSIColors.RED_BACKGROUND;
		
		System.out.printf(ANSIColors.RESET_TEXT + "\t" + ANSIColors.BOLD + ANSIColors.UNDERLINE + "FRANCIA" + "%n%n");
		System.out.printf(ANSIColors.RESET_TEXT);
		
		for (int i = 1; i <= 9; i++) {
			estructuraBandera(9, false, azulOscuro);
			estructuraBandera(9, false, blanco);
			estructuraBandera(9, true, rojo);
		}
		
		System.out.printf(ANSIColors.RESET_TEXT + "\n");
	}
	public static void banderaEspaña() {
		String rojo = ANSIColors.RED_BACKGROUND;
		String amarillo = ANSIColors.YELLOW_BACKGROUND;
		
		System.out.printf(ANSIColors.RESET_TEXT + "\t" + ANSIColors.BOLD + ANSIColors.UNDERLINE + "ESPAÑA" + "%n%n");
		System.out.printf(ANSIColors.RESET_TEXT);
		
		for (int i = 1; i <= 2; i++) {
			estructuraBandera(24, true, rojo);
		}
		for (int i = 1; i <= 5; i++) {
			estructuraBandera(24, true, amarillo);
		}
		for (int i = 1; i <= 2; i++) {
			estructuraBandera(24, true, rojo);
		}
		System.out.printf(ANSIColors.RESET_TEXT + "\n");
	}
	public static void banderaCastilla() {
		String rojo = ANSIColors.RED_BACKGROUND;
		String blanco = ANSIColors.WHITE_BACKGROUND;
		
		System.out.printf(ANSIColors.RESET_TEXT + "\t" + ANSIColors.BOLD + ANSIColors.UNDERLINE + "CASTILLA Y LEÓN" + "%n%n");
		System.out.printf(ANSIColors.RESET_TEXT);
		
		for (int i = 1; i <= 4; i++) {
			estructuraBandera(12, false, rojo);
			estructuraBandera(12, true, blanco);
		}
		for (int i = 1; i <= 4; i++) {
			estructuraBandera(12, false, blanco);
			estructuraBandera(12, true, rojo);
		}
		System.out.printf(ANSIColors.RESET_TEXT + "\n");
	}
	public static void banderaAlemania() {
		String rojo = ANSIColors.RED_BACKGROUND;
		String negro = ANSIColors.BLACK_BACKGROUND;
		String amarillo = ANSIColors.YELLOW_BACKGROUND;
		
		System.out.printf(ANSIColors.RESET_TEXT + "\t" + ANSIColors.BOLD + ANSIColors.UNDERLINE + "ALEMANIA" + "%n%n");
		System.out.printf(ANSIColors.RESET_TEXT);
		
		for (int i = 1; i <= 3; i++) {
			estructuraBandera(24, true, negro);
		}
		for (int i = 1; i <= 3; i++) {
			estructuraBandera(24, true, rojo);
		}
		for (int i = 1; i <= 3; i++) {
			estructuraBandera(24, true, amarillo);
		}
		System.out.printf(ANSIColors.RESET_TEXT + "\n");
	}
	
	//ESTRUCTURA BANDERA
	public static void estructuraBandera(int numColumnas, boolean breakpoint, String color) {
		
		for (int i = 1; i <= numColumnas; i++) {
			System.out.printf(color + " ");
		}
		
		if(breakpoint == true) {
			System.out.printf("%n");
		}
	}
}
