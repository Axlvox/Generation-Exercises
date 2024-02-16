package Turma72;

import java.util.Scanner;

//Escreva um algoritmo em Java, que leia 10 números inteiros via teclado e 
//mostre na tela quantos números são pares e quantos número são ímpares. 
//Veja o exemplo abaixo:
 
public class Dia11Atividade1 {


	 public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        int totalPar = 0;
	        int totalImpar = 0;

	        System.out.println("Digite 10 números inteiros:");

	        for (int i = 1; i <= 10; i++) {
	            System.out.print("Digite o " + i + "º número: ");
	            int numero = scan.nextInt();

	            if (numero % 2 == 0) {
	                totalPar++;
	            } else {
	                totalImpar++;
	            }
	        }

	        System.out.println("Total de números pares: " + totalPar);
	        System.out.println("Total de números ímpares: " + totalImpar);

	        scan.close();
	    }
	}