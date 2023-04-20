package semana6;

import java.util.Scanner;
public class ex11 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Coloque o valor de A: ");
        double a = leitor.nextInt();
        System.out.print("Coloque o valor de B:");
        double b = leitor.nextInt();
        System.out.print("Coloque o valor de C:");
        double c = leitor.nextInt();
        double delta = (Math.pow(b, 2)) - (4 * a * c);
        System.out.println("O valor de delta é " + delta);
    }
}
