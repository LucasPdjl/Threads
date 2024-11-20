class NumerosPares implements Runnable {
    private final Object lock; // Objeto q vai fazer a sincronização ***

    public NumerosPares(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        for (int i = 2; i <= 10; i += 2) {
            synchronized (lock) { // Bloqueia o recurso compartilhado *******
                System.out.println(i);
                lock.notify(); // "chama" a utra thread
                try {
                    lock.wait(); 
                } catch (InterruptedException e) {
                    e.printStackTrace(); // interrupções ***
                }
            }
            lock.notify(); 
        }
    }
}
