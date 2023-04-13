package semana6_02;

import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual a velocidade do carro? ");
        double velocidade = leitor.nextDouble();
        if (velocidade > 80) {
            double multa = (velocidade - 80) * 5;
            System.err.println("Voce foi multado em R$" + multa);
        } else {
            System.out.println("Velocidade ok");
        }
    }
}
