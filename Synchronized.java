public class Synchronized
{
    private volatile boolean isToyota;

    synchronized void toyotaCar(int maxSpeed) {
        while (!isToyota) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(Thread.currentThread().getName() + ":" + maxSpeed);
        isToyota = false;
        notify();
    }

    synchronized void bmwCar(int maxSpeed) {
        while (isToyota) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(Thread.currentThread().getName() + ":" + maxSpeed);
        isToyota = true;
        notify();
    }
}
