package semana6;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual a altura da parede? ");
        float altura = leitor.nextFloat();
        System.out.println("Qual a largura da parede? ");
        float largura = leitor.nextFloat();
        float area = altura * largura;
        float qndtinta = area /2;
        System.out.println("A quantidade de tinta necessária é de " + qndtinta);
    }
}