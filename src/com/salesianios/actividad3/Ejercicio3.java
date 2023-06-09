package com.salesianios.actividad3;

import java.io.*;

public class Ejercicio3 {
    public static void main(String[] args) throws IOException {
        BufferedReader ej1 = new BufferedReader(
                new FileReader("src/com/salesianios/ficheros/ejercicio1.txt"));
        BufferedReader ej2 = new BufferedReader(
                new FileReader("src/com/salesianios/ficheros/ejercicio2.txt"));
        FileWriter fw = new FileWriter("src/com/salesianios/ficheros/ejercicio3.txt");
        File archivo;

        try {
            archivo = new File("src/com/salesianios/ficheros/ejercicio3.txt");

            if (archivo.createNewFile()) {
                System.out.println("se ha creado");
            }

        } catch (Throwable e){}

        fw.write("- Contenido del Fichero Uno: " + ej1.readLine() + "\n");
        fw.write("- Contenido del Fichero Uno: " + ej2.readLine() + "\n");



        fw.close();
        ej1.close();
        ej2.close();
    }
}
