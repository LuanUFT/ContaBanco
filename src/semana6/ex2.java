package semana6;
import java.util.Scanner;
public class ex2 {
    public static void main (String[] args){
        Scanner leitor = new Scanner (System.in);
        System.out.println("Qual seu nome? ");
        String nome = leitor.nextLine();
        System.out.println("Olá " + nome + (", é um prazer te conhecer"));
    }
}
