package semana6;

import java.util.Scanner;

public class ex15 {
    public static void main (String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantos dias foram trabalhados no mes? ");
        int dias = leitor.nextInt();
        int valor_dia = 8*25;
        int salario = dias * valor_dia;
        System.out.println("O salario a receber é: " + salario);
    }
}
