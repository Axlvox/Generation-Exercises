package Turma72;

import java.util.Scanner;

//Uma empresa desenvolveu uma pesquisa interna para conhecer 
//os colaboradores da área de Desenvolvimento 
//e precisam de um sistema para analisar os dados

public class Atividade3B {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int idade, genero, pessoaDesenvolvedora;
		int totalBackend = 0;
		int totalMulheresFrontend = 0;
		int totalHomensMobileMaior40 = 0;
		int totalNaoBinariosFullStackMenor30 = 0;
		int totalPessoas = 0;
		int somaIdades = 0;

		String continua = "S";

		while (continua.equalsIgnoreCase("S")) {
			System.out.println("Idade: ");
			idade = scan.nextInt();
			scan.nextLine();

			System.out.println("Gênero: ");
			genero = scan.nextInt();
			scan.nextLine();

			System.out.println("Pessoa Desenvolvedora: ");
			pessoaDesenvolvedora = scan.nextInt();
			scan.nextLine();

			if (pessoaDesenvolvedora == 1) {
				totalBackend++;
			}

			if ((genero == 1 || genero == 4) && pessoaDesenvolvedora == 2) { 
				totalMulheresFrontend++;
			}

			if ((genero == 2 || genero == 5) && pessoaDesenvolvedora == 3 && idade > 40) {
				totalHomensMobileMaior40++;
			}

			if (genero == 3 && pessoaDesenvolvedora == 4 && idade < 30) { 
				totalNaoBinariosFullStackMenor30++;
			}

			totalPessoas++;
			somaIdades += idade;

			System.out.println("Deseja continuar? (S/N)");
			continua = scan.nextLine();
		}

		System.out.println("Número de pessoas desenvolvedoras Backend: " + totalBackend);
		System.out.println("Número de Mulheres Cis e Trans desenvolvedoras Frontend: " + totalMulheresFrontend);
		System.out.println(
				"Número de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + totalHomensMobileMaior40);
		System.out.println("Número de Não Binários desenvolvedores FullStack menores de 30 anos: "
				+ totalNaoBinariosFullStackMenor30);
		System.out.println("Número total de pessoas que responderam à pesquisa: " + totalPessoas);

		double mediaIdades = totalPessoas > 0 ? (double) somaIdades / totalPessoas : 0;
		System.out.println("Média de idade das pessoas que responderam à pesquisa: " + mediaIdades);

		scan.close();
	}
}