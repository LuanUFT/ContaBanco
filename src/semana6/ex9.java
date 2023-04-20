package semana6;

import java.util.Scanner;

public class ex9 {
    public static void main (String [] args ){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantos reais você tem na carteira? ");
        double reais = leitor.nextFloat();
        double dolar = reais/4.91;
        System.out.println("Você consegue comprar  $" + dolar + " com seus R$" + reais);
    }
}
