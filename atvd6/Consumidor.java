import java.util.LinkedList;
import java.util.Queue;

class Consumidor implements Runnable {
    private final FilaCompartilhada fila;

    public Consumidor(FilaCompartilhada fila) {
        this.fila = fila;
    }

    @Override
    public void run() {
        while (true) {
            try {
                fila.consumir();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
