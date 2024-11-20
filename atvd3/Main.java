public class Main {
    public static void main(String[] args) {
        Object lock = new Object(); // objeto da sincronização

        Thread threadPares = new Thread(new NumerosPares(lock));
        Thread threadImpares = new Thread(new NumerosImpares(lock));

        threadPares.start()
        threadImpares.start();
    }
}
