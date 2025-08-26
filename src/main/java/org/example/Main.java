package org.example;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.addNumero(1);
        manager.addNumero(2);
        manager.addNumero(3);

        manager.imprimirSuma(); // Imprime: La suma de los números es: 6
    }
}