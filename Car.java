public class Car implements Runnable {
    private int wheels;
    private int doors;
    private int seats;
    private int maxSpeed;

    public Car(int maxSpeed) {
        this.wheels = 4;
        this.doors = 4;
        this.seats = 5;
        this.maxSpeed = maxSpeed;
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

    public void run() {
		synchronized(maxSpeed){
        for (int i = 1; i <= 10; ++i) {
            System.out.println("Max speed is " + maxSpeed);
		}
        }
    }
    public void info() {
        // print info of car
    }
}
