public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual? " + smartTv.canal);
        System.out.println("Volume Atual? " + smartTv.volume);

        System.out.println('\n');

        smartTv.ligar();
        System.out.println("Tv Ligada? " + smartTv.ligada);
        System.out.println('\n');

        smartTv.aumentarVolume();
        System.out.println("Aumentou o volume? " + smartTv.volume);
        System.out.println('\n');

        smartTv.diminuirVolume();
        System.out.println("Diminuiu o volume? " + smartTv.volume);
        System.out.println('\n');

        smartTv.aumentarCanal();
        System.out.println("Aumentou o canal? " + smartTv.canal);
        System.out.println('\n');

        smartTv.diminuirCanal();
        System.out.println("Diminuiu o canal? " + smartTv.canal);
        System.out.println('\n');

        smartTv.mudarCanal(10);
        System.out.println("Mudou o canal? " + smartTv.canal);
        System.out.println('\n');

    }
}
