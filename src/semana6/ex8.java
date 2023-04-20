package semana6;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite uma distância em metros: ");
        float distancia = leitor.nextFloat();
        float hm = distancia/100;
        float km = distancia/1000;
        float dam = distancia/10;
        float  dm = distancia*10;
        float cm = distancia * 100;
        float mm = distancia * 1000;
        System.out.println("A distancia de " + distancia + " corresponde a ");
        System.out.println(+km + "Km");
        System.out.println(+hm+ "Hm");
        System.out.println(+dam+ "Dam");
        System.out.println(+dm+ "dm");
        System.out.println(+cm+ "cm");
        System.out.println(+mm+ "mm");
    }
}