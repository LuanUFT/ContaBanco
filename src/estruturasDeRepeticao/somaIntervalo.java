package estruturasDeRepeticao;

import java.util.Scanner;

public class somaIntervalo {
    public static void main(String[] args) {
        int soma =0;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor do primeiro intervalo");
        int num = leitor.nextInt();
        System.out.println("Digite o segundo valor");
        int num2 = leitor.nextInt();
        for (int i=num; i<= num2; i++) {
            soma += i;
        }
        System.out.println(soma);
    }
}
