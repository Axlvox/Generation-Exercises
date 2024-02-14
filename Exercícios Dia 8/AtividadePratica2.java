package Turma72;
import java.util.Scanner;

public class Atividade1B {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite a Nota 1: ");

		float nota1 = scan.nextFloat();

		System.out.println("Digite a Nota 2: ");

		float nota2 = scan.nextFloat();
		
		System.out.println("Digite a Nota 3: ");

		float nota3 = scan.nextFloat();

		System.out.println("Digite a Nota 4: ");

		float nota4 = scan.nextFloat();

		float calcularMedia = (nota1 + nota2 + nota3 + nota4) / 4;

		System.out.println("Nota Média: " + calcularMedia);

		scan.close();

	}
}
