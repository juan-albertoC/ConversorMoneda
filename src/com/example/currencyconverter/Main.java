package com.example.currencyconverter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CurrencyConverter converter = new CurrencyConverter();

        System.out.println("Bienvenido al conversor de monedas");
        while (true) {
            System.out.println("Seleccione la moneda base (ejemplo: USD, ARS, BOB): ");
            String baseCurrency = scanner.next().toUpperCase();

            System.out.println("Seleccione la moneda objetivo (ejemplo: USD, ARS, BOB): ");
            String targetCurrency = scanner.next().toUpperCase();

            System.out.println("Ingrese la cantidad a convertir: ");
            double amount = scanner.nextDouble();

            double result = converter.convert(baseCurrency, targetCurrency, amount);
            System.out.printf("Resultado: %.2f %s\n", result, targetCurrency);

            System.out.println("¿Desea realizar otra conversión? (s/n): ");
            String continueConversion = scanner.next().toLowerCase();
            if (!continueConversion.equals("s")) {
                break;
            }
        }

        scanner.close();
    }
}