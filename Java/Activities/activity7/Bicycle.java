package activities.activity7;

public class Bicycle implements BicycleParts,BicycleOperations{
    public int gears = 0;
    public int speed = 0;

    public Bicycle(int gears, int speed){
        this.gears=gears;
        this.speed=speed;
    }
    @Override
    public void applyBrake(int decrement) {
        this.speed -= decrement;
        System.out.println("Applied break ="+ this.speed);
    }

    @Override
    public void speedUp(int increment) {
        this.speed +=  increment;
        System.out.println("speed up ="+ this.speed);
    }

    public String bicycleDesc() {
        return("No of gears are "+ gears + "\nSpeed of bicycle is " + this.speed);
    }
}
