package Programas;
import java.util.Scanner;
public class Programa1 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int negativos = 0;
        int positivos = 0;
        int multiplosDe15 = 0;
        int acumuladoPares = 0;
        
        // Cargar 10 valores enteros
        for (int i = 1; i <= 5; i++) {
            System.out.print("Ingrese el numero " + i + ": ");
            int numero = scanner.nextInt();
            // a) Contar valores negativos
            if (numero < 0) {
                negativos++;
            }
            // b) Contar valores positivos
            if (numero > 0) {
                positivos++;
            }
            // c) Contar múltiplos de 15
            if (numero % 15 == 0) {
                multiplosDe15++;
            }
            // d) Acumular valores pares
            if (numero % 2 == 0) {
                acumuladoPares += numero;
            }
        }
        // Mostrar resultados
        System.out.println("Cantidad de valores negativos: " + negativos);
        System.out.println("Cantidad de valores positivos: " + positivos);
        System.out.println("Cantidad de multiplos de 15: " + multiplosDe15);
        System.out.println("Suma acumulada de numeros pares: " + acumuladoPares);
    }
}