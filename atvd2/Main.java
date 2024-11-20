public class Main {
    public static void main(String[] args) {
        Thread threadPares = new Thread(new NumerosPares());
        Thread threadImpares = new Thread(new NumerosImpares());
        threadPares.start();
        threadImpares.start();
    }
}
