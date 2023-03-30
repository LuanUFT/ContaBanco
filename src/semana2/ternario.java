package semana2;

import java.beans.PropertyEditorSupport;

public class ternario {
    public static void main (String[] args){
        int a, b;

        a = 5;
        b = 6;
        /*if (a==b)
            resultado = "verdadeiro";
        else
            resultado = "Falso";
        System.out.println(resultado);*/
        String resultado = (a==b) ? "verdadeiro" : "false";
        System.out.println(resultado);
    }
}
