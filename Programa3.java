package Programas;
import java.util.Scanner;
public class Programa3 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mes = 0;
        // Repetir hasta que se introduzca un número válido (entre 1 y 12)
        for (;;) {
            System.out.print("Ingrese un numero para el mes (1-12): ");
            mes = scanner.nextInt();
            // Comprobar que el número está entre 1 y 12
            if (mes >= 1 && mes <= 12) {
                break; // Salir del bucle si el número es válido
            } else {
                System.out.println("Numero invalido. Por favor, ingrese un numero entre 1 y 12.");
            }
        }
        // Determinar el número de días y nombre del mes
        String nombreMes = "";
        int dias = 0;
        switch (mes) {
            case 1:
                nombreMes = "Enero";
                dias = 31;
                break;
            case 2:
                nombreMes = "Febrero";
                dias = 28;
                break;
            case 3:
                nombreMes = "Marzo";
                dias = 31;
                break;
            case 4:
                nombreMes = "Abril";
                dias = 30;
                break;
            case 5:
                nombreMes = "Mayo";
                dias = 31;
                break;
            case 6:
                nombreMes = "Junio";
                dias = 30;
                break;
            case 7:
                nombreMes = "Julio";
                dias = 31;
                break;
            case 8:
                nombreMes = "Agosto";
                dias = 31;
                break;
            case 9:
                nombreMes = "Septiembre";
                dias = 30;
                break;
            case 10:
                nombreMes = "Octubre";
                dias = 31;
                break;
            case 11:
                nombreMes = "Noviembre";
                dias = 30;
                break;
            case 12:
                nombreMes = "Diciembre";
                dias = 31;
                break;
        }
        // Mostrar el resultado
        System.out.println("El mes de " + nombreMes + " tiene " + dias + " dias.");
    }
}
