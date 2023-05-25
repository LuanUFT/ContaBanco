package estruturasDeRepeticao;
import java.util.Scanner;


public class fatorial {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int n=4;
        int f=n;
        System.out.println("Fatorial de " + n);
        while (n>1) {
            f =f*(n-1);
            n--;
        }
        System.out.println(f);

    }
}
