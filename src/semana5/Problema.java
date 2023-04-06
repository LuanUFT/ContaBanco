package semana5;
import java.util.Scanner;
public class Problema {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[10];
        for (int i = 0; i < 10; i++) {
            nomes[i] = sc.nextLine();
        }
        System.out.println("Terceiro nome da lista: "+ nomes[2]);
        System.out.println("Setimo nome da lista: " + nomes[6]);
        System.out.println("Nono nome da lista: " + nomes[8]);
    }
}
