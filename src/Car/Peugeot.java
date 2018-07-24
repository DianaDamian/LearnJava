package Car;

public class Peugeot extends Car{

    private int specialFirst;
    private int specialSec;

    public Peugeot(int gears, int speed, int autoPilot, int brakeLights, int specialFirst, int specialSec) {
        super(gears, speed, autoPilot, brakeLights);
        this.specialFirst=specialFirst;
        this.specialSec=specialSec;
    }




}
