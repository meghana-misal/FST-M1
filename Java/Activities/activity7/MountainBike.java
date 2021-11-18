package activities.activity7;

public class MountainBike extends Bicycle{
    public int seatHeight;

    public MountainBike(int gears, int speed, int seatHeight) {
        super(gears, speed);
        this.seatHeight = seatHeight;
    }

    public void setHeight(int newHeight) {
        this.seatHeight = newHeight;
    }

    public String bicycleDesc() {
        return (super.bicycleDesc()+ "\nSeat height is " + this.seatHeight);
    }
}
