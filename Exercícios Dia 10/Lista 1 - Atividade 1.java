package Turma72;

import java.util.Scanner;

//Lista 01 - Laço de Repetição FOR (Resolva 1 exercício):
//
//Escreva um algoritmo em Java, que leia 2 números inteiros via teclado, 
//onde o primeiro número deve ser menor do que o segundo número. 
//Caso contrário, deve ser exibida uma mensagem na tela informando que o intervalo é 
//inválido e sair do programa. 
//No intervalo informado, mostre na tela todes os números que são múltiplos de 3 e 5. 
//Veja os exemplos abaixo:

public class Atividade3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o primeiro número: ");
		int primeiroNumero = scan.nextInt();

		System.out.println("Digite o segundo número: ");
		int ultimoNumero = scan.nextInt();

		if (primeiroNumero >= ultimoNumero) {
			System.out.println("Intervalo inválido!");
			scan.close();
			return;
		}

		System.out.println("No intervalo entre " + primeiroNumero + ", " + ultimoNumero + ":");

		for (int i = primeiroNumero; i <= ultimoNumero; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i + " é múltiplo de 3 e 5");
			}
		}

		scan.close();
	}
}