package semana3;
public class user {
    public static void main(String[] args){
        smartTv SmartTv = new smartTv();
        System.out.println("A tv está ligada? " +SmartTv.ligada);
        SmartTv.ligar();
        System.out.println("A tv está ligada? " +SmartTv.ligada);
        System.out.println("Canal atual " +SmartTv.canal);
        System.out.println("Volume: " +SmartTv.volume);
        SmartTv.diminuirVolume();
        SmartTv.diminuirVolume();
        SmartTv.diminuirVolume();
        SmartTv.diminuirVolume();
        SmartTv.diminuirVolume();
        System.out.println("Volume: " +SmartTv.volume);
        SmartTv.aumentarVolume();
        System.out.println("Volume: " +SmartTv.volume);
        System.out.println("Canal: " +SmartTv.canal);
        SmartTv.aumentarCanal();
        SmartTv.aumentarCanal();
        System.out.println("Canal: " +SmartTv.canal);
        SmartTv.diminuirCanal();
        System.out.println("Canal: " +SmartTv.canal);
        System.out.println("****************");
        SmartTv.mudarCanal(20);
        System.out.println("Novo canal: " +SmartTv.canal);

    }
}
