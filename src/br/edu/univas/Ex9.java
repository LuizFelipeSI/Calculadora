package br.edu.univas;

import java.util.Scanner;

public class Ex9 {

    public static void main (String []args) {

        Scanner scan = new Scanner(System.in);
        int[] numeros = new int[5];
        int[] numeros2 = new int[5];
        int contador = 0;

        System.out.println("digite 5 números:");
        for (int i = 0; i < 5; i++) {
            numeros[i] = scan.nextInt();
        }
        System.out.println("digite 5 números:");
        for (int i = 0; i < 5; i++) {
            numeros2[i] = scan.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (numeros[i] == numeros2[j]) {
                    break;
                } else {
                    if (j == 4 && numeros[i] != numeros2[j]) {
                        System.out.println(numeros[i]);
                        contador++;
                    }
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (numeros2[i] == numeros[j]) {
                    break;
                } else {
                    if (j == 4 && numeros2[i] != numeros[j]) {
                        System.out.println(numeros2[i]);
                        contador++;
                    }
                }
            }
        }
        System.out.println("total de números:");
        System.out.println(contador);
    }
}



