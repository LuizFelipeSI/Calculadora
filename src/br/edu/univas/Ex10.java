package br.edu.univas;

import java.util.Scanner;

public class Ex10 {

    public static void main (String []args) {

        Scanner scan = new Scanner(System.in);
        int[] numeros = new int[5];
        int[] numeros2 = new int[5];
        int[] numerosNovos = new int[10];
        int contador = 0;
        boolean seHaZero = false;

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
                        contador++;
                        numerosNovos[contador-1] = numeros[i];
                        if (numeros[i] == 0) {
                            seHaZero = true;
                        }
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
                        contador++;
                        numerosNovos[contador-1] = numeros2[i];
                        if (numeros2[i] == 0) {
                            seHaZero = true;
                        }
                    }
                }
            }
        }
        int aux;
        for (int i = 0; i < 10; i++) {
            for (int j = 9; j >= 0; j--) {
                if (numerosNovos[i] > numerosNovos[j]) {
                    aux = numerosNovos[j];
                    numerosNovos[j] = numerosNovos[i];
                    numerosNovos[i] = aux;

                }
            }
        }
        if (seHaZero) {
            System.out.println(0);
        }
        for (int i = 0; i < 10; i++) {
            if (numerosNovos[i] != 0) {
                System.out.println(numerosNovos[i]);
            }
        }
        System.out.println("total de números:");
        System.out.println(contador);
    }
}





