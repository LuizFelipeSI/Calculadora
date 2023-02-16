package br.edu.univas;

import java.util.Scanner;

public class Ex1 {

    public static void main(String []args) {
        
        Scanner scan = new Scanner(System.in);

        int numero;
        float resultado = 0;

        while (true) {

            System.out.println("-------------------------");
            System.out.println("ESCOLHA UMA OPÇÃO:");
            System.out.println("1 - adição");
            System.out.println("2 - subtração");
            System.out.println("3 - multiplicação");
            System.out.println("4 - divisão");
            System.out.println("outro número - sair");
            System.out.println("-------------------------");

            int opcao = scan.nextInt();

            if (opcao < 1 || opcao > 4) {
                break;

            }else {
                System.out.println("digite quantos números quer usar na operação:");
                numero = scan.nextInt();
                System.out.println("digite os números");

                for (int i = 0; i < numero; i++) {

                    float a = scan.nextFloat();
                    if (opcao == 1) {
                        resultado = adicao(resultado, a);
                    } else if (opcao == 2) {
                        resultado = subtracao(resultado, a);
                    } else if (opcao == 3) {
                        if (resultado == 0) {
                            resultado = multiplicacao(1, a);
                        } else {
                            resultado = multiplicacao(resultado, a);
                        }
                    } else {
                        if (resultado == 0) {
                            resultado = divisao(a*a, a);
                        } else {
                            resultado = divisao(resultado, a);
                        }
                    }
                }
            }
            resultado = 0;
        }
    }

    
    public static float adicao(float a, float b) {
        float resultado = a+b;
        System.out.println(resultado);
        
        return resultado;
    }

    public static float subtracao(float a, float b) {
        float resultado = a-b;
        System.out.println(resultado);

        return resultado;
    }

    public static float multiplicacao(float a, float b) {
        float resultado = a*b;
        System.out.println(resultado);

        return resultado;
    }

    public static float divisao(float a, float b) {
        float resultado = a/b;
        System.out.println(resultado);

        return resultado;
    }
}
