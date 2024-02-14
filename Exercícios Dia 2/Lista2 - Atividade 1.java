package Turma72;

import java.util.Scanner;

//Com base na tabela abaixo, escreva um algoritmo em Java que leia o código de um item 
//(número inteiro de 1 a 6) e a quantidade comprada deste item (número inteiro). 
//A seguir, mostre na tela o valor total da conta e o nome do produto que foi comprado.


public class Atividade2C {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o Número: ");
        int numero = scan.nextInt();

        System.out.println("Digite a quantidade: ");
        int quantidade = scan.nextInt();

        double precoProduto = 0;
        String nomeProduto = "";

        switch (numero) {
            case 1:
                nomeProduto = "Cachorro Quente";
                precoProduto = 10.00;
                break;
            case 2:
                nomeProduto = "X-Salada";
                precoProduto = 15.00;
                break;
            case 3:
                nomeProduto = "X-Bacon";
                precoProduto = 18.00;
                break;
            case 4:
                nomeProduto = "Bauru";
                precoProduto = 12.00;
                break;
            case 5:
                nomeProduto = "Refrigerante";
                precoProduto = 8.00;
                break;
            case 6:
                nomeProduto = "Suco de laranja";
                precoProduto = 13.00;
                break;
            default:
                System.out.println("Código inválido.");
                scan.close();
                return;
        }

        double total = precoProduto * quantidade;
        System.out.println("Produto: " + nomeProduto);
        System.out.println("Valor total da conta: R$ " + total);

        scan.close();
    }
}
