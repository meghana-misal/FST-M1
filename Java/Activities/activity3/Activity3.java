package activities.activity3;

public class Activity3 {
    public static void main(String[] args){
        double seconds = 1000000000;

        double EarthSeconds = 31557600;
        double MercurySeconds = 0.2408467;
        double VenusSeconds = 0.61519726;
        double MarsSeconds = 1.8808158;
        double JupiterSeconds = 11.862615;
        double SaturnSeconds = 29.447498;
        double UranusSeconds = 84.016846;
        double NeptuneSeconds = 164.79132;
        double eSeconds = seconds / EarthSeconds;
        System.out.println("Earth: " + eSeconds);

        System.out.println("Mercury: " + eSeconds / MercurySeconds);
        System.out.println("Venus: " + eSeconds/ VenusSeconds);
        System.out.println("Mars: " + eSeconds / MarsSeconds);
        System.out.println("Jupiter: " + eSeconds / JupiterSeconds);
        System.out.println("Saturn: " + eSeconds / SaturnSeconds);
        System.out.println("Uranus: " + eSeconds / UranusSeconds);
        System.out.println("Neptune: " + eSeconds/ NeptuneSeconds);
    }
}
