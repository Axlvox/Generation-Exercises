package Turma72;

import java.util.Queue;
import java.util.Scanner;
import java.util.ArrayDeque;

public class atividadeFila {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Queue<String> fila = new ArrayDeque<>();

        int option = -1;

        while (option != 0) { 
            System.out.println("Digite uma opção: ");
          
            try {
                option = scan.nextInt();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Por favor, digite um número válido.");
                scan.next();
            }

            switch (option) {
                case 1:
                    System.out.println("Adicionar Cliente na Fila: ");
                    String cliente = scan.next();
                    fila.offer(cliente); 
                    System.out.println("Cliente Adicionado!");
                    break;
                case 2:
                    System.out.println("Lista de Clientes na Fila: ");
                    if (!fila.isEmpty()) { 
                        for (String nome : fila) { 
                            System.out.println(nome);
                        }
                    } else {
                        System.out.println("A fila está vazia!");
                    }
                    break;
                case 3:
                    if (!fila.isEmpty()) { 
                        String clienteChamado = fila.poll();
                        System.out.println("O Cliente " + clienteChamado +  " foi Chamado! ");
                    } else {
                        System.out.println("A fila está vazia!");
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