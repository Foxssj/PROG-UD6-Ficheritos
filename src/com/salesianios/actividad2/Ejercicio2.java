package com.salesianios.actividad2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio2 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("src/com/salesianios/ficheros/ejercicio2.txt");

        int numEjDos;
        while ((numEjDos = fr.read()) != -1) {
            System.out.print((char)numEjDos + "_" + numEjDos + ", ");
        }

    }
}
