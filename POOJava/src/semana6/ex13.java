package semana6;

import java.util.Scanner;

public class ex13 {
    public static void main (String [] args ){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o preço do produto: ");
        double salario = leitor.nextFloat();
        double porcentagem = 15/100;
        double valor_final = salario + (porcentagem * salario);
        System.out.println("Salario com aumento: " +valor_final);
    }
}
