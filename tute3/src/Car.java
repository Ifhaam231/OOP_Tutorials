public class Car {
    private String licensePlate;
    private double speed; // kilometers per hour
    private double maxSpeed; // kilometers per hour
    // constructors
    public Car(String licensePlate1, double maxSpeed1) {
        this.licensePlate = licensePlate1;
        this.speed = 0.0;
        if (maxSpeed1 >= 0.0) {
            maxSpeed = maxSpeed1;
        }
        else {
            maxSpeed = 0.0;
        }
    }

    public Car(String licensePlate, double maxSpeed1, double speed1) {
        this.licensePlate = licensePlate;
        //this.speed = maxSpeed1;
        //this.maxSpeed = speed1;
        if (speed1 < 0) {
            this.speed = 0;
        }
        else if (speed1 > maxSpeed1){
            this.speed = maxSpeed1;
        }
    }

    @Override
    public String toString() {
        return "Car " +
                "License Plate is " + licensePlate +
                ", speed is " + speed +
                " and max speed is " + maxSpeed;
    }
}
