package Turma72;

import java.util.Scanner;

//Escreva um algoritmo em Java, que leia um número inteiro via teclado 
//e mostre na tela uma mensagem indicando se este número é par ou ímpar 
//e se o número é positivo ou negativo. Veja os exemplos abaixo:

public class Atividade2B {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o Número: ");

		int numero = scan.nextInt();

		if (numero % 2 == 0) {
			if (numero >= 0) {
				System.out.println("O Número " + numero + " é par e positivo!");
			} else {
				System.out.println("O Número " + numero + " é par e negativo!");
			}
		} else {
			if (numero >= 0) {
				System.out.println("O Número " + numero + " é ímpar e positivo!");
			} else {
				System.out.println("O Número " + numero + " é ímpar e negativo!");
			}
		}

		scan.close();
	}
}