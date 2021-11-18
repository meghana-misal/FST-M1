package activities.activity6;

public class Activity6 {

    public static void main(String[] args) throws InterruptedException {

            Plane plane = new Plane();
            plane.onboard("Sree");
            plane.onboard("Vidya");
            plane.onboard("Meghana");
            System.out.println("Plane took off at: " + plane.takeOff());
            System.out.println("People on the plane: " + plane.getPassengers());
            Thread.sleep(5000);
            plane.land();
            System.out.println("Plane landed at: " + plane.getLastTimeLanded());
            System.out.println("People on the plane after landing: " + plane.getPassengers());
    }
}

