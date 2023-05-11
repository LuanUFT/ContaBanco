package Luan_CarlosEduardo;

import java.util.Scanner;
public class questao01 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Coloque o valor de A: ");
        double A = leitor.nextDouble();
        System.out.print("Coloque o valor de B:");
        double B = leitor.nextDouble();
        System.out.print("Coloque o valor de C:");
        double C = leitor.nextDouble();
        double delta = (Math.pow(B,2)) - (4 * A * C);
        double raiz = Math.sqrt(delta);

        if (raiz > 0) {
            System.out.println(raiz);
            double r1 = (-B+raiz)/(2*A);
            double r2 = (-B-raiz)/(2*A);
            System.out.printf("R1 = %.5f \n", r1);
            System.out.printf("R2 = %.5f", r2);
        }else{
            System.out.println("Impossivel calcular");
        }
    }

}
