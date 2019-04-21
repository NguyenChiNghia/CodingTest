public class Main
{

    public static void main(String[] args)
    {
        Synchronized synchronize = new Synchronized ();
        Car toyotaCar = new ToyotaCar(synchronize, true);
        Car bmwCar = new BmwCar(synchronize, false);

        System.out.println("Toyota car's info :");
        toyotaCar.info();
        System.out.println("BMW car's info :");
        bmwCar.info();

        System.out.println("Answer Of Question 1 :");
        toyotaCar.run();
        bmwCar.run();

        System.out.println("Answer Of Question 2 :");
        Thread toyotaThread = new Thread(new ToyotaCar(synchronize, true));
        Thread bmwThread = new Thread(new BmwCar(synchronize, false));
        toyotaThread.start();
        bmwThread.start();

        // wait for threads to end
        try
        {
            toyotaThread.join();
            bmwThread.join();
        }
        catch (Exception e)
        {
            System.out.println("Interrupted");
        }

        System.out.println("Answer Of Question 3 : The order of outputs in question 1 and 2 is different because when starting 2 or more than 2 threads, they try to access the same method run() and this cause the concurrency issues that make the order is different. In order to make sure the order of question 1 and 2 is the same, we should use the synchronized blocks");
    }
}
