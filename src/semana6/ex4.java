package semana6;
import java.util.Scanner;
public class ex4 {
    public static void main (String[] args){
        Scanner leitor = new Scanner (System.in);
        System.out.println("Digite um valor: ");
        int num1 = leitor.nextInt();
        System.out.println("Digite outro valor: ");
        int num2 = leitor.nextInt();
        int total = num1 + num2;
        System.out.println("A soma entre " + num1 + " e " +num2 + " é igual a " +total);
    }
}
