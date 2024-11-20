public class NumerosImpares implements Runnable {
    private final Object lock;

    public NumerosImpares(Object lock) {
        this.lock = lock; 
    }

    @Override
    public void run() {
        synchronized (lock) {
            for (int i = 1; i <= 9; i += 2) {
               System.out.println("Ímpar: " + i);
                lock.notify();
                try {
                    lock.wait(); 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            lock.notify(); // não travar a otra thread ********
        }
    }
}
