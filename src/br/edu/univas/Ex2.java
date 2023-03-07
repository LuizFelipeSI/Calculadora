package br.edu.univas;

import java.util.Scanner;

public class Ex2 {

    public static void main (String []args) {

        Scanner scan = new Scanner(System.in);

        int quantidadeNumeros = 5;
        float somaNumeros = 0;
        float mediaNumeros;
        int[] numeros = new int[quantidadeNumeros];

        System.out.println("digite os números");
        for (int i = 0; i < quantidadeNumeros; i++) {
            numeros[i] = scan.nextInt();
        }
        for (int i = 0; i < quantidadeNumeros; i++) {
            somaNumeros += numeros[i];
        }
        mediaNumeros = somaNumeros / quantidadeNumeros;
        System.out.println(mediaNumeros);
    }
}
