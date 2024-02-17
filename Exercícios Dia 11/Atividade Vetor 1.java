package Turma72;

import java.util.Scanner;

public class exercicioVetor1 {

    public static void main(String[] args) {
        int numbers[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite o número que você deseja encontrar: ");
        int numeroDesejado = scan.nextInt();
        
        boolean findNumber = false; 
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == numeroDesejado) {
                System.out.println("O número " + numeroDesejado + " está localizado na posição: " + i);
                findNumber = true;
                break;
            }
        }
        
        if (!findNumber) {
            System.out.println("O número " + numeroDesejado + " não foi encontrado!");
        }
        
        scan.close();
    }
}
