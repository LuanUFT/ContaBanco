package Luan_CarlosEduardo;

import java.util.Scanner;

public class questao03 {
    public static void main (String... args ){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor do salário: ");
        float salario = leitor.nextFloat();
        if (salario <= 400){
            double porcentagem = 15.0/100;
            double reajuste = porcentagem* salario;
            double aumento = salario + reajuste;
            System.out.printf("Novo salário: %.2f \n", aumento);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.println("Em percentual: 15%\n");
        }
        if (salario >= 400.01 && salario <= 800){
            double porcentagem = 12.0/100;
            double reajuste = porcentagem* salario;
            double aumento = salario + reajuste;
            System.out.printf("Novo salário: %.2f\n ", aumento);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.println("Em percentual: 12%\n");
        }
        if (salario >= 800.01 && salario <= 1200 ){
            double porcentagem = 10.0/100;
            double reajuste = porcentagem* salario;
            double aumento = salario + reajuste;
            System.out.printf("Novo salário: %.2f\n ", aumento);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.println("Em percentual: 10%\n");
        }
        if (salario >= 1200.01 && salario <= 2000){
            double porcentagem = 7.0/100;
            double reajuste = porcentagem* salario;
            double aumento = salario + reajuste;
            System.out.printf("Novo salário: %.2f\n ", aumento);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.println("Em percentual: 7%\n");
        }
        if (salario > 2000){
            double porcentagem = 4.0/100;
            double reajuste = porcentagem* salario;
            double aumento = salario + reajuste;
            System.out.printf("Novo salário: %.2f \n", aumento);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.println("Em percentual: 4%\n");
        }
    }
}
