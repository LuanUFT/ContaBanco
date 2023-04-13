package semana6;

import java.util.Scanner;

public class ex12 {
    public static void main (String[] args ){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o preço do produto: ");
        double preco = leitor.nextFloat();
        double porcentagem = 5.0/100;
        double valor_final = preco - (porcentagem * preco);
        System.out.println("PREÇO PROMOCIONAL: " +valor_final);
    }
}
