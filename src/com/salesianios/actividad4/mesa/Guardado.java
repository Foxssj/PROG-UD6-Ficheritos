package com.salesianios.actividad4.mesa;

import java.io.*;


public class Guardado {
    public Guardado() {
    }

    public void AnadirMesa(String obj) throws IOException {
        boolean noActualizar = true;
        BufferedWriter bw = new BufferedWriter(
                new FileWriter("src/com/salesianios/ficheros/ejercicio4.txt" , noActualizar));

        bw.write(obj);
        bw.newLine();
        bw.close();
    }

    public void VerMesas() throws IOException {
        BufferedReader br = new BufferedReader(
                new FileReader("src/com/salesianios/ficheros/ejercicio4.txt"));

        String mesa;
        mesa = br.readLine();

        while (mesa != null) {
            System.out.println(mesa);

            mesa = br.readLine();
        }



    }

}
