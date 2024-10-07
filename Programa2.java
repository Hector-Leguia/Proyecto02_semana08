package Programas;

import java.util.Scanner;

public class Programa2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double ahorroTotal = 0; // Acumulador del ahorro anual

        // Recorrer cada uno de los 12 meses
        for (int mes = 1; mes <= 6; mes++) {
            System.out.print("Ingrese la cantidad a depositar para el mes " + mes + ": ");
            double deposito = scanner.nextDouble();
            
            // Acumular el depósito al total ahorrado
            ahorroTotal += deposito;
            
            // Mostrar cuánto se ha ahorrado hasta el mes actual
            System.out.println("Total ahorrado hasta el mes " + mes + ": " + ahorroTotal);
        }

        // Mostrar el total ahorrado al final del año
        System.out.println("El total ahorrado al final del año es: " + ahorroTotal);
    }
}    

