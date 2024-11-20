public class Main {
    public static void main(String[] args) {
        FilaCompartilhada fila = new FilaCompartilhada();

        for (int i = 1; i <= 3; i++) {
            Thread produtor = new Thread(new Produtor(fila), "Produtor-" + i);
            produtor.start();
        }

        for (int i = 1; i <= 2; i++) {
            Thread consumidor = new Thread(new Consumidor(fila), "Consumidor-" + i);
            consumidor.start();
        }
    }
}
