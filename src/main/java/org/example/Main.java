package org.example; // Asegúrate de que el paquete corresponda a tu estructura.

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("==================================================");
            System.out.println("Seleccione una opción:");
            System.out.println("1. Dólar => Peso Argentino");
            System.out.println("2. Peso Argentino => Dólar");
            System.out.println("3. Dólar => Real Brasileño");
            System.out.println("4. Real Brasileño => Dólar");
            System.out.println("5. Dólar => Peso Colombiano");
            System.out.println("6. Peso Colombiano => Dólar");
            System.out.println("7. Salir");
            System.out.println("==================================================");
            System.out.print("Opción: ");
            byte opcion = scanner.nextByte();

            if (opcion == 7) {
                System.out.println("Saliendo del programa...");
                continuar = false;
                continue;
            }

            System.out.print("Ingrese la cantidad a convertir: ");
            double cantidad = scanner.nextDouble();

            try {
                ExchangeRate.converter(opcion, cantidad);
            } catch (IOException | InterruptedException e) {
                System.out.println("Ocurrió un error al realizar la conversión: " + e.getMessage());
            }
        }

        scanner.close();
    }
}
