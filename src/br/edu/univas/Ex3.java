package br.edu.univas;

import java.util.Scanner;

public class Ex3 {

    public static void main (String []args) {

        Scanner scan = new Scanner(System.in);

        int quantidadeNumeros = 5;
        float somaNumeros = 0;
        int[] numeros = new int[quantidadeNumeros];

        System.out.println("digite os números");
        for (int i = 0; i < quantidadeNumeros; i++) {
            numeros[i] = scan.nextInt();
        }
        for (int i = 0; i < quantidadeNumeros; i++) {
            somaNumeros += numeros[i];
        }
        System.out.println(somaNumeros);
    }
}
