package Luan_CarlosEduardo;

import java.sql.SQLOutput;
import java.util.Scanner;

public class questao04 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Telefonou para a vitima? ");
        boolean quest1 = leitor.nextBoolean();
        System.out.println("Esteve no local do crime? ");
        boolean quest2 = leitor.nextBoolean();
        System.out.println("Mora perto da vitima? ");
        boolean quest3 = leitor.nextBoolean();
        System.out.println("Devia para a vitima? ");
        boolean quest4 = leitor.nextBoolean();
        System.out.println("Já trabalhou com a vitima? ");
        boolean quest5 = leitor.nextBoolean();

        if (quest2){
            System.out.println("Suspeito");
        }
        if (quest3  || quest4 ){
            System.out.println("Cumplice");
        }
        if (quest5){
            System.out.println("Assassino");
        } else {
            System.out.println("Inocente");
        }
    }
}
