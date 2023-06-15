package sobrecarga;

public class AppCalc {
    public static void main(String[] args) {
        calculadora Calculadora = new calculadora();

    int total1 = Calculadora.somar(3,4);
        System.out.println(total1);
    double total2= Calculadora.somar(1.2,2.8);
        System.out.println(total2);
    long total3=Calculadora.somar(2L,5L);
        System.out.println(total3);
    float total4 = Calculadora.somar(3, 3.2f);
        System.out.println(total4);
    float total5 = Calculadora.somar(2.0F, 3.2F);
        System.out.println(total5);
    }
}