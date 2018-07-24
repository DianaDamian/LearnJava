package Car;

public class Car extends Vehicle{
    int autoPilot;
    int brakeLights;

    Vehicle vhc= new Vehicle();

    public static void main(String[] args) {

    }
    public Car(int gears, int speed, int autoPilot, int brakeLights) {
        super(gears, speed);
        this.autoPilot=autoPilot;
        this.brakeLights=brakeLights;

    }








}
