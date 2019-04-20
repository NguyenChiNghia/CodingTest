public class Main {

    public static void main(String[] args) {
        Car toyotaCar = new ToyotaCar();
        Car bmwCar = new BmwCar();

        Thread toyotaThread = new Thread(toyotaCar);
        toyotaThread.start();
        Thread bmwThread = new Thread(bmwCar);
        bmwThread.start();
    }
}
