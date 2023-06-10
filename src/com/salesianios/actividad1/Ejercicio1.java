package com.salesianios.actividad1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        FileWriter fw = new FileWriter("src/com/salesianios/ficheros/ejercicio1.txt");
        String frase = "";
        final int MINIMO_CARACTERES = 30;

        while (frase.length() < 30) {
            System.out.println("Introduzca su frase");
            frase = sc.nextLine();
            if (frase.length() < 30) {
                System.out.println("Faltan " + (MINIMO_CARACTERES - frase.length()) + " caracteres");
            }
        }

        String fraseMayus = frase.toUpperCase().replace(" ", "_");
        fw.write(fraseMayus);

        fw.close();
    }
}
