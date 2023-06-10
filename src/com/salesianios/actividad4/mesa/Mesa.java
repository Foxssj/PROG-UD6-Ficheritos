package com.salesianios.actividad4.mesa;

public class Mesa {
    int numPatas;
    String color;

    public Mesa(int numPatas, String color) {
        this.numPatas = numPatas;
        this.color = color;
    }

    @Override
    public String toString() {
        return ("La mesa es de color " + color + " y tiene " + numPatas + " patas");
    }
}
