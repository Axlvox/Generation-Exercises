package Turma72;

import java.util.Scanner;


//Escreva um algoritmo em Java, que leia números inteiros via teclado, 
//até que o número zero seja digitado. 
//Ao final, mostre na tela a soma de todos os números digitados, que sejam positivos

public class Atividade3C {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int soma = 0;

        do {
            System.out.println("Digite um número:");
            numero = scan.nextInt();

            if (numero > 0) {
                soma += numero;
            }
        } while (numero != 0);

        System.out.println("A soma dos números positivos é: " + soma);

        scan.close();
    }
}

