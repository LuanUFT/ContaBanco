package semana6;

import java.util.Scanner;

public class ex16  {
    public static void main (String [] args ){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantos cigarros voce fuma por dia? ");
        int cigarros = leitor.nextInt();
        System.out.println("Faz quantos anos que voce fuma? ");
        int anos = leitor.nextInt();
        int vida = cigarros*10;
        System.out.println("Voce perde " + vida + " minutos de vida por dia");
        int anos_perdido = anos*365;
        System.out.println("Voce ja perdeu " + anos_perdido + " dias de vida");
    }
}
