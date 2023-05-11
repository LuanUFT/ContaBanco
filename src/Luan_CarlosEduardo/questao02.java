package Luan_CarlosEduardo;

import java.util.Scanner;

public class questao02 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual a primeira nota? ");
        float N1 = leitor.nextFloat();
        System.out.println("Qual a segunda nota? ");
        float N2 = leitor.nextFloat();
        System.out.println("Qual a terceira nota? ");
        float N3 = leitor.nextFloat();
        System.out.println("Qual a quarta nota? ");
        float N4 = leitor.nextFloat();

        float media = ((N1*2) + (N2*3) + (N3*4) + N4) / 10;
        System.out.printf("A media é: %.1f \n", media);

        if (media >= 7) {
            System.out.println("Aluno aprovado!!");
        }
        if (media < 5) {
            System.out.println("Aluno reprovado");
        }
        if (media >= 5 && media <= 6.9){
            System.out.println("Aluno em exame");
        }

        System.out.println("Digite a nota do exame");
        float exame = leitor.nextFloat();
        System.out.printf("Nota do exame: %.1f ", exame);

        float novaMedia = (exame + media)/2;
        if (novaMedia >= 5){
            System.out.println("Aluno aprovado");
        } else {
            System.out.println("Aluno reprovado");
        }

        System.out.printf("Media final %.1f ", novaMedia);
    }
}