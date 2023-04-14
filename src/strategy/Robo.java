package strategy;

public class Robo {
    private Comportamento comportamento;
    
    public void serComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }

    public void mover() {
        comportamento.mover();
    }


}
