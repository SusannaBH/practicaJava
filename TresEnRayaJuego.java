package com.tresEnRaya;

import java.util.Scanner;

public class TresEnRayaJuego {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		TresEnRaya juego = new TresEnRaya();

		System.out.println("------ TRES EN RAYA ------\n");
		System.out.println("Seleccione el modo de juego:");
		System.out.println("1. Humano contra Humano");
		System.out.println("2. CPU contra Humano (CPU juega como 'O')");
		System.out.println("3. CPU contra CPU");

		int modoJuego = scanner.nextInt();

		while (true) {
			juego.imprimirTablero();
			System.out.println("El jugador que inicia es: " + juego.obtenerJugadorActual());

			if (modoJuego == 1) {
				// Humano vs Humano
				System.out.println("Ingrese las coordenadas (fila y columna) para colocar la pieza");
				System.out.print("Fila: ");
				int fila = scanner.nextInt() - 1;
				System.out.print("Columna: ");
				int columna = scanner.nextInt() - 1;

				if (juego.realizarJugada(fila, columna)) {
					if (juego.hayGanador()) {
						juego.imprimirTablero();
						System.out.println("¡Jugador " + juego.obtenerJugadorActual() + " ha ganado!");
						break;
					} else {
						juego.cambiarJugador();
					}
				} else {
					System.out.println("¡Posición inválida! Inténtelo de nuevo.");
				}
			} else if (modoJuego == 2) {
				// Jugada Humano vs CPU
				if (juego.obtenerJugadorActual() == 'X') {
					System.out.println("Ingrese las coordenadas (fila y columna) para colocar la pieza");
					System.out.print("Fila: ");
					int fila = scanner.nextInt() - 1;
					System.out.print("Columna: ");
					int columna = scanner.nextInt() - 1;

					if (juego.realizarJugada(fila, columna)) {
						if (juego.hayGanador()) {
							juego.imprimirTablero();
							System.out.println("¡Jugador " + juego.obtenerJugadorActual() + " ha ganado!");
							break;
						} else {
							juego.cambiarJugador();
						}
					} else {
						System.out.println("¡Posición inválida! Inténtelo de nuevo.");
					}
				} else {
					// Jugada CPU
					juego.realizarJugadaCPU();
					if (juego.hayGanador()) {
						juego.imprimirTablero();
						System.out.println("¡Jugador " + juego.obtenerJugadorActual() + " ha ganado!");
						break;
					} else {
						juego.cambiarJugador();
					}
				}
			} else if (modoJuego == 3) {
				// CPU vs CPU
				juego.realizarJugadaCPU();
				if (juego.hayGanador()) {
					juego.imprimirTablero();
					System.out.println("¡Jugador " + juego.obtenerJugadorActual() + " ha ganado!");
					break;
				} else {
					juego.cambiarJugador();
				}
			}
		}

		scanner.close();
	}
}