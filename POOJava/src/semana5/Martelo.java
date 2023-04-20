package semana5;
import java.util.Scanner;
public class Martelo {
    public static void main (String[] args){
        Scanner leitor = new Scanner (System.in);
        System.out.println("Digite quantos amigos serao testados: ");
        int C = leitor.nextInt();
        String nome;
        int N;

        for (int i = 0; i<C; i++){
            System.out.println("Digite o nome: ");
            nome = leitor.next();
            System.out.println("Digite a força: ");
            N = leitor.nextInt();
                if (nome.equals("Thor")) System.out.println("Y");
                else System.out.println("N");
        }
    }
}
