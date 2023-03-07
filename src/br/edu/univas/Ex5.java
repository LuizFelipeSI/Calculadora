package br.edu.univas;

public class Ex5 {

    public static void main (String []args) {

        int quantidadeNumeros = 100;
        int[] numeros = new int[quantidadeNumeros];
        System.out.println("números primos de 1 até 100:");

        for (int i = 0; i < quantidadeNumeros; i++) {
            numeros[i] = i+1;
        }
        for (int i = 1; i < quantidadeNumeros; i++) {
            for (int j = 1; j <= i; j++) {
                if (numeros[i] == numeros[j]) {
                    System.out.println(numeros[i]);
                } else if (numeros[i] % numeros[j] == 0) {
                    break;
                }
            }
        }
    }
}
