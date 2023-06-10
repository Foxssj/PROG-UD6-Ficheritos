package com.salesianios.actividad4;

import com.salesianios.actividad4.mesa.Guardado;
import com.salesianios.actividad4.mesa.Mesa;

import java.io.IOException;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Guardado guardado = new Guardado();
        Mesa mesita;
        boolean salir = false;
        String opcion = "";

        while (!salir) {
            System.out.println("Elija una opcion.\n1.Añadir una mesa.\n2.Ver todas las mesas.\nQ. salir.");
            opcion = sc.nextLine();
            switch (opcion) {
                case "1":
                    System.out.println("Cuantas patas tiene su mesa?");
                    int patas = sc.nextInt();
                    sc.nextLine();
                    System.out.println("De que color es su mesa?");
                    String color = sc.nextLine();
                    mesita = new Mesa(patas, color);
                    guardado.AnadirMesa(mesita.toString());
                    break;
                case "2":
                    guardado.VerMesas();
                    break;
                case "Q":
                case "q":
                    salir = true;
            }
        }



    }

}
