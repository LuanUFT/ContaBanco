package semana6;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual a primeira nota? ");
        float n1 = leitor.nextFloat();
        System.out.println("Qual a segunda nota? ");
        float n2 = leitor.nextFloat();
        float media = (n1 + n2) / 2;
        System.out.println("A média entre " + n1 + " e " + n2 + "é igual a " + media);
    }
}