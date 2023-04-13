package semana6_02;

import java.util.Scanner;

public class ex18 {
    public  static void main (String[]args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Em que ano você nasceu? ");
        int ano = leitor.nextInt();
        int idade = 2023 - ano;
        if (idade >= 16 && < 18){
            System.out.println("Voto facultativo");
        } else if (idade >= 18 && <= 60) {
            System.out.println("Voto obrigatorio");
        } else if (idade >= 61){
            System.out.println("Voto facultativo");
        }else{
            System.err.println("Você não pode votar");
        }
    }
}
