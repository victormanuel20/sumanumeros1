package org.example;

import java.util.ArrayList;

public class Manager {
    private list<Integer> numeros;

    public Manager() {
        this.numeros = new ArrayList<>();
    }
    public void addNumero(Int numero) {
        this.numeros.add(numero);
    }

    public int sumarNumeros() {
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        return suma;
    }


}