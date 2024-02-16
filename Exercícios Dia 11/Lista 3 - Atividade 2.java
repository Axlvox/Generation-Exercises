package Turma72;

import java.util.Scanner;


//Escreva um algoritmo em Java, que leia números inteiros via teclado,
//até que o número zero seja digitado. 
//Ao final, mostre na tela a média de todos os números digitados, que sejam múltiplos de 3.

public class Lista3Ativ1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int soma = 0;
        int count = 0;
        
        do {
            System.out.println("Digite um número:");
            numero = scan.nextInt();

            if (numero != 0 && numero % 3 == 0) {
                soma += numero;
                count++;
            }
        } while (numero != 0);

        if (count > 0) {
            double media = (double) soma / count;
            System.out.println("A média de todos os números múltiplos de 3 é: " + media);
        } else {
            System.out.println("Nenhum número múltiplo de 3 foi digitado.");
        }

        scan.close();
    }
}

