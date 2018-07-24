package Car;

public class Vehicle {

    private int gears;
    private int speed;
    private int currentVelocity;
    private int currentDirection;



    public Vehicle(){

    }

    public Vehicle(int gears, int speed){
        this.gears= gears;
        this.speed=speed;

        this.currentDirection=0;
        this.currentVelocity=0;
    }

    public void steer(int direction){
        this.currentDirection+=direction;
    }

    public void move(int velocity, int direction){
        currentVelocity=velocity;
        currentDirection=direction;
    }
}
