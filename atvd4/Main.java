public class Main {
    public static void main(String[] args) throws InterruptedException {
        Contador contador = new Contador();
        Thread[] threads = new Thread[5];

        for (int i = 0; i < 5; i += 1) {
            threads[i] = new Thread(new Incrementador(contador));
            threads[i].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        System.out.println("Valor final do contador: " + contador.getValor());
    }
}
