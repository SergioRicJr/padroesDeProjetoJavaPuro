package singleton;

//todos os singleton vao retornar o mesmo endereco de memoria
//independente de quantas vezes chamar
//por conta do metodo estatico e acesso privado de construtor
public class TestSingleton {
    public static void main(String[] args) {
        SingletonLazy lazy = SingletonLazy.getInstacia();
        System.out.println(lazy);
        SingletonLazy lazy2 = SingletonLazy.getInstacia();
        System.out.println(lazy2);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        SingletonLazyHolder lazyHolder2 = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder2);


    }
}
