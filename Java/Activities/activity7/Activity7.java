package activities.activity7;

public class Activity7 {
    public static void main(String[] args) {
        MountainBike mb = new MountainBike(5, 2, 20);
        System.out.println(mb.bicycleDesc());
        mb.speedUp(50);
        mb.applyBrake(10);
    }
}
