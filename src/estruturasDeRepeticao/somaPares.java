package estruturasDeRepeticao;

public class somaPares {
    public static void main(String[] args) {
        int soma = 0;
        for (int i = 100; i <=500; i+=2){
            soma += i;
        }
        System.out.println(soma);
    }
}
