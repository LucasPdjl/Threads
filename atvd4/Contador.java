public class Contador {
    private int contador = 0;

    public synchronized void incrementar() {
        contador += 1;
    }

    public int getValor() {
        return contador;
    }
}
