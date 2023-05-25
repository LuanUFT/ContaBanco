public class func {
   protected String nome;
   protected String RG;
   protected double totalVendas;

   public func(String nome, String RG, double totalVendas) {
      super();
      this.nome = nome;
      this.RG = RG;
      this.totalVendas = totalVendas;
   }

   public func() {

   }

   public String getNome() {
      return nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public String getRG() {
      return RG;
   }

   public void setRG(String RG) {
      this.RG = RG;
   }

   public double getTotalVendas() {
      return totalVendas;
   }

   public void setTotalVendas(double totalVendas) {
      this.totalVendas = totalVendas;
   }
}
