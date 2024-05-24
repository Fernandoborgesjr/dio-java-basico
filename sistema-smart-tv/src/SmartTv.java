public class SmartTv {
    private boolean ligada = false;
    private int canal = 1;
    private int volume = 10;

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

    public boolean isLigada() {
        return this.ligada;
    }

    public int getCanal() {
        return this.canal;
    }

    public int getVolume() {
        return this.volume;
    }
}
