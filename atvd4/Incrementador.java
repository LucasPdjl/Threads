public class Incrementador implements Runnable {
    private final Contador contador;

    public Incrementador(Contador contador) {
        this.contador = contador;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            contador.incrementar();
        }
        System.out.println(Thread.currentThread().getName() + " terminou de incrementar");
    }
}
