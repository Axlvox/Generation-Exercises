package Turma72;

import java.util.Scanner;

//Faça um algoritmo em Java que leia 3 valores inteiros A, B e C 
//e imprima na tela se a soma de A + B é maior, menor ou igual a C.

public class Atividade2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o Número A: ");

		float numeroA = scan.nextFloat();

		System.out.println("Digite o Número B: ");

		float numeroB = scan.nextFloat();

		System.out.println("Digite o Número C: ");

		float numeroC = scan.nextFloat();

		if (numeroA + numeroB > numeroC) {
			System.out.println("A Soma de A + B é Maior do que C");
		} else if (numeroA + numeroB < numeroC) {
			System.out.println("A Soma de A + B é Menor do que C");
		} else {
			System.out.println("A Soma de A + B é Igual a C");
		}
		scan.close();

	}
}