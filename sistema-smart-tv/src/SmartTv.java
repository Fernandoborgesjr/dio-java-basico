public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 10;

    public void ligar() {
        this.ligada = true;
    }

    public void desligar() {
        this.ligada = false;
    }

    public void aumentarVolume() {
        if (this.volume == 100)
            return;
        this.volume++;
    }

    public void diminuirVolume() {
        if (this.volume == 0)
            return;
        this.volume--;
    }

    public void aumentarCanal() {
        this.canal++;
    }

    public void diminuirCanal() {
        if (this.canal == 1)
            return;
        this.canal--;
    }

    public void mudarCanal(int canal) {
        this.canal = canal;
    }
}
