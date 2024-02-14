package Turma72;

import java.util.Scanner;

//Escreva um algoritmo em Java, que leia a idade de várias pessoas (números inteiros), 
//via teclado e mostre na tela o total de pessoas cuja idade seja menor que 21 anos 
//e o total de pessoas cuja idade seja maior que 50 anos. 
//A leitura dos dados deve ser finalizada ao digitar uma idade negativa

public class Atividade3B {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int menor21 = 0;
		int maior50 = 0;

		System.out.println("Digite uma idade: ");

		int idade = scan.nextInt();

		while (idade >= 0) {
			if (idade < 21) {
				menor21++;
			} else if (idade > 50) {
				maior50++;
			}

			idade = scan.nextInt();
		}

		System.out.println("Total de pessoas menores de 21 anos: " + menor21);
		System.out.println("Total de pessoas maiores de 50 anos: " + maior50);

		scan.close();
	}
}
