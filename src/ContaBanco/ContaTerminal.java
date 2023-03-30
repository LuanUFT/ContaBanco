package ContaBanco;
import java.util.Scanner;

public class ContaTerminal {
public static void main (String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Olá, digite seu nome");
    String nome = scanner.nextLine();
    System.out.println("Por favor, digite o numero da conta ");
    int conta = scanner.nextInt();
    System.out.println("Por favor, digite o número da Agencia ");
    String agencia = scanner.next();
    System.out.println("Usuário: " + agencia );
    System.out.println("Digite o valor para saque: ");
    double saque = scanner.nextDouble();
    if (saque<=0){
        System.err.println("Não é possivel sacar R$0,00");
    }
System.out.println("Olá, " + nome + " obrigado por criar uma conta em nosso banco, sua agência é, " + agencia +
        " conta " + conta + " e seu saldo " + saque + " já está disponivel para saque.");

}
}
