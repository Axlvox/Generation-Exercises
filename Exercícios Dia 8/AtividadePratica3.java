package Turma72;

import java.util.Scanner;

public class Atividade1C {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o Salário Bruto: ");

		float salarioBruto = scan.nextFloat();

		System.out.println("Digite as Horas Extras: ");

		float horasExtras = scan.nextFloat();
		
		System.out.println("Digite o Adicional Noturno: ");

		float adicionalNoturno = scan.nextFloat();

		System.out.println("Digite os Descontos: ");

		float descontos = scan.nextFloat();

		float calcularSalario = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;

		System.out.println("Salário Líquido: " + calcularSalario);

		scan.close();

	}
}
