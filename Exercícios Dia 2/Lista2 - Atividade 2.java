package Turma72;

import java.util.Scanner;

public class Atividade2D {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o Nome do Colaborador: ");
        String nome = scan.nextLine();

        System.out.println("Digite o Código do Cargo do Colaborador (1 a 6): ");
        int numero = scan.nextInt();

        System.out.println("Digite o Salário do Colaborador: ");
        float salario = scan.nextFloat();

        String cargo = "";
        float percentual = 0;

        switch (numero) {
            case 1:
                cargo = "Gerente";
                percentual = 0.10f;
                break;
            case 2:
                cargo = "Vendedor";
                percentual = 0.07f;
                break;
            case 3:
                cargo = "Supervisor";
                percentual = 0.09f;
                break;
            case 4:
                cargo = "Motorista";
                percentual = 0.06f;
                break;
            case 5:
                cargo = "Estoquista";
                percentual = 0.05f;
                break;
            case 6:
                cargo = "Técnico de TI";
                percentual = 0.08f;
                break;
            default:
                System.out.println("Código de cargo inválido.");
                scan.close();
                return;
        }

        float reajuste = salario * percentual;
        float novoSalario = salario + reajuste;

        System.out.println("Nome do Colaborador: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Novo Salário: R$ " + novoSalario);

        scan.close();
    }
}