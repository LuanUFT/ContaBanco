package estruturasDeRepeticao;

public class media {
    public static void main(String[] args) {
        int soma = 0;
        int media = 0;

        for (int i=500; i<= 700; i++) {
            soma += i;
            media = soma/i;
        }
        System.out.println(soma);
        System.out.println(media);
    }
}
