package semana5;

public class CepInvalidoException  extends Exception{
    public static void main (String[] args){
        try{
            String cepFormatado = formatarCep("77021050");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            e.printStackTrace();
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException {
        if (cep.length() != 8)
            throw new CepInvalidoException();
        return "77.021-050";
    }
}
