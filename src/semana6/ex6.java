package semana6;

import java.util.Scanner;

public class ex6 {
    public static void main (String [] args ){
        int antecessor = 0;
        int sucessor = 0;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número ");
        int num = leitor.nextInt();
        antecessor = num - 1;
        sucessor = num + 1;
        System.out.println("O antecessor de " + num + " é " + antecessor);
        System.out.println("O sucessor de " + num + " é " + sucessor);
    }
}
