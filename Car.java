public class Car implements Runnable
{
    private int wheels;
    private int doors;
    private int seats;
    private int maxSpeed;
    Synchronized synchronize;

    public Car(int maxSpeed) {
        this.wheels = 4;
        this.doors = 4;
        this.seats = 5;
        this.maxSpeed = maxSpeed;
        this.synchronize = synchronize;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public synchronized void run() {
        for (int i = 1; i <= 10; i++)
        {
            System.out.println("Max speed is " + maxSpeed);
        }
    }
    public void info() {
        // print info of car
        System.out.println("Wheels :" + wheels);
        System.out.println("Doors :" + doors);
        System.out.println("Seats :" + seats);
        System.out.println("Max speed :" + maxSpeed);
    }
}
