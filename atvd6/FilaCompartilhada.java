import java.util.LinkedList;
import java.util.Queue;

class FilaCompartilhada {
    private final Queue<Integer> fila = new LinkedList<>();
    private final int capacidade = 10;

    public synchronized void produzir(int item) throws InterruptedException {
        while (fila.size() == capacidade) { // verifica se a fila esta cheia e espera
            wait();
        }
        fila.add(item);
        System.out.println("Produzido: " + item);
        notifyAll(); // notifica os consumidores
    }

    public synchronized int consumir() throws InterruptedException {
        while (fila.isEmpty()) {
            wait();
        }
        int item = fila.poll(); // remover item
        System.out.println("Consumido: " + item);
        notifyAll();
        return item;
    }
}
