package Escola;

public class escola {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.age = 12;
        aluno.name = "Joao";

        System.out.println("O nome é: " +aluno.name);
        System.out.println("Idade: " +aluno.age);

        Aluno estudante = new Aluno();
        estudante.name="Zezinho";
        estudante.age=13;
        System.out.println("O nome é: " +estudante.name);
        System.out.println("Idade: " +estudante.age);

        Aluno estudante2 = new Aluno();
        estudante2.name = "Zezinho 2";
        estudante2.age = 23;
        System.out.println("Nome: " + estudante2.name + ", idade: " +estudante2.age);
    }
}
