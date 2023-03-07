package br.edu.univas;

import java.util.Scanner;

public class Ex7 {

    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] numeros = new int[10];
        int menor = 0;
        int maior = 0;

        System.out.println("digite 10 números:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = scan.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            if (i == 0) {
                menor = numeros[i];
                maior = numeros[i];
            } else if (numeros[i] < menor) {
                menor = numeros[i];
            } else if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        System.out.println("menor número:" + menor);
        System.out.println("maior número:" + maior);
    }
}

