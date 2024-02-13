package Turma72;

import java.util.Scanner;

public class AtividadePratica1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o Salário: ");

		float salario = scan.nextFloat();

		System.out.println("Digite o Abono: ");

		float abono = scan.nextFloat();

		float novoSalario = salario + abono;

		System.out.println("Novo Salário: " + novoSalario);

		scan.close();

	}
}
