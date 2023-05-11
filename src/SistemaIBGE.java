public class SistemaIBGE {
    public static void main(String[] args) {
        for (EstadosDoBrasil e: EstadosDoBrasil.values()){
            System.out.println(e.getSigla()+ "-" + e.getNome());
        }
        EstadosDoBrasil eSelecionado = EstadosDoBrasil.TOCATINS;
        System.out.print("O estado selecionado foi: " + eSelecionado.getNome());
        System.out.print(" " +eSelecionado.getSigla());
        System.out.println(" " +eSelecionado.getCodIBGE());
        System.out.println(eSelecionado.getNomeMaiusculo());
        System.out.println(eSelecionado.getSiglaMaiusculo());
    }
}
