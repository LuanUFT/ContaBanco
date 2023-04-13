package semana6;

import java.util.Scanner;

public class ex3 {
    public static void main (String[] args){
        Scanner leitor = new Scanner (System.in);
        System.out.println("Nome do funcionário: ");
        String nome = leitor.nextLine();
        System.out.println("Salário do funcionário: ");
        float salario = leitor.nextFloat();
        System.out.println("O funcionário " + nome + (" tem um salário de R$ %.2f "  +salario));
    }
}
