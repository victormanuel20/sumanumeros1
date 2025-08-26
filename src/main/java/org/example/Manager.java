package org.example;

import java.util.List;
import java.util.ArrayList;

public class Manager {
    private List<Integer> numeros;

    public Manager() {
        this.numeros = new ArrayList<>();
    }

    public void addNumero(int numero) {
        this.numeros.add(numero);
    }

    public int sumarNumeros() {
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        return suma;
    }

    public void imprimirSuma() {
        System.out.println("La suma de los números es: " + sumarNumeros());
    }
}