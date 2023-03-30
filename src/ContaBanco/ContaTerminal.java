package ContaBanco;
import java.util.Scanner;

public class ContaTerminal {
public static void main (String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Olá, digite seu nome");
    String nome = scanner.nextLine();
    System.out.println("Usuario: " +nome);
    System.out.println("Por favor, digite o numero da conta ");
    int conta = scanner.nextInt();
    System.out.println("Nº da Conta: " +conta);
    System.out.println("Por favor, digite o número da Agencia ");
    String agencia = scanner.next();
    System.out.println("Agencia: " + agencia );
    System.out.println("Digite o saldo: ");
    double saldo = scanner.nextDouble();
    System.out.println("Valor disponível: " +saldo);
System.out.println("Olá, " + nome + " obrigado por criar uma conta em nosso banco, sua agência é, " + agencia +
        " conta " + conta + " e seu saldo " + saldo + " já está disponivel para saque.");
    System.out.println("Conta ABERTA");
}
}