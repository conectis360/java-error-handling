package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        ListOfNumbers listOfNumbers = new ListOfNumbers();

        System.out.println(listOfNumbers);
        listOfNumbers.writeList();
}

    public static void scanNumber() {
        System.out.println("Olá, seja bem-vindo ao teste de Error Handling");

        System.out.println("Digite um numero.");

        Scanner scan = new Scanner(System.in);

        String valor = scan.nextLine();
        try {
            if (Integer.parseInt(valor) == 0 || Integer.parseInt(valor) < 0) {
                throw new Exception("O valor digitado não é válido");
            }

            System.out.println("O numero digitado: " + Integer.parseInt(valor));
        } catch (NumberFormatException numberFormatException) {
            throw new NumberFormatException("Não é possível converter o valor digitado para Integer.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}