package com.tresEnRaya;

import java.util.Random;

class TresEnRaya {
	private char[][] tablero;
	private char jugadorActual;

	public TresEnRaya() {
		tablero = new char[3][3];
		jugadorActual = 'X';

		// Inicializar el tablero
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				tablero[i][j] = ' ';
			}
		}
	}

	public void imprimirTablero() {
		System.out.println("  | 1 | 2 | 3 |");
		for (int i = 0; i < 3; i++) {
			System.out.print(i + 1 + " |");
			for (int j = 0; j < 3; j++) {
				System.out.print(" " + tablero[i][j] + " |");
			}
			System.out.println();
		}
	}

	public boolean realizarJugada(int fila, int columna) {
		if (fila < 0 || fila >= 3 || columna < 0 || columna >= 3 || tablero[fila][columna] != ' ') {
			return false;
		}

		tablero[fila][columna] = jugadorActual;
		return true;
	}

	public boolean hayGanador() {
		// Verificar filas y columnas
		for (int i = 0; i < 3; i++) {
			if (tablero[i][0] == jugadorActual && tablero[i][1] == jugadorActual && tablero[i][2] == jugadorActual) {
				return true; // Ganador en una fila
			}
			if (tablero[0][i] == jugadorActual && tablero[1][i] == jugadorActual && tablero[2][i] == jugadorActual) {
				return true; // Ganador en una columna
			}
		}

		// Verificar diagonales
		if (tablero[0][0] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][2] == jugadorActual) {
			return true; // Ganador en la diagonal principal
		}
		if (tablero[0][2] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][0] == jugadorActual) {
			return true; // Ganador en la diagonal inversa
		}

		return false;
	}

	public void cambiarJugador() {
		jugadorActual = (jugadorActual == 'X') ? 'O' : 'X';
	}

	public char obtenerJugadorActual() {
		return jugadorActual;
	}
	
    public void realizarJugadaCPU() {
        Random rand = new Random();
        int fila, columna;

        do {
            fila = rand.nextInt(3);
            columna = rand.nextInt(3);
        } while (!realizarJugada(fila, columna));
    }
}
