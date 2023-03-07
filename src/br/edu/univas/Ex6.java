package br.edu.univas;

import java.util.Scanner;

public class Ex6 {

    public static void main (String []args) {

        Scanner scan = new Scanner(System.in);
        int[] numeros = new int[10];
        int pares = 0;
        int impares = 0;

        System.out.println("digite 10 números:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = scan.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            if (numeros[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println("pares:" + pares);
        System.out.println("ímpares:" + impares);
    }
}

