package semana6;
import java.util.Scanner;
public class ex7 {
    public static void main (String [] args ){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe um número ");
        float num = leitor.nextFloat();
        float dobro = num*2;
        float terco = num/3;
        System.out.println("O dobro de " + num + " é " + dobro);
        System.out.println("A terça parte de " + num + " é " + terco);
    }
}
