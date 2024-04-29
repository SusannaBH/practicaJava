package com.ejerciciosColores;

import java.util.ArrayList;
import java.util.Arrays;

public class ANSIColors {
    // Tipos de texto
    public static final String RESET_TEXT = "\u001B[0m";
    public static final String BOLD = "\u001B[1m";
    public static final String ITALIC = "\u001B[3m";
    public static final String UNDERLINE = "\u001B[4m";

    // Colores de texto
    public static final String BLACK_TEXT = "\u001B[30m";
    public static final String RED_TEXT = "\u001B[31m";
    public static final String GREEN_TEXT = "\u001B[32m";
    public static final String YELLOW_TEXT = "\u001B[33m";
    public static final String BLUE_TEXT = "\u001B[34m";
    public static final String LIGHT_BLUE_TEXT = "\u001B[94m"; // Azul claro
    public static final String WHITE_TEXT = "\u001B[37m";
    public static final String PURPLE_TEXT = "\u001B[35m";
    public static final String CYAN_TEXT = "\u001B[36m";
    public static final String GRAY_TEXT = "\u001B[90m";
    public static final String LIGHT_GRAY_TEXT = "\u001B[37m"; 

    // Colores de fondo
    public static final String BLACK_BACKGROUND = "\u001B[40m";
    public static final String RED_BACKGROUND = "\u001B[41m";
    public static final String GREEN_BACKGROUND = "\u001B[42m";
    public static final String YELLOW_BACKGROUND = "\u001B[43m";
    public static final String BLUE_BACKGROUND = "\u001B[44m";
    public static final String LIGHT_BLUE_BACKGROUND = "\u001B[104m"; // Fondo azul claro
    public static final String WHITE_BACKGROUND = "\u001B[47m";
    public static final String PURPLE_BACKGROUND = "\u001B[45m";
    public static final String CYAN_BACKGROUND = "\u001B[46m";
    public static final String GRAY_BACKGROUND = "\u001B[100m";
    public static final String LIGHT_GRAY_BACKGROUND = "\u001B[47m";
    public static final String RESET_BACKGROUND = "\u001B[49m";
    
    // LISTA DE COLORES
    public static ArrayList<String> listaFormatos = new ArrayList<>(Arrays.asList(
            RESET_TEXT,
            BOLD,
            ITALIC,
            UNDERLINE,
            BLACK_TEXT,
            RED_TEXT,
            GREEN_TEXT,
            YELLOW_TEXT,
            BLUE_TEXT,
            LIGHT_BLUE_TEXT,
            WHITE_TEXT,
            PURPLE_TEXT,
            CYAN_TEXT,
            GRAY_TEXT,
            LIGHT_GRAY_TEXT,
            BLACK_BACKGROUND,
            RED_BACKGROUND,
            GREEN_BACKGROUND,
            YELLOW_BACKGROUND,
            BLUE_BACKGROUND,
            LIGHT_BLUE_BACKGROUND,
            WHITE_BACKGROUND,
            PURPLE_BACKGROUND,
            CYAN_BACKGROUND,
            GRAY_BACKGROUND,
            LIGHT_GRAY_BACKGROUND,
            RESET_BACKGROUND
    ));
}