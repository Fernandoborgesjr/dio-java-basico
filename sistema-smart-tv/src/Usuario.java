public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv Ligada? " + smartTv.isLigada());
        System.out.println("Canal Atual? " + smartTv.getCanal());
        System.out.println("Volume Atual? " + smartTv.getVolume());

        System.out.println('\n');

        smartTv.ligar();
        System.out.println("Tv Ligada? " + smartTv.isLigada());
        System.out.println('\n');

        smartTv.aumentarVolume();
        System.out.println("Aumentou o volume? " + smartTv.getVolume());
        System.out.println('\n');

        smartTv.diminuirVolume();
        System.out.println("Diminuiu o volume? " + smartTv.getVolume());
        System.out.println('\n');

        smartTv.aumentarCanal();
        System.out.println("Aumentou o canal? " + smartTv.getCanal());
        System.out.println('\n');

        smartTv.diminuirCanal();
        System.out.println("Diminuiu o canal? " + smartTv.getCanal());
        System.out.println('\n');

        smartTv.mudarCanal(10);
        System.out.println("Mudou o canal? " + smartTv.getCanal());
        System.out.println('\n');

    }
}
