package Turma72;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class ExercicioArrayList1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		ArrayList<String> cores = new ArrayList<>();

		System.out.println("Digite 5 cores: ");
		   for (int i = 0; i < 5; i++) {
	            System.out.print("Cor " + (i + 1) + ": ");
	            String cor = scan.nextLine();
	            cores.add(cor);
	        }

		System.out.println("\nListar todas as cores: ");
		for (String cor : cores) {
			System.out.println(cor);
		}
		scan.close();
		
		 Collections.sort(cores);
	        System.out.println("\nOrdenar as cores:");
	        for (String cor : cores) {
	            System.out.println(cor);
	        }

	        scan.close();
	}

}
