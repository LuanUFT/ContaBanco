public enum EstadosDoBrasil {
    SAO_PAULO ("SP", "Sao Paulo", 3),
    RIO_JANEIRO ("RJ", "Rio de Janeiro", 5),
    MINAS_GERAIS("MG", "Minas Gerais", 2),
    MARANHAO("MA", "Maranhao", 4),
    TOCATINS("To", "Tocatins", 7);

    private String nome;
    private String sigla;
    private int CodIBGE;

    public String getNomeMaiusculo(){
        return nome.toUpperCase();
    }
    public String getSiglaMaiusculo(){
        return sigla.toUpperCase();
    }

    private EstadosDoBrasil(String sigla, String nome, int CodIBGE){
        this.sigla = sigla;
        this.nome = nome;
        this.CodIBGE = CodIBGE;
    }
    public String getSigla(){
        return sigla;
    }
    public String getNome(){
        return nome;
    }
    public int getCodIBGE() {
        return CodIBGE;
    }
    EstadosDoBrasil(int codIBGE) {
        CodIBGE = codIBGE;
    }
}

