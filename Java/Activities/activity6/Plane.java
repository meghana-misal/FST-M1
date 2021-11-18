package activities.activity6;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Plane {
        private final List<String> passengers;
        private Date lastTimeLanded;

        public Plane() {
                this.passengers = new ArrayList<>();
        }

        public void onboard(String passenger) {
                this.passengers.add(passenger);
        }

        public Date takeOff() {
                return new Date();
        }

        public void land() {
                this.lastTimeLanded = new Date();
                this.passengers.clear();
        }

        public Date getLastTimeLanded() {
                return lastTimeLanded;
        }

        public List<String> getPassengers() {
                return passengers;
        }
}

