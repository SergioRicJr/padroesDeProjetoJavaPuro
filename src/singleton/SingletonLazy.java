package singleton;

//singleton é usado por exemplo para representacoes de tabela

//criar singleton MODO preguiçoso

public class SingletonLazy {
    private static SingletonLazy instancia;

    //para singletonLazy funcionar e não ser instanciado por outras pessoas
    private SingletonLazy() {
        // super(); com ou sem isso o resultado é o mesmo
    }

    public static SingletonLazy getInstacia() {

        if (instancia==null) {
            instancia = new SingletonLazy();
        }
        return instancia; 
    }
}
