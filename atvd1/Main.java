public class Main {
    public static void main(String[] args) {
        MinhaPrimeiraThread tarefa = new MinhaPrimeiraThread();
        Thread thread = new Thread(tarefa);
        thread.start();
    }
}
