package strategy;

public class Main {
    public static void main(String[] args) {
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo1 = new Robo();
        robo1.serComportamento(normal);
        robo1.mover();

        Robo robo2 = new Robo();
        robo2.serComportamento(defensivo);
        robo2.mover();

        Robo robo3 = new Robo();
        robo3.serComportamento(agressivo);
        robo3.mover();
    }
}
