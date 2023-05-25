public class appFunc {
    public static void main(String[] args) {
        double porcentagem;
        double valor_comissao;
        func joao = new func();
        func pedro = new func("Pedro", "123123", 24);
        joao.setNome("Joao");
        System.out.println(joao.getNome());
        System.out.println(pedro.getTotalVendas());
        System.out.println(pedro.getRG());
        System.out.println(pedro.getNome());

        porcentagem = 5.0/100;
        valor_comissao = pedro.getTotalVendas() + (porcentagem* pedro.getTotalVendas());
        System.out.println(valor_comissao);

    }
}
