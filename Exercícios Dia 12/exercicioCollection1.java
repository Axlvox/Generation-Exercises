package Turma72;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class exercicioCollection1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Set<Integer> setNumeros = new HashSet<Integer>();
        System.out.println("Digite 10 números: ");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int numb = scan.nextInt();
            setNumeros.add(numb);
        }

       
        Set<Integer> numerosSemRepeticao = new HashSet<Integer>(setNumeros);

        System.out.println("\nListar dados do Set:");
        Iterator<Integer> iterator = numerosSemRepeticao.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        scan.close();
    }
}
