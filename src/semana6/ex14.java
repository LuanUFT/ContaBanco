package semana6;

import java.util.Scanner;

public class ex14 {
    public static void main (String[] args ){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantos kilometros foram percorridos? ");
        double km = leitor.nextDouble();
        System.out.println("Quantos dias ficaram com o carro? ");
        double dias = leitor.nextDouble();
        double valores_por_dia = dias * 90;
        double preco_por_km = km * 0.20;
        double valor_total = valores_por_dia + preco_por_km;
        System.out.println("O valor total a ser pago é de R$" + valor_total);
    }
}
