public class Main {
    public static void main(String[] args) {
        FilaCompartilhada fila = new FilaCompartilhada();

        Thread produtor = new Thread(new Produtor(fila));
        Thread consumidor = new Thread(new Consumidor(fila));

        produtor.start();
      consumidor.start();
    }
}
