package Turma72;

import java.util.Scanner;

public class atividadeMatriz1 {
	public static void main(String[] args) {

		int[][] numbersMatriz = new int[3][3];
		Scanner scan = new Scanner(System.in);

		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				System.out.println("Digite um valor para a posição [" + linha + "][" + coluna + "]: ");
				numbersMatriz[linha][coluna] = scan.nextInt();
			}
		}

		System.out.println("Elementos na Diagonal Principal: ");
		for (int linha = 0; linha < 3; linha++) {

			System.out.println(numbersMatriz[linha][linha]);
		}

		System.out.println("Elementos na Diagonal Secundária: ");
		for (int linha = 0; linha < 3; linha++) {

			System.out.println(numbersMatriz[linha][2 - linha]);
		}
		int somaDiagonalPrinc = 0;
		for (int i = 0; i < 3; i++) {
			somaDiagonalPrinc += numbersMatriz[i][i];
		}
		System.out.println("Soma dos Elementos da Diagonal Principal:");
		System.out.println(somaDiagonalPrinc);

		int somaDiagonalSec = 0;
		for (int i = 0; i < 3; i++) {
			somaDiagonalSec += numbersMatriz[i][2 - i];
		}
		System.out.println("Soma dos Elementos da Diagonal Secundária:");
		System.out.println(somaDiagonalSec);

		scan.close();
	}
}
