public class NumerosPares implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 10; i += 2) {
            System.out.println("Par: " + i);
            try {
                Thread.sleep((int)(Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
