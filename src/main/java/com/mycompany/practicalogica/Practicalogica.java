package com.mycompany.practicalogica;

import java.util.HashMap;
import java.util.Scanner;

public class Practicalogica {

    // Define letter values as a class constant
    private static final HashMap<Character, Integer> valoresLetras = new HashMap<>();
    static {
        // Initialize letter values
        valoresLetras.put('A', 1);
        valoresLetras.put('E', 1);
        valoresLetras.put('I', 1);
        valoresLetras.put('O', 1);
        valoresLetras.put('U', 1);
        valoresLetras.put('L', 1);
        valoresLetras.put('N', 1);
        valoresLetras.put('R', 1);
        valoresLetras.put('S', 1);
        valoresLetras.put('T', 1);
        valoresLetras.put('D', 2);
        valoresLetras.put('G', 2);
        valoresLetras.put('B', 3);
        valoresLetras.put('C', 3);
        valoresLetras.put('M', 3);
        valoresLetras.put('P', 3);
        valoresLetras.put('F', 4);
        valoresLetras.put('H', 4);
        valoresLetras.put('V', 4);
        valoresLetras.put('W', 4);
        valoresLetras.put('Y', 4);
        valoresLetras.put('K', 5);
        valoresLetras.put('J', 8);
        valoresLetras.put('X', 8);
        valoresLetras.put('Q', 10);
        valoresLetras.put('Z', 10);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String frase = entrada.nextLine(); // Read a whole line
        
        int puntuacion = calcularPuntuacion(frase);
        System.out.println("La puntuación escalable para la frase '" + frase + "' es: " + puntuacion + " puntos.");
    }

    public static int calcularPuntuacion(String frase) {
        int puntuacion = 0;
        for (char letra : frase.toUpperCase().toCharArray()) {
            // Check if the character is a letter and exists in the map
            if (Character.isLetter(letra) && valoresLetras.containsKey(letra)) {
                puntuacion += valoresLetras.get(letra);
            }
            // You may consider adding a case for handling non-letter characters
        }
        return puntuacion;
    }
}