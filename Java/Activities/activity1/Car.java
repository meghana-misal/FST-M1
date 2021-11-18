package activities.activity1;

public class Car {
    String color;
    String transmission;
    int make;
    int tyres;
    int doors;

    public Car(){
        this.tyres = 4;
        this.doors = 4;
    }

    public void displayCharacteristics() {
        //This displays the values of all the variables
        System.out.println("color:"+ color);
        System.out.println("transmission: "+ transmission);
        System.out.println("make: "+ make);
        System.out.println("tyres:"+ tyres);
        System.out.println("doors: "+ doors);
    }
    public void accelarate(){
        // This prints "Car is moving forward."
        System.out.println("Car is moving forward.");
    }
    public void brake() {
        // This prints "Car has stopped."
        System.out.println("Car has stopped.");
    }
}
