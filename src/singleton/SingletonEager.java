package singleton;

//Singleton apressado
//ao inves de instanciar na checagem do metodo
//cria a instancia logo ao criar 

public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }
}
