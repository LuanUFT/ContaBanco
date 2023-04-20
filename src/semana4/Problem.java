package semana4;
import java.util.Scanner;
public class Problem {
    public static void main (String[] args){
        double A, B, media;
        Scanner sc = new Scanner(System.in);
         A = sc.nextDouble();
         B = sc.nextDouble();
           media = ( A  * 3.5 + B * 7.5)/11;
                System.out.printf("Media = %.5f", media);
                System.out.println();
    }
}
