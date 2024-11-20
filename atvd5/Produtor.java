import java.util.LinkedList;
import java.util.Queue;

class Produtor implements Runnable {
    private final FilaCompartilhada fila;

    public Produtor(FilaCompartilhada fila) {
        this.fila = fila;
    }

    @Override
    public void run() {
        int item = 0;
        while (true) {
            try {
                fila.produzir(++item);
                Thread.sleep(500); // Pausa como se fosse o tempo de produzir
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
