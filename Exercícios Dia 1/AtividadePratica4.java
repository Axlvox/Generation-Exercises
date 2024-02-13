package Turma72;
import java.util.Scanner;

public class Atividade1D {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o número 1: ");
        float num1 = scan.nextFloat();

        System.out.print("Digite o número 2: ");
        float num2 = scan.nextFloat();

        System.out.print("Digite o número 3: ");
        float num3 = scan.nextFloat();

        System.out.print("Digite o número 4: ");
        float num4 = scan.nextFloat();

        float diferenca = (num1 * num2) - (num3 * num4);

        System.out.println("Diferença: " + diferenca);

        scan.close();
    }
}