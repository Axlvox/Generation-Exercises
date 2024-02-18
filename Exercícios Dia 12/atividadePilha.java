package Turma72;

import java.util.Deque;
import java.util.Scanner;
import java.util.ArrayDeque;

public class atividadePilha {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Deque<String> pilha = new ArrayDeque<>();

        int option = -1;

        while (option != 0) { 
            System.out.println("Digite uma opção: ");
          
            try {
                option = scan.nextInt();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Por favor, digite um número válido.");
                scan.next();
                continue;
            }

            switch (option) {
            case 1:
                System.out.println("Adicionar Livro na Pilha: ");
                scan.nextLine();
                String livro = scan.nextLine();
                pilha.push(livro); 
                System.out.println("Livro Adicionado!");
                break;
                case 2:
                    System.out.println("Lista de Livros na Pilha: ");
                    if (!pilha.isEmpty()) { 
                        for (String nome : pilha) { 
                            System.out.println(nome);
                        }
                    } else {
                        System.out.println("A pilha está vazia!");
                    }
                    break;
                case 3:
                    if (!pilha.isEmpty()) { 
                        String livroRetirado = pilha.pop();
                        System.out.println("O Livro '" + livroRetirado + "' foi retirado da pilha.");
                    } else {
                        System.out.println("A pilha está vazia!");
                    }
                    break;
                case 0:
                    System.out.println("Programa Finalizado!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }

        scan.close(); 
    }
}
