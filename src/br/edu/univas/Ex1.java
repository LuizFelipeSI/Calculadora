package br.edu.univas;

import java.util.Scanner;

public class Ex1 {

    public static void main(String []args) {
        
        Scanner scan = new Scanner(System.in);

        int n = 0;
        float resultado = 0;

        while (n < 2) {

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
                if (n == 0) {
                    System.out.println("digite dois números");
                    float a = scan.nextFloat();
                    float b = scan.nextFloat();
                    if (opcao == 1) {
                        resultado = adicao(a, b);
                    } else if (opcao == 2) {
                        resultado = subtracao(a, b);
                    } else if (opcao == 3) {
                        resultado = multiplicacao(a, b);
                    } else {
                        resultado = divisao(a, b);
                    }

                } else {
                    System.out.println("digite um número");
                    float b = scan.nextFloat();
                    if (opcao == 1) {
                        resultado = adicao(resultado, b);
                    } else if (opcao == 2) {
                        resultado = subtracao(resultado, b);
                    } else if (opcao == 3) {
                        resultado = multiplicacao(resultado , b);
                    } else {
                        resultado = divisao(resultado, b);
                    }
                }
            }

            n = 1;
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
